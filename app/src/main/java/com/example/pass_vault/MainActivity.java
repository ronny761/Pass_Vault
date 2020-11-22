package com.example.pass_vault;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //phase 1 - declaration
    EditText et_login_mail, et_login_pass;
    Button btn_login;
    TextView tv_forgot, tv_signUp;
    ImageView img_main;

    String[] user_data = {"latino12@bocaFc.arg", "vamosBoca", ""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide(); //<< this
        setContentView(R.layout.activity_main);

        //phase 2 - referencing
        et_login_mail = findViewById(R.id.et_login_mail);
        et_login_pass = findViewById(R.id.et_login_pass);
        btn_login = findViewById(R.id.btn_login);
        tv_forgot = findViewById(R.id.tv_forgot);
        tv_signUp = findViewById(R.id.tv_signUp);
        img_main = findViewById(R.id.img_main);

        //phase 3 - listeners
        btn_login.setOnClickListener(this);
        tv_forgot.setOnClickListener(this);
        tv_signUp.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == btn_login) {
            String email = et_login_mail.getText().toString();
            String password = et_login_pass.getText().toString();
            if (email.equals(user_data[0]) && password.equals(user_data[1])) {
                //img_main.setVisibility(View.VISIBLE);

                Intent intent1 = new Intent(MainActivity.this,
                        Vault_Screen.class);
                intent1.putExtra("email", email);
                intent1.putExtra("pass", email);
                startActivity(intent1);
            }

        }
        if (view == tv_forgot) {
            startActivity(new Intent(MainActivity.this, Forgot_Screen.class));

        }
        if (view == tv_signUp) {
            Intent intent3 = new Intent(MainActivity.this,
                    SignUp.class);
            startActivity(intent3);
        }
    }//onClick

   /* public boolean checkInput(String email, String pass){
        //if(email.equals()
    }*/

}