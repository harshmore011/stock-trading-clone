package com.example.stockmarketsimulator;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<MyViewHolder> {
    ArrayList<StockDataProvider> dataProviderArrayList;
    MyViewHolder viewHolder;
    Context ctx;

    CustomAdapter(Context context, ArrayList<StockDataProvider> stockDataProviderArrayList) {
        ctx = context;
        dataProviderArrayList = stockDataProviderArrayList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.stockinfo_sample, parent, false);
        viewHolder = new MyViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder viewHolder, int position) {

        viewHolder.stockName.setText(dataProviderArrayList.get(position).getStockName());
        viewHolder.stockPrize.setText(dataProviderArrayList.get(position).getStockPrize());
        viewHolder.stockPrizeMovement.setText(dataProviderArrayList.get(position).getStockPrizeMovement());
        viewHolder.stockPrizeMovementPercent.setText(dataProviderArrayList.get(position).getStockPrizeMovementPercent());

    }

    @Override
    public int getItemCount() {
        return dataProviderArrayList.size();
    }
}

class MyViewHolder extends RecyclerView.ViewHolder {

    TextView stockName, stockPrize, stockPrizeMovement, stockPrizeMovementPercent;

    public MyViewHolder(@NonNull View view) {
        super(view);
        stockName = view.findViewById(R.id.stock_name);
        stockPrize = view.findViewById(R.id.stock_prize);
        stockPrizeMovement = view.findViewById(R.id.stock_prize_movement);
        stockPrizeMovementPercent = view.findViewById(R.id.stock_prize_movement_percentage);

    }
}