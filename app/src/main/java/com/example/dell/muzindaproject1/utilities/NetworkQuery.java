package com.example.dell.muzindaproject1.utilities;

import android.app.Activity;
import android.content.Context;
import android.util.Log;

import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

public class NetworkQuery {

    private static final String TAG = Activity.class.getSimpleName();
   // private WeatherData weatherData;

    public void getWeatherData(Context context, String URL){

        final JsonObjectRequest getRequest = new JsonObjectRequest(com.android.volley.Request.Method.GET, URL, null,
                new com.android.volley.Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {

                        String jsonData = response.toString();
                        WeatherData weatherData;

                        try {
                            weatherData = getDetails(jsonData);


                          // Gson gson = new Gson();
                          //  WeatherData weatherData = gson.fromJson(jsonData, WeatherData.class);


                        } catch (JSONException e) {
                            e.printStackTrace();
                        }


                        Log.d("Response", jsonData);


                    }
                }, new com.android.volley.Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                Log.d("Error.Response", String.valueOf(error));

            }
        });

        AppSingleton.getInstance(context).addToRequestQueue(getRequest);


    }


    private WeatherData getDetails(String jsonData) throws JSONException {
        JSONObject object = new JSONObject(jsonData);

        JSONObject location = object.getJSONObject("location");
        JSONObject current = object.getJSONObject("current");
        JSONObject condition = current.getJSONObject("condition");

        WeatherData data = new WeatherData();
        float humidity = (float) current.getDouble("humidity");
        String name = location.getString("name");

        data.setHumidity(humidity);
        data.setLocaltime(location.getString("localtime"));
        data.setName(name);
        data.setRegion(location.getString("region"));
        data.setTemp_c((float) current.getDouble("temp_c"));
        data.setWind_dir(current.getString("wind_dir"));
        data.setText(condition.getString("text"));



        return data;
    }

}
