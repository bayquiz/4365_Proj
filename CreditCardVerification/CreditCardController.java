package com.example.CreditCardVerify;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/CreditCardVerify")
public class CreditCardController
{
    private CreditCardRepository creditCardRepository;

    @Autowired
    public CreditCardController(CreditCardRepository creditCardRepository)
    {
        this.creditCardRepository = creditCardRepository;
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<CreditCardVerification> getAll()
    {
        return creditCardRepository.findAll();
    }

    /*
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public List<CreditCardVerification> create(@RequestBody CreditCardVerification creditCardVerification)
    {
        creditCardRepository.save(creditCardVerification);

        return creditCardRepository.findAll();
    }
    */

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public List<CreditCardVerification> remove(@PathVariable long id)
    {
        creditCardRepository.deleteById(id);

        return creditCardRepository.findAll();
    }
}
