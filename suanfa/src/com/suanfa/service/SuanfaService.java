package com.suanfa.service;

/**
 * @author xiaoxinga
 * @date 2019/01/09 15:08
 * @since
 */
public class SuanfaService {
    /*百钱买百鸡的问题算是一套非常经典的不定方程的问题，题目很简单：公鸡5文钱一只，母鸡3文钱一只，小鸡3只一文钱，

    用100文钱买一百只鸡,其中公鸡，母鸡，小鸡都必须要有，问公鸡，母鸡，小鸡要买多少只刚好凑足100文钱。

    分析：估计现在小学生都能手工推算这套题，只不过我们用计算机来推算，我们可以设公鸡为x，母鸡为y，小鸡为z，那么我们

    可以得出如下的不定方程，

    x+y+z=100,

            5x+3y+z/3=100，

    下面再看看x，y，z的取值范围。

    由于只有100文钱，则5x<100 => 0<x<20, 同理  0<y<33,那么z=100-x-y*/
    public static void main(String[] args) {
        int x, y, z;
        for (x = 1; x < 20; x++) {
            for (y = 1; y < 33; y++) {
                z = 100 - x - y;
                if (z % 3 == 0 && (5 * x + 3 * y + z / 3) == 100) {
                    System.out.println("公鸡：" + x + "，母鸡：" + y + "，小鸡：" + z);
                }
            }
        }
        //x=4k
        for(int k = 1; k <= 3; k++)
        {
            x = 4 * k;
            y = 25 - 7 * k;
            z = 75 + 3 * k;
            System.out.println("公鸡：" + x + "，母鸡：" + y + "，小鸡：" + z);
        }
    }
}
