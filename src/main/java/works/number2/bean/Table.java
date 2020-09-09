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
public class Table implements FurnitureInterface, ObjectInterface {

    private String nameOfTable;
    static final Logger logger = LogManager.getLogger(Table.class.getName());

    public Table(String nameOfTable) {
        this.nameOfTable = nameOfTable;
    }

    @Override
    public void getTypeOfFurniture() {
        logger.info("Стол, название - " + getNameOfTable());
    }

    @Override
    public void getInfo() {
        getTypeOfFurniture();
    }
}
