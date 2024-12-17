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
public class Category {
    private int categoryId;
    private String categoryName;
    private String description;

    // Constructor
    public Category(int categoryId, String categoryName, String description) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.description = description;
    }

    // Getter dan Setter
    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Method untuk mengambil daftar produk dalam kategori
    public List<Product> getProductInCategory() {
        // Placeholder logika untuk mengambil produk berdasarkan kategori
        List<Product> products = new ArrayList<>();
        System.out.println("Mengambil produk dalam kategori " + categoryName);
        return products;
    }
}
