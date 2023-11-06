package ru.savin.feign_2.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.savin.feign_2.enity.Address;
import ru.savin.feign_2.mapper.AddressMapper;
import ru.savin.feign_2.repository.AddressRepository;
import ru.savin.feign_2.response.AddressResponse;

@Service
@RequiredArgsConstructor
public class AddressService {
    private final AddressRepository addressRepository;
    private final AddressMapper addressMapper;

    public AddressResponse findAddressByEmployeeId(long employeeId) {
        Address address = addressRepository.findAddressByEmployeeId(employeeId)
                .orElseGet(null);
        return addressMapper.mapToResponse(address);
    }
}
