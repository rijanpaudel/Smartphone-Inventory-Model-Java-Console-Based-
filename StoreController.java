import java.util.*;
public class StoreController{
	private ArrayList<SmartphoneInventoryModel> smartphoneList = new ArrayList<>();
	
	public void addNewProduct() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the model code: ");
		String modelCode  = scanner.nextLine();
		
		System.out.println("Enter the name of mobile: ");
		String mobileName = scanner.nextLine();
		
		System.out.println("Enter the price of mobile: ");
		float mobilePrice = scanner.nextFloat();
		
		System.out.println("Enter the quanity of mobile: ");
		int mobileQuantity = scanner.nextInt();
		
		System.out.println("Enter the RAM of mobile: ");
		int mobileRAM = scanner.nextInt();
		
		System.out.println("Enter the storage of mobile: ");
		int mobileStorage = scanner.nextInt();
		
		SmartphoneInventoryModel newModel = new SmartphoneInventoryModel (modelCode, mobileName, mobilePrice, mobileStorage, mobileStorage, mobileStorage);
		smartphoneList.add(newModel);
		System.out.println("New Smartphone added successfully!: ");
	}
	
	public void deleteProduct() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the model code: ");
		String modelCode = scanner.nextLine();
		
		boolean isFound = false;
		for(int i = 0; i < smartphoneList.size(); i++) {
			if(smartphoneList.get(i).getModelCode().equals(modelCode)){
				smartphoneList.remove(i);
				isFound = true;
				System.out.println("The smartphone information successfully removed");
				break;
			}
		}
		if(!isFound) {
			System.out.println("The model code doesn't exits.");
		}
	}
	
	public void updateProduct() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the mode code: ");
		String modelCode = scanner.nextLine();
		boolean isFound = false;
		for (int i = 0; i < smartphoneList.size(); i++) {
		    SmartphoneInventoryModel model = smartphoneList.get(i);
		    if (model.getModelCode().equals(modelCode)) {
		        System.out.println("Enter the new information for the phone:");
		        System.out.print("New Name: ");
		        String newName = scanner.nextLine();
		        System.out.print("New price: ");
		        float newPrice = scanner.nextFloat();
		        System.out.print("New quantity: ");
		        int newQuantity = scanner.nextInt();
		        System.out.print("New RAM: ");
		        int newRAM = scanner.nextInt();
		        System.out.print("New storage: ");
		        int newStorage = scanner.nextInt();

		        model.setMobileName(newName);
		        model.setMobilePrice(newPrice);
		        model.setMobileQuantity(newQuantity);
		        model.setMobileRAM(newRAM);
		        model.setMobileStorage(newStorage);

		        isFound = true;
		        System.out.println("Smartphone Information Updated Successfully!");
		        break;
		    }
		}

		if (!isFound) {
		    System.out.println("Model code '" + modelCode + "' not found in the list.");
		}
		}

	
	public void getSmartphoneInfo() {
		Scanner scanner  = new Scanner(System.in);
		System.out.println("Enter the model code of phone: ");
		String modelCode = scanner.nextLine();
		
		boolean isFound = false;
		for(SmartphoneInventoryModel model : smartphoneList) {
			if(model.getModelCode().equals(modelCode)) {
				 System.out.println("\n**Smartphone Information**");
		         System.out.println("Model Code: " + model.getModelCode());
		         System.out.println("Mobile Name: " + model.getMobileName());
		         System.out.println("Mobile Price: " + model.getMobilePrice());
		         System.out.println("Mobile Quantity: " + model.getMobileQuantity());
		         System.out.println("Mobile RAM: " + model.getMobileRAM());
		         System.out.println("Mobile Storage: " + model.getMobileStorage());
		         isFound = true;
		         break;
			}
		}
		if(!isFound) {
			 System.out.println("Model code '" + modelCode + "' not found in the list.");
		}
	}
	
	
}