package com.example.recyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AdminLogin extends AppCompatActivity {
    CheckBox show;
    TextView error;
    EditText mEtPwd, myLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_login);

        show = findViewById(R.id.check);
        mEtPwd = findViewById(R.id.pass);
        myLogin = findViewById(R.id.login);
        error = findViewById(R.id.error);
        show.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (!isChecked) {
                    mEtPwd.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    mEtPwd.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }
            }
        });
    }

    public void admin(View view) {
        String login = String.valueOf(myLogin.getText());
        int pass = Integer.parseInt(String.valueOf(mEtPwd.getText()));
            if(login.equals("test") && pass==123456){
                Intent intent = new Intent(this, Adminctitvity.class);
                startActivity(intent);
            }else{
                error.setText("Please check your login and password!");
                myLogin.setText("");
                mEtPwd.setText("");
            }
    }
}

