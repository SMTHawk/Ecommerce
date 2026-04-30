package com.example.ecommerce;

public class JsonWebService {

  public String fetchProducts() {
    return "[{"id\":1, \"name\":\"iPhone 14\"}]";
  }

  public String fetchProductDetails(int id) {
    return "{\"id\":" + id + ", \"name\":\"Product Details\"}";
  }
}
