package pro.sky.lesson26skypro.services;

import pro.sky.lesson26skypro.model.Ingredients;

public interface IngredientService {
    int addIngredient(Ingredients ingredient);

    Ingredients getIngredient(int id);
}
