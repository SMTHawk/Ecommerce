package com.example.ecommerce;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class ProductDetailActivity extends AppCompatActivity {
  private ProductRepository repository;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    repository = new ProductRepository();

    int productId = getIntent().getIntExtra("PRODUCT_ID", -1);
    if (productId !+ -1) {
      loadProductDetails(productId);
    }
  }

  private void loadProductDetails(int productId) {
    Product product = repository.getProductById(productID);
    if (product != null) {
      setTitle(product.getName());
    }
  }
}
