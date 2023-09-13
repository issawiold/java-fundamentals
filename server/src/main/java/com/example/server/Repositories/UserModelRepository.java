package com.example.server.Repositories;

import com.example.server.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserModelRepository extends JpaRepository<UserModel, Long> {
    UserModel findByUsername(String username);
}
