package ku.product.repository;


import ku.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    Product findByName(String name);
    List<Product> findByType(String type);
}

