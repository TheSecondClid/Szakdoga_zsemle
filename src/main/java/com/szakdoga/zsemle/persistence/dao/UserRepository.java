package com.szakdoga.zsemle.persistence.dao;

import com.szakdoga.zsemle.persistence.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    @Override
    <S extends UserEntity> S save(S entity);

    @Override
    UserEntity getById(Integer integer);
}
