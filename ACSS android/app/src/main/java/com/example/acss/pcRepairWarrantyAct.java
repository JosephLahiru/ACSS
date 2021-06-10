package com.example.acss;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class pcRepairWarrantyAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pc_repair_warranty);
    }

    public void launchWarrantyClaimAct(View view){
        //Warranty Claim

        Intent wc = new Intent(this, warranty_claim.class);
        startActivity(wc);
    }

    public void launchPCRepairAct(View view){
        //pc repair

        Intent pr = new Intent(this, pc_repair.class);
        startActivity(pr);
    }

}