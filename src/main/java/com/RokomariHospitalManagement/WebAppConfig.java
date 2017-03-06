package com.RokomariHospitalManagement;



import javax.annotation.Resource;
import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.RokomariHospitalManagement.entity.DoctorEntity;
import com.RokomariHospitalManagement.entity.PatientEntity;

@Configuration
@EnableWebMvc
@EnableTransactionManagement
@ComponentScan("com")
@EntityScan("com")



public class WebAppConfig {
 
    private static final String PROPERTY_NAME_DATABASE_DRIVER = "spring.datasource.driver-class-name";
    private static final String PROPERTY_NAME_DATABASE_PASSWORD = "spring.datasource.password";
    private static final String PROPERTY_NAME_DATABASE_URL = "spring.datasource.url";
    private static final String PROPERTY_NAME_DATABASE_USERNAME = "spring.datasource.username";
 
  
 
    @Resource
    private Environment env;
 
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
 
        dataSource.setDriverClassName(env.getRequiredProperty(PROPERTY_NAME_DATABASE_DRIVER));
        dataSource.setUrl(env.getRequiredProperty(PROPERTY_NAME_DATABASE_URL));
        dataSource.setUsername(env.getRequiredProperty(PROPERTY_NAME_DATABASE_USERNAME));
        dataSource.setPassword(env.getRequiredProperty(PROPERTY_NAME_DATABASE_PASSWORD));
 
        return dataSource;
    }
 
   
	
	
	@Bean
	public SessionFactory sessionFactory() {
		return new LocalSessionFactoryBuilder(dataSource())
		   .addAnnotatedClasses(PatientEntity.class)
		   .addAnnotatedClasses(DoctorEntity.class)
		   .buildSessionFactory();
	}
 
    
	@Bean
    public JpaTransactionManager transactionManager() {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        return transactionManager;
    }
   
 
}

