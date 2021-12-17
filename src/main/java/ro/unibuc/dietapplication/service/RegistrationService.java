package ro.unibuc.dietapplication.service;

import org.springframework.stereotype.Service;
import ro.unibuc.dietapplication.model.Account;
import ro.unibuc.dietapplication.model.Registration;
import ro.unibuc.dietapplication.model.User;

@Service
public class RegistrationService {
    private final UserService userService;
    private final CityService cityService;
    private final AccountService accountService;

    public RegistrationService(UserService userService, CityService cityService, AccountService accountService) {
        this.userService = userService;
        this.cityService = cityService;
        this.accountService = accountService;
    }

    //TODO: schimbam in obiect? E nevoie?
    public void create(Registration registration){
        User registeredUser = User.builder()
                .username(registration.getUsername())
                .first_name(registration.getFirst_name())
                .last_name(registration.getLast_name())
                .birth_date(registration.getBirth_date())
                .gender(registration.getGender())
                .city(cityService.findById(registration.getCity()))
                .build();

        User resultedUser = userService.create(registeredUser);

        Account registeredAccount = Account.builder()
                .id(resultedUser.getId())
                .user(resultedUser)
                .password(registration.getPassword())
                .role("user")
                .active("1")
                .build();

        Account resultedAccount = accountService.create(registeredAccount);
    }
}
