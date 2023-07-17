package RPC.Server;

import lombok.Data;

import java.io.Serializable;

/**
 * @author lrh
 * @description
 * @date 2022/8/4
 */
@Data
public class User implements Serializable {
    private String name;
    private int age;
}
