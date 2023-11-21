package part7.recepeSearchingApp;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class RecipeReader {
    public static List<Recipe> readRecipesFromFile(String filePath) {
        List<Recipe> recipes = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String name = line;
                int cookingTime = Integer.parseInt(reader.readLine());

                List<String> ingredients = new ArrayList<>();
                while (!(line = reader.readLine()).isEmpty()) {
                    ingredients.add(line);
                }

                Recipe recipe = new Recipe(name, cookingTime, ingredients);
                recipes.add(recipe);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return recipes;
    }
   
    
}
