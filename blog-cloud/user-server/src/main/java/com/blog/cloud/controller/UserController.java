package com.blog.cloud.controller;

import com.blog.cloud.common.BaseController;
import com.blog.cloud.http.RestResultBuilder;
import com.blog.cloud.pojo.user.BlogUser;
import com.blog.cloud.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(value = "/user")
@Api(value = "UserController", description = "用户管理")
public class UserController extends BaseController {

    @Autowired
    private IUserService userService;

    /**
     * 用户注册接口
     * @param user
     * @return
     */
    @PostMapping("/register")
    @ApiOperation(value = "用户注册", notes = "用户注册")
    public RestResultBuilder register (@RequestBody BlogUser user) {
        Integer registerUser = userService.registerUser(user);
        return successBuild(registerUser);
    }


}
