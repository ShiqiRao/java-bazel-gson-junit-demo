package com.example.demo;

import com.google.gson.Gson;

public class App {
    public static void main(String[] args) {
        // Serialization
        Gson gson = new Gson();
        gson.toJson(1);            // ==> 1
        gson.toJson("abcd");       // ==> "abcd"
        gson.toJson(new Long(10)); // ==> 10
        int[] values = {1};
        gson.toJson(values);       // ==> [1]

        // Deserialization
        int one = gson.fromJson("1", int.class);
        Integer oneInteger = gson.fromJson("1", Integer.class);
        Long oneLong = gson.fromJson("1", Long.class);
        Boolean falseBoolean = gson.fromJson("false", Boolean.class);
        String str = gson.fromJson("\"abc\"", String.class);
        String[] anotherStr = gson.fromJson("[\"abc\"]", String[].class);

    }
}
