package com.spring.smarttrashmanagementsystem.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Declares the form of the data to be stored
 */
@Entity
@Table(name="consumptions_web_service")
public class Consumption {

    @Id
    @Column(name="device_id")
    private Integer deviceId;

    @Column(name="consumption")
    private Float consumption;


    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public Float getConsumption() {
        return consumption;
    }

    public void setConsumption(Float consumption) {
        this.consumption = consumption;
    }
}
