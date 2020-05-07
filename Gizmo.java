import java.util.ArrayList;


public class Gizmo {
    /** Returns the name of the manufacturer of this Gizmo. */
    public String getMaker() {
        /* implementation not shown */ }

    /**
     * Returns true if this Gizmo is electronic, and false otherwise.
     */
    public boolean isElectronic() {
        /* implementation not shown */ }

    /**
     * Returns true if this Gizmo is equivalent to the Gizmo object represented by
     * the parameter, and false otherwise.
     */
    public boolean equals(final Object other) {
        /* implementation not shown */ }
    // There may be instance variables, constructors, and methods
    // not shown.
}

public class OnlinePurchaseManager {
    /**
     * An ArrayList of purchased Gizmo objects, instantiated in the constructor.
     */
    private ArrayList<Gizmo> purchases;

    /**
     * Returns the number of purchased Gizmo objects that are electronic and are
     * manufactured by maker, as described in part (a).
     */
    public int countElectronicsByMaker(final String maker) { /* to be implemented in part (a) */

    int counter = 0;

        for(final Gizmo x : purchases) {

            if(x.getMaker().equals(maker) && x.isElectronic()) {

                counter++;

            }

        }

        return counter;

    }

    /**
     * Returns true if any pair of adjacent purchased Gizmo objects are equivalent,
     * and false otherwise, as described in part (b).
     */
    public boolean hasAdjacentEqualPair() {
        /* to be implemented in part (b) */ 

        Gizmo g1 = purchases.get(0);

        for(int i = 1; i < purchases.size(); i++) {

            Gizmo g2 = purchases.get(i);

            if(g1.equals(g2)) {
                return true;
            }

            g1 = g2;

        }
        return false;
        
    
    }
    // There may be instance variables, constructors, and methods
    // not shown.

    1. public Gizmo getCheapestGizmoByMaker(final String maker) {
    2. We would need to add a getPrice() method in the Gizmo class.
    3. For our getPrice() method, first modify the Gizmo datatype to include price in double type.   Loop through arraylist to find lowest price using getPrice()
        

    }

}
