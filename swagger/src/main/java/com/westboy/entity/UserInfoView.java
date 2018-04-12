package com.westboy.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@ApiModel
public class UserInfoView {
    @ApiModelProperty(value = "用户唯一标识", required = true, example = "101")
    private long userId;
    @ApiModelProperty(value = "用户姓名", required = true, example = "张三")
    private String userName;
    @ApiModelProperty(value = "用户年龄", example = "20")
    private int userAge;

}
