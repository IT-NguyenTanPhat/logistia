package com.logistia.order_service.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
@Getter @Setter @NoArgsConstructor@AllArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String senderName;


    private String receiverName;


    private String senderAddress;


    private String receiverAddress;

    private String description;


    private Double packageWeight; //


    private Double shippingCost; //

    @Enumerated(EnumType.STRING)
    private OrderStatus status; //

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDateTime createdAt;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDateTime updatedAt;

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    // Constructor

}


