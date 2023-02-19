package com.geekster.Ecommerce.API.service;

import com.geekster.Ecommerce.API.Repository.IAddressRepository;
import com.geekster.Ecommerce.API.model.AddressModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService implements IAddressService{
    @Autowired
    private IAddressRepository iAddressRepository;
    @Override
    public void createAddressModel(AddressModel addressModel){
        iAddressRepository.save(addressModel);
    }
    @Override
    public List<AddressModel> getAllAddressDetail(){
        return iAddressRepository.findAll();
    }
}
