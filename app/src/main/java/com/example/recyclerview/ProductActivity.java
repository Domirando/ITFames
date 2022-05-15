package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.recyclerview.model.Product;

public class ProductActivity extends AppCompatActivity {
    ImageView img;
    TextView name, dec, desc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        img =findViewById(R.id.img);
        name =findViewById(R.id.p_name);
        dec =findViewById(R.id.dec);
        desc =findViewById(R.id.p_desc);

        Product product = (Product) getIntent().getSerializableExtra("product");

        img.setImageResource(product.getImg());
        name.setText(product.fullDesc());
        dec.setText(String.valueOf(product.fullDesc()));
        desc.setText(product.getName());

    }
}