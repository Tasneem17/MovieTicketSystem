/*
 *Project 3
 *Movie Ticket System
 *Tasneem Jacobs (215030389)
 * Food And Drink
 * Repository
 */
package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.FoodAndDrink;

import java.util.List;
import java.util.Optional;

@Repository
public interface IFoodAndDrinkRepository extends JpaRepository<FoodAndDrink,String> {

    FoodAndDrink create(FoodAndDrink foodAndDrink);

    Optional<FoodAndDrink> read(String comboNO);

    boolean getAll();
}
