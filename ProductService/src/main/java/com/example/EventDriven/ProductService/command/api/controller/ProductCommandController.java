package com.example.EventDriven.ProductService.command.api.controller;

import com.example.EventDriven.ProductService.command.api.commands.CreateProductCommand;
import com.example.EventDriven.ProductService.command.api.model.ProductRestModel;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/products")
public class ProductCommandController {

    private CommandGateway commandGateway;
    public ProductCommandController(CommandGateway commandGateway){
        this.commandGateway=commandGateway;

    }

    @PostMapping
    public String addProduct(@RequestBody ProductRestModel productRestModel){

        CreateProductCommand createProductCommand=CreateProductCommand.builder()
                .productId(UUID.randomUUID().toString())
                .name(productRestModel.getName())
                .price(productRestModel.getPrice())
                .quantity(productRestModel.getQuantity())
                .build();

        String response=commandGateway.sendAndWait(createProductCommand);
        return response;
    }
}
