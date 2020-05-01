package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping(value = "/CreditCardVerify")
public class CreditCardVerifyController {
	 private CreditCardVerifyRepository creditCardRepository;

	    @Autowired
	    public CreditCardVerifyController(CreditCardVerifyRepository creditCardRepository)
	    {
	        this.creditCardRepository = creditCardRepository;
	    }

	    @RequestMapping(value = "/all", method = RequestMethod.GET)
	    public List<CreditCardVerification> getAll()
	    {
	        return creditCardRepository.findAll();
	    }

	    /*
	    @RequestMapping(value = "/create", method = Requehod.POST)
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
