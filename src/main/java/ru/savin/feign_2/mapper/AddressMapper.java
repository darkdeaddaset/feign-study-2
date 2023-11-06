package ru.savin.feign_2.mapper;

import org.mapstruct.Mapper;
import ru.savin.feign_2.enity.Address;
import ru.savin.feign_2.response.AddressResponse;

@Mapper(componentModel = "spring")
public interface AddressMapper {

    AddressResponse mapToResponse(Address address);
}
