package com.example.neogen1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    TextView sign_up,forgot_password;
    EditText email,password;
    Button sign_in_btm;
    ImageView facebook,google;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        sign_up=findViewById(R.id.sign_up);
        forgot_password=findViewById(R.id.forget_password);
        email=findViewById(R.id.sign_in_email);
        password=findViewById(R.id.sign_in_password);
        sign_in_btm=findViewById(R.id.sing_in_btn);
        facebook=findViewById(R.id.sign_in_facebook);
        google=findViewById(R.id.sign_in_google);


        sign_up.setOnClickListener(v -> startActivity(new Intent(MainActivity2.this, Register_Page.class)));
        sign_in_btm.setOnClickListener(v -> attentLogin());
        facebook.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/login/"))));
        google.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://mail.google.com/mail/u/0/"))));
        forgot_password.setOnClickListener(v -> startActivity(new Intent(MainActivity2.this,com.example.neogen1.forgot_password.class)));
    }

    private void attentLogin() {
        String sign_in_email = email.getText().toString();
        String sign_in_password = password.getText().toString();

        if (Credentials(sign_in_email, sign_in_password)){
            startActivity(new Intent(MainActivity2.this, Register_Page.class));
            finish();
        }else {

        if (sign_in_email.isEmpty() || sign_in_password.isEmpty()){
            Toast.makeText(this, "Enter Email and Password", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "Invalid credentials", Toast.LENGTH_SHORT).show();
        }
        }
    }

    private boolean Credentials(String sign_in_email, String sign_in_password) {

        if (!sign_in_email.endsWith("@gmail.com")){
            return false;
        }
//        String validPassword = "neogen123";
//
//        return sign_in_password.equals(validPassword);

        return true;
    }
}