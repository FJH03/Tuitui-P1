package cnsr.fjh03.tui1.util;

import jakarta.servlet.http.HttpServletRequest;
import org.apache.commons.lang.StringUtils;

/**
 * @Created with Intellij IDEA Ultimate 2022.02.03 正式旗舰版
 * @Author: 2113042621-冯佳和
 * @ClassName: IPUtil
 * @Date: 2024/12/31
 * @Time: 14:58
 * @Description:添加自定义描述
 */
public class IPUtil {
    /**
     * 获取用户IP
     * @return
     */
    public static String getRequestIP(HttpServletRequest httpRequest) {
        String ipForwarded = httpRequest.getHeader("x-forwarded-for");
        if (ipForwarded == null) {
            ipForwarded = httpRequest.getRemoteAddr();
        } else {
            String ips[] = ipForwarded.split(",");
            ipForwarded = ips[ips.length - 1].trim();
        }
        if (StringUtils.equals(ipForwarded, "0:0:0:0:0:0:0:1"))
            return "127.0.0.1";
        return ipForwarded;
    }

}
