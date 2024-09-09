package com.infnet.tp2.infra.listener;

import com.infnet.tp2.infra.StockMovementEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class StockMovementListener {

    @EventListener
    public void onStockMovement(StockMovementEvent event) {
        System.out.println("Produto " + event.getProduct().getName() +
                ", movimentado ao estoque " + event.getWarehouseId() +
                ", em " + event.occurredOn());
    }
}
