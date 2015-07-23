package by.zamskoi.cv.truck;

import org.apache.log4j.Logger;

import by.zamskoi.cv.cargo.*;

public class CargoVan {
	public static final Logger LOG = Logger.getLogger(CargoVan.class);
	private int id;
	private String registrationNumber;
	private String brand;
	private String model;
	private int passengerCapacity;
	private double cargoWeightMaximum; // in kilograms // >0 only;
	private double cargoVolumeMaximum; // in cubic meters // >0 only;
	private Cargo cargo;

	public CargoVan() {
		super();
	}

	public CargoVan(int id, String registrationNumber, String brand,
			String model, int passengerCapacity, double cargoWeightMaximum,
			double cargoVolumeMaximum, Cargo cargo) {
		super();
		this.id = id;
		this.registrationNumber = registrationNumber;
		this.brand = brand;
		this.model = model;
		this.passengerCapacity = passengerCapacity;
		this.cargoWeightMaximum = cargoWeightMaximum;
		this.cargoVolumeMaximum = cargoVolumeMaximum;
		this.cargo = cargo;
	}

	// TODO refactor the set() methods
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPassengerCapacity() {
		return passengerCapacity;
	}

	public void setPassengerCapacity(int passengerCapacity) {
		this.passengerCapacity = passengerCapacity;
	}

	public double getCargoWeightMaximum() {
		return cargoWeightMaximum;
	}

	public void setCargoWeightMaximum(double cargoWeightMaximum) {
		this.cargoWeightMaximum = cargoWeightMaximum;
	}

	public double getCargoVolumeMaximum() {
		return cargoVolumeMaximum;
	}

	public void setCargoVolumeMaximum(double cargoVolumeMaximum) {
		this.cargoVolumeMaximum = cargoVolumeMaximum;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
}
