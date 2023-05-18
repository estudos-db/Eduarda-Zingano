package com.example.BibliotecaApi.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.time.Year;

public class GsonForYear {

    private GsonForYear(){}
    public static Gson getGson(){
        return new GsonBuilder()
                .registerTypeAdapter(Year.class, new YearAdapter())
                .create();
    }
}
