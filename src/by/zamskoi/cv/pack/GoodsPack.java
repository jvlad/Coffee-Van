package by.zamskoi.cv.pack;

public class GoodsPack {
	private GoodsPackType type;
	private double volume;
	private double weight;
	private double netVolume;
	private double netWeight;
	private String material;

	public enum GoodsPackType {
		BOX, PARCEL, VACUUM_PARCEL
	}

	public GoodsPack() {
		super();
	}

	public GoodsPack(GoodsPackType type, double volume, double weight,
			double netVolume, double netWeight, String material) {
		super();
		this.type = type;
		this.volume = volume;
		this.weight = weight;
		this.netVolume = netVolume;
		this.netWeight = netWeight;
		this.material = material;
	}

	public GoodsPackType getType() {
		return type;
	}

	public void setType(GoodsPackType type) {
		this.type = type;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getNetVolume() {
		return netVolume;
	}

	public void setNetVolume(double netVolume) {
		this.netVolume = netVolume;
	}

	public double getNetWeight() {
		return netWeight;
	}

	public void setNetWeight(double netWeight) {
		this.netWeight = netWeight;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

}
