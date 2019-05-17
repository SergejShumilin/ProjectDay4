package by.shumilin.task.util;

import by.shumilin.task.entity.Ball;
import by.shumilin.task.entity.Basket;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class PackerTest {

    private static Basket BASKET = new Basket(new ArrayList<>());
    private static Packer PACKER = new Packer();

    @Before
    public void setBallInBasket() {
        Ball ball = new Ball(-2, "white");
        Ball ball2 = new Ball(2, "white");
        PACKER.addBallInBasket(ball, BASKET);
        PACKER.addBallInBasket(ball2, BASKET);
    }

    @After
    public void clearBasket(){
        BASKET.getList().clear();
    }


    @Test
    public void addBallInBasket_Return_Size() {
        int expected = 1;
        int actual = BASKET.getList().size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getWeightBalls_Return_Weight_Balls() {
        int expected = 2;
        int actual = PACKER.getWeightBalls(BASKET);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAmountBlueBall_Return_Amount_Blue_Ball() {
        int expected = 0;
        int actual = PACKER.getAmountBlueBall(BASKET);

        Assert.assertEquals(expected, actual);
    }
}