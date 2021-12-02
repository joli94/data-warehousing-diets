package ro.unibuc.dietapplication.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import ro.unibuc.dietapplication.dto.AccountDto;
import ro.unibuc.dietapplication.model.Account;

@Mapper(imports = {Account.class})
public abstract class AccountMapper implements EntityMapper<AccountDto, Account>{
    @Mappings({
            @Mapping(target = "userId", source = "user.id")
    })
    public abstract AccountDto toDto(Account account);

    @Mappings({
            @Mapping(target = "user.id", source = "userId")
    })
    public abstract Account toEntity(AccountDto accountDto);
}
