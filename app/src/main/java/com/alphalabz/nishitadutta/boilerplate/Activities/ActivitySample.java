/*
MAINACTIVITY 1

        package com.example.surmeet.workshop;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{
    EditText t;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t=(EditText)findViewById(R.id.editText);
        b=(Button)findViewById(R.id.button);

        b.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String n=t.getText().toString();

                Intent in=new Intent("com.example.hello");
                in.putExtra("name",n);
                startActivityForResult(in,535);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        String s=data.getStringExtra("msg");
        t.setText(s);
    }
}


MAINACTIVITY 2

        package com.example.surmeet.workshop;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity
{
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv=(TextView)findViewById(R.id.textView);

        Intent out=getIntent();
        String x=out.getStringExtra("name");

        tv.setText("Hello "+x);
    }

    @Override
    public void onBackPressed()
    {
        Intent data=new Intent();
        data.putExtra("msg",tv.getText());
        setResult(848,data);
        super.onBackPressed();
    }
}

*/
