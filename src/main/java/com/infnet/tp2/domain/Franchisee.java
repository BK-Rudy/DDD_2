package com.infnet.tp2.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Franchisee {
    private Long id;
    private String name;
    private String address;
    private String phoneNumber;
    private List<Warehouse> warehouses;
}
