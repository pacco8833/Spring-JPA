package net.genspark.Email.Service;

import net.genspark.Email.Entity.Food;
import net.genspark.Email.Repository.FoodDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FoodServer implements FoodServices {

    @Autowired
    private FoodDao db;

    @Override
    public void createFood(String name, double price, int amount) {
        Food f = new Food(name, price, amount);
        db.save(f);
    }

    @Override
    public List<Food> readFoods() {
        return this.db.findAll();
    }

    @Override
    public Food readFood(int id) {
        Optional<Food> op = this.db.findById(id);
        return op.isPresent() ? op.get() : null;
    }

    @Override
    public void updateFood(int id) {
        readFood(id).setPrice(9.99);
        db.save(readFood(id));
    }

    @Override
    public void deleteFood(int id) {
        db.deleteById(id);
        db.save(readFood(id));
    }
}
