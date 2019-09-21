package com.xcl.ad.config;

/* *
 * @Author: xuchunlin
 * @CreateDate: 09/06/2019/13:36
 * @Description: 通用配置
 * @Version: 1.0
 */

import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@Configuration
public class WebConfiguration implements WebMvcConfigurer {
    /**
     * 配置消息转换器
     * @param converters
     */
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.clear();
        //添加消息转换器
        converters.add(new MappingJackson2HttpMessageConverter());
    }
}
