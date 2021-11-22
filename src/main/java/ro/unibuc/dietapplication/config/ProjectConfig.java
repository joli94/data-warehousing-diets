package ro.unibuc.dietapplication.config;

import org.springframework.context.annotation.Bean;
import ro.unibuc.dietapplication.mapper.*;

public class ProjectConfig {
    @Bean
    public AccountMapper accountMapper() {
        return new AccountMapperImpl();
    }

    @Bean
    public BillingMapper billingMapper() {
        return new BillingMapperImpl();
    }

    @Bean
    public CityMapper cityMapper() {
        return new CityMapperImpl();
    }

    @Bean
    public CountryMapper countryMapper() {
        return new CountryMapperImpl();
    }

    @Bean
    public Diet_goalMapper diet_goalMapper() {
        return new Diet_goalMapperImpl();
    }

    @Bean
    public Diet_planMapper diet_planMapper() {
        return new Diet_planMapperImpl();
    }

    @Bean
    public Diet_typeMapper diet_typeMapper() {
        return new Diet_typeMapperImpl();
    }

    @Bean
    public DietMapper dietMapper() {
        return new DietMapperImpl();
    }

    @Bean
    public Food_categoryMapper food_categoryMapper() {
        return  new Food_categoryMapperImpl();
    }

    @Bean
    public FoodMapper foodMapper() {
        return new FoodMapperImpl();
    }

    @Bean
    public HappinessMapper happinessMapper() {
        return new HappinessMapperImpl();
    }

    @Bean
    public Optimum_caloriesMapper optimum_caloriesMapper() {
        return new Optimum_caloriesMapperImpl();
    }

    @Bean
    public PaymentMapper paymentMapper() {
        return new PaymentMapperImpl();
    }

    @Bean
    public UserMapper userMapper() {
        return new UserMapperImpl();
    }

    @Bean
    public WeightMapper weightMapper() {
        return new WeightMapperImpl();
    }
}
