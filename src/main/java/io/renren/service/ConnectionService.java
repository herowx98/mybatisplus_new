package io.renren.service;

import io.renren.dao.ConnectionDao;
import io.renren.entity.SchemaName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConnectionService {
    @Autowired
    ConnectionDao connectionDao;
    public List<SchemaName> getSchema() {
        return connectionDao.getSchema();
    }
}
