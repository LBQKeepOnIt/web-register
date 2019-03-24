package cn.com.lbq.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class FirstController {

    @GetMapping("/say")
    public String saySomething() {
        return "我的web项目跑起来了，加油！";
    }

}
