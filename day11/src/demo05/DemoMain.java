package demo05;

/*
如果接口的实现类(或者是父类的子类) 只需要使用唯一的一次
那么这种情况下就可以省略掉该类的定义，二改完使用【匿名内部类】

匿名内部类的定义格式：
接口名称 对象名 = new 接口名称() {
    //覆盖重写所有抽象方法
};

对格式"new 接口名称() {...}"进行解析：
1.new 代表创建对象的动作
2.接口名称就是匿名内部类需要实现那个接口
3.{...}这才是匿名内部类的内容

另外还要注意几点问题：
1.匿名内部类，在【创建对象】的时候，只能使用唯一一次
如果希望多次创建对象，而且类的内容一样的话，那么久必须使用单独定义的实现类了。
2.匿名对象，在【调用单独】的时候，只能调用唯一一次。
如果希望同一个对象，调用多次方法，那么必须给对象起个名字
3.匿名内部类是省略了【实现类/子类名称】，但是匿名对象是省略了【对象名称】
强调：匿名内部类和匿名对象不是一回事！！！
 */
public class DemoMain {

    public static void main(String[] args) {
        //MyInterfaceImpl impl = new MyInterfaceImpl();
        //impl.method();

        //MyInterface obj = new MyInterfaceImpl();
        //obj.method();

        //错误写法
        //MyInterface some = new MyInterface();

        //使用匿名内部类
        MyInterface objA = new MyInterface() {
            @Override
            public void method1() {
                System.out.println("匿名内部类实现了方法！111-a");
            }
            @Override
            public void method2() {
                System.out.println("匿名内部类实现了方法！222-a");
            }
        };
        objA.method1();
        objA.method2();
        System.out.println("==============");

        //使用匿名内部类，而且省略了对象名称，也是匿名对象
        new MyInterface() {
            @Override
            public void method1() {
                System.out.println("匿名内部类实现了方法！111-b");
            }
            @Override
            public void method2() {
                System.out.println("匿名内部类实现了方法！222-b");
            }
        }.method1();
        //因为匿名对象无法电用第二次方法，所以需要创建一个匿名内部类的匿名对象
        new MyInterface() {
            @Override
            public void method1() {
                System.out.println("匿名内部类实现了方法！111-b");
            }
            @Override
            public void method2() {
                System.out.println("匿名内部类实现了方法！222-b");
            }
        }.method2();

    }

}
