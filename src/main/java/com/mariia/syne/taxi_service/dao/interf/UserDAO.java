package com.mariia.syne.taxi_service.dao.interf;

import com.mariia.syne.taxi_service.model.User;

public interface UserDAO extends CRUDDAO<User,Integer>{
    User updateUserById(Integer idUser, User newUser);

    boolean deleteUserById(Integer idUser);
}
