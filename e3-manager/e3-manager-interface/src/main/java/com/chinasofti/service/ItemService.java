package com.chinasofti.service;
/*
 * @author:张国栋
 * Date  ：2019/4/25
 * */

import com.chinasofti.EasyUIDataGridResult;

public interface ItemService {

        public EasyUIDataGridResult queryByPageBean(int pageIndex, int pageCount);

}
