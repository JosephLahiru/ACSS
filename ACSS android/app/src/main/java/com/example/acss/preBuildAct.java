package com.example.acss;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class preBuildAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_build);
    }

    public void launchPaymentPortalAct(View view){
        //Pre Build

        Intent pp = new Intent(this, payment_portal.class);
        startActivity(pp);
    }

}