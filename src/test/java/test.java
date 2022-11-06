
@RunWith(Parameterized.class)

public class LionParameterizedTest {
    private final String sex;
    private final boolean expectedResult;

    public LionParameterizedTest(String sex, boolean expectedResult) {
        this.sex = sex;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Object [][] getCorrectHasManeValue() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
        };
    }
    @Test
    public void hasManeTest() throws Exception {
        Lion lion = new Lion(sex);
        boolean actualResult = lion.doesHaveMane();
        Assert.assertEquals("...", expectedResult, actualResult);
    }
}


    public void unknownAnimalTest() {
        Exception exception = Assert.assertThrows(Exception.class, () -> {
            Lion lion = new Lion("неизвестный", feline);
        });
        assertEquals(someMassage, exception.getMessage());