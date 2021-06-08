package com.zjz;

import java.util.Arrays;
import java.util.List;

/**
 * @author zhangjunzhou
 * @date 2021/5/30 12:36 下午
 */
public class ListTest {
    public static void main(String[] args) {
        List<Integer> listOfBranch2 = Arrays.asList(new Integer[]{1, 2});

        for(int i = 0; i < listOfBranch2.size(); i++){
            System.out.println(listOfBranch2.get(i));
        }
    }
}
