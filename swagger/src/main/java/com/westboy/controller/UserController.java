package com.westboy.controller;

import com.westboy.dto.UserDTO;
import com.westboy.entity.ResultVO;
import com.westboy.entity.UserInfoForm;
import com.westboy.service.api.UserService;
import com.westboy.utils.ResultVOUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
@Api(description = "用户相关", basePath = "/user")
public class UserController {

    @Resource
    private UserService userService;

    @ApiOperation(value = "获取用户信息", notes = "根据uid获取用户信息", response = UserDTO.class, produces = "application/json")
    @GetMapping("/{uid}")
    public ResultVO<UserDTO> getUserInfo(@PathVariable String uid,
                                         @RequestParam String param,
                                         @RequestHeader String token) {

        UserDTO userDTO = userService.getUserInfo();
        return ResultVOUtil.success(userDTO);
    }

    @ApiOperation(value = "添加用户信息", notes = "添加用户信息", response = String.class, produces = "application/json")
    @PostMapping
    public ResultVO<String> addUserInfo(@RequestBody UserInfoForm userInfoForm) {
        userService.addUserInfo(userInfoForm);
        ResultVO<String> response = new ResultVO<>();
        response.setCode(100);
        response.setMsg("success");
        response.setData("修改成功");
        return response;
    }


    @ApiOperation(value = "修改用户信息", notes = "修改用户信息", response = String.class, produces = "application/json")
    @PutMapping("/{uid}")
    public ResultVO<String> updateUserInfo(@PathVariable String uid, @RequestBody UserInfoForm userInfoForm) {

        System.out.println(userInfoForm);
        ResultVO<String> response = new ResultVO<>();
        response.setCode(100);
        response.setMsg("success");
        response.setData("修改成功");
        return response;
    }
}
