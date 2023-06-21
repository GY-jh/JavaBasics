package Test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
           int score=0;
           int num1=0;
           int num2=0;
           double sum=0;
           int m =0;
           Scanner sc=new Scanner(System.in);//新建从键盘输入取
           System.out.println("输入成绩");      //输出 请输入NUM
          for(int i=1;i<=5;i++){
           System.out.println("第"+i+"位：");
           score=sc.nextInt();
           if(score<0 || score >100) {
            System.out.println("别乱输入！范围错误，请重新输入：");
            score=sc.nextInt();
            assert score > 100:"数字要小于100";
            assert score < 0:"数字要大于0";
         }
         m++;//运行次数记录，避免写死。
         sum=sum+score; //和
           if(score>=60){ //累加合格、不合格人数
               num1++;
           }
           else{
               num2++;
           }
         }
        System.out.println(m+"个数一共累计："+sum);
        System.out.println(m+"个数的平均数为："+(sum/m));
        System.out.println("合格人数："+num1);
        System.out.println("不合格人数："+num2);
    }
}
