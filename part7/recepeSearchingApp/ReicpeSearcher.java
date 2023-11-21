package part7.recepeSearchingApp;
import java.util.ArrayList;
import java.util.List;

public class ReicpeSearcher {
    public static List<Recipe> searchRecipes(List<Recipe> recipes, String searchTerm){
        List<Recipe> results = new ArrayList<>();

        for(Recipe recipe : recipes){
            if (recipe.getName().equalsIgnoreCase(searchTerm) || String.valueOf(recipe.getCookingTime()).equals(searchTerm) || recipe.getIngredients().contains(searchTerm.toLowerCase()))  {
                results.add(recipe);
                
            }
        }

        return results;
    }
    
}
