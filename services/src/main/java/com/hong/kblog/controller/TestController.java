package com.hong.kblog.controller;

import com.hong.common.json.JsonResult;
import com.hong.kblog.error.EmCommonError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author : KongJHong
 * @Date : 2020-06-26 11:49
 * @Version : 1.0
 * Description     :
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public JsonResult test1(){
        return JsonResult.ok(EmCommonError.SUCCESS);
    }
}
