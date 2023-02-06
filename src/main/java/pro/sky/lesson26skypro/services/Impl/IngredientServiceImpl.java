package pro.sky.lesson26skypro.services.Impl;

import org.springframework.stereotype.Service;
import pro.sky.lesson26skypro.model.Ingredients;
import pro.sky.lesson26skypro.services.IngredientService;

import java.util.HashMap;
import java.util.Map;

@Service
public class IngredientServiceImpl implements IngredientService {
    private Map<Integer, Ingredients> ingredientsMap = new HashMap<>();

    @Override
    public int addIngredient(Ingredients ingredient) {
        int id = ingredientsMap.size()+1;
        ingredientsMap.put(id, ingredient);
        return id;
    }

    @Override
    public Ingredients getIngredient(int id) {
        return ingredientsMap.get(id);
    }
}
