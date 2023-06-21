package demo02;

public class Demo02PhoneTwo {

    public static void main(String[] args) {
        //根据Phone类，创建一个名为one的对象
        //格式：类名称 对象名 = new 类名称（）；
        Phone one = new Phone();
        System.out.println(one.brand);//null
        System.out.println(one.price);//0.0
        System.out.println(one.color);//null

        System.out.println("================");

        one.brand = "苹果";
        one.price = 8388.0;
        one.color = "黑色";
        System.out.println(one.brand);//苹果
        System.out.println(one.price);//8388.0
        System.out.println(one.color);//黑色

        System.out.println("================");

        one.call("乔布斯");
        one.sendMessage();

        System.out.println("================");

        Phone two = new Phone();
        System.out.println(two.brand);//null
        System.out.println(two.price);//0.0
        System.out.println(two.color);//null

        System.out.println("================");

        two.brand = "三星";
        two.price = 5999.0;
        two.color = "蓝色";
        System.out.println(two.brand);//苹果
        System.out.println(two.price);//8388.0
        System.out.println(two.color);//黑色

        System.out.println("================");

        two.call("张三");
        two.sendMessage();

    }

}
