
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    // implement the required methods here
    public void addMeal(String meal){
            if(this.meals.contains(meal)){
            
            }else {
                this.meals.add(meal);
            }

    }

    //Print meals
    public void printMeals(){
        for(String meals : this.meals){
            System.out.println(meals);
        }
    }

    //Clearing menu
    public void clearMenu(){
        this.meals.clear();
    }
}
