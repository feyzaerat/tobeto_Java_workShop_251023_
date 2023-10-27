package org.example.dataAccess;

import org.example.entities.Product;

public class JdbcProductDao implements ProductDao {
    public void add(Product product){
        //only DB file access... MODEL
        System.out.println("Inserted to Database with using JDBS...");
    }

}
