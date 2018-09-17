package Exercise2;

public class PC {
	
	private int ramMemory;
	private int hardDiskCapacity;
	private double cpuSpeed;
	private double monitorSizeInch;
	protected double buyingPrice;

	public PC() {
		
	}

	public PC(int ramMemory, int hardDiskCapacity, double cpuSpeed, double monitorSizeInch, double buyingPrice) {
		super();
		this.ramMemory = ramMemory;
		this.hardDiskCapacity = hardDiskCapacity;
		this.cpuSpeed = cpuSpeed;
		this.monitorSizeInch = monitorSizeInch;
		this.buyingPrice = buyingPrice;
	}

	public int getRamMemory() {
		return ramMemory;
	}

	public void setRamMemory(int ramMemory) {
		this.ramMemory = ramMemory;
	}

	public int getHardDiskCapacity() {
		return hardDiskCapacity;
	}

	public void setHardDiskCapacity(int hardDiskCapacity) {
		this.hardDiskCapacity = hardDiskCapacity;
	}

	public double getCpuSpeed() {
		return cpuSpeed;
	}

	public void setCpuSpeed(double cpuSpeed) {
		this.cpuSpeed = cpuSpeed;
	}

	public double getMonitorSizeInch() {
		return monitorSizeInch;
	}

	public void setMonitorSizeInch(double monitorSizeInch) {
		this.monitorSizeInch = monitorSizeInch;
	}

	public double getBuyingPricePrice() {
		return buyingPrice;
	}

	public void setbuyingPrice(double buyingPrice) {
		this.buyingPrice = buyingPrice;
	}

	@Override
	public String toString() {
		return "PC [ramMemory=" + ramMemory + ", hardDiskCapacity=" + hardDiskCapacity + ", cpuSpeed=" + cpuSpeed
				+ ", monitorSizeInch=" + monitorSizeInch + ", buyingPrice=" + buyingPrice + "]";
	}
	
	public double calculatePrice () {
		return buyingPrice + (buyingPrice * 0.1);
	}
	
}
