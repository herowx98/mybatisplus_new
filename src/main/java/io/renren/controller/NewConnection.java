package io.renren.controller;

import com.alibaba.druid.pool.DruidDataSource;
import io.renren.entity.SchemaName;
import io.renren.service.ConnectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.GroupSequence;
import java.util.List;

@RestController
@RequestMapping("/new")
public class NewConnection {
    @Autowired
    DruidDataSource druidDataSource;
    @Autowired
    ConnectionService connectionService;
    @GetMapping("/connection")
    public void getNewConnection(){
        druidDataSource.resetStat();
        druidDataSource.setUrl("jdbc:mysql://localhost:3306/guli_edu?useUnicode=true&characterEncoding=UTF-8&useSSL=false&serverTimezone=Asia/Shanghai");

    }

    @GetMapping("/getSchema")
    public void getSchema(){
        List<SchemaName> list = connectionService.getSchema();
        System.out.println("list = " + list);

    }
}
