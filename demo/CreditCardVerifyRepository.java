package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class CreditCardVerifyRepository extends JpaRepository<CreditCardVerification, Long>{

	public void saveAll(List<CreditCardVerification> creditCardVerify) {
		// TODO Auto-generated method stub
		
	}

	public List<CreditCardVerification> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
