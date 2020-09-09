package works.number2.bean;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import works.number2.interfaces.FurnitureInterface;
import works.number2.interfaces.ObjectInterface;

@Data
@ToString
@EqualsAndHashCode
public abstract class Chair implements FurnitureInterface, ObjectInterface {

    static final Logger logger = LogManager.getLogger(Chair.class.getName());

    String typeOfChair;
    String nameOfChair;
    Integer maxWeight;
    Integer numberOfLegs;
    boolean spinning;

    public abstract void getDataAboutChair();

    public void checkGameToYourCompany(int maxWeight, boolean spinning){
        if(maxWeight < this.maxWeight && this.spinning == spinning){
            logger.info("Хороший стул, покупаем");
            logger.info("Название -" + nameOfChair + " Тип стула - " + typeOfChair);
        }
        else logger.info("К сожалению нет, давай поищем другой");
    }


}
