package com.xcl.ad.advice;

/* *
 * @Author: xuchunlin
 * @CreateDate: 09/06/2019/13:26
 * @Description: 统一异常处理
 * @Version: 1.0
 */

import com.xcl.ad.exception.AdException;
import com.xcl.ad.vo.CommonResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class GlobalExceptionAdvice {
    //声明处理哪种类型的异常
    @ExceptionHandler(value = AdException.class)
    public CommonResponse<String> handlerAdException(HttpServletRequest req, AdException ex){
        CommonResponse<String> response = new CommonResponse<>(-1,"business error");
        response.setData(ex.getMessage());
        return response;
    }
}
