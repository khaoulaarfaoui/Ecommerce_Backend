package com.ecommerce.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.backend.entity.Payment;
import com.ecommerce.backend.entity.Product;

@Repository
public interface PaymentRepo extends JpaRepository<Payment, Integer> {

    Payment findByTxnId(String txnId);

	
}
