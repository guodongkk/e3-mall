package com.chinasofti.service;/*
 * @author :张
 * Date  : 2019/4/25
 * @Description: ItemCatServiceImpl
 */

import com.chinasofti.EasyUITreeNode;
import com.chinasofti.dao.ItemCatDao;
import com.chinasofti.entity.TbItemCat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemCatServiceImpl implements ItemCatService {

    @Autowired
    ItemCatDao itemCatDao;

    @Override
    public List<EasyUITreeNode> queryAction(Integer p_id) {
       //通过pid拿到节点
        List<TbItemCat> list = itemCatDao.queryByPid(p_id);
       //将节点放入TreeNode
        ArrayList<EasyUITreeNode> easyUITreeNodeList = new ArrayList<>();
        for (TbItemCat cat:list) {
            EasyUITreeNode easyUITreeNode = new EasyUITreeNode();
             easyUITreeNode.setId(cat.getId());//节点id
             easyUITreeNode.setText(cat.getName());//类目
            //如果是父类目就closed， 不是就open
            easyUITreeNode.setState(cat.getIsParent()?"closed":"open");
            //将节点加入集合中
            easyUITreeNodeList.add(easyUITreeNode);
        }
        return easyUITreeNodeList;
    }
}
