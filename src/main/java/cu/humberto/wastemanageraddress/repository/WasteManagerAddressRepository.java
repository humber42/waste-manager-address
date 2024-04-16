package cu.humberto.wastemanageraddress.repository;

import cu.humberto.wastemanageraddress.entity.WasteManagerAddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WasteManagerAddressRepository extends JpaRepository<WasteManagerAddressEntity,Long> {
}
