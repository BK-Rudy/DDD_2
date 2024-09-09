package com.infnet.tp2.infra;

import com.infnet.tp2.domain.Product;
import lombok.Data;

import java.time.Instant;

@Data
public class StockMovementEvent implements DomainEvents {
    private final Product product;
    private final Long warehouseId;
    private final Instant occurredOn;

    public StockMovementEvent(Product product, Long warehouseId) {
        this.product = product;
        this.warehouseId = warehouseId;
        this.occurredOn = Instant.now();
    }

    @Override
    public Instant occurredOn() {
        return occurredOn;
    }
}
