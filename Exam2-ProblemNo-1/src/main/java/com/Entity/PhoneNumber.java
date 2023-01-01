package com.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


public class PhoneNumber {

   private int phoneId;
   private String  phoneNumber;
   private String phoneType ;


    public int getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(int phoneId) {
        this.phoneId = phoneId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }



    public PhoneNumber(int phoneId, String phoneNumber, String phoneType) {
        this.phoneId = phoneId;
        this.phoneNumber = phoneNumber;
        this.phoneType = phoneType;

    }

    public PhoneNumber() {
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "phoneId=" + phoneId +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", phoneType='" + phoneType + '\'' +

                '}';
    }
}
