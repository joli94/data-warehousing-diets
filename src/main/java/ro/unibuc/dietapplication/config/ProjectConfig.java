package ro.unibuc.dietapplication.config;

import org.springframework.context.annotation.Bean;
import ro.unibuc.dietapplication.mapper.*;

public class ProjectConfig {
    @Bean
    public CityMapper cityMapper(){return new CityMapperImpl();}

    @Bean
    public CountryMapper countryMapper(){return new CountryMapperImpl();}

    @Bean
    public UserMapper userMapper(){return new UserMapperImpl();}
}
