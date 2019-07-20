//package com.example.demo.config.dao;
//
//import com.mchange.v2.c3p0.ComboPooledDataSource;
//import org.mybatis.spring.annotation.MapperScan;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.beans.PropertyVetoException;
//
//@Configuration
//@MapperScan("com.example.demo.dao") //配置mybatis mapper的扫描路径
//public class DataSourceConfiguration {
//
//    //从application.properties 配置文件中获取 参数的值使用注释@Value()
//    @Value("${jdbc.driver}")
//    private String jdbcDriver;
//    @Value("${jdbc.url}")
//    private String jdbcUrl;
//    @Value("${jdbc.user}")
//    private String jdbcUser;
//    @Value("${jdbc.password}")
//    private String jdbcPassword;
//
//    @Bean(name="dataSource")
//    public ComboPooledDataSource createDataSource() throws PropertyVetoException {
//        ComboPooledDataSource dataSource = new ComboPooledDataSource();
//        dataSource.setDriverClass(jdbcDriver);
//        dataSource.setJdbcUrl(jdbcUrl);
//        dataSource.setUser(jdbcUser);
//        dataSource.setPassword(jdbcPassword);
//        //设置关闭的时候不自动提交
//        dataSource.setAutoCommitOnClose(false);
//
//        return dataSource;
//    }
//}
