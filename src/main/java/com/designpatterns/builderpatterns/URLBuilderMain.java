package com.designpatterns.builderpatterns;

public class URLBuilderMain {
    public static void main(String[] args) {
        URLBuilder.Builder builder = new URLBuilder.Builder();
        URLBuilder urlBuilder = builder.protocol("http://").hostName("localhost").port("8080").build();
        System.out.print(urlBuilder.protocol);
        System.out.print(urlBuilder.hostName);
        System.out.print(urlBuilder.port);
    }
}
