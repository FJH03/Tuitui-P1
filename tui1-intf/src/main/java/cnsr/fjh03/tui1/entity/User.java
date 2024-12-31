package cnsr.fjh03.tui1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @Created with Intellij IDEA Ultimate 2022.02.03 正式旗舰版
 * @Author: 2113042621-冯佳和
 * @ClassName: User
 * @Date: 2024/12/31
 * @Time: 15:00
 * @Description:添加自定义描述
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    private int id;
    private String userName;
    private String password;
    private String brief;
    private int gender;
    private String birthday;
    private int rank;
    private String mobile;
    private int mobileStatus;
    private String email;
    private int emailStatus;
    private int status;
    private String photoAddress;
    private String salt;
    private LocalDateTime addTime;
    private LocalDateTime lastLoginTime;
    private LocalDateTime updateTime;
    private String userIp;
}
