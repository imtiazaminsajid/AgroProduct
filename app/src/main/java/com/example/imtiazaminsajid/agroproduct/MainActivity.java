package com.example.imtiazaminsajid.agroproduct;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<ContactPerson>contactPersonArrayList;
    ContactPerson contactPerson;
    PersonAdapter personAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView =findViewById(R.id.listview);

        personAdapter = new PersonAdapter(this,contactPersonArrayList);
        contactPerson = new ContactPerson();
        contactPersonArrayList = contactPerson.getAllPersons();
    }
}
