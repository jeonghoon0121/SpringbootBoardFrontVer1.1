package com.ohgiraffers.request;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.ohgiraffers.request")
@MapperScan(basePackages = "com.ohgiraffers.request", annotationClass = Mapper.class)
public class Chap01RequestMappingLectureSourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Chap01RequestMappingLectureSourceApplication.class, args);
    }

}