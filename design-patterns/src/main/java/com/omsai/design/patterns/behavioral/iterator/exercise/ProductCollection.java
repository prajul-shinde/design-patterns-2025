package com.omsai.design.patterns.behavioral.iterator.exercise;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection {
    private List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public ProductIterator createIterator(ProductCollection productsCollection) {
        return new ProductIterator(this);
    }

    public class ProductIterator implements Iterator<Product> {

        private ProductCollection productCollection;
        private int index;

        public ProductIterator(ProductCollection productCollection) {
            this.productCollection = productCollection;
        }

        @Override
        public boolean hasNext() {
            return index < productCollection.products.size();
        }

        @Override
        public void next() {
            index++;
        }

        @Override
        public Product current() {
            return productCollection.products.get(index);
        }
    }

}
