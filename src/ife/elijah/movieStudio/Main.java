package ife.elijah.movieStudio;

//Import list and Array list

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    //Array of 6 Genres
    private String[] genres = {"Action", "Drama", "Documentary", "Comedy", "Animation", "Non-Fiction"};

    public static void main(String[] args) {


        //New Instance of Scanner
        Scanner scan = new Scanner(System.in);

        //Welcome Message to Customer
        System.out.print("Hi ! Welcome to Our Cinema!!!\nWhat is your name ? ");
        //Take user input from User
        String customerName = scan.nextLine();
        System.out.print("Please enter your email: ");
        String customerEmail = scan.nextLine();
        System.out.println("Please enter your age :");
        int customerAge = scan.nextInt();

        //Create New instance of Customer
        Customer customer1 = new Customer();
        customer1.setName(customerName);
        customer1.setAge(customerAge);
        customer1.setEmail(customerEmail);

        System.out.println("Here is the list of our Genre");
        Main main = new Main();
        main.displayMovieGenre(customer1, scan);

    }
    //Create a method for Movie list of same class name with ur Main
    private List<Movies> moviesCollection(){

        //Instantiate new ArrayList
        List<Movies> moviesList = new ArrayList<>();

        //Create the movie 1
        Movies movie1 = new Movies();
        movie1.setTitle("Black Panther");
        movie1.setDescription("African");
        movie1.setGenres(genres[0]);
        movie1.setLength(2);
        movie1.setPrice(50);
        movie1.setRating(4.5);

        //Add movie1 to the Movie list
        moviesList.add(movie1);

        //Create the movie 2
        Movies movie2 = new Movies();
        movie2.setTitle("Avengers");
        movie2.setDescription("African Power");
        movie2.setGenres(genres[0]);
        movie2.setLength(3);
        movie2.setPrice(100);
        movie2.setRating(5.0);

        //Add movie1 to the Movie list
        moviesList.add(movie2);

        //Create the movie 3
        Movies movie3 = new Movies();
        movie3.setTitle("Captain Marvel\n");
        movie3.setDescription("American Movie");
        movie3.setGenres(genres[1]);
        movie3.setLength(5);
        movie3.setPrice(70);
        movie3.setRating(4.5);

        //Add movie1 to the Movie list
        moviesList.add(movie3);

        //Create the movie 4
        Movies movie4 = new Movies();
        movie4.setTitle("Mission: Impossible – Fallout");
        movie4.setDescription("Thriller/Action Movie");
        movie4.setGenres(genres[1]);
        movie4.setLength(5);
        movie4.setPrice(90);
        movie4.setRating(4.9);

        //Add movie1 to the Movie list
        moviesList.add(movie4);

        //Create the movie 5
        Movies movie5 = new Movies();
        movie5.setTitle("Alita: Battle Angel");
        movie5.setDescription("Sci-fi/Thriller");
        movie5.setGenres(genres[2]);
        movie5.setLength(7);
        movie5.setPrice(59);
        movie5.setRating(4.8);

        //Add movie1 to the Movie list
        moviesList.add(movie5);

        //Create the movie 6
        Movies movie6 = new Movies();
        movie6.setTitle("The Raid: Redemption");
        movie6.setDescription("African");
        movie6.setGenres(genres[2]);
        movie6.setLength(8);
        movie6.setPrice(50);
        movie6.setRating(4.1);

        //Add movie1 to the Movie list
        moviesList.add(movie6);

        //Create the movie 7
        Movies movie7 = new Movies();
        movie7.setTitle("Edge of Tomorrow");
        movie7.setDescription("American science fiction action film");
        movie7.setGenres(genres[3]);
        movie7.setLength(10);
        movie7.setPrice(55);
        movie7.setRating(4.5);

        //Add movie1 to the Movie list
        moviesList.add(movie7);

        //Create the movie 8
        Movies movie8 = new Movies();
        movie8.setTitle("Kick-Ass");
        movie8.setDescription("Action/Comedy");
        movie8.setGenres(genres[3]);
        movie8.setLength(8);
        movie8.setPrice(55);
        movie8.setRating(4.0);

        //Add movie1 to the Movie list
        moviesList.add(movie8);

        //Create the movie 9
        Movies movie9 = new Movies();
        movie9.setTitle("Avatar");
        movie9.setDescription("Fantasy/Mystery");
        movie9.setGenres(genres[4]);
        movie9.setLength(5);
        movie9.setPrice(100);
        movie9.setRating(3.9);

        //Add movie1 to the Movie list
        moviesList.add(movie9);

        //Create the movie 10
        Movies movie10 = new Movies();
        movie10.setTitle("BIron Man");
        movie10.setDescription("Sci-fi/Thriller");
        movie10.setGenres(genres[4]);
        movie10.setLength(20);
        movie10.setPrice(500);
        movie10.setRating(4.5);

        //Add movie1 to the Movie list
        moviesList.add(movie10);

        //Create the movie 11
        Movies movie11 = new Movies();
        movie11.setTitle("Star Trek");
        movie11.setDescription("Fantasy/Action");
        movie11.setGenres(genres[5]);
        movie11.setLength(25);
        movie11.setPrice(50);
        movie11.setRating(5.1);

        //Add movie1 to the Movie list
        moviesList.add(movie11);

        //Create the movie 12
        Movies movie12 = new Movies();
        movie12.setTitle("Taken");
        movie12.setDescription("Thriller/Action");
        movie12.setGenres(genres[5]);
        movie12.setLength(25);
        movie12.setPrice(500);
        movie12.setRating(4.7);

        //Add movie1 to the Movie list
        moviesList.add(movie12);

        return  moviesList;

    }


    //Method for selection of Genre choice
    private void movieChoice(int choice, Customer customer){
        int genreChoice = choice -1;
        List<Movies> selectedMovies = new ArrayList<>();

        String genreName = genres[genreChoice];
        for (int i = 0; i < moviesCollection().size() ; i++) {
            if (moviesCollection().get(i).getGenres().equals(genreName))
            selectedMovies.add(moviesCollection().get(i));

        }
            System.out.println(genreName+ "movies");
        for (int i = 0; i <selectedMovies.size() ; i++) {
           System.out.println(i + 1 + ". Title:"+selectedMovies.get(i).getTitle() + "\nDescription: " +
                   selectedMovies.get(i).getDescription() + "\n Price: Ksh" + selectedMovies.get(i).getPrice());

        }
            System.out.println("Which "+genreName + "movie(s) do you want");
            Scanner movieScanner = new Scanner(System.in);
            int moviesPicked = movieScanner.nextInt();

            int moviePrice;
            if (moviesPicked == 1){
                moviePrice = selectedMovies.get(0).getPrice();
                int fullBill = customer.getCustomerBill() + moviePrice;
                customer.setCustomerBill(fullBill);
                customer.getMyCustomerMovies().add(selectedMovies.get(0));

                System.out.println("Do you want to pick another movie ? \n1. Yes\n2. No");
                int another = movieScanner.nextInt();

                if (another == 1){
                    System.out.println("Pick another from the list of the categories");
                    displayMovieGenre(customer, movieScanner);
                }else {
                    System.out.println("Hey: "+customer.getName()+"\n" + "Total Price: "
                            +customer.getCustomerBill());
                    for (int i = 0; i <customer.getMyCustomerMovies().size() ; i++) {
                        Movies movie = customer.getMyCustomerMovies().get(i);
                        System.out.println("Here are the movies you have selected" +
                                "Title" + movie.getTitle() + "Movie Length"+movie.getLength() +
                                "Description"+movie.getDescription() +"Price" + movie.getPrice());

                    }

                }


            }
            else if (moviesPicked == 2) {
                moviePrice = selectedMovies.get(1).getPrice();
                int fullBill = customer.getCustomerBill() + moviePrice;
                customer.setCustomerBill(fullBill);
                customer.getMyCustomerMovies().add(selectedMovies.get(1));

                System.out.println("Do you want to pick another movie ? \n1. Yes\n2. No");
                int another = movieScanner.nextInt();

                if (another == 1) {
                    System.out.println("Pick another from the list of the categories");
                    displayMovieGenre(customer, movieScanner);
                } else {
                    System.out.println("Hey: " + customer.getName() + "\n" + "Total Price: "
                            + customer.getCustomerBill());

                    for (int i = 0; i < customer.getMyCustomerMovies().size(); i++) {
                        Movies movie = customer.getMyCustomerMovies().get(i);
                        System.out.println("Here are the movies you have selected" +
                                "Title" + movie.getTitle() + "Movie Length" + movie.getLength() +
                                "Description" + movie.getDescription() + "Price" + movie.getPrice());

                    }

                }
            }
            else{
                System.out.println("Kindly pick a valid choice from either 1 or 2 ");
            }

    }

    private void displayMovieGenre (Customer customer1, Scanner scan){
        Main main = new Main();
        for (int i = 0; i <main.genres.length ; i++) {
            System.out.println(i+1 + ". " + main.genres[i]);
        }

        //Prompt User to select a Genre type
        System.out.println("Kindly select your Genre of choice ");
        int genreChoice =  scan.nextInt();

        switch (genreChoice){
            case 1:
                main.movieChoice(1 ,customer1);
                break;
            case 2:
                main.movieChoice(2 ,customer1);
                break;
            case 3:
                main.movieChoice(3 ,customer1);
                break;
            case 4:
                main.movieChoice(4 ,customer1);
                break;
            case 5:
                main.movieChoice(5 ,customer1);
                break;
            case 6:
                main.movieChoice(6 ,customer1);
                break;
            default:
                System.out.println("Kindly select from the available genre list");
                break;

        }

    }
}
