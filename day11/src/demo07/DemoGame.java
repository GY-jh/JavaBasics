package demo07;

public class DemoGame {

    public static void main(String[] args) {

        Hero hero = new Hero();
        hero.setName("艾希");//设置英雄的名称

        //设置英雄技能
        //hero.setSkill(new SkillImpl());

        //还可以改成使用匿名内部类
/*        Skill skill = new Skill() {
            @Override
            public void use() {
                System.out.println("Pia~pia~pia~pia~");
            }
        };*/

        //进一步简化，同时使用匿名内部类和匿名对象
        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("Pia~Biu~Pia~Biu~Pia~Biu~");
            }
        });

        hero.attack();

    }

}
