package ku.product.controller;


import ku.product.entity.Product;
import ku.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/products")
public class ProductController {


    @Autowired
    private ProductService service;


    @GetMapping
    public List<Product> getAllProducts() {
        return service.getAll();
    }


    @GetMapping("/{id}")
    public Product getProductById(@PathVariable int id) {
        return service.getProductById(id);
    }


    @GetMapping("/name/{name}")
    public Product getProductByName(@PathVariable String name) {
        return service.getProductByName(name);
    }


    @GetMapping("/type/{type}")
    public List<Product> getProductByType(@PathVariable String type) {
        return service.getProductByType(type);
    }


    @PostMapping
    public Product create(@RequestBody Product product) {
        return service.create(product);
    }

}

