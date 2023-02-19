package com.geekster.Ecommerce.API.service;

import com.geekster.Ecommerce.API.Repository.IUserRepository;
import com.geekster.Ecommerce.API.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService{
    @Autowired
    private IUserRepository iUserRepository;
    @Override
    public List<UserModel> getAllUser(){
        return iUserRepository.findAll();
    }
    @Override
    public void createUser(UserModel userModel){
        iUserRepository.save(userModel);
    }
    @Override
    public UserModel userByUserId(Integer id){
        return iUserRepository.findById(id).get();
    }
}
