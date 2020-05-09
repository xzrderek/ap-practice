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

    public int getSeniors() {
        return numSeniors;
    }

    public class Stats {
        private ArrayList<ScoreInfo> scoreList;

     public boolean record(int score) //bool senior parameter removed
     {
        ScoreInfo newScore = new ScoreInfo(score);

        for (int i =0; i< scoreList.size(); i++) {
            ScoreInfo s = scoreList.get(i);
            if(score == s.getScore()) {
                s.increment();
                return false;
            } else if (score < s.getScore()) { //fixed inequality sign
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

// 1. public double getSeniorPercent(int score)
// 2. add a private int numSeniors for integer of num of seniors
// 3. add a getter method 


// answers from ap csa video
// 1. public double getSeniorPercent(int score)
// 2. we would need a new private instance variable numSeniors that would gather an integer of the number of seniors that got each score. 
// 3. constructor would need to be updated and a new accessor method added to access the numSeniors number.