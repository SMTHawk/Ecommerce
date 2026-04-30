package com.example.ecommerce;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.ListFragment;
import java.util.List;

public class ProductListFragment extends ListFragment {
  private ProductRepository repository;

  @Override
  public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    repository = new ProductRepository();
    displayProducts(repository.getProducts());
  }

  public void displayProducts(List<Product> products) {
    ArrayAdapter<Product> adapter = new ArrayAdapter<>(
      requireContext(),
      android.R.layout.simple_list_item_1,
      products
    );
    setListAdapter(adapter);
  }

  @Override
  public void onListItemClick(@NonNull ListView l, @NonNull View v, int position, long id) {
    Product selectedProduct = (Product) l.getItemAtPosition(position);
    onProductSelected(selectedProduct.getId());
  }

  public void onProductSelected(int productId) {
    Intent intent = new Intent(getActivity(), ProductDetailActivity.class);
    intent.putExtra("PRODUCT_ID", productId);
    startActivity(intent);
  }
}
