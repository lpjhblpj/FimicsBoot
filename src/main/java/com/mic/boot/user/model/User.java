package com.mic.boot.user.model;


@SuppressWarnings("all")
public class User {

    public String id;
    public String name;
    public String password;
    public String email;
    public String avatarUrl;
    public String bigAvatarUrl;
    public String phoneNUm;
    public String address;
    public String token;
    public String sex;
    public String enjoy;
    public String income;
    public String age;
    public String school;


    public User(String id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getBigAvatarUrl() {
        return bigAvatarUrl;
    }

    public void setBigAvatarUrl(String bigAvatarUrl) {
        this.bigAvatarUrl = bigAvatarUrl;
    }

    public String getPhoneNUm() {
        return phoneNUm;
    }

    public void setPhoneNUm(String phoneNUm) {
        this.phoneNUm = phoneNUm;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEnjoy() {
        return enjoy;
    }

    public void setEnjoy(String enjoy) {
        this.enjoy = enjoy;
    }

    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
