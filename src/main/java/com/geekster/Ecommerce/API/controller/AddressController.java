package com.geekster.Ecommerce.API.controller;

import com.geekster.Ecommerce.API.model.AddressModel;
import com.geekster.Ecommerce.API.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addressModel")
public class AddressController {
    @Autowired
    private AddressService addressService;

    @PostMapping("/create-address")
    public void createAddress(@RequestBody AddressModel addressModel){
        addressService.createAddressModel(addressModel);
    }
    @GetMapping("/get-all/address")
    public List<AddressModel> model(){
        return addressService.getAllAddressDetail();
    }
}
