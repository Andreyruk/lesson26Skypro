package pro.sky.lesson26skypro.services.Impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pro.sky.lesson26skypro.model.Recipes;
import pro.sky.lesson26skypro.services.IngredientService;
import pro.sky.lesson26skypro.services.RecipesService;

import java.util.HashMap;
import java.util.Map;

@Service
@AllArgsConstructor
public class RecipesServiceImpl implements RecipesService {
    private Map<Integer, Recipes> recipesMap = new HashMap<>();
    private final IngredientService ingredientService;
    @Override
    public int AddRecipe(Recipes recipe) {
        int id = recipesMap.size()+1;
        if (recipe.getIngredients() != null && !recipe.getIngredients().isEmpty()) {
            recipe.getIngredients().forEach(ingredientService::addIngredient);
        }
        recipesMap.put(id, recipe);
        return id;
    }

    @Override
    public Recipes getRecipe(int id) {
        return recipesMap.get(id);
    }
}
