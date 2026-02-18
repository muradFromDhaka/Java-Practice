package com.abc.JasperReport.entity;

import java.math.BigDecimal;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetails {
    private Integer orderNumber;
    private Date orderDate;
    private String customerName;
    private String productName;
    private Integer quantityOrdered;
    private BigDecimal priceEach;
    private BigDecimal totalPrice;
}
