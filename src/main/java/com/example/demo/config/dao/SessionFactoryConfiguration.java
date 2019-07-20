//package com.example.demo.config.dao;
//
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
//
//import javax.sql.DataSource;
//
//// 告诉spring要去扫描这个类
//@Configuration
//public class SessionFactoryConfiguration {
//
//    //mybatis mapper 文件的位置
//    @Value("${mybatis.mapper-locations}")
//    private String mapperPath;
//
//    //mybatis-config.xml 配置文件的路径
//    @Value("${mybatis.config_file}")
//    private String mybatisConfigFilePath;
//
//    @Autowired
//    @Qualifier("dataSource")
//    private DataSource dataSource;
//
//    //  实体类所在的package
//    @Value("${entity_package}")
//    private String entityPackage;
//
//    @Bean(name="sqlSessionFactoryBean")
//    public SqlSessionFactoryBean createSqlSessionFactoryBean(){
//        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
//        //引入mybatis配置文件的位置
//        sqlSessionFactoryBean.setConfigLocation(new ClassPathResource(mybatisConfigFilePath));
//
//        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
//        //mybatis 的mapper文件的位置
//        String packageSearchPath = PathMatchingResourcePatternResolver.CLASSPATH_ALL_URL_PREFIX+mapperPath;
//
//        sqlSessionFactoryBean.setMapperLocations(resolver.getResource(packageSearchPath));
//        sqlSessionFactoryBean.setDataSource(dataSource);
//        sqlSessionFactoryBean.setTypeAliasesPackage(entityPackage);
//
//        return sqlSessionFactoryBean;
//    }
//
//}
