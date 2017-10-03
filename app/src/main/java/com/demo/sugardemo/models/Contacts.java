package com.demo.sugardemo.models;

import com.orm.SugarRecord;

/**
 * Created by Ishaq Hassan on 10/3/2017.
 */

public class Contacts extends SugarRecord {
    String name;
    String phone;
    Card busineddCard;

    public Contacts() {
    }

    public Contacts(String name, String phone, Card busineddCard) {
        this.name = name;
        this.phone = phone;
        this.busineddCard = busineddCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Card getBusineddCard() {
        return busineddCard;
    }

    public void setBusineddCard(Card busineddCard) {
        this.busineddCard = busineddCard;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", busineddCard=" + busineddCard +
                '}';
    }
}
