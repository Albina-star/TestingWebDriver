import org.testng.annotations.Test;

public class FirstExample {

    @Test
    public void testName() {
        System.out.println("Hello Portnov School");
    }

    @Test
    public void testShouldPrintText() {
        System.out.println("Hello world!");
    }

    @Test
    public void testName1() {
        int variableOne = 1;
        int variableTwo = 6;

        printTwoNumbers(variableTwo, variableTwo);
    }

    public void printTwoNumbers(int firstParameter, int secondParameter) {
        System.out.println(firstParameter + " " + secondParameter);
    }

    @Test
   public void testBooleans() {
        boolean booleanVariables = true;

        int amountOfLinks = 5;
        int amountOfClicks = 5;

        boolean isThereAreStillLinksToClicks = amountOfLinks > amountOfClicks;

        if (isThereAreStillLinksToClicks) {
            System.out.println("Keep clicking on links");
        }
    }
    @Test
    public void testBooleansLogical() {

        int amountOfLinks = 5;
        int amountOfClicks = 5;

        boolean elementOneVisible = true;

        boolean isThereAreStillLinksToClicks = amountOfLinks > amountOfClicks;

        int currentTime = 5000;
        int timeSinceTestStarted = 3000;
        boolean isThereStillSomeTimeToClick = (currentTime - timeSinceTestStarted) > 1000;

        if (elementOneVisible && isThereAreStillLinksToClicks && isThereStillSomeTimeToClick) {
            System.out.println("Keep clicking on links");
        } else {
            System.out.println("Some conditions are not met");
        }
    }
    public boolean isThereStillSomeTimeToClick(int currentTime, int timeSinceTestStarted) {
        boolean result = false;
        result = (currentTime - timeSinceTestStarted) > 1000;
        return result;
    }

    @Test
    public void testArrays() {
        int[] arrayOfNumber = {1, 2, 3, 4, 5, 6};

        String firstCar = "Volvo";
        String secondCar = "Toyota";
        String thirdCar = "Tesla";

        String[] garage = {firstCar, secondCar, thirdCar};
         for(int i = 0; i < garage.length; i++) {
             System.out.println("Car" + "[" + i + "]=" + garage[i]);
         }
         for(String eachCar : garage) {
             System.out.println("Car:" + eachCar);
         }
    }
    @Test
    public void testWhile() {
        int i = 0;
        while(i < 10) {
            System.out.println("While is " + i);
            i++;
        }
    }

}
