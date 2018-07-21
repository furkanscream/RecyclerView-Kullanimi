package com.code_lama.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);


        List<Kisi> kisiList = new ArrayList<>();
        kisiList.add(new Kisi().setIsim("Cihan Gül").setNumara("0555 555 55 55").setResim(R.drawable.user));
        kisiList.add(new Kisi().setIsim("Furkan Canöz").setNumara("0555 555 55 55").setResim(R.drawable.user));
        kisiList.add(new Kisi().setIsim("Ömer Koç").setNumara("0555 555 55 55").setResim(R.drawable.user));
        kisiList.add(new Kisi().setIsim("Ahmet Akın").setNumara("0555 555 55 55").setResim(R.drawable.user));
        kisiList.add(new Kisi().setIsim("Mehmet Koçak").setNumara("0555 555 55 55").setResim(R.drawable.user));
        kisiList.add(new Kisi().setIsim("Sait Okur").setNumara("0555 555 55 55").setResim(R.drawable.user));
        kisiList.add(new Kisi().setIsim("Burcu Kerimoğlu").setNumara("0555 555 55 55").setResim(R.drawable.user));
        kisiList.add(new Kisi().setIsim("Ramazan Göktaş").setNumara("0555 555 55 55").setResim(R.drawable.user));
        kisiList.add(new Kisi().setIsim("İbrahim Kaya").setNumara("0555 555 55 55").setResim(R.drawable.user));
        kisiList.add(new Kisi().setIsim("Cihan Gül").setNumara("0555 555 55 55").setResim(R.drawable.user));
        kisiList.add(new Kisi().setIsim("Furkan Canöz").setNumara("0555 555 55 55").setResim(R.drawable.user));
        kisiList.add(new Kisi().setIsim("Ömer Koç").setNumara("0555 555 55 55").setResim(R.drawable.user));

        RehberAdapter rehberAdapter = new RehberAdapter(this,kisiList);
        recyclerView.setAdapter(rehberAdapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);

    }
}
