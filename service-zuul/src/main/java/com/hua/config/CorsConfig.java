package com.hua.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

/*
//跨域配置
@Configuration
public class CorsConfig {

    @Bean
    public CorsWebFilter corsWebFilter(){

        // cors跨域配置对象
        CorsConfiguration configuration = new CorsConfiguration();
        configuration.addAllowedOrigin("*"); //允许所有域名
        configuration.setAllowCredentials(true); //允许携带个人信息
        configuration.addAllowedMethod("*"); //允许所有方法
        configuration.addAllowedHeader("*"); //允许所有请求头

        // 配置源对象
        UrlBasedCorsConfigurationSource configurationSource = new UrlBasedCorsConfigurationSource();
        configurationSource.registerCorsConfiguration("/**", configuration); //拦截所有请求
        // cors过滤器对象
        return new CorsWebFilter(configurationSource);
    }
}*/
