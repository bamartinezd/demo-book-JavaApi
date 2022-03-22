package com.example.demo.Domain.Entities;

import java.util.UUID;

public class Cathegory {
    private UUID Id;
    private String Name;

    public UUID getId() {
        return Id;
    }
    public void setId(UUID id) {
        Id = id;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
}
