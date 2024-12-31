package com.logistia.order_service.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;

@Entity
@Table(name = "service_types")
@Getter @Setter @NoArgsConstructor@AllArgsConstructor
public class ServiceType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    private Double basePrice; // Giá cơ bản cho loại dịch vụ

    private String description;

    // Constructor
    public ServiceType(String name, Double basePrice, String description) {
        this.name = name;
        this.basePrice = basePrice;
        this.description = description;
    }
}

