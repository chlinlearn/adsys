package com.xcl.ad.service.impl;

/* *
 * @Author: xuchunlin
 * @CreateDate: 09/06/2019/16:37
 * @Description: null
 * @Version: 1.0
 */

import com.xcl.ad.constant.Constants;
import com.xcl.ad.dao.AdUserRepository;
import com.xcl.ad.entity.AdUser;
import com.xcl.ad.exception.AdException;
import com.xcl.ad.service.IUserService;
import com.xcl.ad.utils.CommonUtils;
import com.xcl.ad.vo.CreateUserRequest;
import com.xcl.ad.vo.CreateUserResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private AdUserRepository userRepository;

    @Override
    public CreateUserResponse createUser(CreateUserRequest request) throws AdException {
        //若username为空抛出异常
        if (request.validate()){
            throw new AdException(Constants.ErrorMsg.REQUEST_PARAM_ERROR);
        }

        AdUser oldUser = userRepository.findByUsername(request.getUsername());

        //若该用户名存在记录，抛出异常
        if (oldUser!=null){
            throw  new AdException(Constants.ErrorMsg.SAME_NAME_ERROR);
        }

        //若用户名不存在，则创建新用户并保存
        //token，通过MD5对唯一的username加密获取
        AdUser newUser = userRepository.save(new AdUser(request.getUsername(),
                CommonUtils.md5(request.getUsername())));

        return new CreateUserResponse(newUser.getId(),newUser.getUsername(),
                newUser.getToken(),newUser.getCreateTime(),newUser.getUpdateTime());
    }
}
