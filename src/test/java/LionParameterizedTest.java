import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;


@RunWith(Parameterized.class)

    public class LionParameterizedTest {
        private final String sex;
        private final boolean expectedResult;

        public LionParameterizedTest(String sex, boolean expectedResult) {
            this.sex = sex;
            this.expectedResult = expectedResult;
        }

        @Parameterized.Parameters
        public static Object[][] getCorrectHasManeValue() {
            return new Object[][]{
                    {"Самец", true},
                    {"Самка", false},
            };
        }
    @Mock
    private Feline feline;

        @Test
        public void getHasMane() throws Exception {
            Lion lion = new Lion(sex, feline);
            boolean actualResult = lion.doesHaveMane();
            Assert.assertEquals("Используйте допустимые значения пола животного - самец или самка", expectedResult, actualResult);
        }

    }

