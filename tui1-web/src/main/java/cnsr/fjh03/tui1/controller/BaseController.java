package cnsr.fjh03.tui1.controller;

import cnsr.fjh03.tui1.constant.CommonConstant;
import jakarta.servlet.http.HttpServletRequest;

import org.apache.commons.lang.math.NumberUtils;
import org.springframework.beans.factory.annotation.Value;

/**
 * @Created with Intellij IDEA Ultimate 2022.02.03 正式旗舰版
 * @Author: 2113042621-冯佳和
 * @ClassName: BaseController
 * @Date: 2024/12/31
 * @Time: 14:58
 * @Description:添加自定义描述
 */
public class BaseController {

    protected static final String SUCCESS = "success";
    protected static final String FAIL = "fail";
    protected static final int SUCCESS_ID = 1;
    protected static final int FAIL_ID = 0;
    protected static final String NOT_LOGIN = "not_login";

    @Value("${home.url}")
    protected String PreFix;

    protected int getCurrentUserId(HttpServletRequest request) {
        Object uId = request.getAttribute(CommonConstant.LOGIN_USERID_KEY);
        if (uId == null) {
            return -1;
        } else {
            return NumberUtils.toInt(uId.toString());
        }
    }


}
