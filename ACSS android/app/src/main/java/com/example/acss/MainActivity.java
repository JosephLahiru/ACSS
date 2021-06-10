package com.example.acss;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchPreBuildAct(View view){
        //Pre Build

        Intent pb = new Intent(this, preBuildAct.class);
        startActivity(pb);
    }

    public void launchProductListAct(View view){
        //product List

        Intent pl = new Intent(this, productListAct.class);
        startActivity(pl);
    }

    public void launchPcRepairWarrantyAct(View view){
        //pc repair and warranty

        Intent pr = new Intent(this, pcRepairWarrantyAct.class);
        startActivity(pr);
    }

    public void launchComputerAssemblyAct(View view){
        //computer assembly

        Intent ca = new Intent(this, computerAssemblyAct.class);
        startActivity(ca);

    }
}