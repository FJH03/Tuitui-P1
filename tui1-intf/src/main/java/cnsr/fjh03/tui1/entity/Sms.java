package cnsr.fjh03.tui1.entity;

import lombok.ToString;

import lombok.Data;

import java.util.Date;

/**
 * @Created with Intellij IDEA Ultimate 2022.02.03 正式旗舰版
 * @Author: 2113042621-冯佳和
 * @ClassName: Sms
 * @Date: 2024/12/31
 * @Time: 14:34
 * @Description:添加自定义描述
 */
@Data
@ToString
public class Sms {
    private int id;
    private int userId;
    private String mobile;
    //放第三方模板值
    private String content;
    private String veriCode;
    private int smsType;
    private int status;//见枚举 0 1 2
    private int code;//操作代码
    private String message;//操作描述
    private Date createTime;
    private String userIp;
}
