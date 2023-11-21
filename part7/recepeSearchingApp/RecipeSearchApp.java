package part7.recepeSearchingApp;
import java.io.File;
import java.util.List;
import java.util.Scanner;

public class RecipeSearchApp {

    public static void main(String[] args) {

         String filePath = "C:\\Users\\sagar rana 11\\Desktop\\JAVA\\part7\\recepeSearchingApp\\recepe.txt";
        File file = new File(filePath);

        if (file.exists()) {
            System.out.println("File exists.");
        } else {
            System.out.println("File does not exist.");
        }

        List<Recipe> recipes = RecipeReader.readRecipesFromFile("C:\\Users\\sagar rana 11\\Desktop\\JAVA\\part7\\recepeSearchingApp\\recepe.txt");

        // Interact with the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter search term: ");
        String searchTerm = scanner.nextLine().toLowerCase();

        // Search for recipes
        List<Recipe> results = ReicpeSearcher.searchRecipes(recipes, searchTerm);

        // Display the results
        if (results.isEmpty()) {
            System.out.println("No recipes found.");
        } else {
            System.out.println("Recipes found:");
            for (Recipe result : results) {
                System.out.println("Name: " + result.getName());
                System.out.println("Cooking Time: " + result.getCookingTime() + " minutes");
                System.out.println("Ingredients: " + result.getIngredients());
                System.out.println();
            }
        }

       

    }
    
}
