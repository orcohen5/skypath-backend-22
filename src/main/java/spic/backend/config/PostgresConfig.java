package spic.backend.config;

import com.zaxxer.hikari.util.DriverDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
public class PostgresConfig {

    @Bean
    public JdbcTemplate jdbcTemplate() {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String username = "postgres";
        String driverClassName = "org.postgresql.Driver";
        String password = "skypath";
        DataSource dataSource = new DriverDataSource(url, driverClassName, new Properties(), username, password);
        return new JdbcTemplate(dataSource);
    }
}
