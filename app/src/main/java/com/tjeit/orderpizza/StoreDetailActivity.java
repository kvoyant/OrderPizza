package com.tjeit.orderpizza;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tjeit.orderpizza.databinding.ActivityMainBinding;
import com.tjeit.orderpizza.databinding.ActivityStoreDetailBinding;
import com.tjeit.orderpizza.datas.PizzaStore;

public class StoreDetailActivity extends AppCompatActivity {

    PizzaStore mAppData;

    ActivityStoreDetailBinding act;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        act = DataBindingUtil.setContentView(this, R.layout.activity_store_detail);

        mAppData = (PizzaStore) getIntent().getSerializableExtra("앱정보");

        act.storeNameTxt.setText(mAppData.stroeName);

    }
}
