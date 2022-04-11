package net.genspark.Email.Controller;

import net.genspark.Email.Entity.Food;
import net.genspark.Email.Service.FoodServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class MainController {

    @Autowired
    private FoodServices foods;

    @GetMapping("/")
    public String helloWorld() {
        return "<h1> Sup Internet.</h1>" +
                "<h2> Food Controller Active.</h2>";
    }

    @GetMapping("/foods")
    public List<Food> getItems() {
        return foods.readFoods();
    }

    @PostMapping("/feed")
    public void newItems(@RequestParam  String name, @RequestParam double price, @RequestParam int amount) {
        foods.createFood(name ,price,amount);
    }
}
