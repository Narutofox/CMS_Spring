/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.cms_ivancicek.config;

import com.spring.cms_ivancicek.DAL.MenuRepo;
import javax.persistence.EntityManagerFactory;
import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 *
 * @author programer10
 */
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(value = "com.spring.cms_ivancicek.DAL")
@ComponentScan("com.spring.cms_ivancicek.models")
//@EntityScan(value = "com.spring.cms_ivancicek.models")
public class DbConfig {

//    @Autowired
//    private Environment env;

    @Bean
    public BasicDataSource dataSource() {
        BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName("com.microsoft.jdbc.sqlserver.SQLServerDriver");
        ds.setUrl("jdbc:microsoft:sqlserver://den1.mssql3.gear.host:1433/brjakocms");
        ds.setUsername("brjakocms");
        ds.setPassword("Rg3Pi8ig4~~5");     
        return ds;
    }
    @Bean
    public JpaVendorAdapter getJpaVendorAdapter() {
        HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
        adapter.setDatabase(Database.SQL_SERVER);
        return adapter;
    }

    @Bean
    public EntityManagerFactory entityManagerFactory() {
        LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
        factory.setJpaVendorAdapter(getJpaVendorAdapter());
        factory.setPersistenceUnitName("CMS");
        factory.setPackagesToScan("com.spring.cms_ivancicek.DALs, com.spring.cms_ivancicek.models ");
        factory.setDataSource(dataSource());
               
        factory.afterPropertiesSet();       
        return factory.getObject();
    }

    @Bean
    public PlatformTransactionManager transactionManager() {

        JpaTransactionManager txManager = new JpaTransactionManager();
        txManager.setEntityManagerFactory(entityManagerFactory());
        return txManager;
    }
    
//       @Bean
//    public MenuRepo menuRepo(){
//        MenuRepo repo = new MenuRepo();
//        return repo;
//    }
}
