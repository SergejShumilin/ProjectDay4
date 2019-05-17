package by.shumilin.task;

import by.shumilin.task.entity.Ball;
import by.shumilin.task.entity.Basket;
import by.shumilin.task.util.Packer;

import java.util.ArrayList;

public class Run {

    private static Basket BASKET = new Basket(new ArrayList<>());
    private static Packer PACKER = new Packer();

    public static void main(String[] args) {

        Ball yellow = new Ball(12, "yellow");
        Ball blue = new Ball(2, "blue");
        Ball secondBlue = new Ball(10, "blue");
        Ball green = new Ball(15, "green");
        Ball red = new Ball(-15, "red");


        PACKER.addBallInBasket(yellow, BASKET);
        PACKER.addBallInBasket(blue, BASKET);
        PACKER.addBallInBasket(secondBlue, BASKET);
        PACKER.addBallInBasket(green, BASKET);
        PACKER.addBallInBasket(red, BASKET);

        int weightBalls = PACKER.getWeightBalls(BASKET);
        System.out.println(weightBalls);

        int amountBlueBall = PACKER.getAmountBlueBall(BASKET);
        System.out.println(amountBlueBall);
    }
}
