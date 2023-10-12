package bth.assignment.OneBEServiceMS.entity;

import jakarta.persistence.*;

import java.time.LocalTime;

@Entity
@Table(name = "schedules")
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long schedule_id;
    @ManyToOne
    @JoinColumn(name = "professional_id")
    private Professional professional;
    @Column(name = "schedule_weekday", nullable = false)
    private Integer scheduleWeekday;
    @Column(name = "schedule_is_day_off", nullable = false)
    private boolean scheduleIsDayOff;
    @Column(name = "schedule_start_time", nullable = false)
    private LocalTime scheduleStartTime;
    @Column(name = "schedule_end_time", nullable = false)
    private LocalTime scheduleEndTime;


    public Long getSchedule_id() {
        return schedule_id;
    }

    public void setSchedule_id(Long schedule_id) {
        this.schedule_id = schedule_id;
    }

    public Professional getProfessional() {
        return professional;
    }

    public void setProfessional(Professional professional) {
        this.professional = professional;
    }

    public Integer getScheduleWeekday() {
        return scheduleWeekday;
    }

    public void setScheduleWeekday(Integer scheduleWeekday) {
        this.scheduleWeekday = scheduleWeekday;
    }

    public boolean isScheduleIsDayOff() {
        return scheduleIsDayOff;
    }

    public void setScheduleIsDayOff(boolean scheduleIsDayOff) {
        this.scheduleIsDayOff = scheduleIsDayOff;
    }

    public LocalTime getScheduleStartTime() {
        return scheduleStartTime;
    }

    public void setScheduleStartTime(LocalTime scheduleStartTime) {
        this.scheduleStartTime = scheduleStartTime;
    }

    public LocalTime getScheduleEndTime() {
        return scheduleEndTime;
    }

    public void setScheduleEndTime(LocalTime scheduleEndTime) {
        this.scheduleEndTime = scheduleEndTime;
    }
}
