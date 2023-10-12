package bth.assignment.OneBEServiceMS.repository;

import bth.assignment.OneBEServiceMS.entity.StoreAdmin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StoreAdminRepository extends JpaRepository<StoreAdmin, Long> {

    Optional<StoreAdmin> findStoreAdminByEmail(String email);
    Boolean existsStoreAdminByFirebaseUid(String firebaseUid);
    Optional<StoreAdmin> findStoreAdminByFirebaseUid(String firebaseUid);
    Optional<StoreAdmin> findStoreAdminByStoreAdminId(Long storeAdminId);
    List<StoreAdmin> findAll();

}
