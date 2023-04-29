package com.example.demo.controller;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class BetType {

    private String betType;

    List<BetTypeKey> betTypeKey;

    public BetType(String betType, List<BetTypeKey> betTypeKey) {
        this.betType = betType;
        this.betTypeKey = betTypeKey;
    }
}
