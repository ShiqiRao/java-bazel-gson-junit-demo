package com.example.demo;

import com.google.gson.Gson;
import org.junit.Test;


public class TestCases {

    @Test
    public void primitives() {
        Gson gson = new Gson();
        assert gson.toJson(1).equals("1");            // ==> 1
        assert gson.toJson("abcd").equals("\"abcd\"");       // ==> "abcd"
        assert gson.toJson(new Long(10)).equals("10"); // ==> 10
        int[] values = {1};
        assert gson.toJson(values).equals("[1]");       // ==> [1]

        // Deserialization
        int one = gson.fromJson("1", int.class);
        assert one == 1;
        Integer oneInteger = gson.fromJson("1", Integer.class);
        assert oneInteger == 1;
        Long oneLong = gson.fromJson("1", Long.class);
        assert oneLong == 1L;
        Boolean falseBoolean = gson.fromJson("false", Boolean.class);
        assert !falseBoolean;
        String str = gson.fromJson("\"abc\"", String.class);
        assert str.equals("abc");
        String[] anotherStr = gson.fromJson("[\"abc\"]", String[].class);
        assert anotherStr[0].equals("abc");
    }

}
