package tutorial7.shopping;

public class BrandedItem {
	
	private final String name, brand;
	private final int pricePerUnit, quantity;
	
	public BrandedItem(
      String name, String brand, int pricePerUnit, int quantity) {
		this.name = name;
		this.brand = brand;
    	this.quantity = quantity;
		this.pricePerUnit = pricePerUnit;
	}
	
	public String getName() {
		return name;
	}

	public String getBrand() {
		return brand;
	}

	public int getQuantity() {
		return quantity;
	}

	public int getPricePerUnit() {
		return pricePerUnit;
	}

	public int getPrice() {
		return getPricePerUnit()*getQuantity();
	}

  public String getShortDescription() {
    return getName() + " - " + getBrand() + " (x" + getQuantity() + ")";
  }

}
