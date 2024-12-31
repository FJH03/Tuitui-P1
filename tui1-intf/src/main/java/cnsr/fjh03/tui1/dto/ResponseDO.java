package cnsr.fjh03.tui1.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Created with Intellij IDEA Ultimate 2022.02.03 正式旗舰版
 * @Author: 2113042621-冯佳和
 * @ClassName: ResponseDO
 * @Date: 2024/12/31
 * @Time: 15:32
 * @Description:添加自定义描述
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ResponseDO {
    private boolean success;
    private String msg;
    // private int errorCode;
    private Object data;

    public static ResponseDO success(Object data) {
        return new ResponseDO(true, "success", data);
    }

    public static ResponseDO fail(String msg) {
        return new ResponseDO(false, msg, null);
    }

    public static ResponseDO fail(String msg, Object data) {
        return new ResponseDO(false, msg, data);
    }
}
