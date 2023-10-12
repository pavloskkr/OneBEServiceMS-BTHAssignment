package bth.assignment.OneBEServiceMS.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "stores")
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long storeId;
    @Column(name = "store_name", nullable = false)
    private String storeName;
    @Column(name = "store_rating_avg", nullable = false)
    private float storeRatingAvg;
    @ManyToMany
    @JoinTable(name = "store_has_type",
            joinColumns = @JoinColumn(name = "store_id"),
            inverseJoinColumns = @JoinColumn(name = "store_type_id"))
    private List<StoreType> storeTypes;
    @ManyToMany
    @JoinTable(name = "store_has_address",
            joinColumns = @JoinColumn(name = "store_id"),
            inverseJoinColumns = @JoinColumn(name = "store_address_id"))
    private List<StoreAddress> storeAddresses;
    @ManyToMany
    @JoinTable(name = "store_has_professional",
            joinColumns = @JoinColumn(name = "store_id"),
            inverseJoinColumns = @JoinColumn(name = "professional_id"))
    private List<Professional> professionals = new ArrayList<>();
    @OneToMany(mappedBy = "store")
    private List<Review> reviews;
    @ManyToOne
    @JoinColumn(name = "store_admin_id")
    private StoreAdmin storeAdmin;

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public float getStoreRatingAvg() {
        return storeRatingAvg;
    }

    public void setStoreRatingAvg(float storeRatingAvg) {
        this.storeRatingAvg = storeRatingAvg;
    }

    public List<StoreType> getStoreTypes() {
        return storeTypes;
    }

    public void setStoreTypes(List<StoreType> storeTypes) {
        this.storeTypes = storeTypes;
    }

    public List<StoreAddress> getStoreAddresses() {
        return storeAddresses;
    }

    public void setStoreAddresses(List<StoreAddress> storeAddresses) {
        this.storeAddresses = storeAddresses;
    }

    public List<Professional> getProfessionals() {
        return professionals;
    }

    public void setProfessionals(List<Professional> professionals) {
        this.professionals = professionals;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public StoreAdmin getStoreAdmin() {
        return storeAdmin;
    }

    public void setStoreAdmin(StoreAdmin storeAdmin) {
        this.storeAdmin = storeAdmin;
    }
}
