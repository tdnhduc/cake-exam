package mapper;

import com.cake.origination.dto.LoginDTO;
import com.cake.origination.dto.RegisterDTO;
import com.cake.origination.handler.request.LoginRequest;
import com.cake.origination.handler.request.RegisterRequest;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DTOMapper {

    DTOMapper INSTANCE = Mappers.getMapper(DTOMapper.class);

    LoginDTO toLoginDTO(final LoginRequest loginRequest);

    RegisterDTO toRegisterDTO(final RegisterRequest registerRequest);
}
