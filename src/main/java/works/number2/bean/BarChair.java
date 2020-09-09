package works.number2.bean;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

@Data
@EqualsAndHashCode
@ToString
public class BarChair extends Chair {

    static final Logger logger = LogManager.getLogger(BarChair.class.getName());

    public void setGame(){
        setMaxWeight(150);
        setNumberOfLegs(1);
        setNameOfChair("Стул - 'Семён'");
        setTypeOfChair("Барный");
        setSpinning(true);
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
