package OOP;
import java.util.*;

public class OOP2 {
    public static void main(String[] args) {
        Movie[] m = new Movie[4];
        m[0] = new Movie("Avatar", "VR", "13");
        m[1] = new Movie("Pathan", "Inox", "8");
        m[2] = new Movie("KGF2", "Velentine", "PG-10");
        m[3] = new Movie("Naadi Dosh", "Cineverse", "PG-9");

        String[] ans = Movie.getPG(m);

        System.out.println(Arrays.toString(ans));
    }
}
class Movie{
    private String title;
    private String studio;
    private String rating;

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }
    public static String[] getPG(Movie[] movies){
        String[] ans = new String[movies.length];
        int j=0;
        for(int i=0; i<movies.length; i++){
            if(movies[i].getRating().equals("PG")){
                ans[j] = movies[i].getTitle();
                j++;
            }
        }
        return ans;
    }

    public Movie(String title, String studio){
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }

    public String getTitle() {
        return title;
    }

    public String getStudio() {
        return studio;
    }

    public String getRating() {
        return rating;
    }

}
