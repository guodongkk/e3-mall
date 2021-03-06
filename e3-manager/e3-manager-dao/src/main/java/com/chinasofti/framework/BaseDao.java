package com.chinasofti.framework;/*
 * @author:张国栋
 * Date  ：2019/4/24
 * */

import org.hibernate.criterion.DetachedCriteria;

import java.util.List;

public interface BaseDao<T> {
void add(T t);

void update(T t);

void delete(Integer id);

T query(Integer id );

List<T> queryByPageBean(T t, int firstResult, int maxResults, Object... params);

long getCounts();

    DetachedCriteria createDetachedCriteria(T t, Object... param);

    List<T>queryAll();
}
