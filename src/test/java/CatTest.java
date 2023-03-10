import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline simba;

    @Test
    public void getSoundReturnCorrectValue() {
        Cat cat = new Cat(simba);
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void getFoodReturnPredatorsFood() throws Exception {
        Cat cat = new Cat(simba);
        Mockito.when(simba.eatMeat()).thenReturn(Arrays.asList("Животные", "Птицы", "Рыба"));
        List<String> expectedFood = Arrays.asList("Животные", "Птицы", "Рыба");
        List<String> actualFood = cat.getFood();
        assertEquals(expectedFood,actualFood);
    }

    @Test
    public void getFoodCallsEatMeatOnce() throws Exception {
        Cat cat = new Cat(simba);
        cat.getFood();
        Mockito.verify(simba, Mockito.times(1)).eatMeat();
    }
}

