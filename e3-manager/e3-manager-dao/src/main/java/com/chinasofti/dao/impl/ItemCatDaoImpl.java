package com.chinasofti.dao.impl;/*
 * @author:张国栋
 * Date  ：2019/4/24
 * */

import com.chinasofti.dao.ItemCatDao;
import com.chinasofti.entity.TbItemCat;
import com.chinasofti.framework.BaseDaoImpl;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ItemCatDaoImpl extends BaseDaoImpl<TbItemCat> implements ItemCatDao  {

   @Autowired
   HibernateTemplate hibernateTemplate;

    @Override
    public List<TbItemCat> queryByPid(final Integer pid) {
        List<TbItemCat> itemCatList = hibernateTemplate.execute(new HibernateCallback<List<TbItemCat>>() {
            @Override
            public List<TbItemCat> doInHibernate(Session session) throws HibernateException {
                List list = session.createQuery("from TbItemCat where parent_id =:pid")
                        .setParameter("pid", pid)
                        .list();
                return list;
            }
        });
        return itemCatList;
    }
}
