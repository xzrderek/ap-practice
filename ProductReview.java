public class ProductReview

{

    private String name;

    private String review;

    /** Constructs a ProductReview object and initializes the instance variables. */

    public ProductReview(String pName, String pReview) {
        name = pName;
        review = pReview;
    }

    /** Returns the name of the product. */

    public String getName() {
        return name;
    }

    /** Returns the review of the product. */

    public String getReview() {
        return review;
    }

}

public class ReviewCollector {
    private ArrayList<ProductReview> reviewList;
    private ArrayList<String> productList;

    /**
     * Constructs a ReviewCollector object and initializes the instance variables.
     */

    public ReviewCollector() {
        reviewList = new ArrayList<ProductReview>();
        productList = new ArrayList<String>();

    }

    /** Adds a new review to the collection of reviews, as described in part (a). */

    public void addReview(ProductReview prodReview) {
        /* to be implemented in part (a) */

        String name = prodReview.getName();

        reviewList.add(prodReview);
        if(!productList.contains(name))) {
            productList.add(name);
        }

    }

    /**
     * Returns the number of good reviews for a given product name, as described in
     * part (b).
     */

    public int getNumGoodReviews(String prodName)

    {
        /* to be implemented in part (b) */ 

        int counter = 0;

        for(ProductReview review : reviewList) {

            if(review.getName().equals(prodName)) {

                if(review.getReview().contains("best")) {

                    counter++;

                }
                //these two are the same thing above and below
                if (review.getReview().indexOf("best") > 0) {

                    counter++;

                }

            }

        }
        return counter;

    }

    // There may be instance variables, constructors, and methods not shown.

}