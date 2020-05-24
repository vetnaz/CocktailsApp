package com.example.cocktailsapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface JsonPlaceHolder {

    @GET("api/json/v1/1/search.php?")
    Call<RezulList> getDrinks(@Query("s") String name);;
}
