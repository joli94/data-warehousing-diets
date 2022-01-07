package ro.unibuc.dietapplication.mapper;

import org.mapstruct.Mapper;
import ro.unibuc.dietapplication.dto.AccountDto;
import ro.unibuc.dietapplication.model.Account;

@Mapper
public interface AccountMapper extends EntityMapper<AccountDto, Account>{
}
