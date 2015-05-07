/**
 * EatPeach.java   2015年5月7日 下午5:36:39 by gordon.li 
 *
 * Copyright (c) 2000 - 2015 gordon.Li. All rights reserved.
 * 
 */
package com.xuebing.algorithm.interview;

/**
 * EatPeach
 * 
 * @ClassName EatPeach
 * @Description 猴子吃桃问题：
 * 猴子吃桃子问题：猴子第一天摘下N个桃子，当时就吃了一半，还不过瘾，就又吃了一个。第二天又将剩下的桃子吃掉一半，又多吃了一个。以后每天都吃前一天剩下的一半零一个。到第10天在想吃的时候就剩一个桃子了,求第一天共摘下来多少个桃子？
 * 
 * 公式 : tomorrow = today / 2 - 1; 推出 today = 2tomorrow + 2; 或 today = 2(tomorrow + 1);
 * 
 * @author gordon.li coderxb@163.com
 * @date 2015年5月7日 下午5:43:29
 */
public class EatPeach {

    public static void main(String[] args) {
        int amount = eat(10);
        System.out.println("第一天摘了" + amount + "个");
    }

    public static int eat(int days) {
        if (days > 1) {
            return 2 * (eat(--days) + 1);
        }
        return 1;
    }

    public static int eat2(int days) {
        int total = 0;
        for (int i = days; i > 0; i--) {
            if (i == days) {
                total = 1;
            } else {
                total = total * 2 + 2;
            }
            System.out.println("第" + i + "天吃" + total);
        }
        return total;
    }

    public static int eat3(int days) {
        int total = 1;
        System.out.println("第" + 10 + "天吃" + total);
        for (int i = days - 1; i > 0; i--) {
            total = (total + 1) * 2;
            System.out.println("第" + i + "天吃" + total);
        }
        return total;
    }
}
