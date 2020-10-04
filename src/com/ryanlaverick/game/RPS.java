package com.ryanlaverick.game;

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
