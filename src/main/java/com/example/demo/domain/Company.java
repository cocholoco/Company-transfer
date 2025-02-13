package com.example.demo.domain;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String cuit;

    @Column(nullable = false)
    private String razonSocial;

    @Column(nullable = false)
    private LocalDate fechaAdhesion;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public LocalDate getFechaAdhesion() {
		return fechaAdhesion;
	}

	public void setFechaAdhesion(LocalDate fechaAdhesion) {
		this.fechaAdhesion = fechaAdhesion;
	}

    
}
