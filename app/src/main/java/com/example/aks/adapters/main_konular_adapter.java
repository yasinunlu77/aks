package com.example.aks.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.aks.R;
import com.example.aks.bakanlik_teskilati;
import com.example.aks.devlet_memurlari_kanunu;
import com.example.aks.devlet_memurlarinin_yargilanmasi_kanunu;
import com.example.aks.inkilap_tarihi;
import com.example.aks.ogretmenlik_uygulamalari;

import java.util.ArrayList;

public class main_konular_adapter extends BaseAdapter {

    ArrayList<String> konular;
    ArrayList<Integer> resimler;
    Context context;

    public main_konular_adapter(Context context, ArrayList<String> konular, ArrayList<Integer> resimler){
        this.context = context;
        this.konular = konular;
        this.resimler = resimler;
    }


    @Override
    public int getCount() {
        return konular.size();
    }

    @Override
    public Object getItem(int position) {
        return konular.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View konulararayüzü = LayoutInflater.from(context).inflate(R.layout.konular,null);

        ImageView resim = konulararayüzü.findViewById(R.id.konuresmi);
        TextView konu = konulararayüzü.findViewById(R.id.konuismi);

        resim.setImageResource(resimler.get(position));
        konu.setText(konular.get(position));


        konulararayüzü.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(konular.get(position).equals("657 Sayılı Devlet Memurları Kanunu")){
                    Intent intent = new Intent(context, devlet_memurlari_kanunu.class);
                    context.startActivity(intent);
                }
                else if(konular.get(position).equals("4483 Sayılı Devlet Memurlarının Yargılanması Hakkında Kanun")){
                    Intent intent = new Intent(context, devlet_memurlarinin_yargilanmasi_kanunu.class);
                    context.startActivity(intent);
                }
                else if(konular.get(position).equals("Bakanlık Teşkilatı")){
                    Intent intent = new Intent(context, bakanlik_teskilati.class);
                    context.startActivity(intent);
                }
                else if(konular.get(position).equals("Öğretmen Uygulamaları")){
                    Intent intent = new Intent(context, ogretmenlik_uygulamalari.class);
                    context.startActivity(intent);
                }
                else if(konular.get(position).equals("İnkilap Tarihi ve Atatürkçülük")){
                    Intent intent = new Intent(context, inkilap_tarihi.class);
                    context.startActivity(intent);
                }
            }
        });







        return konulararayüzü;
    }




    public ArrayList<String> getKonular() {
        return konular;
    }

    public void setKonular(ArrayList<String> konular) {
        this.konular = konular;
    }

    public ArrayList<Integer> getResimler() {
        return resimler;
    }

    public void setResimler(ArrayList<Integer> resimler) {
        this.resimler = resimler;
    }
}
