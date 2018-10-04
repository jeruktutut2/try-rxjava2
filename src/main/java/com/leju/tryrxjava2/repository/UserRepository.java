package com.leju.tryrxjava2.repository;

import com.leju.tryrxjava2.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User,String> {
}
