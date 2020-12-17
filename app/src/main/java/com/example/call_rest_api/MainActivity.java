package com.example.call_rest_api;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

import java.net.URI;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String URI = "https://simplifiedcoding.net/demos/marvel/";

        //First you have to create a request Queue

        RequestQueue requestQueue = Volley.newRequestQueue(this);

        //Now you have that request queue
        //Now you have to construct actual request queue
        //Three ways Request queue 1.JSONObjectRequest ,2.StringRequest

        //Going to create JSON Object

        JsonObjectRequest objectRequest = new JsonObjectRequest(
                Request.Method.GET,
                URI,
                null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {

                        Log.e("Rest Response",response.toString());

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                        Log.e("Rest Response",error.toString());

                    }
                }
        );

        requestQueue.add(objectRequest);

    }
}