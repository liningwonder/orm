package com.lining.orm.datasource;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.datasource.DataSourceFactory;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * description:
 * date 2018-03-05
 *
 * @author lining1
 * @version 1.0.0
 */
public class DruidDataSourceFactory implements DataSourceFactory {

    Properties properties = null;

    @Override
    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public DataSource getDataSource() {
        DataSource dataSource = null;
        try {
            dataSource = com.alibaba.druid.pool.DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dataSource;
    }
}
