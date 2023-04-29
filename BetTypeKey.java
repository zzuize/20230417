package com.example.demo.controller;

import lombok.Data;

@Data
public class BetTypeKey {
    String key;
    String enValue;

    public BetTypeKey(String key, String enValue) {
        this.key = key;
        this.enValue = enValue;
    }
}
