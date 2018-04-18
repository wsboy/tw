package com.westboy.utils;

import com.westboy.constant.ResultEnum;
import com.westboy.entity.ResultVO;

public class ResultVOUtil {

    public static ResultVO success() {
        return new ResultVO(ResultEnum.SUCCESS);
    }


    public static <T> ResultVO<T> success(T data) {
        return new ResultVO<>(ResultEnum.SUCCESS, data);
    }

    public static ResultVO fail() {
        return new ResultVO(ResultEnum.FAIL);
    }
}
