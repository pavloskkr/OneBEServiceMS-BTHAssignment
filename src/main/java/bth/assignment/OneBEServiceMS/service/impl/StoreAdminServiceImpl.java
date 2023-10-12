package bth.assignment.OneBEServiceMS.service.impl;

import bth.assignment.OneBEServiceMS.entity.StoreAdmin;
import bth.assignment.OneBEServiceMS.repository.StoreAdminRepository;
import bth.assignment.OneBEServiceMS.service.StoreAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StoreAdminServiceImpl implements StoreAdminService {

    @Autowired
    private StoreAdminRepository storeAdminRepository;

    @Override
    public StoreAdmin createStoreAdmin(StoreAdmin storeAdmin) {
        if (!storeAdminRepository.existsStoreAdminByFirebaseUid(storeAdmin.getFirebaseUid())) {
            return storeAdminRepository.save(storeAdmin);
        }
        else {
            return null;
        }
    }

    @Override
    public Optional<StoreAdmin> findStoreAdminByFirebaseUid(String firebaseUid) {
        return storeAdminRepository.findStoreAdminByFirebaseUid(firebaseUid);
    }

    @Override
    public Optional<StoreAdmin> findStoreAdminByStoreAdminId(Long storeAdminId) {
        return storeAdminRepository.findStoreAdminByStoreAdminId(storeAdminId);
    }

    @Override
    public List<StoreAdmin> findAllStoreAdmins() {
        return storeAdminRepository.findAll();
    }

    @Override
    public StoreAdmin save(StoreAdmin existingStoreAdmin) {
        storeAdminRepository.save(existingStoreAdmin);
        return existingStoreAdmin;
    }

}
