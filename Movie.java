public class Movie {
    String title;
    String studio;
    String rating;
    public Movie(String myTitle, String myStudio, String myRating){
        myTitle = this.title;
        myStudio = this.studio;
        myRating = this.rating;
    }
    public Movie(String myTitle, String myStudio){
        title = myTitle;
        studio = myStudio;
        rating = "PG";
    }

}
