package works.number1.bean;

import lombok.*;

import java.io.Serializable;

@Builder
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Employee implements Serializable {
    private String fullName;
    private double salary;
    private boolean havingChildren;

    public Employee(String fullName, Boolean havingChildren) {
        this.fullName = fullName;
        this.havingChildren = havingChildren;
    }

    public Employee() {
    }
}
