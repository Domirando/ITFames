package com.example.recyclerview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.MainActivity;
import com.example.recyclerview.R;
import com.example.recyclerview.model.Product;

import java.util.ArrayList;

public class ProductAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    MainActivity activity;
    ArrayList<Product> products;

    public ProductAdapter(MainActivity activity, ArrayList<Product> products) {
        this.activity = activity;
        this.products = products;
    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_item,parent,false);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Product product = products.get(position);

        if (holder instanceof ProductViewHolder){
            ImageView fon = ((ProductViewHolder) holder).fon;
            fon.setImageResource(product.getImg());

            TextView name = ((ProductViewHolder) holder).name;
            name.setText(product.getName());

            TextView dec = ((ProductViewHolder) holder).dec;
            dec.setText(String.valueOf(product.getDec()));

            CardView cardView = ((ProductViewHolder) holder).cardView;
            cardView.setOnClickListener(view -> {
                activity.openItemDetalis(product);
            });

        }
    }

    public class ProductViewHolder extends RecyclerView.ViewHolder{
        public View view;
        public ImageView fon;
        public TextView name, dec;
        CardView cardView;


        public ProductViewHolder(View v) {
            super(v);
            this.view = v;

            fon = view.findViewById(R.id.fon);
            name = view.findViewById(R.id.name);
            dec = view.findViewById(R.id.dec);
            cardView = view.findViewById(R.id.card);
        }

    }

}
