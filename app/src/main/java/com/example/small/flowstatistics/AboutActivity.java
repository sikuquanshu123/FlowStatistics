package com.example.small.flowstatistics;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Calendar;

public class AboutActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        Button icon = (Button) findViewById(R.id.icon_about);
        icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar calendar = Calendar.getInstance();
                int systemTime = calendar.get(Calendar.HOUR_OF_DAY);
                Toast.makeText(AboutActivity.this, systemTime+"", Toast.LENGTH_SHORT).show();
            }
        });
    }


}
