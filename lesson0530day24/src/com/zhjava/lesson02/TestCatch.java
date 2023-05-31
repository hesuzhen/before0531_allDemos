package com.zhjava.lesson02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestCatch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        try{
            //将可能出现异常的部分放到这里
            System.out.print("输入被除数：");
            int b = sc.nextInt();
            System.out.print("输入除数：");
            int c=sc.nextInt();
            int d=b/c;
            System.out.println(d);
            return;

        }/*catch(Exception e){
            //Exception是父类
            //执行了上面的就不会执行父类的这个
            System.out.println("出现异常。。。。。");
        }*/catch(InputMismatchException i){//catch捕捉异常
            System.out.println("输入不匹配异常。。。。");
          /*  String m = i.getMessage();
            System.out.println(m);*/
            i.printStackTrace();


        }catch(ArithmeticException a){
            System.out.println("数学异常。。。。");
            String message = a.getMessage();
            System.out.println(message);

            System.exit(-1);//不是0就是异常状态
        }catch(Exception e){
            /*Exception是父类
                执行了上面的就不会执行父类的这个
                如果把大范围的这个放在上面，那么就会报错，只能放在下面
                如果没有子类，只有Exception，那么会执行Exception里的内容
            */
            System.out.println("出现异常。。。。。");

        }finally {
            System.out.println("谢谢使用。。。。。");
        }
        System.out.println("程序结束");

    }
}
