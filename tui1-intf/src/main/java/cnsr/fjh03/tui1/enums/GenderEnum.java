package cnsr.fjh03.tui1.enums;

import lombok.Getter;

/**
 * @Created with Intellij IDEA Ultimate 2022.02.03 正式旗舰版
 * @Author: 2113042621-冯佳和
 * @ClassName: GenderEnum
 * @Date: 2024/12/31
 * @Time: 14:40
 * @Description:添加自定义描述
 */
@Getter
public enum GenderEnum {
    Male(1, "男"),
    Female(2, "女"),
    Secret(3, "保密");

    private int id;
    private String name;

    GenderEnum(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static GenderEnum getById(int id) {
        for (GenderEnum genderEnum : GenderEnum.values()) {
            if (genderEnum.getId() == id) {
                return genderEnum;
            }
        }

        return null;
    }
}
