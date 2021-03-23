package com.example.aks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class devlet_memurlarinin_yargilanmasi_kanunu extends AppCompatActivity {
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_devlet_memurlarinin_yargilanmasi_kanunu);

        toolbar = findViewById(R.id.toolbarr);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Devlet Memurlarının Yargılanması Kanunu");
    }
}