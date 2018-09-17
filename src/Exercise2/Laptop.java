package Exercise2;

public class Laptop extends PC {
	
	private double bateryDurationInHours;

	public Laptop() {
		super();
	}

	public Laptop(int ramMemory, int hardDiskCapacity, double cpuSpeed, double monitorSizeInch, double buyingPrice, double bateryDurationInHours) {
		super(ramMemory, hardDiskCapacity, cpuSpeed, monitorSizeInch, buyingPrice);
		this.bateryDurationInHours = bateryDurationInHours;
	}
	
	
	
	@Override
	public String toString() {
		return "Laptop [bateryDurationInHours=" + bateryDurationInHours + ", buyingPrice=" + buyingPrice
				+ ", getBateryDurationInHours()=" + getBateryDurationInHours() + ", calculatePrice()="
				+ calculatePrice() + ", getRamMemory()=" + getRamMemory() + ", getHardDiskCapacity()="
				+ getHardDiskCapacity() + ", getCpuSpeed()=" + getCpuSpeed() + ", getMonitorSizeInch()="
				+ getMonitorSizeInch() + ", getBuyingPricePrice()=" + getBuyingPricePrice() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	public double getBateryDurationInHours() {
		return bateryDurationInHours;
	}

	public void setBateryDurationInHours(double bateryDurationInHours) {
		this.bateryDurationInHours = bateryDurationInHours;
	}

	@Override
	public double calculatePrice () {
		return buyingPrice + (buyingPrice * 0.15);
	}

}
