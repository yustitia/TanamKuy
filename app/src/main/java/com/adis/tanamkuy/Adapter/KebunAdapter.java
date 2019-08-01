package com.adis.tanamkuy.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.adis.tanamkuy.Model.Item;
import com.adis.tanamkuy.R;
import com.bumptech.glide.Glide;

import java.util.List;

public class KebunAdapter extends RecyclerView.Adapter<KebunAdapter.MyHolder> {

    List<Item> mList;
    Context ctx;

    public KebunAdapter(Context ctx,List<Item> mList) {
        this.mList = mList;
        this.ctx = ctx;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View layout = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_list_item_f,viewGroup, false);
        final MyHolder holder = new MyHolder(layout);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder myHolder, int i) {
        Item restoList = mList.get(i);
        myHolder.nama.setText(restoList.getNama_tanaman());
        myHolder.jenis.setText(restoList.getJenis_tanaman());
        myHolder.harga.setText(restoList.getHarga_bibit());
        Glide.with(ctx).load(restoList.getGambar_tanaman()).override(350,550).into(myHolder.foto);
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }



    public class MyHolder extends RecyclerView.ViewHolder {
        TextView nama, jenis, harga;
        ImageView foto;
        Button btnDetail;
        public MyHolder(View v)
        {
            super(v);

            nama  = (TextView) v.findViewById(R.id.nama_resto);
            jenis = (TextView) v.findViewById(R.id.alamat);
            harga = (TextView) v.findViewById(R.id.phone);
            foto = (ImageView) v.findViewById(R.id.fotoresto);
            btnDetail = (Button) v.findViewById(R.id.btn_detail);

        }

    }
}
