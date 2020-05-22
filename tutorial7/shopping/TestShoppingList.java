package tutorial7.shopping;

public class TestShoppingList {
	
  public static void main(String[] args) {
    BrandedItem[] shoppingList = new BrandedItem[4];

    shoppingList[0] = new BrandedItem("Cornflakes","Kelloggs", 250, 1);
    shoppingList[1] = new BrandedItem("Mayonnaise","Hellmans", 139, 1);
    shoppingList[2] = new BrandedItem("Baked Beans","Heinz", 89, 3);
    shoppingList[3] = new BrandedItem("Cheese Nachos","Doritos", 129, 4);


    showShoppingList(shoppingList);
  }

  public static void showShoppingList(BrandedItem[] shoppingList) {

    int itemPrice;
    System.out.println("ShoppingList are:");

    for (BrandedItem item : shoppingList) {
      itemPrice = item.getPrice();
      System.out.println(
        "\t" + priceAsString(itemPrice) + "\t"
        + item.getShortDescription());
    }

    
  }

  public static String priceAsString(int price) {
    return "£" + String.format("%.2f", price/100.0);
  }
}
