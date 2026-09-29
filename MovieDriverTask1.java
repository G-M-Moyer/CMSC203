import java.util.Scanner;

public class MovieDriverTask1 {	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		 
        Movie movie = new Movie();
 
        System.out.print("Enter the name of a movie");
        System.out.println();
        String title = keyboard.nextLine();
        movie.setTitle(title);
 
        System.out.print("Enter the rating of the movie");
        System.out.println();
        String rating = keyboard.nextLine();
        movie.setRating(rating);
 
        System.out.print("Enter the number of tickets sold for this movie");
        System.out.println();
        int ticketsSold = keyboard.nextInt();
        movie.setSoldTickets(ticketsSold);
 
        System.out.print("Goodbye");

        keyboard.close();
	}
}
