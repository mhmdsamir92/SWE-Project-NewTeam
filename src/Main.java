
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.Timer;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		Scanner input = new Scanner(System.in);
		boolean mainLoop = true;

		User user1 = new User();
		String user = user1.getUsername();
		String pass = user1.getPassword();
		String stat = user1.getLogin_stat();
		String mail = user1.getEmail();
		String fname = user1.getFname();

		Admin admin1 = new Admin();

		ProductDetails d = new ProductDetails();
		String pname = d.getProductName();
		String pcategory = d.getCategory();
		String price = d.getPrice();
		String br = d.getBrandName();
		String brcat = d.getBrandCategory();
		String sn = d.getStoreName();
		String Type = d.getType();
		String location = d.getLocation();

		Customer customer1 = new Customer();

		StoreOwner so = new StoreOwner();

		Statstics statt = new Statstics();
		int choice;
		do {
			System.out.println(" Main Menu : \n");
			System.out.print("1.) Register if you don't have an account \n");
			System.out.print("2.) Login with an existing account : \n");
			System.out.print("3.) Add Items as an admin : \n");
			System.out.print("4.) Add Items as a store owner : \n");
			System.out.print("5.) Add a new store : \n");
			System.out.print("6.) Add new brand : \n");
			System.out.print("7.) View products  : \n");
			System.out.print("8.) View stores  : \n");
			System.out.print("9.) View statstics numbers  : \n");
			System.out.print("10.) View statstics numbers of first lanuch of website : \n");
			System.out.print("11.) Exit\n");
			System.out.print("\nEnter Your Menu Choice: ");

			choice = input.nextInt();

		}

		while (choice > 12);

		switch (choice) {

		case 1:

			user1.Register(user, pass, stat, fname, mail);

			break;

		case 2:

			user1.login_verify(user, pass, stat);
			break;

		case 3:

			admin1.addItems(pname, pcategory, price);
			break;
		case 4:

			so.addItems(pname, pcategory, price);
			break;

		case 5:
			so.addNewStore(sn, Type, location);
			break;

		case 6:
			admin1.addNewBrand(br, brcat);
			break;

		case 7:
			customer1.viewproduct();
			break;

		case 8:
			customer1.viewStore();
			break;

		case 9:
			Timer timer = new Timer();
			timer.schedule(new ProductDetails(), 0, 600000);
			break;

		case 10:
			System.out.println("Number of products viewed : " + statt.getNumberOfProducts_viewed());
			System.out.println("Number of stores viewed : " + statt.getNumberOfStores_visited());
			System.out.println("Number of products bought : " + statt.getNumberOfProducts_bought());
			break;

		case 11:
			System.out.println("Exiting Program...");
			System.exit(0);
			break;

		}

		// Bad Menu Option Direct
		if (choice > 11 || choice < 1) {
			System.out.println("This is not a valid Menu Option! Please Select Another.");
			do {
				choice = input.nextInt();
			} while (choice < 12);
		}
		// End bad menu option

	}

}
