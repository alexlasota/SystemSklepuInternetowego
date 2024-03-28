package com.shop.model;

public class Computer extends Product {

    private String processor;
    private RamSize ramSize;

    public enum RamSize {
        RAM_4GB(4),
        RAM_8GB(8),
        RAM_16GB(16),
        RAM_32GB(32);

        private final int value;

        RamSize(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }


    public Computer(long id, String productName, double price, int amountOfProduct, String processor, RamSize ramSize) {
        super(id, productName, price, amountOfProduct);
        this.processor = processor;
        this.ramSize = ramSize;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public RamSize getRamSize() {
        return ramSize;
    }

    public void setRamSize(RamSize ramSize) {
        if (ramSize != null) {
            this.ramSize = ramSize;
        } else {
            throw new IllegalArgumentException("RAM size cannot be null");
        }
    }
}

