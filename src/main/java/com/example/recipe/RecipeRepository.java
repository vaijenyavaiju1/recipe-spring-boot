// Write your code here
package com.example.recipe;

import java.util.*;

public interface RecipeRepository {
    ArrayList<Recipe> getRecipes();

    Recipe getRecipeById(int recipeId);

    Recipe addRecipe(Recipe recipe);

    Recipe updatedRecipe(int recipeId, Recipe recipe);

    void deleteRecipe(int recipeId);
}
