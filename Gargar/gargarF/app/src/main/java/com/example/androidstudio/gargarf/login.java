package com.example.androidstudio.gargarf;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View.OnClickListener;
import android.view.View;
import android.content.Intent;

public class login extends AppCompatActivity {

    private EditText email;
    private EditText pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email=(EditText) findViewById(R.id.email);
        pass=(EditText) findViewById(R.id.password);

        findViewById(R.id.log).setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View em){

               if(email.getText().toString().equals("admin")&& pass.getText().toString().equals("test"));
                Intent intent=new Intent(login.this,TouchListener.class);
                startActivity(intent);
                finish();
            }
            //else{
                //email.setError("Invalid Email");
            //}
        });


    }
}
