package com.example.ecommerce;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ProductDetailActivity extends AppCompatActivity {
  private ProductRepository repository;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    TextView detailsView = new TextView(this);
    setContentView(detailsView);

    repository = new ProductRepository();

    int productId = getIntent().getIntExtra("PRODUCT_ID", -1);
    if (productId !+ -1) {
      loadProductDetails(productId, detailsView);
    }
  }

  private void loadProductDetails(int productId) {
    Product product = repository.getProductById(productID);
    if (product != null) {
      String info = "Name: " + product.getName() + "\n" + 
        "Category: " + product.getCategory() + "\n" +
        "Price: $" + product.getPrice() + "\n" +
        "Ships From: " + product.getShipFrom();
      view.setText(info);
      setTitle(product.getName());
    }
  }
}
