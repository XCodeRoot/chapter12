package Day26.com.CodeRoot.homework01;

import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//
//        int[] num = new int[2];
//
//        try {
//            System.out.println("输入第一个数：");
//            num[0] = Integer.parseInt(scanner.next());
//            System.out.println("输入第二个数：");
//            num[1] = Integer.parseInt(scanner.next());
//
//            int res = num[0] / num[1];
//        } catch (NumberFormatException e) {
//            System.out.println(e.getMessage());
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println(e.getMessage());
//        } catch (ArithmeticException e){
//            System.out.println(e.getMessage());
//        } finally {
//        }

        //先验证参数个数
        try {
            if(args.length!=2){
                throw new ArrayIndexOutOfBoundsException("参数个数异常");
            }
            //先把接收到的参数转成整数
            int num1=Integer.parseInt(args[0]);
            int num2=Integer.parseInt(args[1]);

            double res=calc(num1,num2);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }catch (NumberFormatException e){
            System.out.println("参数格式不正确");
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }finally {
        }

    }

    public static int calc(int num1,int num2){
        return num1/num2;
    }
}


