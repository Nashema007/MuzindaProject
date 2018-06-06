package com.example.dell.muzindaproject1.utilities;



public class WeatherData{
    private String name;
    private String region;
    private String localtime;
    private float humidity;
    private float temp_c;
    private String wind_dir;
    private String text;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getLocaltime() {
        return localtime;
    }

    public void setLocaltime(String localtime) {
        this.localtime = localtime;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getTemp_c() {
        return temp_c;
    }

    public void setTemp_c(float temp_c) {
        this.temp_c = temp_c;
    }

    public String getWind_dir() {
        return wind_dir;
    }

    public void setWind_dir(String wind_dir) {
        this.wind_dir = wind_dir;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

/*public class WeatherData {

    Location location;
    Current current;


   public static class Location{
       private String name;
       private String region;
       private String localtime;

       public String getName() {
           return name;
       }

       public void setName(String name) {
           this.name = name;
       }

       public String getRegion() {
           return region;
       }

       public void setRegion(String region) {
           this.region = region;
       }

       public String getLocaltime() {
           return localtime;
       }

       public void setLocaltime(String localtime) {
           this.localtime = localtime;
       }
   }



   public static class Current{
       private float humidity;
       private float temp_c;
       private String wind_dir;

       Condition condition;

       public float getHumidity() {
           return humidity;
       }

       public void setHumidity(float humidity) {
           this.humidity = humidity;
       }

       public float getTemp_c() {
           return temp_c;
       }

       public void setTemp_c(float temp_c) {
           this.temp_c = temp_c;
       }

       public String getWind_dir() {
           return wind_dir;
       }

       public void setWind_dir(String wind_dir) {
           this.wind_dir = wind_dir;
       }

       public class Condition{

           private String text;

           public String getText() {
               return text;
           }

           public void setText(String text) {
               this.text = text;
           }
       }
   }

}*/
