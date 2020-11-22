package com.example.pass_vault;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Edit_Pass_Screen extends AppCompatActivity implements View.OnClickListener {
    EditText et_pass, et_username, et_title;
    Button btn_save, btn_cancel;

    Intent intent;
    String title, user_name, user_pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit__pass__screen);

        myInit();

        //receiving intent values
        title = intent.getStringExtra("title");
        user_name = intent.getStringExtra("userName");
        user_pass = intent.getStringExtra("userPass");

        et_title.setText(title);
        et_pass.setText(user_pass );
        et_username.setText(user_name);
    }

    private void myInit() {
        //receiving intent
        intent = getIntent();

        btn_cancel = findViewById(R.id.btn_cancel);
        btn_save = findViewById(R.id.btn_save);
        et_pass = findViewById(R.id.et_pass_edit);
        et_username = findViewById(R.id.et_username_edit);
        et_title = findViewById(R.id.et_title_edit);

        btn_save.setOnClickListener(this);
        btn_cancel.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view == btn_save){
            Intent data = new Intent();
            data.putExtra("nTitle", et_title.getText().toString());
            data.putExtra("nName", et_username.getText().toString());
            data.putExtra("nPass", et_pass.getText().toString());
            setResult(RESULT_OK, data);
            finish();
        }
        if(view == btn_cancel){
            setResult(RESULT_CANCELED, null);
            finish();
        }
    }
}