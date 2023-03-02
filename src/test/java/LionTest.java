import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionTest {

        String sex;
        boolean expectedHasMane;

        public LionTest (String sex, boolean expectedHasMane) {
            this.sex = sex;
            this.expectedHasMane = expectedHasMane;
        }
        @Parameterized.Parameters
        public static Object[][] getParameters() {
            return new Object[][]{
                    {"Самец", true},
                    {"Самка", false},
            };
        }

    @Test
    public void checkSexAndGetMane () throws Exception {
        Lion mufasa = new Lion(sex);
        boolean actualHasMane = mufasa.doesHaveMane();
        assertEquals (expectedHasMane, actualHasMane);
    }

    @Test (expected = Exception.class)
    public void checkExceptionIfNotMaleAndNotFemale () throws Exception {
        Lion mufasa = new Lion("Котёнок");
        }

    @Test
    public void checkGetKittens () throws Exception {
        Lion mufasa = new Lion("Самка");
        Feline feline = new Feline();
        mufasa.Feline(feline);
        int expectedKittensCount = 1;
        int actualKittensCount = mufasa.getKittens();
        assertEquals (expectedKittensCount, actualKittensCount);
    }

    @Test
    public void checkGetFoodForPredators() throws Exception {
        Lion mufasa = new Lion("Самка");
        Feline feline = new Feline();
        mufasa.Feline(feline);
        List<String> expectedFood = Arrays.asList("Животные", "Птицы", "Рыба");
        List<String> actualFood = mufasa.getFood();
        assertEquals(expectedFood, actualFood);
    }

}

