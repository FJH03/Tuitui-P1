package cnsr.fjh03.tui1.enums;

import lombok.Getter;

/**
 * @Created with Intellij IDEA Ultimate 2022.02.03 正式旗舰版
 * @Author: 2113042621-冯佳和
 * @ClassName: SmsTypeEnum
 * @Date: 2024/12/31
 * @Time: 14:40
 * @Description:添加自定义描述
 */
@Getter
public enum SmsTypeEnum {

    REGISTER(1, "注册", "111"),
    RESET_PASSWORD(2, "修改密码", "111"),
    RESET_MOBILE(3, "修改手机", "111"),
    RESET_TO_NEW_MOBILE(4, "向新手机发送短信", "111"),
    Login(10, "手机验证码登录", "111");


    /**********这里备注一下模板，方便对应
     *  String SMS_REGISTER_CONTENT = "感谢注册***，您的手机验证码是%s。Run for youth。";
     *
     */

    private int id;
    private String name;
    private String templteId; //目前短信都调用第三方短信模板

    SmsTypeEnum(int id, String name, String templteId) {
        this.id = id;
        this.name = name;
        this.templteId = templteId;
    }

    public static SmsTypeEnum getById(int id) {
        for (SmsTypeEnum smsType : SmsTypeEnum.values()) {
            if (smsType.getId() == id)
                return smsType;
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(getById(1).getName());
    }

}
