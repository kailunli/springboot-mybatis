package com.armor.www.dao;

import com.armor.www.ddlentity.TableEntity;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DdlTableDao {

    /* 获取数据表 */
    @Select("select * from `information_schema`.`tables` where `table_schema`=#{tableSchema, jdbcType=VARCHAR} and `table_name`=#{tableName, jdbcType=VARCHAR}")
    @Results(id="table", value = {
            @Result( column = "table_schema", property = "tableSchema"),
            @Result( column = "table_name", property = "tableName"),
            @Result( column = "engine", property = "engine"),
            @Result( column = "table_comment", property = "tableComment"),
            @Result( column = "{tableName=table_name, tableSchema=table_schema}", property = "columns", many = @Many(
                    select = "com.armor.www.dao.DdlColumnDao.getTableColumns"
            ))
    })
    TableEntity getTable(@Param("tableName") String tableName, @Param("tableSchema") String tableSchema);

    /* 获取所有数据表 */
    @Select("select * from `information_schema`.`tables` where `table_schema`=#{tableSchema, jdbcType=VARCHAR}")
    @ResultMap("table")
    List<TableEntity> getTables(@Param("tableSchema") String tableSchema);
}
