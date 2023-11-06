package ru.savin.feign_2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.savin.feign_2.enity.Address;

import java.util.Optional;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

    @Query(nativeQuery = true,
    value = "select ea.id, ea.city, ea.state from public.address ea \n" +
            "join public.employee e on e.id = ea.employee_id\n" +
            "where ea.employee_id=:employeeId")
    Optional<Address> findAddressByEmployeeId(@Param("employeeId") Long employeeId);
}
