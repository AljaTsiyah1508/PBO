/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Penjualan;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class ProductCategory {
    private List<Product> products = new ArrayList<>();
    private Category category;

    // Constructor
    public ProductCategory(Category category) {
        this.category = category;
    }

    // Method untuk menambahkan produk ke kategori
    public void addProductToCategory(Product product) {
        products.add(product);
        System.out.println("Produk " + product.getProductName() + " telah ditambahkan ke kategori " + category.getCategoryName());
    }

    // Method untuk mendapatkan semua produk di kategori ini
    public List<Product> getProductsInCategory() {
        System.out.println("Daftar produk dalam kategori " + category.getCategoryName() + ":");
        for (Product product : products) {
            System.out.println("- " + product.getProductDetails());
        }
        return products;
    }
}
