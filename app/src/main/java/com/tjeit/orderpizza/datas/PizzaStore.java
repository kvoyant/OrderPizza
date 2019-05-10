package com.tjeit.orderpizza.datas;

import java.io.Serializable;

public class PizzaStore implements Serializable {
    public String imgURL;
    public String stroeName;
    public String openTime;


    public PizzaStore(String imgURL, String stroeName, String openTime) {
        this.imgURL = imgURL;
        this.stroeName = stroeName;
        this.openTime = openTime;
    }
}
