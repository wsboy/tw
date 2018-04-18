package com.westboy.entity;

import com.westboy.constant.ResultEnum;
import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@ApiModel
public class ResultVO<T> implements Serializable {

    private static final long serialVersionUID = 3029295702131567309L;

    private int code;
    private String msg;
    private T data;

    public ResultVO(ResultEnum resultEnum) {
        this.code = resultEnum.getCode();
        this.msg = resultEnum.getMsg();
    }

    public ResultVO(ResultEnum resultEnum, T data) {
        this.code = resultEnum.getCode();
        this.msg = resultEnum.getMsg();
        this.data = data;
    }
}
