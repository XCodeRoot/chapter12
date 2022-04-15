package Day26.com.CodeRoot.customexception_;

public class CustomException {

    public static void main(String[] args) {

        int age=1;
        //要求年龄在18-120之间，否则抛出异常
        if (!(age>18&&age<120)){

            throw new AgeException("年龄需在18至120之间");//设置信息
        }else{
            System.out.println("年龄正常");
        }
    }
}

class AgeException extends RuntimeException{//一般将自定义异常写成运行时异常
    //好处在于，可以使用默认的异常处理机制

    //构造器
    public AgeException(String message) {//可以改变参数
        super(message);
    }
}
