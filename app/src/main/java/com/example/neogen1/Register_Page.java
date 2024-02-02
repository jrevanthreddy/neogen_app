package com.example.neogen1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Register_Page extends AppCompatActivity {

    TextView sign_in;
    ImageView facebook,google;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page);

        sign_in=findViewById(R.id.sign_up_to_sign_in);
        facebook=findViewById(R.id.sign_up_facebook);
        google=findViewById(R.id.sign_up_google);

        sign_in.setOnClickListener(v -> startActivity(new Intent(Register_Page.this,MainActivity2.class)));
        facebook.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/login/"))));
        google.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://mail.google.com/mail/u/0/"))));
    }
}