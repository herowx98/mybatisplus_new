package io.renren.dao;

import io.renren.entity.SchemaName;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ConnectionDao {
    List<SchemaName> getSchema();
}
