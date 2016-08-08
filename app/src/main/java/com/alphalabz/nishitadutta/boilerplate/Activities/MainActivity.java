package com.alphalabz.nishitadutta.boilerplate.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.alphalabz.nishitadutta.boilerplate.R;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=(EditText)findViewById(R.id.edit_text);
        button=(Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String n=editText.getText().toString();

                Intent in=new Intent(MainActivity.this,NextActivity.class);
                in.putExtra("name",n);
                startActivityForResult(in,535);
            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        String s=data.getStringExtra("msg");
        editText.setText(s);
    }
    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }
}
