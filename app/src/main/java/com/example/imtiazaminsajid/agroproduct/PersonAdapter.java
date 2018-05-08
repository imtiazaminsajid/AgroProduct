package com.example.imtiazaminsajid.agroproduct;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PersonAdapter extends ArrayAdapter<Product> {

    public Context context;
    public ArrayList<Product>personArrayList;

    public PersonAdapter(@NonNull Context context, ArrayList<Product>personArrayList) {
        super(context,R.layout.row_layout,personArrayList);
        this.context = context;
        this.personArrayList = personArrayList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        convertView = inflater.inflate(R.layout.row_layout,parent,false);

        TextView nameTV = convertView.findViewById(R.id.productName);
        TextView phoneTV = convertView.findViewById(R.id.productPrice);
        ImageView imageTV = convertView.findViewById(R.id.productImage);

        nameTV.setText(personArrayList.get(position).getProductName());
        phoneTV.setText(personArrayList.get(position).getProductPrice());
        imageTV.setImageResource(personArrayList.get(position).getProductImage());

        return convertView;
    }
}
