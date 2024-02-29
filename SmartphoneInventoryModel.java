public class SmartphoneInventoryModel{
	private String modelCode;
	private String mobileName;
	private float mobilePrice;
	private int mobileQuantity;
	private int mobileRAM;
	private int mobileStorage;
	
	public SmartphoneInventoryModel(String modelCode, String mobileName, float mobilePrice,
			int mobileQuantity, int mobileRAM, int mobileStorage) {
		this.modelCode = modelCode;
		this.mobileName = mobileName;
		this.mobilePrice = mobilePrice;
		this.mobileQuantity = mobileQuantity;
		this.mobileRAM = mobileRAM;
		this.mobileStorage = mobileStorage;
	}
	
	public String getModelCode() {
		return modelCode;
	}
	
	public String getMobileName() {
		return mobileName;
	}
	
	public float getMobilePrice() {
		return mobilePrice;
	}
	
	public int getMobileQuantity() {
		return mobileQuantity;
	}
	
	public int getMobileRAM() {
		return mobileRAM;
	}
	
	public int getMobileStorage() {
		return mobileStorage;
	}
	
	public void setModelCode(String newModelCode) {
		this.modelCode = newModelCode;
	}
	
	public void setMobileName(String newMobileName) {
		this.mobileName = newMobileName;
	}
	
	public void setMobilePrice(float newMobilePrice) {
		this.mobilePrice = newMobilePrice;
	}
	
	public void setMobileQuantity(int newMobileQuantity) {
		this.mobileQuantity = newMobileQuantity;
	}
	
	public void setMobileRAM(int newMobileRAM) {
		this.mobileRAM = newMobileRAM;
	}
	
	public void setMobileStorage(int newMobileStorage) {
		this.mobileStorage = newMobileStorage;
	}
	
	
	
	
}