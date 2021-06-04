package com.zjz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author zhangjunzhou
 * @date 2021/5/30 12:36 下午
 */
public class ListTest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(new Integer[]{1, 2});

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }

}
