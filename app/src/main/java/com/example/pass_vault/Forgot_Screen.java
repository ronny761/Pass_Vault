package com.example.pass_vault;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Forgot_Screen extends AppCompatActivity implements View.OnClickListener {
    //phase 1 - declaration
    EditText et_forgot_email;
    TextView tv_pass_ok;
    Button btn_done;

    String[] user_data = {"latino12@bocaFc.arg", "vamosBoca" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot__screen);

        //phase 2 - referencing
        et_forgot_email = findViewById(R.id.et_forgot_email);
        tv_pass_ok = findViewById(R.id.tv_pass_ok);
        btn_done = findViewById(R.id.btn_frgt_submit);

        //phase 3 - listeners
        btn_done.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view == btn_done){
            String user_input = et_forgot_email.getText().toString();
            if(user_input.equals(user_data[0])){
                tv_pass_ok.setText(user_data[1]);
                Intent intent = new Intent(Forgot_Screen.this, MainActivity.class);
                startActivity(intent);
            }
            else{
                Toast.makeText(this, "try again", Toast.LENGTH_LONG).show();
            }

        }//btn_done
    }
}