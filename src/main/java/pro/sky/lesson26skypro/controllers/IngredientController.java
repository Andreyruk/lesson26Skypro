package pro.sky.lesson26skypro.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pro.sky.lesson26skypro.model.Ingredients;
import pro.sky.lesson26skypro.services.IngredientService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/ingredient")
@Tag(name = "ingredient", description = "Работа с ингредиентами")
public class IngredientController {
    private final IngredientService ingredientService;

    @PostMapping
    @Operation(summary = "Создание записи",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Запись создана"),
                    @ApiResponse(responseCode = "500", description = "Возникли ошибки во время создания записи")
            })
    public int AddIngredient(@RequestBody Ingredients ingredient) {
        return ingredientService.addIngredient(ingredient);
    }

    @GetMapping("/{id}")
    @Operation(summary="Получение записи",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Запись получена"),
                    @ApiResponse(responseCode = "500", description = "Возникли ошибки во время получения записи")
            })
    public Ingredients getIngredient(@PathVariable
                             int id) {
        return ingredientService.getIngredient(id);
    }
}
