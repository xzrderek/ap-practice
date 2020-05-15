public class TestResults {
    
    private ArrayList<StudentAnswerSheet> sheets;

    public String highestScoringStudent(ArrayList<String> key) {

        int max = 0;

        for(int i = 1; i < sheets.size(); i++) {
            if(sheets.get(max).getScore() < sheets.get(i).getScore()) {
                max = i;
            }
        }
        return sheets.get(max).getName();
        
    }

}