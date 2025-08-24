package com.bytebyteboot.rateLimiting.repository;

import java.util.UUID;

import com.bytebyteboot.rateLimiting.entity.Plan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PlanRepository extends JpaRepository<Plan, UUID> {

}