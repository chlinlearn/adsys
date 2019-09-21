package com.xcl.ad.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.util.StringUtils;

/* *
 * @Author: xuchunlin
 * @CreateDate: 09/06/2019/16:28
 * @Description: null
 * @Version: 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateUserRequest {

    private String username;

    /**
     * <h2>判断用户名是否为空</h2>
     * @return 若username为空返回true
     */
    public Boolean validate(){
        return StringUtils.isEmpty(username);
    }
}
