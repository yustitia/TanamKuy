package com.adis.tanamkuy.Kebun;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.adis.tanamkuy.API.APIEnd;
import com.adis.tanamkuy.API.APIService;
import com.adis.tanamkuy.Adapter.KebunAdapter;
import com.adis.tanamkuy.Model.Item;
import com.adis.tanamkuy.Model.KebunModel;
import com.adis.tanamkuy.R;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A simple {@link Fragment} subclass.
 */
public class KebunFragment extends Fragment {

        private KebunAdapter viewAdapter;
        private List<Item> mItems = new ArrayList<>();
        private RecyclerView.LayoutManager mLayoutManager;

        @Nullable
        @Override
        public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            final View myFragment = inflater.inflate(R.layout.fragment_kebun,container,false);
            final RecyclerView recyclerView = myFragment.findViewById(R.id.feed_id_r);
            viewAdapter = new KebunAdapter(getContext(), mItems);
            mLayoutManager = new GridLayoutManager(getActivity(),2);
            recyclerView.setLayoutManager(mLayoutManager);
            recyclerView.setItemAnimator(new DefaultItemAnimator());
            recyclerView.setAdapter(viewAdapter);
            APIService api = APIEnd.getClient().create(APIService.class);
            Call<KebunModel> call = api.getPegiMakan();
            call.enqueue(new Callback<KebunModel>() {
                @Override
                public void onResponse(Call<KebunModel> call, Response<KebunModel> response) {
                    mItems = response.body().getItem();
                    viewAdapter = new KebunAdapter(getContext(), mItems);
                    recyclerView.setAdapter(viewAdapter);
                }

                @Override
                public void onFailure(Call<KebunModel> call, Throwable t) {
                    Toast.makeText(getContext(), "Tidak Ada Koneksi ! ", Toast.LENGTH_SHORT).show();

                }
            });


            return myFragment;

        }


    }