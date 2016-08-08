package com.alphalabz.nishitadutta.boilerplate.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.alphalabz.nishitadutta.boilerplate.R;

public class NextActivity extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sample_linear_layout);
        tv = (TextView) findViewById(R.id.textView);

        Intent out = getIntent();
        String x = out.getStringExtra("name");

        tv.setText("Hello " + x);
    }

    @Override
    public void onBackPressed() {
        Intent data = new Intent();
        data.putExtra("msg", tv.getText());
        setResult(848, data);
        super.onBackPressed();
    }
}


