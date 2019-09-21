package com.xcl.ad.constant;

import lombok.Getter;

/* *
 *@author: xuchunlin
 *@createTime: 09/06/2019/15:47
 *@description: null
 */
@Getter
public enum CommonStatus {
    VALID(1,"有效状态"),
    INVALID(0,"无效状态");

    private Integer status;
    private String msg;

    CommonStatus(Integer status, String msg) {
        this.status = status;
        this.msg = msg;
    }
}
