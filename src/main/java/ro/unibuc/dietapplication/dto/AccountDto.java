package ro.unibuc.dietapplication.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AccountDto {
    private Long id;

    private String password;

    private String active;

    private UserDto userDto;
}
