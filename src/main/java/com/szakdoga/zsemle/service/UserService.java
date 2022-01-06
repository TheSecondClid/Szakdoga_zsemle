package com.szakdoga.zsemle.service;

import com.szakdoga.zsemle.persistence.dao.UserRepository;
import com.szakdoga.zsemle.persistence.entity.UserEntity;
import com.szakdoga.zsemle.transformer.UserTransformer;
import com.szakdoga.zsemle.view.UserView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserTransformer userTransformer;


    public UserEntity createUser(UserView userview){
        return userRepository.save(userTransformer.transform(userview));

    }

    public UserEntity findUser(Integer id) {
        return userRepository.getById(id);

    }
}
