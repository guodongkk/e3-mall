package com.chinasofti.service;/*
 * @author:张国栋
 * Date  ：2019/4/25
 * */

import com.chinasofti.EasyUIDataGridResult;
import com.chinasofti.dao.ItemDao;
import com.chinasofti.entity.TbItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


//@Service("itemService")  没有路径，
@Service
public class ItemServiceImpl implements ItemService {
   @Autowired
    ItemDao itemDao;

    @Override
    public EasyUIDataGridResult queryByPageBean(int pageIndex, int pageCount) {

        int first=(pageIndex-1)*pageCount;
        int max=pageCount;
        List<TbItem> list = itemDao.queryByPageBean(new TbItem(), first, max);
        long counts = itemDao.getCounts();
        EasyUIDataGridResult easyUIDataGridResult = new EasyUIDataGridResult(counts, list);
        return easyUIDataGridResult;

    }
}
