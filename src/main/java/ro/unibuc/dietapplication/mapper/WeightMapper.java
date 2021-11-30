package ro.unibuc.dietapplication.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import ro.unibuc.dietapplication.dto.WeightDto;
import ro.unibuc.dietapplication.model.User;
import ro.unibuc.dietapplication.model.Weight;

@Mapper(imports = {User.class})
public abstract class WeightMapper implements EntityMapper<WeightDto, Weight>{
    @Mappings({
            @Mapping(target = "userId", source = "user.id")
    })
    public abstract WeightDto toDto(Weight weight);

    @Mappings({
            @Mapping(target = "user.id", source = "userId")
    })
    public abstract Weight toEntity(WeightDto weightDto);
}
