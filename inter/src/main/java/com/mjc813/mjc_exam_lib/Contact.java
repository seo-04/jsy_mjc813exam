package com.mjc813.mjc_exam_lib;

public class Contact implements Icontact{
    private String name;
    private String phone;
    private String email;
    public Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
    @Override
    public String getName(){
        return name;
    }
    @Override
    public String getPhone(){
        return phone;
    }
    @Override
    public String getEmail(){
        return email;
    }


}
