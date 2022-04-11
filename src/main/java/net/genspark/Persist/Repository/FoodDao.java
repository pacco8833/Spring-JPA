package net.genspark.Email.Repository;

import net.genspark.Email.Entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodDao extends JpaRepository<Food,Integer> {
}
