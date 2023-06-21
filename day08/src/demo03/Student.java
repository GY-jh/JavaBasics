package demo03;

public class Student {

    private int id;//学号
    private String name;//学生姓名
    private int age;//学生年龄
    static String room;//班级

    private static int idCounter = 0;//学号计数器，每当new一个新对象的时候，计数器++

    public Student() {
        idCounter++;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++idCounter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
