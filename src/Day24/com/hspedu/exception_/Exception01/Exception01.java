package Day24.com.hspedu.exception_.Exception01;

public class Exception01 {
    public static void main(String[] args) {

        int num1=10;
        int num2=0;

        //int res=num1/num2;//这里会抛出一个 ArithmeticException 异常（数学计算异常）
/**
 * 可以用 try-catch-finally异常处理机制来解决
 *
 * 选中一段代码，快捷键 ctrl + alt + T  ，然后选上 try-catch
 */
        try {
            int res=num1/num2;//可能出现异常

        } catch (Exception e) {//来捕获异常
            /**
             * 1.当异常发生时
             *      系统将异常封装成 Exception的对象e，传递给catch
             * 2.得到异常对象后，程序员可以自己任意处理
             * 3.注意：如果没有出现异常，则catch代码块不执行
             */

            e.printStackTrace();
        } finally {//无论try代码块里有没有发生异常，finally代码块都会执行
            //所以通常将释放资源的代码 放在finally里
        }
//这样搞了以后，仍然报错：数学计算异常，但是程序却正常运行结束了
        //算运行时异常
        System.out.println("程序继续运行");
    }
}


