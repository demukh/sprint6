import com.example.Animal;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;



public class AnimalKindTest {


    @Test
    public void shouldBeExceptionForAnotherAnimalKind() {
        Animal animal = new Animal();
        String invalidAnimal = "Неизвестный";
        Exception actualException = null;
        try {
            assertEquals(animal.getFood(invalidAnimal), List.of("Неизвестный вид животного, используйте значение Травоядное или Хищник"));
        } catch (Exception e) {
            actualException = e;
        }
        assertNotNull(actualException);
    }


}
