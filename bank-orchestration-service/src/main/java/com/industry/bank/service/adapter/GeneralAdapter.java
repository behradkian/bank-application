package com.industry.bank.service.adapter;

import com.industry.bank.api.dto.general.NationalityDto;
import com.industry.bank.api.dto.location.AddressDto;
import com.industry.bank.api.dto.location.CityDto;
import com.industry.bank.api.dto.location.CountryDto;
import com.industry.bank.service.repository.dto.AddressRequest;
import com.industry.bank.service.repository.dto.CityRequest;
import com.industry.bank.service.repository.dto.CountryRequest;
import com.industry.bank.service.repository.dto.NationalityRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Pedram Behradkian
 * @date : 2025/03/02
 */
@AllArgsConstructor
@Component
public class GeneralAdapter {

    public List<AddressRequest> adaptAddressRequestList(List<AddressDto> addresses) {

        if (addresses == null || addresses.isEmpty())
            return null;

        List<AddressRequest> addressRequests = new ArrayList<>();

        for (AddressDto addressDto : addresses)
            if (addressDto != null)
                addressRequests.add(adaptAddressRequest(addressDto));

        return addressRequests;
    }

    public AddressRequest adaptAddressRequest(AddressDto addressDto) {
        if (addressDto == null || addressDto.getAddressDetails() == null)
            return null;
        return AddressRequest.builder()
                .addressType(addressDto.getAddressType())
                .postalCode(addressDto.getAddressDetails().getPostalCode())
                .city(adaptCityRequest(addressDto.getCity()))
                .province(addressDto.getAddressDetails().getProvince())
                .townShip(addressDto.getAddressDetails().getTownShip())
                .zone(addressDto.getAddressDetails().getZone())
                .firstStreet(addressDto.getAddressDetails().getFirstStreet())
                .secondStreet(addressDto.getAddressDetails().getSecondStreet())
                .houseNumber(addressDto.getAddressDetails().getHouseNumber())
                .floorNumber(addressDto.getAddressDetails().getFloorNumber())
                .sideFloor(addressDto.getAddressDetails().getSideFloor())
                .build();
    }

    public CityRequest adaptCityRequest(CityDto city) {
        if (city == null)
            return null;
        return CityRequest.builder()
                .cityCode(city.getCode())
                .cityName(city.getName())
                .country(adaptCountryRequest(city.getCountry()))
                .build();
    }

    public CountryRequest adaptCountryRequest(CountryDto country) {
        if (country == null)
            return null;
        return CountryRequest.builder()
                .countryCode(country.getCode())
                .countryName(country.getName())
                .build();
    }

    public NationalityDto adaptNationalityDto(NationalityRequest nationalityRequest) {
        NationalityDto nationalityDto = new NationalityDto();
        nationalityDto.setCode(nationalityRequest.getNationalityCode());
        nationalityDto.setName(nationalityRequest.getNationalityName());
        return nationalityDto;
    }

    public NationalityRequest adaptNationalityRequest(NationalityDto nationalityDto){
        return null;
    }

}