package com.cg.service;

import com.cg.model.Product;
import com.cg.model.dto.IProductDTO;
import com.cg.model.dto.ProductDTO;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface ProductService {

    Iterable<Product> findAll();

    Optional<Product> findById(String id);

    List<IProductDTO> findAllIProductDTO();

    IProductDTO findIProductDTOById(String id);

    Product create(ProductDTO productDTO);

    void delete(Product product) throws IOException;


}
