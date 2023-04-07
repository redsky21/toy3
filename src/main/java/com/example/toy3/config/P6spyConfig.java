package com.example.toy3.config;

import com.p6spy.engine.spy.P6SpyOptions;
import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Configuration;



@Configuration
public class P6spyConfig {
    @PostConstruct
    public void setLogMessageFormat() {
        P6SpyOptions.getActiveInstance().setLogMessageFormat(P6spyPrettySqlFormatter.class.getName());
    }
//    @Primary
//    @Bean(name = "dbDataSource")
//    @ConfigurationProperties(prefix = "datasource.db")
//    public HikariDataSource dbDataSource() {
//        return DataSourceBuilder.create().type(HikariDataSource.class).build();
//    }
}