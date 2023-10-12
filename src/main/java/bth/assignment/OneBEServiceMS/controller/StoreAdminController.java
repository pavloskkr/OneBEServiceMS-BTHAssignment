package bth.assignment.OneBEServiceMS.controller;

import bth.assignment.OneBEServiceMS.entity.StoreAdmin;
import bth.assignment.OneBEServiceMS.service.StoreAdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class StoreAdminController {

    @Autowired
    StoreAdminService storeAdminService;

    @GetMapping("/storeAdmin/{firebaseUid}")
    public ResponseEntity<?> getStoreAdminByFirebaseUid(@PathVariable String firebaseUid) {
        Optional<StoreAdmin> storeAdminOptional = storeAdminService.findStoreAdminByFirebaseUid(firebaseUid);
        if (((Optional<?>) storeAdminOptional).isPresent()) {
            StoreAdmin storeAdmin = storeAdminOptional.get();
            // Handle the response or return the storeAdmin entity
            return ResponseEntity.ok(storeAdmin);
        } else {
            // Handle the case when a storeAdmin with the given firebaseUid is not found
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found.");
        }
    }

    @PostMapping("/storeAdmin/create")
    public ResponseEntity<StoreAdmin> createStoreAdmin(@RequestBody StoreAdmin storeAdmin) {
        StoreAdmin createdStoreAdmin = storeAdminService.createStoreAdmin(storeAdmin);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdStoreAdmin);
    }

    @GetMapping("/admin/storeAdminsList")
    public ResponseEntity<List<StoreAdmin>> listOfStoreAdmins() {
        List<StoreAdmin> storeAdmins = storeAdminService.findAllStoreAdmins();
        return ResponseEntity.status(HttpStatus.CREATED).body(storeAdmins);
    }
}
