import java.util.*;
public class StoreApp {
	public static ArrayList<SmartphoneInventoryModel> smartPhones = new ArrayList<>();
	public static void main(String args[]) {
		StoreController controller = new StoreController();
			
			int choice;
			do {
			System.out.println("\nSmartphone Inventory Management System");
            System.out.println("1. Add New Product");
            System.out.println("2. Delete Product");
            System.out.println("3. Update Product");
            System.out.println("4. Get Product Information");
            System.out.println("5. Exit");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            
            
            if(choice==1) {
                controller.addNewProduct();
            }
            else if(choice==2) {
            	controller.deleteProduct();
            }
            else if(choice==3) {
            	controller.updateProduct();
            }
            else if(choice==4) {
            	controller.getSmartphoneInfo();
            }
            else if(choice==5) {
            	System.out.println("Thank You!");
            	break;
            }
            else {
                System.out.println("Invalid choice!");
            }
		}
			while(choice != 5);
     

	}
}
