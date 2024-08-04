package com.microservice_userpurchase.persistence;

import com.microservice_userpurchase.entity.UserPurchase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserPurchaseRepository extends JpaRepository<UserPurchase, Integer> {
}
