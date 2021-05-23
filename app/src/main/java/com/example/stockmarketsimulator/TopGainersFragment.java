package com.example.stockmarketsimulator;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TopGainersFragment extends Fragment {
    private RecyclerView recyclerView;
    private ArrayList<StockDataProvider> dataProviderArrayList;
    private CustomAdapter customAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_orders, container, false);
//
//        recyclerView = view.findViewById(R.id.topGainersRec);
//        dataProviderArrayList = new ArrayList<StockDataProvider>();
//
//        for (int i = 0; i <= 10; i++) {
//
//            dataProviderArrayList.add(new StockDataProvider("Bharti Airtel", "549.13", "5.56", "(+1.34%)"));
//        }
//
//        customAdapter = new CustomAdapter(getContext(), dataProviderArrayList);
//        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
//        recyclerView.setAdapter(customAdapter);

        return view;
    }
}
