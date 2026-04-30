package com.example.ecommerce;

import java.util.List;

public class ProductRepository {
  private DataVirtualization cache;

  public ProductRepository() {
    this.cache = new DataVirtualization();
  }

  public List<Product> getProducts() {
    List<Product> products = cache.getCachedProducts();
    if (products.isEmpty()) {
      products = ProductSeeder.getSampleProducts();
      cache.cacheProducts(products);
    }
    return products;
  }

  public Product getProductbyId(int id) {
    for (Product p : getProducts()) {
      if (p.getId() == id) return p;
    }
    return null;
  }
}
