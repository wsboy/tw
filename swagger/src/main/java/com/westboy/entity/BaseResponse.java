package com.westboy.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class BaseResponse<T> implements Serializable {

    private static final long serialVersionUID = 3029295702131567309L;

    private int code;
    private String msg;
    private T body;
}
