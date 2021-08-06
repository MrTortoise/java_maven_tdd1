

public class Tennis {

    public static final String LOVE = "love";
    public static final String FIFTEEN = "15";
    public static final String THIRTY = "30";
    public static final String FOURTY = "40";
    public static final String ADVANTAGE = "adv";
    public static final String WINNER = "win";

    private String player1Score = LOVE;
    private String player2Score = LOVE;

    private class ScoreResult{
        private final String currentScore;
        private final String otherScore;

        public ScoreResult(String currentPlayerScore, String otherPlayerScore){
            currentScore = currentPlayerScore;
            otherScore = otherPlayerScore;
        }
    }

    public String performAction(TennisAction player) {

        switch (player) {
            case One -> {
                ScoreResult result = UpdateScore(player1Score, player2Score);
                player1Score = result.currentScore;
                player2Score = result.otherScore;
            }
            case Two -> {
                ScoreResult result = UpdateScore(player2Score, player1Score);
                player2Score = result.currentScore;
                player1Score = result.otherScore;
            }
            case StartGame -> {
                player1Score = LOVE;
                player2Score = LOVE;
            }
            default -> throw new IllegalStateException("Unexpected value: " + player1Score);
        }

        return buildScore();
    }

    private ScoreResult UpdateScore(String currentPlayerScore, String otherPlayerScore) {
        String currentScore = currentPlayerScore;
        String otherScore = otherPlayerScore;
        if(otherScore.equals(ADVANTAGE)){
            currentScore = FOURTY;
            otherScore = FOURTY;
        }
        else{
            if (currentScore.equals(ADVANTAGE)) {
                currentScore = WINNER;
            }

            if (currentScore.equals(FOURTY)) {
                currentScore = ADVANTAGE;
            }
            if (currentScore.equals(THIRTY)) {
                currentScore = FOURTY;
            }
            if (currentScore.equals(FIFTEEN)) {
                currentScore = THIRTY;
            }
            if (currentScore.equals(LOVE)) {
                currentScore = FIFTEEN;
            }
        }

        return new ScoreResult(currentScore, otherScore);
    }

    private String buildScore() {
        if(player1Score.equals(WINNER)){
            return "winner player 1";
        }
        if(player2Score.equals(WINNER)){
            return "winner player 2";
        }

        if(player1Score.equals(ADVANTAGE)){
            if(player2Score.equals(FOURTY)){
                return "advantage player 1";
            }
            return "winner player 1";
        }

        if(player2Score.equals(ADVANTAGE)){
            if(player1Score.equals(FOURTY)){
                return "advantage player 2";
            }
            return "winner player 2";
        }

        if(player1Score.equals(FOURTY) && player2Score.equals(FOURTY)){
            return "deuce";
        }
        return player1Score + "-" + player2Score;
    }
}
