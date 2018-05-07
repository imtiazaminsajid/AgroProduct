package com.example.imtiazaminsajid.agroproduct;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class PersonAdapter extends ArrayAdapter<ContactPerson> {

    public Context context;
    public ArrayList<ContactPerson>personArrayList;

    public PersonAdapter(@NonNull Context context, ArrayList<ContactPerson>personArrayList) {
        super(context,R.layout.row_layout,personArrayList);
        this.context = context;
        this.personArrayList = personArrayList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return super.getView(position, convertView, parent);
    }
}
