package com.westboy.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@ApiModel(description = "用户信息")
public class UserInfoParam {
    @ApiModelProperty(value = "用户唯一标识", required = true, example = "101")
    private long userId;
    @ApiModelProperty(value = "用户姓名", required = true, example = "张三")
    private String userName;
    @ApiModelProperty(value = "用户年龄", example = "20")
    private int userAge;
}
