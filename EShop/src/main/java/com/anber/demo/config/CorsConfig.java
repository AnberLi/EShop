package com.anber.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 跨域配置类
 */
@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")//允许跨域访问的路径
                .allowedOriginPatterns("*")//允许跨域访问的源
                .allowedMethods("GET", "POST", "PUT", "DELETE")//允许跨域访问的方法
                .allowedHeaders("*")//允许跨域访问的请求头
                .allowCredentials(true)//允许发送cookie
                .maxAge(3600);//预检请求的缓存时间（秒），即在这个时间段里，对于相同的跨域请求不会再预检了
    }
}
