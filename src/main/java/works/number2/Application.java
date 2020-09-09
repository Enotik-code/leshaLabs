package works.number2;


import works.number2.bean.BarChair;
import works.number2.bean.Table;
import works.number2.bean.Cupboard;
import works.number2.bean.StoolChair;

public class Application {
    public static void main(String[] args) {
        Table table = new Table("Стол обыкновенный");
        Cupboard cupboard = new Cupboard("Шкаф-купе");

        cupboard.getInfo();
        table.getInfo();

        BarChair cardStrategy = new BarChair();
        StoolChair stepByStepStrategy = new StoolChair();

        cardStrategy.setGame();
        stepByStepStrategy.setGame();

        cardStrategy.getInfo();
        stepByStepStrategy.getInfo();
    }
}
