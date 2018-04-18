package com.westboy.service.api;

import com.westboy.dto.UserDTO;
import com.westboy.entity.UserInfoForm;

public interface UserService {

    UserDTO getUserInfo();

    void addUserInfo(UserInfoForm userInfoForm);
}
