package by.shumilin.task.util;

import by.shumilin.task.entity.Ball;
import by.shumilin.task.entity.Basket;

import java.util.List;

public class Packer {

    public Basket addBallInBasket(Ball ball, Basket basket) {
        List<Ball> list = basket.getList();
        if (ball.getWeight() > 0 && ball.getWeight() < 100) {
                list.add(ball);
        }
        return basket;
    }

    public int getWeightBalls(Basket basket) {
        int sumWeight = 0;
        List<Ball> list = basket.getList();
        for (Ball ball : list) {
            sumWeight += ball.getWeight();
        }
        return sumWeight;
    }

    public int getAmountBlueBall(Basket basket){
        int count = 0;
        List<Ball> list = basket.getList();
        for (Ball ball : list) {
            if (ball.getColor().equals("blue")){
                count++;
            }
        }
        return count;
    }
}
