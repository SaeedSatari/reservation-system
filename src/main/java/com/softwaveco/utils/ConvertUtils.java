package com.softwaveco.utils;

import com.google.gson.Gson;
import org.springframework.stereotype.Component;

@Component
public class ConvertUtils {

    private ConvertUtils(){}
    public static String objectToString(Object object) {
        Gson gson = new Gson();
        return gson.toJson(object);
    }
}
