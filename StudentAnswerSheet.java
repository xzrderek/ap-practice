public class StudentAnswerSheet {
    
    private ArrayList<String> answers;
    //list of students answers
    
    public double getScore(ArrayList<String> key) {

        int correct;
        int wrong;
        int omit;

        for(int i = 0; i < key.size(); i++) {
            if(key.get(i).equals(answers.get(i))) {
                correct++;
            }
            else if(answers.get(i).equals("?")) {
                omit++;
            }
            else {
                wrong++;
            }
        }
        return (correct - wrong / 4);

    }

}