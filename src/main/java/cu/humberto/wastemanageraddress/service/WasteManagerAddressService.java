package cu.humberto.wastemanageraddress.service;

import cu.humberto.wastemanageraddress.dto.WasteManagerAddressDTO;

import java.util.List;

public interface WasteManagerAddressService {
    WasteManagerAddressDTO create(WasteManagerAddressDTO wasteManagerAddress);
    WasteManagerAddressDTO update(WasteManagerAddressDTO wasteManagerAddress);
    WasteManagerAddressDTO findById(long id);
    void deleteById(long id);
    List<WasteManagerAddressDTO> findAll();
}
