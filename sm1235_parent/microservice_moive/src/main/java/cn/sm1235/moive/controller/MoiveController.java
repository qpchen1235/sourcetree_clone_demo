package cn.sm1235.moive.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


//电影购票
@RequestMapping("/moive")
@RestController
public class MoiveController {

    @Autowired
    private RestTemplate restTemplate;

//    购票方法
    @RequestMapping(value = "/order",method = RequestMethod.GET)
    public String order(){

        //模拟取当前用户
//        Integer id=2;
//        查询用户微服务，获取用户的具体信息
//        使用RestTemplate远程调用用户微服务
//        参数一：调用的URL地址，参数二：需要封装的对象类型
//        User user=restTemplate.getForObject("http://localhost:9001/user/",User.class);
//        User user=restTemplate.getForObject("http://localhost:9001/user/",User.class);
//        System.out.println(user+"==正在购票...");
        System.out.println("正在购票");

        return "购票成功";




    }
}
