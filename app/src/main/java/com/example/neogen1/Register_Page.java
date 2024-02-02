package com.example.neogen1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Register_Page extends AppCompatActivity {

    TextView sign_in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page);

        sign_in=findViewById(R.id.sign_up_to_sign_in);

        sign_in.setOnClickListener(v -> startActivity(new Intent(Register_Page.this,MainActivity2.class)));
    }
}