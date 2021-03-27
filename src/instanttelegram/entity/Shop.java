/*
 * Shop.java
 * 
 * Created on March 27 2021, 15:30 PM
 */
package instanttelegram.entity;

import java.util.ArrayList;

/**
 * Kelas Shop Berfungsi untuk menyimpan data toko yang di 
 * wish oleh pengguna.
 * 
 * @author luckysetiawan
 */
public class Shop {
    private User wishBy;
    private ArrayList<ShopItem> listOfWish = new ArrayList<>();
    
    private void addToWishlist(ShopItem item) {
        listOfWish.add(item);
    }
    
    private boolean removeFromWishlist(ShopItem item) {
        boolean isRemoved = listOfWish.remove(item);
        return isRemoved;
    }
}
