package com.geekster.Ecommerce.API.service;

import com.geekster.Ecommerce.API.model.UserModel;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IUserService {
    public List<UserModel> getAllUser();
    public void createUser(UserModel userModel);
    public UserModel userByUserId(Integer id);

}
