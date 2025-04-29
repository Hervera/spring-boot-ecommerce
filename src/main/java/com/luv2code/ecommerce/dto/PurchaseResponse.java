package com.luv2code.ecommerce.dto;


import com.luv2code.ecommerce.entity.Order;
import lombok.Data;

@Data
public class PurchaseResponse {

    private final String orderTrackingNumber;

}
