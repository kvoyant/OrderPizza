package com.tjeit.orderpizza.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.tjeit.orderpizza.R;
import com.tjeit.orderpizza.datas.PizzaStore;

import java.util.List;

public class PizzaStoreAdapter extends ArrayAdapter<PizzaStore> {
    Context mContext;
    List<PizzaStore> mList;
    LayoutInflater inf;

    public PizzaStoreAdapter(Context context, List<PizzaStore> list) {
        super(context, R.layout.store_list, list);

        mContext = context;
        mList = list;
        inf = LayoutInflater.from(mContext);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;

        if(row == null) {
            row = inf.inflate(R.layout.store_list,null);
        }

        PizzaStore storeData = mList.get(position);
        TextView storeNameTxt = row.findViewById(R.id.stroeNameTxt);
        TextView imgURL = row.findViewById(R.id.imgURL);
        TextView openTimeTxt = row.findViewById(R.id.openTimeTxt);

        storeNameTxt.setText(storeData.stroeName);
        openTimeTxt.setText(storeData.openTime);

        return row;
    }
}
