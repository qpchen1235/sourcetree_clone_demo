package cn.sm1235.user.Controller;


import cn.sm1235.user.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/user")
@RestController // @RestController=@RequestMapping+@ResponseBody
public class UserController {

//    @Autowired
//    private UserService userService;
//    查询所有用户

    @RequestMapping(method = RequestMethod.GET)
    public List<User> findAll(){
        //模拟用户数据
        List<User> list=new ArrayList<>();
//        list.add(new User(1,"张三","123456","男",1000.0));
        list.add(new User(2,"李四","123456","女",2000.0));
//        list.add(new User(3,"王五","123456","男",3000.0));


        return list;
//        return userService.findAll();
    }

//    //    根据id查询用户
//    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
//    public User findById(@PathVariable Integer id){
//        return userService.findById(id);
//    }
//
////    添加用户
//    @RequestMapping(method = RequestMethod.POST)
//    public String add(@RequestBody User user){
//        userService.add(user);
//        return "添加成功";
//    }
//
////    修改用户
//    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
//    public String update(@RequestBody User user,@PathVariable Integer id){
////        设置Id
//        user.setId(id);
//        userService.update(user);
//        return "修改成功";
//
//    }
//
////    根据id删除用户
//    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
//    public String deleteById(@PathVariable Integer id){
//        userService.deleteById(id);
//        return "删除用户成功";
//}

}

