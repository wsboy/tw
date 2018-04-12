package com.westboy.controller;

import com.westboy.entity.BaseResponse;
import com.westboy.entity.UserInfoParam;
import com.westboy.entity.UserInfoView;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
@Api(description = "用户相关", basePath = "/user")
public class UserController {

    @GetMapping("/{uid}")
    @ApiOperation(value = "获取用户信息", notes = "根据uid获取用户信息", response = UserInfoView.class, produces = "application/json")
    @ResponseBody
    public BaseResponse<UserInfoView> getUserInfo(@PathVariable String uid,
                                    @RequestParam String param,
                                    @RequestHeader String token) {

        System.out.println("获取用户信息");

        UserInfoView infoView = new UserInfoView();
        infoView.setUserId(Long.valueOf(uid));
        infoView.setUserName("wpb");
        infoView.setUserAge(22);
        BaseResponse<UserInfoView> response = new BaseResponse<>();
        response.setCode(100);
        response.setMsg("success");
        response.setBody(infoView);
        return response;
    }


    @ApiOperation(value = "修改用户信息", notes = "修改用户信息", response = String.class, produces = "application/json")
    @PutMapping("/{uid}")
    @ResponseBody
    public BaseResponse<String> modifyUserInfo(@PathVariable String uid,
                                               @RequestBody UserInfoParam userInfoParam) {
        System.out.println("修改用户信息");

        BaseResponse<String> response = new BaseResponse<>();
        response.setCode(100);
        response.setMsg("success");
        response.setBody("修改成功");
        return response;
    }
}
