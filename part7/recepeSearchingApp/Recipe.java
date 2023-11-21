package part7.recepeSearchingApp;

import java.util.ArrayList;
import java.util.List;

public class Recipe {
    private String name;
    private int cookingTime;
    private List<String> ingredients;

    // Constructor
    public Recipe(String name, int cookingTime, List<String> ingredients) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredients = ingredients;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public List<String> getIngredients() {
        return ingredients;
    }
}

    
