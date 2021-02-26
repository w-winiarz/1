package com.company;

public class Phone
{
    final public String producer;
    final public String model;
    final public double screenSize;
    final public String operationSystem;


    public Phone(String producer, String model, double screenSize, String operationSystem) {
        this.producer = producer;
        this.model = model;
        this.screenSize = screenSize;
        this.operationSystem = operationSystem;
    }
}
