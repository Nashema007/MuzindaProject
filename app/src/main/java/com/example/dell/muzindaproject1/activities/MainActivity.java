package com.example.dell.muzindaproject1.activities;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.dell.muzindaproject1.R;
import com.example.dell.muzindaproject1.utilities.DrawGraph;
import com.example.dell.muzindaproject1.utilities.NetworkQuery;
import com.example.dell.muzindaproject1.utilities.WeatherData;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.Date;


public class MainActivity extends AppCompatActivity {

    PieChart pieChart;
    LineChart lineChart;
    BarChart barChart;
    NetworkQuery networkQuery = new NetworkQuery();
    WeatherData weatherData = new WeatherData();



    private static final String URL = "http://169.254.28.11/MuzindaProject/jsonformatter.txt";
    //private static final String URL = "http://api.apixu.com/v1/current.json?key=c67e0cc1a5e24d0389b75123182705&q=Harare";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        networkQuery.getWeatherData(this, URL);

        Date date = new Date();
        date.setTime(1527416979);
        String hour = String.valueOf(date.getTime());
        Toast.makeText(this, hour, Toast.LENGTH_LONG).show();


        pieChart = findViewById(R.id.weeklyPie);
        lineChart = findViewById(R.id.line);
        barChart = findViewById(R.id.dailyBar);







        String a =  weatherData.getName();




        Float[] x = {1600f, 1700f, 1800f, 1900f, 2000f};
        Float[] x1 = {1600f, 1700f, 1800f, 1900f, 2000f};
        Float[] y = {13f, 12.3f, 12.4f, 15.4f, 15.7f};
        Float[] y1 = {12.2f, 21.3f, 12.5f, 11.7f, 5.9f};
        Float[] weeklyAverage = {12.2f, 21.3f, 12.5f, 11.7f, 5.9f, 12.2f, 21.3f};
        String[] dayOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        DrawGraph graph = new DrawGraph();

        graph.currentStats(x, y, lineChart, Color.RED, "Temp");
        graph.dailyStats(x1, y1, barChart, Color.RED, "Average Daily Temperature");
        graph.weeklyStats(weeklyAverage, dayOfWeek, pieChart, ColorTemplate.PASTEL_COLORS, "Weekly Average");


    }




    }


