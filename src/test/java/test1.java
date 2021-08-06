import org.junit.Assert;
import org.junit.Test;

public class test1 extends Tennis {
    @Test
    public void shouldStartWithLoveLove() {
        Tennis tennis = new Tennis();
        String result = tennis.performAction(TennisAction.StartGame);
        Assert.assertEquals("love-love",result);
        result = tennis.performAction(TennisAction.Two);
        result = tennis.performAction(TennisAction.StartGame);
        Assert.assertEquals("love-love",result);
    }

    @Test
    public void Love15AfterPlayer2Scores() {
        Tennis tennis = new Tennis();
        String result = tennis.performAction(TennisAction.StartGame);
        result = tennis.performAction(TennisAction.Two);
        Assert.assertEquals("love-15",result);
    }

    @Test
    public void PLayer1Scores15Love() {
        Tennis tennis = new Tennis();
        String result = tennis.performAction(TennisAction.StartGame);
        result = tennis.performAction(TennisAction.One);
        Assert.assertEquals("15-love",result);
    }

    @Test
    public void fifteenFifteen() {
        Tennis tennis = new Tennis();
        String result = tennis.performAction(TennisAction.StartGame);
        result = tennis.performAction(TennisAction.One);
        result = tennis.performAction(TennisAction.Two);
        Assert.assertEquals("15-15",result);
    }

    @Test
    public void fifteenFifteen2() {
        Tennis tennis = new Tennis();
        String result = tennis.performAction(TennisAction.StartGame);
        result = tennis.performAction(TennisAction.Two);
        result = tennis.performAction(TennisAction.One);

        Assert.assertEquals("15-15",result);
    }

    @Test
    public void thirtyFifteen() {
        Tennis tennis = new Tennis();
        String result = tennis.performAction(TennisAction.StartGame);
        result = tennis.performAction(TennisAction.One);
        result = tennis.performAction(TennisAction.Two);
        result = tennis.performAction(TennisAction.One);
        Assert.assertEquals("30-15",result);
    }

    @Test
    public void fifteenThirty() {
        Tennis tennis = new Tennis();
        String result = tennis.performAction(TennisAction.StartGame);
        result = tennis.performAction(TennisAction.One);
        result = tennis.performAction(TennisAction.Two);
        result = tennis.performAction(TennisAction.Two);
        Assert.assertEquals("15-30",result);
    }

    @Test
    public void thirtyThirty() {
        Tennis tennis = new Tennis();
        String result = tennis.performAction(TennisAction.StartGame);
        result = tennis.performAction(TennisAction.One);
        result = tennis.performAction(TennisAction.Two);
        result = tennis.performAction(TennisAction.Two);
        result = tennis.performAction(TennisAction.One);
        Assert.assertEquals("30-30",result);
    }

    @Test
    public void fourtyThirty() {
        Tennis tennis = new Tennis();
        String result = tennis.performAction(TennisAction.StartGame);
        result = tennis.performAction(TennisAction.One);
        result = tennis.performAction(TennisAction.Two);
        result = tennis.performAction(TennisAction.Two);
        result = tennis.performAction(TennisAction.One);
        result = tennis.performAction(TennisAction.One);
        Assert.assertEquals("40-30",result);
    }

    @Test
    public void thirtyFourty() {
        Tennis tennis = new Tennis();
        String result = tennis.performAction(TennisAction.StartGame);
        result = tennis.performAction(TennisAction.One);
        result = tennis.performAction(TennisAction.Two);
        result = tennis.performAction(TennisAction.Two);
        result = tennis.performAction(TennisAction.One);
        result = tennis.performAction(TennisAction.Two);
        Assert.assertEquals("30-40",result);
    }

    @Test
    public void deuceFirst() {
        Tennis tennis = new Tennis();
        String result = tennis.performAction(TennisAction.StartGame);
        result = tennis.performAction(TennisAction.One);
        result = tennis.performAction(TennisAction.Two);
        result = tennis.performAction(TennisAction.Two);
        result = tennis.performAction(TennisAction.One);
        result = tennis.performAction(TennisAction.Two);
        result = tennis.performAction(TennisAction.One);
        Assert.assertEquals("deuce",result);
    }

