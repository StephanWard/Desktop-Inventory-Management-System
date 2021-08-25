package model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * Creates a model for an inventory of Products and Parts.
 *
 * The classes will provide consistent and applicable data for the software application.
 *
 * @author Stephan Ward Created on 06/12/2021
 */
public class Inventory {

    /**
     * An ID for the part. Variable used for the unique part IDs.
     */
    private static int partId = 0;

    /**
     * An ID for the product. Variable used for the unique product IDs.
     */
    private static int productId = 0;

    /**
     * A list of all the parts in inventory.
     */
    private static ObservableList<Part> allParts = FXCollections.observableArrayList();

    /**
     * A list of all the products in inventory.
     */
    private static ObservableList<Product> allProducts = FXCollections.observableArrayList();

    /**
     * Gets a list of all the parts in inventory.
     *
     * @return A list of part objects.
     */
    public static ObservableList<Part> getAllParts() {
        return allParts;
    }

    /**
     * Gets a list of all the products in inventory.
     *
     * @return A list of the product objects.
     */
    public static ObservableList<Product> getAllProducts() {
        return allProducts;
    }

    /**
     * Adds the part to the inventory.
     *
     * @param newPart The part of the object to add.
     */
    public static void addPart(Part newPart) {
        allParts.add(newPart);
    }

    /**
     * Adds the product to the inventory system.
     *
     * @param newProduct The product of the object to add.
     */
    public static void addProduct(Product newProduct) {
        allProducts.add(newProduct);
    }

    /**
     * Creates or generates a new part ID.
     *
     * @return A unique part ID for the object.
     */
    public static int getNewPartId() {
        return ++partId;
    }

    /**
     * Generates a new product ID for the product object.
     *
     * @return A unique product ID for the product object.
     */
    public static int getNewProductId() {
        return ++productId;
    }

    /**
     * Searches list of the parts by ID.
     *
     * @param partId The part ID.
     * @return The part object if found, or null, if not found.
     */
    public static Part lookupPart(int partId) {
        Part partFound = null;
        
        for (Part part : allParts) {
            if (part.getId() == partId) {
                partFound = part;
            }
        }
        
        return partFound;
    }

    /**
     * Searches the list of parts by name.
     *
     * @param partName The part name.
     * @return A list of parts found.
     */
    public static ObservableList<Part> lookupPart(String partName) {
        ObservableList<Part> partsFound = FXCollections.observableArrayList();

        for (Part part : allParts) {
            if (part.getName().equals(partName)) {
                partsFound.add(part);
            }
        }

        return partsFound;
    }

    /**
     * Searches the list of products by ID.
     *
     * @param productId The productt ID.
     * @return The product object if found, null if not found.
     */
    public static Product lookupProduct(int productId) {
        Product productFound = null;

        for (Product product : allProducts) {
            if (product.getId() == productId) {
                productFound = product;
            }
        }

        return productFound;
    }

    /**
     * Searches the list of products by name.
     *
     * @param productName The product name.
     * @return A list of products found.
     */
    public static ObservableList<Product> lookupProduct(String productName) {
        ObservableList<Product> productsFound = FXCollections.observableArrayList();

        for (Product product : allProducts) {
            if (product.getName().equals(productName)) {
                productsFound.add(product);
            }
        }

        return productsFound;
    }

    /**
     * Replaces a part in the list of parts.
     *
     * @param index Index of the part to be replaced.
     * @param selectedPart The part used for replacement.
     */
    public static void updatePart (int index, Part selectedPart) {

        allParts.set(index, selectedPart);
    }

    /**
     * Replaces a product in the list of products.
     *
     * @param index Index of the product to be replaced.
     * @param selectedProduct The product used for replacement.
     */
    public static void updateProduct (int index, Product selectedProduct) {

        allProducts.set(index, selectedProduct);
    }

    /**
     * Removes a part from the list of parts.
     *
     * @param selectedPart The part to be removed.
     * @return A boolean indicating status of part removal.
     */
    public static boolean deletePart(Part selectedPart) {
        if (allParts.contains(selectedPart)) {
            allParts.remove(selectedPart);
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Removes a product from the list of parts.
     *
     * @param selectedProduct The product to be removed.
     * @return A boolean indicating status of product removal.
     */
    public static boolean deleteProduct(Product selectedProduct) {
        if (allProducts.contains(selectedProduct)) {
            allProducts.remove(selectedProduct);
            return true;
        }
        else {
            return false;
        }
    }
}
