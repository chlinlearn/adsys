package com.xcl.ad.entity;

import com.xcl.ad.constant.CommonStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.naming.Name;
import javax.persistence.*;
import java.util.Date;

/* *
 * @Author: xuchunlin
 * @CreateDate: 09/06/2019/15:35
 * @Description: null
 * @Version: 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ad_user")
public class AdUser {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private Long id;

    @Basic
    @Column(name = "username",nullable = false)
    private String username;

    @Column(name = "token",nullable = false)
    private String token;

    @Column(name = "user_status",nullable = false)
    private Integer user_status;

    @Column(name = "create_time",nullable = false)
    private Date createTime;

    @Column(name = "update_time",nullable = false)
    private Date updateTime;

    public AdUser(String username, String token) {
        this.username = username;
        this.token = token;
        this.user_status = CommonStatus.VALID.getStatus();
        this.createTime = new Date();
        this.updateTime = this.createTime;
    }
}
