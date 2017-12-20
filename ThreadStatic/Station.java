package cn.com.doone.tx.cloud.ThreadStatic;

/**
 * @OAuthor: YeCongZhi
 * @Description:  继承Thread类
 * @CreatedDate: 2017/12/18 9:04
 * @Package:cn.com.doone.tx.cloud.controller
 */
public class Station extends Thread{

    //通过构造方法给线程名字赋值
    public Station(String name){
        super(name);
    }
    //为了数值一致，票数要静态
    static int tick = 20;

    //创建一个静态钥匙
    static Object ob = "aa";

    //重写run 方法 实现买票操作
    @Override
    public void run() {
       while (tick>0){
           synchronized (ob){
               //这个很重要，必须使用一个锁
               //进去的人会把钥匙拿在手上，出来后才把钥匙拿出来
               if (tick>0){
                   System.out.println(getName()+"卖出了第"+tick+"票");
                   tick --;
               }else {
                   System.out.println("票卖完了");
               }
           }
           try {
                sleep(1000);
           }catch (InterruptedException e){
                e.printStackTrace();
           }
       }
    }

}

