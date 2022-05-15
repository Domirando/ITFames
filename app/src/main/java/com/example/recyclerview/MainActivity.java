package com.example.recyclerview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.example.recyclerview.adapter.ProductAdapter;
import com.example.recyclerview.model.Product;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Product> products = new ArrayList<>();
    Context context;
    RecyclerView recyclerView;
    String tim = "World Wide Web Inventor. Berners-Lee was born on 8 June 1955 in London, England,[26] the eldest of the four children of Mary Lee Woods and Conway Berners-Lee; his brother Mike is a professor of ecology and climate change management. His parents were computer scientists who worked on the first commercially built computer, the Ferranti Mark 1. He attended Sheen Mount Primary School, and then went on to attend south-west London's Emanuel School from 1969 to 1973, at the time a direct grant grammar school, which became an independent school in 1975. A keen trainspotter as a child, he learnt about electronics from tinkering with a model railway.[27] He studied at The Queen's College, Oxford, from 1973 to 1976, where he received a first-class Bachelor of Arts degree in physics.[1][26] While at university, Berners-Lee made a computer out of an old television set, which he bought from a repair shop.";
    String steve = "CEO of Apple. Steven Paul Jobs (February 24, 1955 – October 5, 2011) was an American entrepreneur, inventor, business magnate, media proprietor, and investor. He was the co-founder, chairman, and CEO of Apple; the chairman and majority shareholder of Pixar; a member of The Walt Disney Company's board of directors following its acquisition of Pixar; and the founder, chairman, and CEO of NeXT. He is widely recognized as a pioneer of the personal computer revolution of the 1970s and 1980s, along with his early business partner and fellow Apple co-founder Steve Wozniak.\n" +
            "\n";
    String bill = "CEO of Microsoft. William Henry Gates III (born October 28, 1955) is an American business magnate, software developer, investor, author, and philanthropist. He is a co-founder of Microsoft, along with his late childhood friend Paul Allen.[2][3] During his career at Microsoft, Gates held the positions of chairman, chief executive officer (CEO), president and chief software architect, while also being the largest individual shareholder until May 2014.[4] He was a major entrepreneur of the microcomputer revolution of the 1970s and 1980s.";
    String artur = "Satellite communication system. Sir Arthur Charles Clarke CBE FRAS (16 December 1917 – 19 March 2008) was an English science-fiction writer, science writer, futurist, inventor, undersea explorer, and television series host. Clarke was a lifelong proponent of space travel. In 1934, while still a teenager, he joined the BIS, British Interplanetary Society. In 1945, he proposed a satellite communication system using geostationary orbits.[8] He was the chairman of the British Interplanetary Society from 1946 to 1947 and again in 1951–1953.";
    String fortran = "Creator of Fortran. John Warner Backus (December 3, 1924 – March 17, 2007) was an American computer scientist. He directed the team that invented and implemented FORTRAN, the first widely used high-level programming language, and was the inventor of the Backus–Naur form (BNF), a widely used notation to define formal language syntax. He later did research into the function-level programming paradigm, presenting his findings in his influential 1977 Turing Award lecture \"Can Programming Be Liberated from the von Neumann Style?\"[1]\n" +
            "\n" +
            "The IEEE awarded Backus the W. W. McDowell Award in 1967 for the development of FORTRAN. He received the National Medal of Science in 1975[3] and the 1977 Turing Award\" for profound, influential, and lasting contributions to the design of practical high-level programming systems, notably through his work on FORTRAN, and for publication of formal procedures for the specification of programming languages\".[4]\n" +
            "\n" +
            "He retired in 1991 and died at his home in Ashland, Oregon on March 17, 2007.";
    String linus = "Creator of Linux Kernel. Linus Benedict Torvalds was born 28 December 1969) is a Finnish-American software engineer who is the creator and, historically, the main developer of the Linux kernel, used by Linux distributions and other operating systems such as Android. He also created the distributed version control system Git and the scuba dive logging and planning software Subsurface. He was honored, along with Shinya Yamanaka, with the 2012 Millennium Technology Prize by the Technology Academy Finland \"in recognition of his creation of a new open source operating system for computers leading to the widely used Linux kernel.\" He is also the recipient of the 2014 IEEE Computer Society Computer Pioneer Award and the 2018 IEEE Masaru Ibuka Consumer Electronics Award.";
    public String title(String smth){
        String desc = "";
        for (int i = 0; i < smth.length(); i++) {
            char myString = smth.charAt(i);
            if (myString != '.') {
                desc += myString;
            }else{
                break;
            }
        }
        return desc;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        products.add(new Product("Tim Berners-Lee",tim,R.drawable.tim));
        products.add(new Product("Arthur C",artur,R.drawable.artur));
        products.add(new Product("Bill Gates",bill,R.drawable.bill));
        products.add(new Product("John Backus",fortran,R.drawable.fortran));
        products.add(new Product("Steve Jobs",steve,R.drawable.steve));
        products.add(new Product("Linus Torvalds",linus,R.drawable.linus));
        initViews();
    }
    void initViews() {
        context = this;
        recyclerView = findViewById(R.id.recyclerview);

        recyclerView.setLayoutManager(new GridLayoutManager(context, 1));

        refreshAdapter(products);
    }

    void refreshAdapter(ArrayList<Product> products){
        ProductAdapter adapter = new ProductAdapter(this,products);
        recyclerView.setAdapter(adapter);
    }
    public void openItemDetalis(Product product){
        Intent intent = new Intent(this,ProductActivity.class);
        intent.putExtra("product", product);
        startActivity(intent);
    }

}