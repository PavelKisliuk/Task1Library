package com.epam.training.shop.product;

public class ProductByWeight extends Product {
	private double kiloPrice;
	//-----------------------------------------------------------------------------
	public ProductByWeight(double kiloPrice) {
		this.kiloPrice = kiloPrice;
	}
	//-----------------------------------------------------------------------------
	//-----------------------------------------------------------------------------
	public double getFullPrice(double weight) {
		return weight * this.kiloPrice;
	}
	//-----------------------------------------------------------------------------
	//-----------------------------------------------------------------------------
	public String getWhatFold(ProductByWeight anotherProduct)
	{
		return (this.kiloPrice > anotherProduct.getKiloPrice()) ?
				String.format("%f%s%f%s%f%n", this.kiloPrice, " fold ", anotherProduct.getKiloPrice(),
						" in ", (this.kiloPrice / anotherProduct.getKiloPrice())) :
				String.format("%f%s%f%s%f%n", anotherProduct.getKiloPrice(), " fold ", this.kiloPrice,
						" in ", (anotherProduct.getKiloPrice() / this.kiloPrice));
	}
	//-----------------------------------------------------------------------------
	//-----------------------------------------------------------------------------
	public double getKiloPrice() {
		return this.kiloPrice;
	}

	public void setKiloPrice(double kiloPrice) {
		this.kiloPrice = kiloPrice;
	}
}
