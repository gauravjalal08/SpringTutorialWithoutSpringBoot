package com.example;

public class Client {
    public static void main(String[] args) {
        BulbService bulbService = new BulbService();
        System.out.println(bulbService.askForBulb());

    }
}
