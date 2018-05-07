package com.example.imtiazaminsajid.agroproduct;

import java.util.ArrayList;

public class ContactPerson {
    private String personName;
    private String phoneNumber;
    private int personImage;

    public ContactPerson(String personName, String phoneNumber, int personImage) {
        this.personName = personName;
        this.phoneNumber = phoneNumber;
        this.personImage = personImage;
    }

    public ContactPerson(String personName, String phoneNumber) {
        this.personName = personName;
        this.phoneNumber = phoneNumber;
    }


    public ContactPerson() {
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPersonImage() {
        return personImage;
    }

    public void setPersonImage(int personImage) {
        this.personImage = personImage;
    }

    public ArrayList<ContactPerson>getAllPersons(){
        ArrayList<ContactPerson>persons = new ArrayList<>();
        persons.add(new ContactPerson("Imtiaz Amin", "01677006082", R.id.myImage));
        persons.add(new ContactPerson("Imtiaz Amin", "01677006082"));
        persons.add(new ContactPerson("Imtiaz Amin", "01677006082"));
        persons.add(new ContactPerson("Imtiaz Amin", "01677006082"));
        persons.add(new ContactPerson("Imtiaz Amin", "01677006082"));
        persons.add(new ContactPerson("Imtiaz Amin", "01677006082"));
        persons.add(new ContactPerson("Imtiaz Amin", "01677006082"));
        persons.add(new ContactPerson("Imtiaz Amin", "01677006082"));
        persons.add(new ContactPerson("Imtiaz Amin", "01677006082"));
        persons.add(new ContactPerson("Imtiaz Amin", "01677006082"));

        return persons;

    }
}
