package com.imdb.imdb_dbschema.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    private HikariDataSource hikariDataSource;

    @Bean
    public DataSource dataSource(DataSourceProperties dataSourceProperties) {
        hikariDataSource = (HikariDataSource) dataSourceProperties.initializeDataSourceBuilder().build();
        return hikariDataSource;
    }

}
