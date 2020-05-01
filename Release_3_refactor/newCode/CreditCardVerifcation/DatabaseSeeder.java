package CreditCardVerifcation;


import org.hibernate.boot.model.relational.Database;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DatabaseSeeder implements CommandLineRunner
{
    private CreditCardRepository creditCardRepository;

    @Autowired
    public DatabaseSeeder(CreditCardRepository creditCardRepository)
    {
        this.creditCardRepository = creditCardRepository;
    }

    @Override
    public void run(String... args) throws Exception
    {
        List<CreditCardVerification> CreditCardVerify = new ArrayList<>();

        CreditCardVerify.add(new CreditCardVerification("357817467632234", "09/2021", 673));
        CreditCardVerify.add(new CreditCardVerification("4722517453740773", "03/2026", 624));
        CreditCardVerify.add(new CreditCardVerification("5372077623575351", "09/2023", 549));

        creditCardRepository.saveAll(CreditCardVerify);
    }
}
