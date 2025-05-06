package com.pablo_dev9.budgee_be.repository;

import com.pablo_dev9.budgee_be.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
