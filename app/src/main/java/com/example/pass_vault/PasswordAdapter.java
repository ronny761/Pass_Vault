package com.example.pass_vault;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * Created by Ronny Ruben on 11/1/2020
 */
class PasswordAdapter extends ArrayAdapter<Password> {
    List<Password> passwords;
    Context context;

    public PasswordAdapter( Context context, List<Password> passwords){
        super(context,0,passwords);
        this.context = context;
        this.passwords = passwords;
    }

    @Override
    public View getView(int position,View current, ViewGroup parent) {
        View row_with_data = current;
        row_with_data = LayoutInflater.from(context).
                inflate(R.layout.row_in_listview_pass,parent,
                        false);

        TextView tv_title = row_with_data.findViewById(R.id.tv_title);
        TextView tv_dataUserName = row_with_data.findViewById(R.id.tv_dataUserName);
        TextView tv_dataPass = row_with_data.findViewById(R.id.tv_dataPass);


        Password tmp = passwords.get(position);

        tv_title.setText(tmp.getTitle());
        tv_dataPass.setText(tmp.getData_pass());
        tv_dataUserName.setText(tmp.getData_userName());

        return row_with_data;
    }
}
