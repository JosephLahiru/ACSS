package com.example.acss;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class computerAssemblyAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer_assembly);

        Spinner dropdown1 = findViewById(R.id.spinner1);
        String[] items1 = new String[]{"intel i3", "intel i5", "intel i7", "intel i9", "Ryzen 3", "Ryzen 5", "Ryzen 9"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items1);
        dropdown1.setAdapter(adapter1);

        Spinner dropdown2 = findViewById(R.id.spinner2);
        String[] items2 = new String[]{"2GB", "4GB", "8GB", "16GB", "32GB"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items2);
        dropdown2.setAdapter(adapter2);

        Spinner dropdown3 = findViewById(R.id.spinner3);
        String[] items3 = new String[]{"GTX1650", "GTX1660", "GTX1670", "GTX1680", "ASUS", "GIGABYTE", "ZOTAC"};
        ArrayAdapter<String> adapter3 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items3);
        dropdown3.setAdapter(adapter3);

        Spinner dropdown4 = findViewById(R.id.spinner4);
        String[] items4 = new String[]{"ASROCK", "ASUS", "GIGABYTE", "intel"};
        ArrayAdapter<String> adapter4 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items4);
        dropdown4.setAdapter(adapter4);
    }

    public void launchSelectAssemblerAct(View view){
        //Select Assembler

        Intent sa = new Intent(this, select_assembler.class);
        startActivity(sa);
    }


}