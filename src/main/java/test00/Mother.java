package test00;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.concurrent.Callable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Mother implements CallBack {

    private Son son;
    public void bye(){
        System.out.println("同步开始");
        new Thread(()->son.train(this)).start();
        System.out.println("同步结束");
    }


    @Override
    public void call() {
        System.out.println("到了");
    }
}
