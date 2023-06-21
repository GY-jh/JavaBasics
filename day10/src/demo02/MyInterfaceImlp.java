package demo02;

public class MyInterfaceImlp extends Object implements MyInterfaceA,MyInterfaceB {
    @Override
    public void methodA() {
        System.out.println("覆盖重写了A方法");
    }

    @Override
    public void methodAbs() {
        System.out.println("覆盖重写了AB都有的抽象方法");
    }

    @Override
    public void methodB() {
        System.out.println("覆盖重写了A方法");
    }

    @Override
    public void methodDefault() {
        System.out.println("对多个接口当中冲突的默认方法进行覆盖重写");
    }
}
