package com.xcl.ad.vo;

/* *
 * @Author: xuchunlin
 * @CreateDate: 09/06/2019/16:32
 * @Description: null
 * @Version: 1.0
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateUserResponse {

    private Long userId;

    private String username;

    private String token;

    private Date createTime;

    private Date updateTime;
}
