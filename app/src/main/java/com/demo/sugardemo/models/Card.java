package com.demo.sugardemo.models;

import com.orm.SugarRecord;

/**
 * Created by Ishaq Hassan on 10/3/2017.
 */

public class Card extends SugarRecord {
    String web;
    String email;
    String secondaryAddress;

    public Card() {
    }

    public Card(String web, String email, String secondaryAddress) {
        this.web = web;
        this.email = email;
        this.secondaryAddress = secondaryAddress;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSecondaryAddress() {
        return secondaryAddress;
    }

    public void setSecondaryAddress(String secondaryAddress) {
        this.secondaryAddress = secondaryAddress;
    }

    @Override
    public String toString() {
        return "Card{" +
                "web='" + web + '\'' +
                ", email='" + email + '\'' +
                ", secondaryAddress='" + secondaryAddress + '\'' +
                '}';
    }
}
