package com.tjeit.orderpizza;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.tjeit.orderpizza.adapters.PizzaStoreAdapter;
import com.tjeit.orderpizza.databinding.ActivityMainBinding;
import com.tjeit.orderpizza.datas.PizzaStore;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    PizzaStoreAdapter mStoreAdapter;
    List<PizzaStore> storeList = new ArrayList<>();
    ActivityMainBinding act;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("피자 주문 앱");
        super.onCreate(savedInstanceState);

        bindViews();
        fillDatas();

        mStoreAdapter = new PizzaStoreAdapter(MainActivity.this, storeList);
        act.storeListView.setAdapter(mStoreAdapter);

        setValues();

        act.storeListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(MainActivity.this, String.format("%d번쨰 줄 클릭",position), Toast.LENGTH_SHORT).show();

                PizzaStore clickedData = storeList.get(position);
                Intent intent = new Intent(MainActivity.this, StoreDetailActivity.class);
                intent.putExtra("앱정보", clickedData);
                startActivity(intent);
            }
        });

    }



    private void bindViews() {
        act = DataBindingUtil.setContentView(this, R.layout.activity_main);
    }

    private void setValues() {
        //Glide.with(mContext).load("http://cfs15.tistory.com/image/24/tistory/2008/11/05/18/00/491160cb593e2").into(act.pizzaLogoImgView);
    }


    void fillDatas() {
        storeList.add(new PizzaStore("https://mblogthumb-phinf.pstatic.net/20141124_182/howtomarry_1416806028308979cg_PNG/Pizza_Hut_logo.svg.png?type=w2", "피자헛", "15:00 ~ 21:00"));
        storeList.add(new PizzaStore("https://mblogthumb-phinf.pstatic.net/20141124_182/howtomarry_1416806028308979cg_PNG/Pizza_Hut_logo.svg.png?type=w2", "미스터피자", "15:00 ~ 22:00"));
        storeList.add(new PizzaStore("https://mblogthumb-phinf.pstatic.net/20141124_182/howtomarry_1416806028308979cg_PNG/Pizza_Hut_logo.svg.png?type=w2", "파파존스", "15:00 ~ 23:00"));
        storeList.add(new PizzaStore("https://mblogthumb-phinf.pstatic.net/20141124_182/howtomarry_1416806028308979cg_PNG/Pizza_Hut_logo.svg.png?type=w2", "도미노피자", "15:00 ~ 24:00"));
    }
}
