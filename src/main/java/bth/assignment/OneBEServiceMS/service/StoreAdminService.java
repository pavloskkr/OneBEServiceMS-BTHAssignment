package bth.assignment.OneBEServiceMS.service;

import bth.assignment.OneBEServiceMS.entity.StoreAdmin;

import java.util.List;
import java.util.Optional;

public interface StoreAdminService {


    StoreAdmin createStoreAdmin(StoreAdmin storeAdmin);

    Optional<StoreAdmin> findStoreAdminByFirebaseUid(String firebaseUid);

    Optional<StoreAdmin> findStoreAdminByStoreAdminId(Long storeAdminId);

    List<StoreAdmin> findAllStoreAdmins();

    StoreAdmin save(StoreAdmin existingStoreAdmin);
}
