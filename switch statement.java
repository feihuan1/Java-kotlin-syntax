class Scratch {


    public static void main(String[] args) {
        System.out.println(getScore(3));
    }

    private static String getDifficulty(int level) {

        return switch (level) {
            case 1 -> "Easy";
            case 2 -> "Normal";
            case 3 -> "Hard";
            default -> "Invalid Input";
        };
    }

    private static int getScore (int targetHit) {
        int score = 0;
        // non stop if not break
        switch (targetHit) {
            case 3:
                score = score + 10;
            case 2:
                score = score + 5;
            case 1:
                score = score + 1;
                break;
            default:
                score = -1;
        }

        return score;
    }

}