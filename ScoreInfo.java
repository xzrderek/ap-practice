public class ScoreInfo {
    private int score;
    private int numStudents;
    private int numSeniors;

    public ScoreInfo(int aScore, bool senior) {
        score = aScore;
        numStudents = 1;
        if (senior) numSeniors = 1;
    }

    public void increment(boolean senior) {
        numStudents++;
        if (senior) numSeniors ++;
    }

    public int getScore() {
        return score;
    }

    public int getFrequency() {
        return numStudents;
    }

    public int getSniors() {
        return numSeniors;
    }

    public class Stats {
        private ArrayList<ScoreInfo> scoreList;

     public boolean record(int score, bool senior)
     {
        ScoreInfo newScore = new ScoreInfo(score);

        for (int i =0; i< scoreList.size(); i++) {
            ScoreInfo s = scoreList.get(i);
            if(score == s.getScore()) {
                s.increment();
                return false;
            } else if (score > s.getScore()) {
                scoreList.add(i, newScore);
                return true;
            }
        }

        scoreList.add(newScore);
        return true;

     }

    public void recordScores(int[] stuScores) {

        for (int score : stuScores) {
            record(score);
        }

     }

1. public double getSeniorPercent(int score)
2. add a private int numSeniors to class ScoreInfo.
getter method 
3. 