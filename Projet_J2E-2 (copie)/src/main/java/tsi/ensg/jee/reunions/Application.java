package tsi.ensg.jee.reunions;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;




//@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})

//@ComponentScan({"tsi.ensg.jee.reunions.service, tsi.ensg.jee.reunions.dao"})
//@EntityScan("tsi.ensg.jee.reunions.service, tsi.ensg.jee.reunions.dao")
//@EnableJpaRepositories("tsi.ensg.jee.reunions.dao")
@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class, DataSourceAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class, HibernateJpaAutoConfiguration.class})

@SpringBootApplication
public class Application  {
    /*@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Application.class);
    }*/
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

    }

}
