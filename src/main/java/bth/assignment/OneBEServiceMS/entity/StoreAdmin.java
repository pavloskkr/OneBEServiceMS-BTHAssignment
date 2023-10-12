package bth.assignment.OneBEServiceMS.entity;

import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import bth.assignment.OneBEServiceMS.entity.enums.Role;

import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "store_admin")
public class StoreAdmin implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long storeAdminId;
    @Column(name = "store_admin_username")
    private String username;
    @Column(name = "store_admin_password", nullable = false)
    private String password;
    @Column(name = "store_admin_email", nullable = false)
    private String email;
    @Column(name = "store_admin_enabled", nullable = false)
    private boolean enabled = true;
    @Column(name = "firebase_uid", nullable = false)
    private String firebaseUid;
    @OneToMany
    private List<Store> stores;
    @Enumerated(EnumType.STRING)
    private Role role;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority(role.name()));
    }
    public void setStoreAdminId(Long storeAdminId) {
        this.storeAdminId = storeAdminId;
    }

    public Long getStoreAdminId() {
        return storeAdminId;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Store> getStores() {
        return stores;
    }

    public void setStores(List<Store> stores) {
        this.stores = stores;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getFirebaseUid() {
        return firebaseUid;
    }

    public void setFirebaseUid(String firebaseUid) {
        this.firebaseUid = firebaseUid;
    }
}
