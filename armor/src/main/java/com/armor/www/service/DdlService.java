package com.armor.www.service;

import com.armor.www.dao.DdlColumnDao;
import com.armor.www.dao.DdlTableDao;
import com.armor.www.ddlentity.ColumnEntity;
import com.armor.www.ddlentity.TableEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DdlService extends BaseService {

    @Autowired
    private DdlTableDao ddlTableDao;

    @Autowired
    private DdlColumnDao ddlColumnDao;

    public DdlService() {
        super();
    }

    /* 获取数据表信息 */
    public TableEntity getTable(String tableName) {
        return ddlTableDao.getTable(tableName, tableSchema);
    }

    /* 获取数据表字段信息 */
    public List<ColumnEntity> getTableColumns(String tableName) {
        return ddlColumnDao.getTableColumns(tableName, tableSchema);
    }

    public List<TableEntity> getTables() {
        return ddlTableDao.getTables(tableSchema);
    }



}
