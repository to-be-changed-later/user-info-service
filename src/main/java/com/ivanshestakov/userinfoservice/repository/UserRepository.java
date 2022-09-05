package com.ivanshestakov.userinfoservice.repository;

import com.ivanshestakov.userinfoservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {

}
