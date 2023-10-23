public class Lego_Brick_Counter {
    public static void main(String[] args) {
        System.out.println("This program calculates the containers needed to contain all the legos!");
        int randomGeneratedNumberA = (int) (Math.random() * (100 - 50 + 1) + 50);
        int randomGeneratedNumberB = (int) (Math.random() * (10-5 + 1)+5);

//      The code below generates the container capacity
        while (randomGeneratedNumberB % 2 != 0){
            randomGeneratedNumberB = (int) (Math.random() * (10-5 + 1)+5);
        }
        int containerCapacity = randomGeneratedNumberB;

//      The code below generates the amount of lego bricks
        while (randomGeneratedNumberA % 2 == 0){
            randomGeneratedNumberA = (int) (Math.random() * (100 - 50 + 1)+50);
        }
        int amountOfBricks = randomGeneratedNumberA;

//        This code below helps in calculating the amount of full and total containers
        float amountOfBricksInFloat = (float) amountOfBricks;
        float containerCapacityInFloat = (float) containerCapacity;
        float remainderCalculation = (amountOfBricksInFloat / containerCapacityInFloat);

//        This code below calculates the remainder bricks using modulus
        float remainderBricks = amountOfBricks % containerCapacity;

//        This code is what will be printed in the terminal
        System.out.println("The generated amount of Lego Bricks is: " + amountOfBricks);
        System.out.println("The generated amount of Containers is: "+ containerCapacity);
        System.out.println("The amount of remainder bricks is: " + remainderBricks);
        System.out.println("The amount of full containers are:  " + (int)Math.floor(remainderCalculation));
        System.out.println("The total amount of containers is: "+ (int)Math.ceil(remainderCalculation));


    }
}
