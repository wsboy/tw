package com.westboy.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@ApiModel(description = "用户信息")
public class UserInfoParam {
    @ApiModelProperty(value = "用户唯一标识", required = true, example = "101")
    @JsonProperty("user_id")
    private long userId;

    @ApiModelProperty(value = "用户姓名", required = true, example = "张三")
    @JsonProperty("user_name")
    private String userName;

    @ApiModelProperty(value = "用户年龄", example = "20")
    @JsonProperty("user_age")
    private int userAge;
}
