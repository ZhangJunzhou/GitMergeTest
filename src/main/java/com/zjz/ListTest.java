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
        List<Integer> listOfBranch1 = Arrays.asList(new Integer[]{1, 2});

        for(int i = 0; i < listOfBranch1.size(); i++){
            System.out.println(listOfBranch1.get(i));
        }


        List<Integer> cachedBOList = new ArrayList<>();
        System.out.println(cachedBOList.size());

        HashMap<Integer, PreAndPostStatusListVO> statusMap = new HashMap<Integer, PreAndPostStatusListVO>(){{
            put(0, new PreAndPostStatusListVO(0, Arrays.asList(new Integer[]{}), Arrays.asList(new Integer[]{1, 6, 7, 10, 20, 30, 40, 50, 60, 70, 80, 100, 110, 120, 130, 140, 150})));
        }};

        System.out.println(statusMap.get(0).getPreStatusList().contains(11));



    }

}
