package Day25.com.CodeRoot.try_;

import Day24.com.hspedu.exception_.NullPointerException_;

import java.util.Scanner;

public class TryCatchDetail {

    public static void main(String[] args) {
        /**
         *  catch 可以有多个 ，异常是什么 就匹配哪个 catch代码块
         *  注意： 实际上并不能一次性捕获多个异常
         */
        try {
            Person person = new Person();
            person=null;
            System.out.println(person.getName());
            int n1=10;
            int n2=0;
            int res=n1/n2;
        }
        catch (NullPointerException e){
            System.out.println("空指针异常 "+e.getMessage());
        }
        catch (ArithmeticException e){
            System.out.println("算术异常 "+e.getMessage());
        }
        catch (Exception e) {
            e.printStackTrace();
        } finally {
        }


        int num=0;
        while (true) {

            Scanner scanner = new Scanner(System.in);
            System.out.print(" 请输入一个整数:");

            try {
                num= Integer.parseInt(scanner.next());//将输入转为int类型
                break;//如果上面没有异常，就可以退出了
            } catch (Exception e) {
                System.out.print("你输入的不是整数:");
            } finally {
            }
        }

    }
}

class Person{
    private String name="jack";


    public String getName() {
        return name;
    }
}