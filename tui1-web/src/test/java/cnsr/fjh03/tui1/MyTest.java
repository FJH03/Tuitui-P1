package cnsr.fjh03.tui1;

import cnsr.fjh03.tui1.entity.Novel;
import cnsr.fjh03.tui1.service.NovelDetailService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

/**
 * @Created with Intellij IDEA Ultimate 2022.02.03 正式旗舰版
 * @Author: 2113042621-冯佳和
 * @ClassName: MyTest
 * @Date: 2024/12/31
 * @Time: 17:13
 * @Description:我的一些自定义测试
 */
@SpringBootTest
@Slf4j
public class MyTest {
    @Resource
    private NovelDetailService novelDetailService;

    @Test
    public void insertNovelTest() {
        Novel novel = new Novel();
        novel.setAuthorId(1);
        novel.setStatus(1);
        novel.setType(1);
        novel.setBookName("天道图书馆");
        novel.setAuthorName("唐家三少");
        novel.setDesc("测试描述");
        novel.setSimpleDesc("【2017最火玄幻作品，海外点推双榜第一】张悬穿越异界，成了一名光荣的教师，脑海中多出了一个神秘的图书馆");
        novel.setSubscribeNum(10);
        novel.setCover("cdaba9ac281948e5a009750a53dceaed.jpg");
        novel.setBookUrl("https://book.qidian.com/info/1034360760/");
        novel.setLastCharpterId(1);
        novel.setCharpterUrl("测试章节url");
        novel.setLastCharpterTime(LocalDateTime.now());
        novel.setAddTime(LocalDateTime.now());
        novel.setUpdateTime(LocalDateTime.now());
        novelDetailService.save(novel);
    }

    @Test
    public void queryNovelTest() {
        Novel novel = novelDetailService.getById(1);
        log.error("novel = {}", novel);
    }

    @Test
    public void delNovelTest() {
        novelDetailService.removeById(1);
    }
}
