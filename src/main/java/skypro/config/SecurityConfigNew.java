package skypro.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;

import javax.sql.DataSource;

@EnableWebSecurity
public class SecurityConfigNew extends WebSecurityConfigurerAdapter {

    private final DataSource dataSource;

    public SecurityConfigNew(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication().dataSource(dataSource);
    }



//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//
//        User.UserBuilder userBuilder = User.withDefaultPasswordEncoder();
//        auth.inMemoryAuthentication()
//                .withUser(userBuilder.username("Ann").password("1").roles("Employee"))
//                .withUser(userBuilder.username("Bob").password("2").roles("IT"))
//                .withUser(userBuilder.username("Cate").password("3").roles("Security","IT"))
//                .withUser(userBuilder.username("Den").password("4").roles("Director","Security","IT"));
//    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.authorizeRequests()
                .antMatchers("/").hasAnyRole("Employee", "IT", "Security", "Director")
                .antMatchers("/it").hasAnyRole("IT")
                .antMatchers("/security").hasAnyRole("Security")
                .antMatchers("/director").hasAnyRole("Director")
                .and().formLogin().permitAll();
    }
}