package com.geekster.Ecommerce.API.service;

import com.geekster.Ecommerce.API.model.AddressModel;

import java.util.List;

public interface IAddressService {
    public void createAddressModel(AddressModel addressModel);
    public List<AddressModel> getAllAddressDetail();

}
