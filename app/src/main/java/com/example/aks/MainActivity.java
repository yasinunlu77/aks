package com.example.aks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import com.example.aks.adapters.main_konular_adapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private Toolbar toolbar;
    private ListView listofKonular;

    ArrayList<String> konular;
    ArrayList<Integer> resimler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        toolbar = findViewById(R.id.toolbarr);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("ADAYLIK KALDIRMA SINAVI");




        listofKonular = findViewById(R.id.konular);

        konular = new ArrayList<String>();
        konular.add("657 Sayılı Devlet Memurları Kanunu");
        konular.add("4483 Sayılı Devlet Memurlarının Yargılanması Hakkında Kanun");
        konular.add("Bakanlık Teşkilatı");
        konular.add("Öğretmen Uygulamaları");
        konular.add("İnkilap Tarihi ve Atatürkçülük");

        resimler = new ArrayList<Integer>();
        resimler.add(R.drawable.memur);
        resimler.add(R.drawable.yargilama);
        resimler.add(R.drawable.teskilat);
        resimler.add(R.drawable.ogretmen);
        resimler.add(R.drawable.inkilap);

        main_konular_adapter mk = new main_konular_adapter(MainActivity.this,konular,resimler);

        listofKonular.setAdapter(mk);




    }






}