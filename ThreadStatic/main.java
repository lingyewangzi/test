package cn.com.doone.tx.cloud.ThreadStatic;

/**
 * @OAuthor: YeCongZhi
 * @Description: 静态变量一定要先声明后赋值
 * @CreatedDate: 2017/12/19 10:03
 * @Package:cn.com.doone.tx.cloud.ThreadStatic
 */
public class main {

    /**静态变量是类加载时被分配到数据区（Data Area）的，
     * 它在内存中只有一个拷贝，不会被分配多次，其后的所有赋值操作都是值改变，
     * 地址则保持不变。我们知道JVM初始化变量是先声明空间，然后再赋值的**/

//    int i=100;
//    在JVM中是分开执行，等价于：
//    int i;  //分配地址空间
//    i=100;  //赋值

    public static  int i=1;
    static{
        i=100;
    }

    public static void main(String[] args) {
          System.out.println(i);
    }
}
