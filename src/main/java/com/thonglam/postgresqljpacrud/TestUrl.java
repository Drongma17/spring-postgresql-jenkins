package com.thonglam.postgresqljpacrud;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.util.JSONPObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class TestUrl {

    public static void main(String[] args) {

        System.setProperty("http.agent", "chrome");
        try {
           // URL url=new URL("http://jsonplaceholder.typicode.com/posts");
            URL url=new URL("https://coderbyte.com/api/challenges/json/rest-get-simple");
            try {
                URLConnection con = url.openConnection();
                InputStream inputStream=con.getInputStream();
                System.out.println(inputStream);
                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String inputline;
                StringBuffer response=new StringBuffer();
                while ((inputline = in.readLine()) != null){
                    response.append(inputline);
                }
                in.close();
                System.out.println(response.toString());

            }catch (IOException ioException){
                System.out.println(ioException);
            }
        }catch (MalformedURLException exception){
            System.out.println(exception);
        }
    }
}
