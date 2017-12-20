package cn.com.doone.tx.cloud.ThreadStatic;

/**
 * @OAuthor: YeCongZhi
 * @Description:
 * @CreatedDate: 2017/12/18 14:25
 * @Package:cn.com.doone.tx.cloud.ThreadStatic
 */
public class StaticFoo {

    static int i = 1024;
    static double k = 2048.0;
    int b = 1;

    public static void main(String[] args){
        StaticFoo f = new StaticFoo();
        //应该以静态方式访问类型Foo中的静态方法setK(double) 或者setK就不要静态化了嘛
        f.setK(2.0);//The static method setK(double) from the type Foo should be accessed in a static way
        StaticFoo.setK(33);
        System.out.println("k = " + k);
    }

    public void setI(int i){
        StaticFoo.i = i;
        this.i = i;//The static field Foo.i should be accessed in a static way简单翻译就是，应该用 Foo.i这种形式
    }

    //java 这种形式称为静态初始化或者静态代码块
    public static void setK(double k){
        StaticFoo.k = k;
    }

//    public static void setB(int b){
//        StaticFoo.b = b;//Cannot make a static reference to the non-static field Foo.b 能看懂吧，他是让你把变量b变成静态变量
//        this.b = b;//Cannot use this in a static context
//        b = 666;
//    }

}
