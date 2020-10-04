package com.ryanlaverick.game;

import java.util.concurrent.ThreadLocalRandom;

public class RPSGame {
    private RPS generatedResult;
    private GameResult result;

    public RPSGame() {
        this.generatedResult = RPS.values()[ThreadLocalRandom.current().nextInt(RPS.values().length)];
    }

    public RPS getGeneratedResult() {
        return generatedResult;
    }

    public GameResult getResult(String userInput) {
        RPS user = get(userInput);

        if(user != null) {

            if(user.getBeats().equalsIgnoreCase(generatedResult.getLosesTo())) {
                return GameResult.WIN;
            }

            else if(user.getDrawsTo().equalsIgnoreCase(generatedResult.getDrawsTo())) {
                return GameResult.DRAW;
            }

            else if(user.getLosesTo().equalsIgnoreCase(generatedResult.getBeats())) {
                return GameResult.LOSS;
            }

        }

        return null;
    }

    public boolean isChoice(String userInput) {
        for(RPS results : RPS.values()) {

            if(userInput.equalsIgnoreCase(results.getName())) {
                return true;
            }

        }

        return false;
    }

    public RPS get(String userInput) {
        for(RPS results : RPS.values()) {

            if(userInput.equalsIgnoreCase(results.getName())) {
                return results;
            }

        }

        return null;
    }




}
