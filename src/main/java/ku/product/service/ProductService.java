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
        return repository.save(restaurant);
    }


}

