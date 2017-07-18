package com.sms.config;

import javax.sql.DataSource;

import org.jooq.SQLDialect;
import org.jooq.impl.DataSourceConnectionProvider;
import org.jooq.impl.DefaultConfiguration;
import org.jooq.impl.DefaultDSLContext;
import org.jooq.impl.DefaultExecuteListenerProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.TransactionAwareDataSourceProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import com.sms.exceptions.ExceptionTranslator;

@Configuration
@ComponentScan({"com.sms.sis.db.tables"})
@EnableTransactionManagement
@PropertySource("classpath:jooq_config.properties")
public class PersistenceContext {

	@Autowired
	private Environment environment;
	 
	@Bean
	public DataSource dataSource() {
		MysqlDataSource dataSource = new MysqlDataSource();
	 
	    dataSource.setUrl(environment.getRequiredProperty("db.url"));
	    dataSource.setUser(environment.getRequiredProperty("db.username"));
	    dataSource.setPassword(environment.getRequiredProperty("db.password"));
	
	    return dataSource; 
	}
	
	@Bean
	public TransactionAwareDataSourceProxy transactionAwareDataSource() {
	    return new TransactionAwareDataSourceProxy(dataSource());
	}
	 
	@Bean
	public DataSourceTransactionManager transactionManager() {
	    return new DataSourceTransactionManager(dataSource());
	}
	 
	@Bean
	public DataSourceConnectionProvider connectionProvider() {
	    return new DataSourceConnectionProvider(transactionAwareDataSource());
	}
	 
	@Bean
	public ExceptionTranslator exceptionTransformer() {
	    return new ExceptionTranslator();
	}
	     
	@Bean
	public DefaultDSLContext dsl() {
	    return new DefaultDSLContext(configuration());
	}
	
	@Bean
    public DefaultConfiguration configuration() {
        DefaultConfiguration jooqConfiguration = new DefaultConfiguration();
        jooqConfiguration.set(connectionProvider());
        jooqConfiguration.set(new DefaultExecuteListenerProvider(exceptionTransformer()));

        String sqlDialectName = environment.getRequiredProperty("jooq.sql.dialect");
        SQLDialect dialect = SQLDialect.valueOf(sqlDialectName);
        jooqConfiguration.set(dialect);

        return jooqConfiguration;
    }

}	
