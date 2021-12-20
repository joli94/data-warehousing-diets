package ro.unibuc.dietapplication.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
        private final DataSource dataSource;

        public SecurityConfig(DataSource dataSource) {
                this.dataSource = dataSource;
        }

        @Bean
        public PasswordEncoder passwordEncoder(){
            return new BCryptPasswordEncoder();
        }

        @Override
        protected void configure(AuthenticationManagerBuilder auth) throws Exception{
            auth.jdbcAuthentication()
                    .dataSource(dataSource)
                    .usersByUsernameQuery("SELECT username, password, active " +
                                    "FROM users u join account a on a.account_id=u.user_id " +
                                    "WHERE username = ?")
                    .authoritiesByUsernameQuery("select username, role "
                            + "FROM users u join account a on a.account_id=u.user_id "
                            + "where username = ?");
        }

        @Override
        protected void configure(HttpSecurity http) throws Exception{
                http
                        .authorizeRequests()
                                .antMatchers("/registration/", "/cities/**", "/countries/**", "dietGoals", "/dietTypes", "/diets").permitAll()
                                .antMatchers("/users/**","/accounts/**", "/billings/**", "/dietPlans/**").authenticated()
                                .anyRequest().authenticated()
                        .and()
                                .httpBasic()
                        .and()
                                .csrf().disable();

                //TODO: de pus toate path-urile, si de pus roluri
        }

}
