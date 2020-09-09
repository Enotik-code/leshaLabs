package works.number2.bean;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

@Data
@EqualsAndHashCode
@ToString
public class StoolChair extends Chair {

    static final Logger logger = LogManager.getLogger(Chair.class.getName());

    public void setGame(){
        setMaxWeight(100);
        setNumberOfLegs(4);
        setNameOfChair("Стул обычный");
        setTypeOfChair("Табуретка");
        setSpinning(false);
    }

    @Override
    public void getDataAboutChair() {
        getInfo();
    }

    @Override
    public void getTypeOfFurniture() {
        logger.info(getTypeOfChair());
    }

    @Override
    public void getInfo() {
        logger.info("Название - " + getNameOfChair() + "\nТип стула - " + getTypeOfChair()
                + "\nМакс. вес и кол-тво ножек" + getMaxWeight() + "," + getNumberOfLegs() + "\nКрутиться? - " + isSpinning());

    }
}
