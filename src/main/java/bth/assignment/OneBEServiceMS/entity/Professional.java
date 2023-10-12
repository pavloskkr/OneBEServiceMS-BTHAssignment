package bth.assignment.OneBEServiceMS.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "professionals")
public class Professional {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long professionalId;
    @Column(name = "professional_name", nullable = false)
    private String professionalName;
    @Column(name = "professional_photo")
    private String professionalPhoto;
    @OneToMany(mappedBy = "professional")
    private List<Schedule> schedules;
    @ManyToMany
    @JoinTable(name = "professional_has_service",
            joinColumns = @JoinColumn(name = "professional_id"),
            inverseJoinColumns = @JoinColumn(name = "service_id"))
    private List<Service> services = new ArrayList<>();

    public Long getProfessionalId() {
        return professionalId;
    }

    public void setProfessionalId(Long professionalId) {
        this.professionalId = professionalId;
    }

    public String getProfessionalName() {
        return professionalName;
    }

    public void setProfessionalName(String professionalName) {
        this.professionalName = professionalName;
    }

    public String getProfessionalPhoto() {
        return professionalPhoto;
    }

    public void setProfessionalPhoto(String professionalPhoto) {
        this.professionalPhoto = professionalPhoto;
    }

    public List<Schedule> getSchedules() {
        return schedules;
    }

    public void setSchedules(List<Schedule> schedules) {
        this.schedules = schedules;
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }
}
