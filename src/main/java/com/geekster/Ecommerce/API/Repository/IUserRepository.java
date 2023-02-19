package com.geekster.Ecommerce.API.Repository;

import com.geekster.Ecommerce.API.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<UserModel, Integer> {

}
