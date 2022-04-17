import java.util.Scanner;
import java.util.Random;
public class Assignment8A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rc=new Random();
        int numOfMovies;
        String name; //Movie Title
        int year; //Release Year
        String genres;// genre
        float rate; //ratings
        int choice;//user Choice
        int i;
        int pickAMovie = 0;
        int counter = 0;
        int checkingVariable = 0;
        //Printing out user questions
        System.out.println("[Laser Disc Collection]");
        System.out.print("How many movies do you have?");
        numOfMovies = sc.nextInt();
        //Array created for the number of Movies in collection
        LaserDisc[] movies;
        movies = new LaserDisc[numOfMovies];
        //loop for Movie information
        for (i = 0; i < movies.length; i++) {
            System.out.println("Movie " + (i + 1) + ": ");
            System.out.print("*Enter Title: ");
            sc.nextLine();
            name = sc.nextLine();
            System.out.print("*Enter Genre: ");
            genres = sc.nextLine();
            System.out.print("*Enter Release Year: ");
            year = sc.nextInt();
            System.out.print("*Enter Rating: ");
            rate = sc.nextFloat();
            movies[i]=new LaserDisc(name,year,genres,rate);
        }
        //loop to give user the following options
        do{
            System.out.print("[Main Menu]\n" +
                    "1) Movie Info\n" +
                    "2) Recommend a Good Movie\n" +
                    "3) Log off\n");
            System.out.print("Choice: ");
            choice= sc.nextInt();
            switch (choice){
                //choice one movie information
                case 1:
                    System.out.print("Which Movie do you want?");
                    i=sc.nextInt();
                    if(i> movies.length){
                        System.out.print("Sorry, that’s not a valid Movie index");
                    }
                    else{
                        System.out.print(i+".");
                        String movieTitle= movies[i].getMovieTitle();
                        int releaseYear= movies[i].getReleaseYear();
                        String genre= movies[i].getGenre();
                        float rating= movies[i].getRating();
                        System.out.println(movieTitle+","+releaseYear);
                        System.out.println("Genre: "+genre);
                        System.out.println("Rating: "+rating);
                    }
                    break;
                case 2:
                    //2.Next we are going to print a good movie base on rating
                    while(counter<movies.length) {
                        checkingVariable=pickAMovie;
                        if(pickAMovie==checkingVariable && counter>1){
                          counter--;
                        }
                        //maybe use a counter to keep track of guesses
                        pickAMovie = rc.nextInt(numOfMovies);
                        counter++;
                        //maybe use a random number generator and generate a number
                        //next we could maybe use that random to call on a movie
                        float rating = movies[pickAMovie].getRating();
                        //next we can call on the method isItGood to check the rating
                        //if the rating is returned false then pick something else and start the process over
                        if (movies[pickAMovie].isItGood(rating)) {
                            System.out.print("You should try: " + movies[pickAMovie].getMovieTitle());
                            System.out.println("(" + movies[pickAMovie].getReleaseYear() + ")!");
                            System.out.println("It has a rating of " + movies[pickAMovie].getRating());
                            break;
                        }
                    }
                    if(counter>=movies.length){
                    System.out.println("No good movies exist in the collection.");
                    break;
                }
                    break;
                case 3:
                    System.out.print("Goodbye!");
            }

        }while(choice!=3);

    }
}