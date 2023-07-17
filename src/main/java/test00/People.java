package test00;

import lombok.Data;

/**
 * @author lrh
 * @description
 * @date 2023/3/10
 */
@Data
public class People implements Cloneable {
    private String name;
    private int age;
    private Address add;

    @Override
    protected People clone() throws CloneNotSupportedException {
        return (People) super.clone();
    }
}
