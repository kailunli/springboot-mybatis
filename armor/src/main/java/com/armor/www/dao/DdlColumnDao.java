package com.armor.www.dao;

import com.armor.www.ddlentity.ColumnEntity;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DdlColumnDao {

    @Select("select * from `information_schema`.`columns` where `table_schema`=#{tableSchema, jdbcType=VARCHAR} and `table_name`=#{tableName, jdbcType=VARCHAR}")
    @Results({
            @Result( column = "table_schema", property = "tableSchema"),
            @Result( column = "table_name", property = "tableName"),
            @Result( column = "column_name", property = "columnName"),
            @Result( column = "column_default", property = "columnDefault"),
            @Result( column = "is_nullable", property = "isNullable"),
            @Result( column = "data_type", property = "dataType"),
            @Result( column = "column_type", property = "columnType"),
            @Result( column = "extra", property = "extra"),
            @Result( column = "column_comment", property = "columnComment"),
    })
    List<ColumnEntity> getTableColumns(@Param("tableName") String tableName, @Param(value = "tableSchema") String tableSchema);

}
