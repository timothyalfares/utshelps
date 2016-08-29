package com.utshelps.utshelps2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    EditText username = (EditText)findViewById(R.id.studID);
    EditText password = (EditText)findViewById(R.id.passw);
    Button login = (Button) findViewById(R.id.loginbut);
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void login()
    {
        login.setOnClickListener(this);
    }


}
