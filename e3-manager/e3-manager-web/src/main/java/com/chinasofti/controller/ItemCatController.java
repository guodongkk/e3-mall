package com.chinasofti.controller;/*
 * @author :张
 * Date  : 2019/4/25
 * @Description: ItemCatController
 */


import com.chinasofti.EasyUITreeNode;
import com.chinasofti.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/item/cat")
public class ItemCatController {

    @Autowired
    ItemCatService itemCatService;

    @RequestMapping("/list")
    @ResponseBody
    public List<EasyUITreeNode> list(@RequestParam(name = "id",defaultValue = "0")Integer pid,@RequestParam(name = "text",required = false) String text){
        System.out.println("pid======="+pid);
        System.out.println("text======="+text);
        List<EasyUITreeNode> easyUITreeNodes = itemCatService.queryAction(pid);

        return easyUITreeNodes;
    }


}
