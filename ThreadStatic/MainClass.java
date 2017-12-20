package cn.com.doone.tx.cloud.ThreadStatic;

/**
 * @OAuthor: YeCongZhi
 * @Description:
 * @CreatedDate: 2017/12/18 9:34
 * @Package:cn.com.doone.tx.cloud.controller
 */
public class MainClass {

    /**
     * java多线程同步锁的使用
     * 示例：三个窗口同时出售16张票
     */
    public static void main(String[] args) {

        //实例化站台对象
//        Station station1 = new Station("窗口1");
//        Station station2 = new Station("窗口2");
//        Station station3 = new Station("窗口3");

        //让每个站台对象各自开始工作
//        station1.start();
//        station2.start();
//        station3.start();


        /**
         * 两个人AB通过一个账户A在柜台取钱和B在ATM机取钱
         * */
        // 实力化一个银行对象
//        Bank bank = new Bank();
        // 实例化两个人，传入同一个银行的对象
//        PersonA pA = new PersonA(bank);
//        PersonB pB = new PersonB(bank);
        // 两个人开始取钱
//        pA.start();
//        pB.start();


        //龟兔赛跑20米
        //实例化乌龟和兔子
        Tortoise tortoise = new Tortoise();
        Rabbit rabbit = new Rabbit();

        //回调方法的使用，谁先调用calltoback方法，另一个就不跑了
        LetOneStop letOneStop1 = new LetOneStop(tortoise);
        rabbit.calltoback = letOneStop1;//让兔子的回调方法里面存在乌龟对象的值，可以把乌龟stop
        LetOneStop letOneStop2 = new LetOneStop(rabbit);
        tortoise.calltoback = letOneStop2;//让乌龟的回调方法里面存在兔子对象的值，可以把兔子stop

        //开始跑
        tortoise.start();
        rabbit.start();

    }
}
