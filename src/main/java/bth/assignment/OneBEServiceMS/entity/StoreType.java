package bth.assignment.OneBEServiceMS.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "store_types")
public class StoreType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long storeTypeId;
    @Column(name = "store_type", nullable = false)
    private String storeType;
    @ManyToMany(mappedBy = "storeTypes")
    private List<Store> stores;

    public Long getStoreTypeId() {
        return storeTypeId;
    }

    public void setStoreTypeId(Long storeTypeId) {
        this.storeTypeId = storeTypeId;
    }

    public String getStoreType() {
        return storeType;
    }

    public void setStoreType(String storeType) {
        this.storeType = storeType;
    }

    public List<Store> getStores() {
        return stores;
    }

    public void setStores(List<Store> stores) {
        this.stores = stores;
    }
}
