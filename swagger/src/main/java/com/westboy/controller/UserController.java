package com.westboy.controller;

import com.westboy.entity.BaseResponse;
import com.westboy.entity.UserInfoParam;
import com.westboy.entity.UserInfoView;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController("/user")
public class UserController {

    @GetMapping("/user/{uid}")
    @ApiOperation(value = "获取用户信息", notes = "根据uid获取用户信息", response = UserInfoView.class, produces = "application/json")
//    @ResponseBody
    public UserInfoView getUserInfo(@PathVariable String uid,
                                    @RequestParam String param) {
        UserInfoView infoView = new UserInfoView();
        infoView.setUserId(Long.valueOf(uid));
        infoView.setUserName("wpb");
        infoView.setUserAge(22);
//        BaseResponse<UserInfoView> response = new BaseResponse<>();
//        response.setCode(100);
//        response.setMsg("success");
//        response.setBody(infoView);
        return infoView;
    }


    @ApiOperation(value = "修改用户信息", notes = "修改用户信息", response = String.class, produces = "application/json")
    @PutMapping("/user/{uid}")
    @ResponseBody
    public BaseResponse<String> modifyUserInfo(@PathVariable String uid,
                                               @RequestBody UserInfoParam userInfoParam) {
        BaseResponse<String> response = new BaseResponse<>();
        response.setCode(100);
        response.setMsg("success");
        response.setBody("修改成功");
        return response;
    }
}
