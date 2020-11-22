package com.example.pass_vault;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SignUp extends AppCompatActivity implements View.OnClickListener {
    //phase 1 - declaration
    TextView tv_login;
    Button btn_register;
    EditText et_signUp_name, et_signUp_email, et_signUp_pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //phase 2 - referencing
        tv_login = findViewById(R.id.tv_login);
        et_signUp_name = findViewById(R.id.et_signUp_name);
        et_signUp_email = findViewById(R.id.et_signUp_email);
        et_signUp_pass = findViewById(R.id.et_signUp_pass);
        btn_register = findViewById(R.id.btn_register);

        //phase 3 - listeners
        tv_login.setOnClickListener(this);
        btn_register.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view == tv_login){
            Intent intent1 = new Intent(SignUp.this,
                    MainActivity.class);
            startActivity(intent1);
        }

        if(view == btn_register){
            String email = et_signUp_email.getText().toString();

            Intent intent2 = new Intent(SignUp.this,
                    Vault_Screen.class);

            intent2.putExtra("label_email", email);

            startActivity(intent2);
        }
    }
}