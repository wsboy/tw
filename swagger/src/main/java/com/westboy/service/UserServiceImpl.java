package com.westboy.service;

import com.westboy.dao.UserMapper;
import com.westboy.dto.UserDTO;
import com.westboy.entity.UserInfoForm;
import com.westboy.model.User;
import com.westboy.service.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDTO getUserInfo() {
        UserDTO userDTO = new UserDTO();
        userDTO.setUserId(10001);
        userDTO.setUserName("wpb");
        userDTO.setUserAge(22);
        return userDTO;
    }

    @Override
    public void addUserInfo(UserInfoForm userInfoForm) {
        User user = new User();
        user.setUserName(userInfoForm.getUserName());
        user.setUserAge(userInfoForm.getUserAge());
        userMapper.insert(user);
    }
}
