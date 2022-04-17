public class LaserDisc {
    private  String movieTitle;
    private  int releaseYear;
    private String genre;
    private  float rating;
    //Default Constructor
     LaserDisc(){
        String movieTitle="Star Wars Holiday Special";
        int releaseYear=1978;
        String genre="Science Fiction";
        float rating=5.0f;
    }
    //Overload Constructor
    LaserDisc(String mTitle,int rYear, String mGenre, float mRating){
        this.movieTitle=mTitle;
        this.releaseYear=rYear;
        if(releaseYear<1978){
            this.releaseYear=1978;
        }
        this.genre=mGenre;
        this.rating=mRating;
        if(rating>5.0||rating<0.0){
            this.rating=0.0f;
        }
    }
    boolean isItGood(float rating){
        boolean good=false;
        if(rating>=3.0){
            good=true;
        }
        return good;
    }
    //getters
    String getMovieTitle() {
        return movieTitle;
    }
    int getReleaseYear() {
        return releaseYear;
    }
    String getGenre() {
        return genre;
    }
    float getRating() {
        return rating;
    }
}
