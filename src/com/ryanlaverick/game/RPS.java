package com.ryanlaverick.game;

import java.util.Arrays;
import java.util.TreeMap;

public enum RPS {
    ROCK("Rock", "Scissors", "Rock", "Paper"),
    PAPER("Paper", "Rock", "Paper", "Scissors"),
    SCISSORS("Scissors", "Paper", "Scissors", "Rock");

    String name, beats, drawsTo, losesTo;

    RPS(String name, String beats, String drawsTo, String losesTo) {
        this.name = name;
        this.beats = beats;
        this.drawsTo = drawsTo;
        this.losesTo = losesTo;
    }

    private static TreeMap<String, RPS> mapIndex = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

    static {
        for(RPS rps : values()) {
            mapIndex.put(rps.getName(), rps);
        }
    }

    public static RPS lookup(String s) {
        return mapIndex.get(s);
    }

    public static boolean isRegistered(String s) {
        return mapIndex.containsKey(s);
    }

    public String getName() {
        return name;
    }

    public String getBeats() {
        return beats;
    }

    public String getDrawsTo() {
        return drawsTo;
    }

    public String getLosesTo() {
        return losesTo;
    }
}
