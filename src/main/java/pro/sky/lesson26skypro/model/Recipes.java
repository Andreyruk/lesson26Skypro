package pro.sky.lesson26skypro.model;

import lombok.Data;

import java.util.List;

@Data
public class Recipes {
    private String nameRecipe;
    private int timeCooking;
    private List<Ingredients> ingredients;
    private List<String> stepsCooking;
}
