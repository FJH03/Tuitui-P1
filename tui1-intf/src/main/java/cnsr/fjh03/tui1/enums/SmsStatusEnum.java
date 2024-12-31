package cnsr.fjh03.tui1.enums;

import lombok.Getter;

/**
 * @Created with Intellij IDEA Ultimate 2022.02.03 正式旗舰版
 * @Author: 2113042621-冯佳和
 * @ClassName: SmsStatusEnum
 * @Date: 2024/12/31
 * @Time: 14:40
 * @Description:添加自定义描述
 */
@Getter
public enum SmsStatusEnum {

    Sended(0, "短信已发送"),
    VerifySuccess(1, "验证成功"),
    VerifyFail(2, "验证失败");

    private int id;
    private String name;


    SmsStatusEnum(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static SmsStatusEnum getById(int id) {
        for (SmsStatusEnum smsType : SmsStatusEnum.values()) {
            if (smsType.getId() == id)
                return smsType;
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(getById(1).getName());
    }

}
