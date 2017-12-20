package cn.com.doone.tx.cloud.ThreadStatic;

/**
 * @OAuthor: YeCongZhi
 * @Description:
 * @CreatedDate: 2017/12/18 13:54
 * @Package:cn.com.doone.tx.cloud.Thread
 */
class StaticDemo{
    static int a = 42;
    static int b = 99;
    static void callme(){
        System.out.println("a = "+a);
    }
}
public class TestStatic {

//    静态变量、静态块、静态方
//    通常情况下，类成员必须通过它的类的对象访问，
// 但是可以创建这样一个成员，它能够被它自己使用，而不必引用特定的实例。
// 在成员的声明前面加上关键字static就能创建这样的成员。
// 如果一个成员被声明为static，它就能够在它的类的任何对象创建之前被访问，而不必引用任何对象（跟类是否有static修饰无关）。

//    初始化顺序：初始化静态变量、静态初始化块>变量、初始化块>构造器
//    静态块（静态变量）——>成员变量——>构造方法——>静态方法
//    注意：静态变量和静态代码块的加载顺序由编写先后决定

    //静态变量
    static int a = 3;
    static int b;
    //静态方法
    static void meth(int x){
        System.out.println("x = "+x);
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
    //静态块
    static {
        System.out.println("static block initialized");
        b = a*4;
    }
    public static void main(String[] args) {

        meth(42);

        //首先执行静态块内容
        //a=3 b=12
        //执行静态方法的内容
        //x=42 a=3 b=12

        System.out.println(StaticDemo.b);//调用静态方法
        System.out.println(StaticDemo.a);//使用静态变量

    }
}
