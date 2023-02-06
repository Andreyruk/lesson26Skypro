package pro.sky.lesson26skypro.services;

import pro.sky.lesson26skypro.model.Recipes;

public interface RecipesService {
    int AddRecipe(Recipes recipe);

    Recipes getRecipe(int id);
}
