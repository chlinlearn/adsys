package com.xcl.ad.dao;

/* *
 * @Author: xuchunlin
 * @CreateDate: 09/06/2019/16:04
 * @Description: null
 * @Version: 1.0
 */

import com.xcl.ad.entity.AdUser;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AdUserRepository extends JpaRepository<AdUser, Long> {

    /**
     * <h2>根据用户名查找用户记录</h2>
     * @param username
     * @return
     */
    AdUser findByUsername(String username);
}
