package com.armor.www.controller;

import com.alibaba.fastjson.JSONObject;
import com.armor.www.ddlentity.ColumnEntity;
import com.armor.www.ddlentity.TableEntity;
import com.armor.www.service.DdlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@Controller
public class DdlController {

    @Autowired
    private DdlService ddlServ;

    @RequestMapping("/table/{tableName}")
    public String getTable(@PathVariable("tableName") String tableName) {
        TableEntity table = ddlServ.getTable(tableName);

        return JSONObject.toJSONString(table);
    }

    @RequestMapping("/tables")
    public ModelAndView getTables(ModelAndView mv) {
        List<TableEntity> tables = ddlServ.getTables();

        mv.setViewName("wht_tables");
        mv.addObject("tables", tables);

        return mv;
    }

    @RequestMapping("/tbclms/{tableName}")
    public String getTableColumns(@PathVariable("tableName") String tableName) {
        List<ColumnEntity> tbColumns = ddlServ.getTableColumns(tableName);

        return JSONObject.toJSONString(tbColumns);
    }

}
