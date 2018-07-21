package com.code_lama.recyclerview;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RehberAdapter extends RecyclerView.Adapter<RehberViewHolder>{

    Activity activity;
    List<Kisi> kisiList;

    public RehberAdapter(Activity activity, List<Kisi> kisiList) {
        this.activity = activity;
        this.kisiList = kisiList;
    }

    @NonNull
    @Override
    public RehberViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(activity).inflate(R.layout.rehber_item,parent,false);

        return new RehberViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RehberViewHolder holder, int position) {

        Kisi kisi = kisiList.get(position);

        holder.resim.setImageResource(kisi.getResim());
        holder.isim.setText(kisi.getIsim());
        holder.numara.setText(kisi.getNumara());

    }

    @Override
    public int getItemCount() {
        return kisiList.size();
    }
}

class RehberViewHolder extends RecyclerView.ViewHolder {

    ImageView resim;
    TextView isim,numara;

    public RehberViewHolder(View itemView) {
        super(itemView);

        resim = itemView.findViewById(R.id.resim);
        isim = itemView.findViewById(R.id.isim);
        numara = itemView.findViewById(R.id.numara);

    }
}