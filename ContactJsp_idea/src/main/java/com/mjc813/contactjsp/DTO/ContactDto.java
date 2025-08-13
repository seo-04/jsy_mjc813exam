package com.mjc813.contactjsp.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContactDto implements IContact {
    int id;
    String name;
    String phoneNumber;
    String zipNumber;
    String email;


    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer name) {
        this.id = name.intValue();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
    this.name = name;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    }

    @Override
    public String getZipNumber() {
        return zipNumber;
    }

    @Override
    public void setZipNumber(String zipNumber) {
   this.zipNumber = zipNumber;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
    this.email = email;
    }

    @Override
    public String getContactFullInfo() {
        return "";
    }
}
