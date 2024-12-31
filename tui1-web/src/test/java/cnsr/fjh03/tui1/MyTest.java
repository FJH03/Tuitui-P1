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
        novel.setType(2);
        novel.setBookName("测试书名");
        novel.setAuthorName("测试作者名字");
        novel.setDesc("测试描述");
        novel.setSimpleDesc("测试简要描述");
        novel.setCover("测试封面");
        novel.setBookUrl("测试书籍url");
        novel.setCharpterUrl("测试章节url");
        novel.setSimpleDesc("测试简要描述");
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
