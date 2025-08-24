package com.bytebyteboot.rateLimiting.repository;

import java.util.UUID;

import com.bytebyteboot.rateLimiting.entity.UserPlanMapping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import jakarta.transaction.Transactional;

@Repository
public interface UserPlanMappingRepository extends JpaRepository<UserPlanMapping, UUID> {

    @Transactional
    @Modifying(clearAutomatically = true)
    @Query(nativeQuery = true, value = """
        UPDATE user_plan_mappings
        SET is_active = false
        WHERE user_id = ?1 and is_active = true
        """)
    void deactivateCurrentPlan(final UUID userId);

    @Query(nativeQuery = true, value = """
        SELECT * FROM user_plan_mappings
        WHERE user_id = ?1 AND is_active = true
        """)
    UserPlanMapping getActivePlan(final UUID userId);


    @Query(value = """
        SELECT COUNT(id) = 1 FROM UserPlanMapping
        WHERE isActive = true
        AND userId = ?1
        AND planId = ?2
        """)
    boolean isActivePlan(final UUID userId, final UUID planId);

}