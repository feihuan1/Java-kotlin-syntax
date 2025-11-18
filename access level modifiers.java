class Scratch {

    public static void main(String[] args) {
        AccessLevelModifiers levelTester = new AccessLevelModifiers();
//        levelTester.aPrivateField; // error, private field
//        levelTester.aPrivateMethod(); // error, private method
        String a = levelTester.aPublicMethod();
        System.out.println(a);

        levelTester.aProtectedMethod();

        //*********Score Keeper Demo**********
        ScoreKeeper scoreKeeper = new ScoreKeeper();
        scoreKeeper.playerOneCorrectAnswer();
        scoreKeeper.playerOneCorrectAnswer();
        scoreKeeper.playerOneCorrectAnswer();
        scoreKeeper.playerOneCorrectAnswer();
        scoreKeeper.playerOneCorrectAnswer();
        scoreKeeper.checkForWinner();// we don't want check score when no score change, this should be private as well
        scoreKeeper.playerTwoCorrectAnswer();

        // cheat on score when public
        scoreKeeper.playerTwoScore = 9999;

    }
}

class AccessLevelModifiers {

    // there are 4 levels of access in Java: public, protected, default, private
    // from most visible to most restricted
    public String aPublicField = "access from any class";
    protected String aProtectedField = "access from either a class in same package/folder(sibling in folder only) or a subclass/child class";
    String aDefaultField = "Access from class in same package, NO ACCESS in child class";
    private String aPrivateField = "only access from within this class";

    public String aPublicMethod(){
        System.out.println("Public");
        return aPrivateField;
    }
    protected void aProtectedMethod(){
        System.out.println("protected");
    }
    private void aPrivateMethod(){
        System.out.println("Private");
    }
}

class ScoreKeeper{

    public int playerOneScore = 0;
    public int playerTwoScore = 0;

    public void playerOneCorrectAnswer() {
        playerOneScore ++;
        System.out.println("player one got one right! Player one " + playerOneScore + " - Player Two " + playerTwoScore);
    }
    public void playerTwoCorrectAnswer() {
        playerTwoScore ++;
        System.out.println("player Two got one right! Player one " + playerOneScore + " - Player Two " + playerTwoScore);
    }
    public void checkForWinner() {
        if(playerOneScore == 5) {
            System.out.println("Player One win!");
        }else if(playerTwoScore == 5){
            System.out.println("Player Two win!");
        }
    }
}