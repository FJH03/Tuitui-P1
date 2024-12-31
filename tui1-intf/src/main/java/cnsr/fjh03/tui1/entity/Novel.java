package cnsr.fjh03.tui1.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

/**
 * @Created with Intellij IDEA Ultimate 2022.02.03 正式旗舰版
 * @Author: 2113042621-冯佳和
 * @ClassName: Novel
 * @Date: 2024/12/31
 * @Time: 14:17
 * @Description:添加自定义描述
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@TableName("tuitui_novel")
public class Novel {

    @TableId(type = IdType.AUTO)
    private int id;

    private int authorId;

    private int status;

    private int type;

    private String bookName;

    private String authorName;

    @TableField("`desc`")
    private String desc;

    private String simpleDesc;

    private int subscribeNum;

    private String bookUrl;

    private String cover;

    private LocalDateTime lastCharpterTime;

    private String lastestCharpter;

    private String charpterUrl;

    private LocalDateTime addTime;

    private LocalDateTime updateTime;
}
