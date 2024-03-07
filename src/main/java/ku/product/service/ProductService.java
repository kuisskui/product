package ku.product.service;


import ku.product.entity.Product;
import ku.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class ProductService {


    @Autowired
    private ProductRepository repository;


    public List<Product> getAll() {
        return repository.findAll();
    }


    public Product create(Product restaurant) {
        Product record = repository.save(restaurant);
        return record;
    }

    public Product getProductById(int id) {
        return repository.findById(id).get();
    }

    public Product getProductByName(String name) {
        return repository.findByName(name);
    }


    public List<Product> getProductByType(String type) {
        return repository.findByType(type);
    }

}

