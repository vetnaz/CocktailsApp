package com.example.cocktailsapp;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RezulList {
    @SerializedName("drinks")
   private List<Drinks> drinksList;

    public List<Drinks> getDrinksList() {
        return drinksList;
    }

    public void setDrinksList(List<Drinks> drinksList) {
        this.drinksList = drinksList;
    }
}
