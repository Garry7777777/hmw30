package skypro.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;

@EnableWebSecurity
public class SecurityConfigNew extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        User.UserBuilder userBuilder = User.withDefaultPasswordEncoder();
        auth.inMemoryAuthentication()
                .withUser(userBuilder.username("Bob").password("qwerty").roles("Employee"))
                .withUser(userBuilder.username("Den").password("asdfgh").roles("IT"))
                .withUser(userBuilder.username("Greg").password("zxcvbn").roles("Security"))
                .withUser(userBuilder.username("Kate").password("qazwsx").roles("Director"));

    }
}