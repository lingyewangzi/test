package cn.com.doone.tx.cloud.ThreadStatic;

/**
 * @OAuthor: YeCongZhi
 * @Description:
 * @CreatedDate: 2017/12/18 15:02
 * @Package:cn.com.doone.tx.cloud.ThreadStatic
 */
public class Rabbit extends Animal {//继承父类

    public Rabbit(){
       // Thread的方法，给线程赋值名字
        setName("兔子");
    }

    @Override
    public void runing() {//父类是抽象类 子类必须重写父类的抽象方法
        // 跑的距离
        double dis = 0.5;
        length -= dis;//跑完后距离减少
        if (length <= 0) {
            length = 0;
            System.out.println("兔子获得了胜利");
        }
        //给回调对象赋值，让乌龟不要再跑了
        if (calltoback != null) {
            calltoback.win();
        }
        System.out.println("兔子跑了" + dis + "米，距离终点还有" + (int)length + "米");
        if (length % 2 == 0) {// 两米休息一次
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
