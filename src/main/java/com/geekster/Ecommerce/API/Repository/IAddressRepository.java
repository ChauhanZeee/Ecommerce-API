package com.geekster.Ecommerce.API.Repository;

import com.geekster.Ecommerce.API.model.AddressModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressRepository extends JpaRepository<AddressModel, Integer> {
}
