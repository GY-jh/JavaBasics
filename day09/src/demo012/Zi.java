package demo012;

public class Zi extends Fu{

    public Zi(){
        System.out.println("子类构造方法实现");
    }

    @Override
    public void eat() {
        System.out.println("吃饭！");
    }

}
