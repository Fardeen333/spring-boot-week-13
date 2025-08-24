package com.codingshuttle.learn_kafka.user_service.repository;

import com.codingshuttle.learn_kafka.user_service.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
