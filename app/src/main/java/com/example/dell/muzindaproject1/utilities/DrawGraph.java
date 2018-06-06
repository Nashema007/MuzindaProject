package com.example.dell.muzindaproject1.utilities;

import android.graphics.Color;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;

import java.util.ArrayList;

public class DrawGraph {

    public DrawGraph() {

    }





    public void currentStats(Float[] xValues, Float[] yValues, LineChart lineChart, int color, String Label){



        ArrayList<Entry> line = new ArrayList<>();

        int count;

        for(count = 0; count < xValues.length; count++){

                line.add(new Entry(xValues[count],yValues[count])) ;
        }
        LineDataSet lineDataSet = new LineDataSet(line, Label);

        lineDataSet.setFillAlpha(110);
        lineDataSet.setColor(color);
        lineDataSet.setLineWidth(5f);
        lineDataSet.setFormSize(30f);
        Legend legend =lineChart.getLegend();
        legend.setTextSize(20f);
        legend.setFormSize(20f);

      XAxis xAxis = lineChart.getXAxis();
      xAxis.setTextSize(20f);






        ArrayList<ILineDataSet>  dataSets = new ArrayList<>();
        dataSets.add(lineDataSet);
        LineData data = new LineData(dataSets);
        lineChart.setData(data);
    }



    public void dailyStats(Float[] xValues, Float[] yValues, BarChart barChart, int color, String Label){

        ArrayList<BarEntry> bar = new ArrayList<>();

        int count;
        for(count = 0; count < xValues.length; count++) {
            bar.add(new BarEntry(xValues[count], yValues[count]));
        }


        XAxis xAxis = barChart.getXAxis();
        xAxis.setTextSize(20f);


        Legend legend = barChart.getLegend();
        legend.setTextSize(20f);
        legend.setFormSize(20f);




        BarDataSet barDataSet = new BarDataSet(bar, Label);
        barDataSet.setBarBorderWidth(20f);
        barDataSet.setBarBorderColor(color);

        ArrayList<IBarDataSet> dataSets = new ArrayList<>();
        dataSets.add(barDataSet);

        BarData barData = new BarData(dataSets);
        barChart.setData(barData);



    }


    public void weeklyStats(Float[] xValues, String[] yValues, PieChart pieChart, int[] color, String Label){




        pieChart.setUsePercentValues(true);
        pieChart.getDescription().setEnabled(false);
        pieChart.setExtraOffsets(5,10,5,5);
        pieChart.setDragDecelerationFrictionCoef(0.95f);

        pieChart.setDrawHoleEnabled(true);
        pieChart.setHoleColor(Color.WHITE);
        pieChart.setTransparentCircleRadius(61f);

        ArrayList<PieEntry> charts = new ArrayList<>();

        int count;
        for(count = 0; count < xValues.length; count++) {
            charts.add(new PieEntry(xValues[count], yValues[count]));
        }

        Legend legend = pieChart.getLegend();
        legend.setTextSize(20f);
        legend.setFormSize(20f);


        PieDataSet dataSet = new PieDataSet(charts, Label);
        dataSet.setSliceSpace(3f);
        dataSet.setSelectionShift(10f);
        dataSet.setColors(color);

        PieData data = new PieData(dataSet);
        data.setValueTextSize(30f);
        data.setValueTextColor(Color.BLACK);

        pieChart.setData(data);
    }


}