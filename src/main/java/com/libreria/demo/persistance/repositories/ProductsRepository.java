package com.libreria.demo.persistance.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//import java.util.List;
import com.libreria.demo.persistance.entities.ProductEntity;


//Con esta anotacion convertimos esta clase en un bean, para que inetractue solo con la base de datos
@Repository
public interface ProductsRepository extends JpaRepository<ProductEntity, String> {

    //List<ProductEntity> findByNombreLike(String isbn);
}
