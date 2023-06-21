package Test;

import java.util.*;
public class text{
    public static void main(String arg[]){
        Scanner reader = new Scanner(System.in);
        double sum = 0;
        int m = 0;
        while(reader.hasNextDouble()){
            double x = reader.nextDouble();
            assert x <= 100:"数字要小于100";
            assert x >= 0:"数字要大于0";
            m = m + 1;
            sum = sum + x;
        }
        System.out.printf("%d个数的和为%f\n",m,sum);
        System.out.printf("%d个数的平均值为%f\n",m,sum/m);
    }

}
