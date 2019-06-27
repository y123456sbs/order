package com.b4pay.order;

import org.apache.commons.lang3.RandomUtils;

import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        RandomUtils randomUtils = new RandomUtils();
        // 生成 [0-n) 个不重复的随机数
        // list 用来保存这些随机数
        Set numsSet = new HashSet<>();
        while (numsSet.size() < 7) {
            numsSet.add(randomUtils.nextInt(1, 49));
        }
        System.out.println(numsSet);
    }


}
