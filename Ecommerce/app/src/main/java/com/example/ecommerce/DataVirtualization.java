package com.example.ecommerce;

import java.util.ArrayList;
import java.util.List;

public class DataVirtualization {
  private List<Product> memoryCache = new ArrayList<>();

  public void cacheProducts(List<Product> products) {
    this.memoryCache.clear();
    this.memoryCache.addAll(products);
  }

  public List<Product> getCachedProducts() {
    return memoryCache;
  }
}
