package com.example.pass_vault;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Vault_Screen extends AppCompatActivity {
    List<Password> passwords;
    ListView listview_pass;
    PasswordAdapter adapter;
    Password selectedPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vault__screen);

/*        //receiving intent
        Intent intent = getIntent();
        String email = intent.getStringExtra("label_email");*/

        listview_pass = findViewById(R.id.listview_pass);

        Password p1 = new Password("mashov", "shimon99", "123456");
        Password p2 = new Password("ebay", "el_shimon", "p12w34");
        Password p3 = new Password("amzon", "el_shimon", "e1212e");
        Password p4 = new Password("ynet", "ynaet1212", "p12w34");
        Password p5 = new Password("gmail", "shimi45", "2323232");
        Password p6 = new Password("walla mail", "shimi45", "4343434t");

        passwords = new ArrayList<Password>();

        passwords.add(p1);
        passwords.add(p2);
        passwords.add(p3);
        passwords.add(p4);
        passwords.add(p5);
        passwords.add(p6);

        adapter = new PasswordAdapter(this, passwords);
        listview_pass.setAdapter(adapter);
        listview_pass.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(Vault_Screen.this,
                        Edit_Pass_Screen.class);
                selectedPassword = adapter.getItem(i);
                intent.putExtra("title", selectedPassword.getTitle());
                intent.putExtra("userName", selectedPassword.getData_userName());
                intent.putExtra("userPass", selectedPassword.getData_pass());
                startActivityForResult(intent, 1356);
            }
        });
    }//end_onCreate

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 1356){
            if(resultCode == RESULT_OK){
                selectedPassword.setTitle(data.getStringExtra("nTitle"));
                selectedPassword.setData_userName(data.getStringExtra("nName"));
                selectedPassword.setData_pass(data.getStringExtra("nPass"));
                adapter.notifyDataSetChanged();
            }
            if(resultCode == RESULT_CANCELED){
                Toast.makeText(this, "user cancled operation", Toast.LENGTH_SHORT).show();
            }
        }
    }
}