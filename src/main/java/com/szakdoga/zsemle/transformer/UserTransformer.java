package com.szakdoga.zsemle.transformer;

import com.szakdoga.zsemle.persistence.entity.UserEntity;
import com.szakdoga.zsemle.view.UserView;
import org.springframework.stereotype.Service;

@Service
public class UserTransformer {
    public UserEntity transform(UserView userview){
        UserEntity userEntity = new UserEntity();
        userEntity.setEmail(userview.getEmail());
        userEntity.setName(userview.getName());
        return userEntity;
    }

}
