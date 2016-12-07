/**
 * Created by chqian on 2016/12/6.
 */
public class Demo {
    private static Demo d = null;
    private Demo (){}

    public static Demo getDemo() {
        if (d==null){
            d=new Demo();
        }
        return d;
    }

    public static void main(String[] args) {
        Demo d1 = Demo.getDemo();
        Demo d2 = Demo.getDemo();
        System.out.println(d2);
        Demo d3 = Demo.d;
        System.out.println(d3);

    }
}
