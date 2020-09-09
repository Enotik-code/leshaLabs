package works.number2.bean;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import works.number2.interfaces.FurnitureInterface;
import works.number2.interfaces.ObjectInterface;

@Data
@EqualsAndHashCode
@ToString
public class Cupboard implements FurnitureInterface, ObjectInterface {

    private String nameOfCupboard;
    static final Logger logger = LogManager.getLogger(Cupboard.class.getName());

    public Cupboard(String nameOfCupboard) {
        this.nameOfCupboard = nameOfCupboard;
    }

    @Override
    public void getTypeOfFurniture() {
        logger.info("Шкаф, название -" + getNameOfCupboard());
    }

    @Override
    public void getInfo() {
        getTypeOfFurniture();
    }

}
