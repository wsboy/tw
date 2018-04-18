package com.westboy.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ResultEnum {
    SUCCESS(0, "success"),
    FAIL(-1, "fail");

    int code;
    String msg;

}
