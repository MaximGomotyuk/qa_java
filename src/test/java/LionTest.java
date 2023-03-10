import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LionTest {
    Feline lion = new Feline();

    @Test (expected = Exception.class)
    public void checkExceptionIfNotMaleAndNotFemale () throws Exception {
        Lion simba = new Lion("Котёнок", lion);
        }

    @Test
    public void checkExceptionMessage () {
        try {Lion simba = new Lion("Котёнок", lion);
        } catch (Exception exception) {
            assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
        }
    }

    @Test
    public void checkGetKittens () throws Exception {
        Lion nola = new Lion("Самка", lion);
        int expectedKittensCount = 1;
        int actualKittensCount = nola.getKittens();
        assertEquals (expectedKittensCount, actualKittensCount);
    }

    @Test
    public void checkGetFoodForPredators() throws Exception {
        Lion mufasa = new Lion("Самец", lion);
        List<String> expectedFood = Arrays.asList("Животные", "Птицы", "Рыба");
        List<String> actualFood = mufasa.getFood();
        assertEquals(expectedFood, actualFood);
    }

}

