package com.xcl.ad.service;
/* *
 *@author: xuchunlin
 *@createTime: 09/06/2019/16:26
 *@description: null
 */

import com.xcl.ad.exception.AdException;
import com.xcl.ad.vo.CreateUserRequest;
import com.xcl.ad.vo.CreateUserResponse;

public interface IUserService {
    /**
     * <h2>创建用户</h2>
     * @param request
     * @return
     * @throws AdException
     */
     CreateUserResponse createUser(CreateUserRequest request)
             throws AdException;
}
