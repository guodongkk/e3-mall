package com.chinasofti.service;/*
 * @author :张
 * Date  : 2019/4/25
 * @Description: ItemCatService
 */

import com.chinasofti.EasyUITreeNode;

import java.util.List;

public interface ItemCatService {
    public List<EasyUITreeNode> queryAction(Integer p_id);
}
