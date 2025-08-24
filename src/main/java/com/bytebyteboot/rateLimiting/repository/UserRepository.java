package com.bytebyteboot.rateLimiting.repository;

import java.util.Optional;
import java.util.UUID;

import com.bytebyteboot.rateLimiting.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {

    Boolean existsByEmailId(final String emailId);

    Optional<User> findByEmailId(final String emailId);

}