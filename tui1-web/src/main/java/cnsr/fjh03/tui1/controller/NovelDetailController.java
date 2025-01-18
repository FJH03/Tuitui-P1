package cnsr.fjh03.tui1.controller;

import cnsr.fjh03.tui1.constant.CacheConstant;
import cnsr.fjh03.tui1.dto.ResponseDO;
import cnsr.fjh03.tui1.entity.Novel;
import cnsr.fjh03.tui1.service.NovelDetailService;
import cnsr.fjh03.tui1.utils.redis.RedisCacheUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Created with Intellij IDEA Ultimate 2022.02.03 正式旗舰版
 * @Author: 2113042621-冯佳和
 * @ClassName: NovelDetailController
 * @Date: 2024/12/31
 * @Time: 15:26
 * @Description:添加自定义描述
 */
@Slf4j
@RestController
@RequestMapping("/book/detail")
public class NovelDetailController extends BaseController {
    @Resource
    private NovelDetailService novelDetailService;

    private StringRedisTemplate redisTemplate = new StringRedisTemplate();

    private ObjectMapper objectMapper = new ObjectMapper();

    @GetMapping("/getNovelDetail")
    public ResponseDO getNovelDetail(int novelId, HttpServletRequest req) throws JsonProcessingException {
        log.info("getNovelDetail接口，novelId={}", novelId);

        if (novelId < 0) {
            return ResponseDO.fail("非法数据，请重试！");
        }

        String json = redisTemplate.opsForValue().get(CacheConstant.NOEVL_DETAIL + novelId);
        //从缓存中拉取

        Novel novel = null;

        if (json == null) {
            novel = novelDetailService.getById(novelId);
            if (novel == null) {
                return ResponseDO.fail("非法数据，请重试！");
            } else {
                redisTemplate.opsForValue().set(CacheConstant.NOEVL_DETAIL + novelId, String.valueOf(novel), RedisCacheUtils.EXRP_ONE_MINITE);
            }
        }


        // 暂时不考虑订阅功能的实现
        Boolean isHasSubScribed = false;

        Map<String, Object> map = new HashMap<>();
        map.put("novel", novel);
        map.put("isHasSubScribed", isHasSubScribed);

        return ResponseDO.success(map);
    }

    @GetMapping("/getIsLastUpdate")
    public ResponseDO getIsLastUpdate(int novelId, int lastCharpterId) {
        log.info("novelId = {}, lastCharpterId = {}", novelId, lastCharpterId);

        if (novelId < 0 || lastCharpterId < 0) {
            return ResponseDO.fail("非法数据，请重试！");
        }

        Novel novel = novelDetailService.getById(novelId);

        if (novel == null) {
            return ResponseDO.fail("非法数据，请重试！");
        }

        boolean isUpdated = novel.getLastCharpterId() == lastCharpterId ? false : true;

        return ResponseDO.success(isUpdated);
    }
}
