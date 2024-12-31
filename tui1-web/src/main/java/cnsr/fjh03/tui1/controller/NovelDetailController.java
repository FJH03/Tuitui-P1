package cnsr.fjh03.tui1.controller;

import cnsr.fjh03.tui1.dto.ResponseDO;
import cnsr.fjh03.tui1.entity.Novel;
import cnsr.fjh03.tui1.service.NovelDetailService;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/getNovelDetail")
    public ResponseDO getNovelDetail(int novelId, HttpServletRequest req) {
        log.info("getNovelDetail接口，novelId={}", novelId);

        if (novelId < 0) {
            return ResponseDO.fail("非法数据，请重试！");
        }

        Novel novel = novelDetailService.getById(novelId);

        return ResponseDO.success(novel);
    }


}
