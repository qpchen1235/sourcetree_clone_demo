package cn.sm1235.moive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

//电影微服务
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableHystrix
public class MovieApplication {
    public static void main(String[] args){
        SpringApplication.run(MovieApplication.class,args);
    }

//实例化RestTemplate
    @Bean
    @LoadBalanced //添加Ribbon负载均衡
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}



