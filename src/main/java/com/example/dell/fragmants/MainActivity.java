package com.example.dell.fragmants;





import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    FragmentManager fm;
    Fragment f1,f2;
    LinearLayout l;
    EditText t,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lol);


    }

    public void onClick(View v)
    {
        fm=getSupportFragmentManager();
        f1=fm.findFragmentById(R.id.fragment3);
        t=(EditText)f1.getView().findViewById(R.id.editText);
        String s=t.getText().toString();
        f2=fm.findFragmentById(R.id.fragment4);
        t2=(EditText)f2.getView().findViewById(R.id.editText2);
        t2.setText(s);
    }
}
