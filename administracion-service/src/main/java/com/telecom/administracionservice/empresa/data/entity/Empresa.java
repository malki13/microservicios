package com.telecom.administracionservice.empresa.data.entity;

import com.telecom.administracionservice.interventor.data.entity.Interventor;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_Empresas")
public class Empresa implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_iden")
    private Integer iden;

    @Column(name = "emp_num_gateways", nullable = false)
    private Integer numGateways;

    @Column(name = "emp_num_devices", nullable = false)
    private Integer numDevices;
    @Column(name = "emp_fecr", nullable = false, columnDefinition= "TIMESTAMP WITH TIME ZONE")
    private LocalDateTime createdAt = LocalDateTime.now();

    @Column(name = "emp_feac", columnDefinition= "TIMESTAMP WITH TIME ZONE")
    private LocalDateTime updatedAt;

    @Column(name = "emp_feeli", columnDefinition= "TIMESTAMP WITH TIME ZONE")
    private LocalDateTime deletedAt;

    @OneToOne
    @JoinColumn(name = "emp_int", unique = true)
    private Interventor interventor;

    public Empresa() {
    }

    public Integer getIden() {
        return iden;
    }

    public void setIden(Integer iden) {
        this.iden = iden;
    }

    public Integer getNumGateways() {
        return numGateways;
    }

    public void setNumGateways(Integer numGateways) {
        this.numGateways = numGateways;
    }

    public Integer getNumDevices() {
        return numDevices;
    }

    public void setNumDevices(Integer numDevices) {
        this.numDevices = numDevices;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public LocalDateTime getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(LocalDateTime deletedAt) {
        this.deletedAt = deletedAt;
    }

    public Interventor getInterventor() {
        return interventor;
    }

    public void setInterventor(Interventor interventor) {
        this.interventor = interventor;
    }
}
