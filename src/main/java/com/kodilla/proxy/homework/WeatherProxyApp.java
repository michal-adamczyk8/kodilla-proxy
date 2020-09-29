package com.kodilla.proxy.homework;

import java.util.Random;

public class WeatherProxyApp {
    public static void main(String[] args) throws InterruptedException {
        long begin = System.currentTimeMillis();
        Random random = new Random();
        int randomInt = random.nextInt(5);
        for (int i = 1; i <= 10; i++) {
            IWeather weather = new ProxyWeather();
            System.out.println(weather.getWeather());
            if (randomInt == i || randomInt == i/2) {
                System.out.println("Refreshing...");
                weather.refreshData();
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("The execution took: " + (end - begin) + " [ms]");
    }
}
