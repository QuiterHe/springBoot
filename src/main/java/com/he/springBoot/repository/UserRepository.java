package com.he.springBoot.repository;

import com.he.springBoot.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    UserEntity findById(long id);
}
