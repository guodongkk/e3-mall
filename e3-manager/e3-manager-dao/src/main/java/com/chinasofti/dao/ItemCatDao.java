package com.chinasofti.dao;/*
 * @author:张国栋
 * Date  ：2019/4/24
 * */

import com.chinasofti.entity.TbItemCat;
import com.chinasofti.framework.BaseDao;

import java.util.List;

public interface ItemCatDao extends BaseDao<TbItemCat> {

public List<TbItemCat> queryByPid(Integer pid);
}
