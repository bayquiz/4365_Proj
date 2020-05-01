package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class DatabaseSeeder {
	private CreditCardVerifyRepository creditCardRepository;

    @Autowired
    public DatabaseSeeder(CreditCardVerifyRepository creditCardRepository)
    {
        this.creditCardRepository = creditCardRepository;
    }

    public void run(String... args) throws Exception
    {
        List<CreditCardVerification> CreditCardVerify = new ArrayList<>();

        CreditCardVerify.add(new CreditCardVerification("357817467632234", "09/2021", 673));
        CreditCardVerify.add(new CreditCardVerification("4722517453740773", "03/2026", 624));
        CreditCardVerify.add(new CreditCardVerification("5372077623575351", "09/2023", 549));

        (creditCardRepository).saveAll(CreditCardVerify);
    }
}
