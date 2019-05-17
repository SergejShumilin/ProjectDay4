package by.shumilin.task.entity;

import java.util.List;

public class Basket {

    private List<Ball> list;

    public Basket() {
    }

    public Basket(List<Ball> list) {
        this.list = list;
    }

    public List<Ball> getList() {
        return list;
    }

    public void setList(List<Ball> list) {
        this.list = list;
    }
}
