public class Review {
    private String body;
    private int stars;
    private String author;
    public   Restaurant restaurant;


    public String getBody() {
        return body;
    }
    public int getStars(){
        return stars;
    }
    public String getAuthor(){
        return author;
    }

    public Review(String body ,int stars ,String author){
        this.body =body;
         this.author =author;
        this.stars = stars;
        this.restaurant = null;

    }
    public  String tostring (){
        return "Body: " + body + "stars: "+ stars ;

    }

}
