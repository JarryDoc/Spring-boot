package com.imooc.luckymoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created with IDEA
 * author:Jarry
 * Date:2019/6/2
 * Time:14:57
 * @Controller + @ResponseBody = @RestController
 */
@RestController
@RequestMapping("hello")
public class HelloController {

    @Autowired
    private LimitConfig limitConfig;

    @GetMapping("/say")
//    @PostMapping("/say")
//    @RequestMapping("/say")
    public String say(@RequestParam(value = "id",required = false,defaultValue = "0") Integer id){
//        return "minMoney:"+ limitConfig.getMinMoney()+",说明："+ limitConfig.getDescription();
//        return "index";
        return "id:" + id;
    }

}