    @Test
    public void advantageOne() {
        Tennis tennis = new Tennis();
        String result = tennis.performAction(TennisAction.StartGame);
        result = tennis.performAction(TennisAction.One);
        result = tennis.performAction(TennisAction.Two);
        result = tennis.performAction(TennisAction.Two);
        result = tennis.performAction(TennisAction.One);
        result = tennis.performAction(TennisAction.Two);
        result = tennis.performAction(TennisAction.One);
        result = tennis.performAction(TennisAction.One);
        Assert.assertEquals("advantage player 1",result);
    }

    @Test
    public void advantageTwo() {
        Tennis tennis = new Tennis();
        String result = tennis.performAction(TennisAction.StartGame);
        result = tennis.performAction(TennisAction.One);
        result = tennis.performAction(TennisAction.Two);
        result = tennis.performAction(TennisAction.Two);
        result = tennis.performAction(TennisAction.One);
        result = tennis.performAction(TennisAction.Two);
        result = tennis.performAction(TennisAction.One);
        result = tennis.performAction(TennisAction.Two);
        Assert.assertEquals("advantage player 2",result);
    }

    @Test
    public void player1WinsNoAdvantage() {
        Tennis tennis = new Tennis();
        String result = tennis.performAction(TennisAction.StartGame);
        result = tennis.performAction(TennisAction.One);
        result = tennis.performAction(TennisAction.Two);
        result = tennis.performAction(TennisAction.Two);
        result = tennis.performAction(TennisAction.One);
        result = tennis.performAction(TennisAction.One);
        result = tennis.performAction(TennisAction.One);
        Assert.assertEquals("winner player 1",result);
    }

    @Test
    public void player1getsDeuceAfterPlayer2Advantage() {
        Tennis tennis = new Tennis();
        String result = tennis.performAction(TennisAction.StartGame);
        result = tennis.performAction(TennisAction.One);
        result = tennis.performAction(TennisAction.Two);
        result = tennis.performAction(TennisAction.Two);
        result = tennis.performAction(TennisAction.One);
        result = tennis.performAction(TennisAction.One);
        result = tennis.performAction(TennisAction.Two);
        result = tennis.performAction(TennisAction.Two);
        result = tennis.performAction(TennisAction.One);
        Assert.assertEquals("deuce",result);
    }

    @Test
    public void player2getsDeuceAfterPlayer1Advantage() {
        Tennis tennis = new Tennis();
        String result = tennis.performAction(TennisAction.StartGame);
        result = tennis.performAction(TennisAction.One);
        result = tennis.performAction(TennisAction.Two);
        result = tennis.performAction(TennisAction.Two);
        result = tennis.performAction(TennisAction.One);
        result = tennis.performAction(TennisAction.One);
        result = tennis.performAction(TennisAction.Two);
        result = tennis.performAction(TennisAction.One);
        result = tennis.performAction(TennisAction.Two);
        Assert.assertEquals("deuce",result);
    }

    @Test
    public void player1WinsAdvantage() {
        Tennis tennis = new Tennis();
        String result = tennis.performAction(TennisAction.StartGame);
        result = tennis.performAction(TennisAction.One);
        result = tennis.performAction(TennisAction.Two);
        result = tennis.performAction(TennisAction.Two);
        result = tennis.performAction(TennisAction.One);
        result = tennis.performAction(TennisAction.Two);
        result = tennis.performAction(TennisAction.One);
        result = tennis.performAction(TennisAction.One);
        result = tennis.performAction(TennisAction.One);
        Assert.assertEquals("winner player 1",result);
    }

    @Test
    public void player2WinsAdvantage() {
        Tennis tennis = new Tennis();
        String result = tennis.performAction(TennisAction.StartGame);
        result = tennis.performAction(TennisAction.One);
        result = tennis.performAction(TennisAction.Two);
        result = tennis.performAction(TennisAction.Two);
        result = tennis.performAction(TennisAction.One);
        result = tennis.performAction(TennisAction.Two);
        result = tennis.performAction(TennisAction.One);
        result = tennis.performAction(TennisAction.Two);
        result = tennis.performAction(TennisAction.Two);
        Assert.assertEquals("winner player 2",result);
    }
}
