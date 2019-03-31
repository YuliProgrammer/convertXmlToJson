package com.dolnikova;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import com.google.gson.Gson;

import java.io.PrintWriter;
import java.io.File;

public class Main {

    public static void main(String[] args) {

        try {
            XmlMapper xmlMapper = new XmlMapper();
            xmlMapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
            Group group = xmlMapper.readValue(new File("group.xml"), Group.class);

            Gson gson = new Gson();
            String jsonString = gson.toJson(group);

            File JSON = new File("group.json");
            PrintWriter writer = new PrintWriter(JSON, "UTF-8");
            writer.println(jsonString);
            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}