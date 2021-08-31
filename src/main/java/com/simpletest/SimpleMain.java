package com.simpletest;


import static example.simple.Simple.SimpleMessage;

public class SimpleMain {
    public static void main(String[] args) {
        System.out.println("Hello World");
        SimpleMessage.Builder builder = SimpleMessage.newBuilder();
        builder.setId(2)
                .setName("Xavier")
                .setIsSimple(false);
        System.out.println(builder.toString());

        SimpleMessage message = builder.build();
    }
}
