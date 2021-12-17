package ro.unibuc.dietapplication.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {
    private Long id;

    private String username;
    private String first_name;
    private String last_name;

    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate birth_date;

    private String gender;

    private Long cityId;
}
