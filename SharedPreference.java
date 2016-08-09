package com.example.dell.sharedpreference;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SharedPreference extends AppCompatActivity {

    EditText t,t2;
    SharedPreferences sh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preference);
        t=(EditText)findViewById(R.id.editText);
        t2=(EditText)findViewById(R.id.editText2);
        sh=getSharedPreferences("abc",MODE_PRIVATE);
    }
    public void set(View v)
    {
        String name=t.getText().toString();
        int ph=Integer.parseInt(t2.getText().toString());
        SharedPreferences.Editor shed=sh.edit();
        shed.putString("name",name);
        shed.putInt("ph",ph);
        shed.commit();
    }

    public void get(View v)
    {
        int ph=sh.getInt("ph",0);
        String name=sh.getString("name","");
        t.setText(ph+"");
        t2.setText(name);
    }
}
