package com.xcl.ad.utils;

/* *
 * @Author: xuchunlin
 * @CreateDate: 09/06/2019/16:58
 * @Description: null
 * @Version: 1.0
 */

import org.apache.commons.codec.digest.DigestUtils;

public class CommonUtils {
    public static String md5(String value){
        return DigestUtils.md5Hex(value).toUpperCase();
    }
}
