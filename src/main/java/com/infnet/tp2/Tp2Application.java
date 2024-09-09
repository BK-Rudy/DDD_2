package com.infnet.tp2;

import com.infnet.tp2.domain.Franchisee;
import com.infnet.tp2.domain.Product;
import com.infnet.tp2.domain.Warehouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationEventPublisher;

import java.util.ArrayList;

@SpringBootApplication
public class Tp2Application implements CommandLineRunner {

    @Autowired
    private ApplicationEventPublisher eventPublisher;

    public static void main(String[] args) {
        SpringApplication.run(Tp2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Product product = new Product();
        product.setName("Ração Royal Canin Senior - 15kg");

        Franchisee franchisee = new Franchisee();
        franchisee.setName("Pet Friends");
        franchisee.setAddress("Av. Maracanã");

        Warehouse warehouse = new Warehouse();
        warehouse.setId(1L);
        warehouse.setFranchisee(franchisee);
        warehouse.setProducts(new ArrayList<>());
        warehouse.setAddress("Loja Central");
        warehouse.setCapacity(100);
        warehouse.setEventPublisher(eventPublisher);

        warehouse.create(product);
    }
}
