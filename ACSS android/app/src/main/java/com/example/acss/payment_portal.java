package com.example.acss;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class payment_portal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_portal);
    }

    public void payment_complete(View view){
        Toast toast = Toast.makeText(this, "Payment Successful", Toast.LENGTH_LONG);
        toast.show();
    }
}