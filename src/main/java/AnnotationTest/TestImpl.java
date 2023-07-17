package AnnotationTest;

/**
 * @author lrh
 * @description
 * @date 2023/4/6
 */
public class TestImpl implements Test {
    @Override
    @MyAnno(value = 10)
    public int f(int a, int b) {
        return a+b;
    }
}
