package net.genspark.Email.Service;

import net.genspark.Email.Entity.Food;

import java.util.List;

public interface FoodServices {
    public void createFood(String name, double price, int amount);
    public List<Food> readFoods();
    public Food readFood(int id);
    public void updateFood(int id);
    public void deleteFood(int id);
}
