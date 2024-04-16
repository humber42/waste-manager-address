package cu.humberto.wastemanageraddress.service.impl;

import cu.humberto.wastemanageraddress.dto.WasteManagerAddressDTO;
import cu.humberto.wastemanageraddress.entity.WasteManagerAddressEntity;
import cu.humberto.wastemanageraddress.repository.WasteManagerAddressRepository;
import cu.humberto.wastemanageraddress.service.WasteManagerAddressService;
import lombok.RequiredArgsConstructor;
import org.dozer.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class WasteManagerAddressServiceImpl implements WasteManagerAddressService {
    private final WasteManagerAddressRepository wasteManagerAddressRepository;
    private final Mapper mapper;
    @Override
    public WasteManagerAddressDTO create(WasteManagerAddressDTO wasteManagerAddress) {
        return this.saveOrUpdate(mapper.map(wasteManagerAddress,WasteManagerAddressEntity.class));
    }

    @Override
    public WasteManagerAddressDTO update(WasteManagerAddressDTO wasteManagerAddress) {
        return this.saveOrUpdate(mapper.map(wasteManagerAddress,WasteManagerAddressEntity.class));
    }

    private WasteManagerAddressDTO saveOrUpdate(WasteManagerAddressEntity wasteManagerAddress){
       return mapper.map(wasteManagerAddressRepository.save(wasteManagerAddress), WasteManagerAddressDTO.class);
    }

    @Override
    public WasteManagerAddressDTO findById(long id) {
        return mapper.map(wasteManagerAddressRepository.findById(id).get(), WasteManagerAddressDTO.class);
    }

    @Override
    public void deleteById(long id) {
        wasteManagerAddressRepository.deleteById(id);
    }

    @Override
    public List<WasteManagerAddressDTO> findAll() {
        return wasteManagerAddressRepository.findAll().stream().map(wasteManagerAddressEntity -> mapper.map(wasteManagerAddressEntity,WasteManagerAddressDTO.class))
                .collect(Collectors.toList());
    }
}
