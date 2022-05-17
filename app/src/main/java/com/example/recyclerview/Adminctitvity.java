package com.example.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.adapter.ProductAdapter;
import com.example.recyclerview.model.Product;

import java.util.ArrayList;

public class Adminctitvity  extends AppCompatActivity{
    Product product;
    EditText fullname, title, desc;
    Context context;
    TextView res;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        fullname = findViewById(R.id.fullname);
        title = findViewById(R.id.title);
        desc = findViewById(R.id.desc);
        res = findViewById(R.id.res);
    }

    public void add(View view) {
//        product = new Product(String.valueOf(fullname.getText()), String.valueOf(desc.getText()), R.drawable.ic_launcher_background);
//        initViews();
        res.setText("Successfully added!");
    }
    void initViews() {
        context = this;
        recyclerView = findViewById(R.id.recyclerview);

        recyclerView.setLayoutManager(new GridLayoutManager(context, 1));

    }
    public void openItemDetalis(Product product){
        Intent intent = new Intent(this,ProductActivity.class);
        intent.putExtra("product", product);
        startActivity(intent);
    }
}
















