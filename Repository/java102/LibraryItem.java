package java102;

import java.util.ArrayList;

public class LibraryItem {
    public final String title;
    public final String itemId;
    protected boolean isCheckedOut = false;

    public LibraryItem(String title, String itemId) {
        this.title = title;
        this.itemId = itemId;
    }

    public boolean available() {
        return !isCheckedOut;
    }

    public void checkOut() {
        isCheckedOut = true;
    }

    public void returnItem() {
        isCheckedOut = false;
    }

    public static ArrayList<LibraryItem> availableItems(LibraryItem[] items) {
        ArrayList<LibraryItem> availableItemsList = new ArrayList<>();
        for (LibraryItem item : items) {
            if (!item.isCheckedOut) {
                availableItemsList.add(item);
            }
        }
        return availableItemsList;
    }

    @Override
    public String toString() {
        return "Library Item: " + title;
    }
}
