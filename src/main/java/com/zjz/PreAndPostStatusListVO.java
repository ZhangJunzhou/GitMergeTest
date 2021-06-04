package com.zjz;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhangjunzhou
 * @date 2021/5/30 12:11 下午
 *
 * 用于判断哪些status位于当前status之前，
 * 哪些status位于当前status之后
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PreAndPostStatusListVO {
    /**
     * 当前status
     */
    private int status;

    /**
     * preStatus的集合
     */
    List<Integer> preStatusList;

    /**
     * postStatus的集合
     */
    List<Integer> postStatusList;
}
