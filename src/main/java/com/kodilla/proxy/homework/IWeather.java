package com.kodilla.proxy.homework;

public interface IWeather {

    default String getWeather() {
        return "Good weather";
    }

    default void refreshData() throws InterruptedException {
        Thread.sleep(5000);
    }
}
