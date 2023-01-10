package com.student.payment.repository;
 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.payment.model.FeePayment;

@Repository
public interface PaymentRepository extends JpaRepository<FeePayment, Long>{
	 

}
