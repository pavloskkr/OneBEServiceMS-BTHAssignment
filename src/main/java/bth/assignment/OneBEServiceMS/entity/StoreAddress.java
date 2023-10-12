package bth.assignment.OneBEServiceMS.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "store_addresses")
public class StoreAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long storeAddressId;
    @Column(name = "store_address", nullable = false)
    private String storeAddress;
    @Column(name = "store_address_number", nullable = false)
    private String storeAddressNumber;
    @Column(name = "store_city", nullable = false)
    private String storeCity;
    @Column(name = "store_state_province", nullable = false)
    private String storeStateProvince;
    @Column(name = "store_postal_code", nullable = false)
    private String storePostalCode;
    @Column(name = "store_country", nullable = false)
    private String storeCountry;
    @ManyToMany(mappedBy = "storeAddresses")
    private List<Store> stores;

    public Long getStoreAddressId() {
        return storeAddressId;
    }

    public void setStoreAddressId(Long storeAddressId) {
        this.storeAddressId = storeAddressId;
    }

    public String getStoreAddress() {
        return storeAddress;
    }

    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress;
    }

    public String getStoreAddressNumber() {
        return storeAddressNumber;
    }

    public void setStoreAddressNumber(String storeAddressNumber) {
        this.storeAddressNumber = storeAddressNumber;
    }

    public String getStoreCity() {
        return storeCity;
    }

    public void setStoreCity(String storeCity) {
        this.storeCity = storeCity;
    }

    public String getStoreStateProvince() {
        return storeStateProvince;
    }

    public void setStoreStateProvince(String storeStateProvince) {
        this.storeStateProvince = storeStateProvince;
    }

    public String getStorePostalCode() {
        return storePostalCode;
    }

    public void setStorePostalCode(String storePostalCode) {
        this.storePostalCode = storePostalCode;
    }

    public String getStoreCountry() {
        return storeCountry;
    }

    public void setStoreCountry(String storeCountry) {
        this.storeCountry = storeCountry;
    }

    public List<Store> getStores() {
        return stores;
    }

    public void setStores(List<Store> stores) {
        this.stores = stores;
    }
}
