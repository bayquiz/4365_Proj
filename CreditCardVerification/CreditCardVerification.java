package com.example.CreditCardVerify;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CreditCardVerification {

    public CreditCardVerification(){}

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private String cardNo;
    private String strDate;
    private int cvvNo;

    public CreditCardVerification(String cardNo, String strDate, int cvvNo)
    {
        this.cardNo = cardNo;
        this.strDate = strDate;
        this.cvvNo = cvvNo;
    }

    public String getCardNo()
    {
        return cardNo;
    }

    public String getStrDate()
    {
        return strDate;
    }

    public int getCvvNo()
    {
        return cvvNo;
    }

    public long getId()
    {
        return id;
    }
}
