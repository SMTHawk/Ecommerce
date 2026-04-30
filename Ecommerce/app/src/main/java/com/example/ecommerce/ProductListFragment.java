package com.example.ecommerce;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import java.util.List;

public class ProductListFragment extends Fragment {
  private ProductRepository repository;

  @Nullable
  @Override
  public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
    repository = new ProductRepository();

    View view = inflater.inflate(android.R.layout.list_content, container, false);

    displayProducts(repository.getProducts());
    return view;
  }

  public void displayProducts(List<Product> products) {
  }

  public void onProductSelected(int productId) {
  }
}
