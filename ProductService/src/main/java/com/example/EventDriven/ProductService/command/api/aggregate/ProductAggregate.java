package com.example.EventDriven.ProductService.command.api.aggregate;

import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.TargetAggregateIdentifier;
import org.axonframework.spring.stereotype.Aggregate;

import java.math.BigDecimal;

@Aggregate
public class ProductAggregate {
    @AggregateIdentifier
    private String productId;
    private String name;
    private BigDecimal price;
    private Integer quantity;
}
