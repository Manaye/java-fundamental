import java.util.LinkedList;

public class Restaurant {
    protected String name;
    public int stars;
    protected String price;
    public Restaurant restaurant;

    public LinkedList<Review> reviewList;

    public String getName() {
        return name;
    }

    public int getStars() {
        return stars;
    }
    public String  getPrice(){
        return price;

    }

    public LinkedList<Review> getReviewList() {
        return reviewList;
    }
    public Restaurant(String name ,String price, int stars){
        this.name = name ;
        this.price =price;
        this.stars = stars;
    }
    public String toString(){
        String reviewOutput = "";
        for (Review review: reviewList){
            reviewOutput +=review.toString()+"\n";
        }

        //return "Name: " + name + "stars: "+ stars + "price: " +price;
        return  reviewOutput;
    }
    public void addReview (Review review){
        this.reviewList.add(review);
        review.restaurant = this;
        stars = avgStars();
    }
    protected int avgStars(){
        int totalStars = 0;
        for (Review review : reviewList){
            totalStars += review.getStars();

        }

        return totalStars;
    }


}
