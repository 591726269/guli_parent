package com.bysj.eduservice.controller;

import com.bysj.commonutils.R;
import org.springframework.web.bind.annotation.*;

/**
 * @author wzp
 * @date 7/5/21 10:07 PM
 */
@RestController
@RequestMapping("/eduservice/user")
@CrossOrigin
public class EduLoginController {

    //login
    @PostMapping("login")
    public R login(){
        return R.ok().data("token","admin");
    }

    //info
    @GetMapping("info")
    public R info(){
        return R.ok().data("roles","[admin]").data("name","admin").data("avatar","");
    }
}
