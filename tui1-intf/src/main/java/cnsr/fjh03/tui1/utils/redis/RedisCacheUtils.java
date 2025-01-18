package cnsr.fjh03.tui1.utils.redis;

import org.springframework.stereotype.Component;

/**
 * @Created with Intellij IDEA Ultimate 2022.02.03 正式旗舰版
 * @Author: 2113042621-冯佳和
 * @ClassName: RedisCacheUtils
 * @Date: 2025/1/18
 * @Time: 16:49
 * @Description:添加自定义描述
 */
@Component
public class RedisCacheUtils {
    /**
     * redis过期时间,以秒为单位
     */
    public final static int EXRP_ONE_MINITE = 60;          //一分钟
    public final static int EXRP_ONE_HOUR = 60 * 60;          //一小时
    public final static int EXRP_ONE_DAY = 60 * 60 * 24;        //一天
    public final static int EXRP_HALF_AN_DAY = 60 * 60 * 24;        //一天
    public final static int EXRP_ONE_MONTH = 60 * 60 * 24 * 30;   //一个月
    private static int MAX_IDLE = 200;          // 设置最大空闲数
    private static int MAX_WAIT = 10000;        // 最大连接时间
    private static int TIMEOUT = 10000;         // 超时时间
}
