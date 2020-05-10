public class FrogSimulation {
    private int goalDistance;// distance from starting point to the goal
    private int maxHops; // max number of hops allowed to reach the goal

    // construct a FrogSimulation object
    public FrogSimulation(int d, int h) {
        goalDistance = d;
        maxHops = h;
    }

    // getter for goalDistance instance variable
    public int getGoalDistance() {
        return goalDistance;
    }

    private int hopDistance() {
    }

    /* other methods not shown */

    public boolean simulate() {

        int counter = 0;

        int distance = 0;

        while (counter < maxHops) {

            distance += hopDistance();

            if (distance >= goalDistance) {
                return true;
            } else if (distance < 0) {
                return false;
            }
        }

        return false;

    }

    public double runSimulations(int num) {

        int success = 0;

        for (int i = 0; i < num; i++) {
            if (simulate()) {
                success += 1;
            }
        }
        
        return (double)success/num;

    }
}