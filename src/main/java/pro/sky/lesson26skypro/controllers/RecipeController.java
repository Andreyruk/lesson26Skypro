package pro.sky.lesson26skypro.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pro.sky.lesson26skypro.model.Recipes;
import pro.sky.lesson26skypro.services.RecipesService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/recipe")
@Tag(name = "recipe", description = "Работа с рецептами")
public class RecipeController {
    private final RecipesService recipesService;

    @PostMapping
    @Operation(summary = "Создание записи",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Запись создана"),
                    @ApiResponse(responseCode = "500", description = "Возникли ошибки во время создания записи")
            })
    public int AddRecipe(@RequestBody Recipes recipe) {
        return recipesService.AddRecipe(recipe);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Получение записи",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Запись получена"),
                    @ApiResponse(responseCode = "500", description = "Возникли ошибки во время получения записи")
            })
    public Recipes getRecipe(@PathVariable
                             int id) {
        return recipesService.getRecipe(id);
    }
}
