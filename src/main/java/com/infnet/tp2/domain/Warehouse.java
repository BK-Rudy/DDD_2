package com.infnet.tp2.domain;

import com.infnet.tp2.infra.StockMovementEvent;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Warehouse {

    private Long id;
    private List<Product> products;
    private Franchisee franchisee;
    private String address;
    private int capacity;
    private ApplicationEventPublisher eventPublisher;

    public void create(Product product) {
        this.products.add(product);
        StockMovementEvent event = new StockMovementEvent(product, this.id);
        eventPublisher.publishEvent(event);
    }

    public void delete(Product product) {
        this.products.remove(product);
    }
}
