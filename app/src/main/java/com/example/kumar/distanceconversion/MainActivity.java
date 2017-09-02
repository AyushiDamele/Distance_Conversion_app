package com.example.kumar.distanceconversion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import  android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // for converting miles to km
        Button milestokm=(Button) findViewById(R.id.milestokm);
        milestokm.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View v) {
                EditText milesedit=(EditText)findViewById(R.id.milesedit);
                EditText kmsedit=(EditText)findViewById(R.id.kmsedit);
                double vmiles=Double.valueOf(milesedit.getText().toString());
                String len=String.valueOf(vmiles);
                if(len.length()==0)
                {
                    Toast.makeText(getApplicationContext(),"Please enter a valid number",Toast.LENGTH_LONG).show();
                }
                else
                {
                    double vkm=vmiles / 0.62137;
                    DecimalFormat formatval=new DecimalFormat("##.##");
                    kmsedit.setText(formatval.format(vkm));
                }

            }
        });
       // for converting km to miles
        Button kmtomiles=(Button) findViewById(R.id.kmtomiles);
        kmtomiles.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View v) {
                EditText milesedit=(EditText)findViewById(R.id.milesedit);
                EditText kmsedit=(EditText)findViewById(R.id.kmsedit);
                double vkm=Double.valueOf(kmsedit.getText().toString());
                String len=String.valueOf(vkm);
                if(len.length()==0)
                {
                    Toast.makeText(getApplicationContext(),"Please enter a valid number",Toast.LENGTH_LONG).show();
                }
                else
                {
                    double vmiles=vkm / 0.62137;
                    DecimalFormat formatval=new DecimalFormat("##.##");
                    kmsedit.setText(formatval.format(vmiles));
                }

            }
        });


    }
}
