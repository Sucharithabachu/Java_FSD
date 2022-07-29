package virtualkeyproject;
import java.util.*;
import java.io.File;

public class LockedMe {
	


		public static File folder = new File("D:\\virtualkeytextfiles");

		public static void main(String[] args) {

			// welcome Page of our project
			System.out.println("*********************************");
			System.out.println("Welcome to Lockedme.com \n");
			System.out.println("This Project is developed by Sucharitha Bachu \n");
			System.out.println("This application is encoded with Java Code \n");
			System.out.println("*********************************");
			ChooseOption();//calling the function
		}

		public static void ChooseOption() {

			System.out.println("Choose an option from below");
			String[] arr = { "1.Retrive Current File Name in Ascending Order ",
					"2.Business Level Operation Menu", "3.Exit from the application" };
			System.out.println("**********************************");
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
				// display the all the menu mentioned in the String array
			}
			System.out.println("\nSelect one of the options listed above\n");
			//taking user input
			Scanner ip = new Scanner(System.in);
			int k = ip.nextInt();
			//using switch case for different functions
			//if the case number matches,it following function takes place
			switch (k) {
			case 1:
				File filearray[] = folder.listFiles();
				Arrays.sort(filearray);

				for (int i = 0; i < filearray.length; i++)
					System.out.println(filearray[i]);
				ChooseOption();//calling the function
				break;
			case 2:
				//to check with two different condition,first with true condition,second with false condition
				boolean condition=true;
				//while loop for multiple iterations until the condition is true
				while (condition) {
					System.out.println("Business Level Operations\n");
					System.out.println(" 1 : Add a file ");
					System.out.println(" 2 : Delete a file ");
					System.out.println(" 3 : Search file from the Directory");
					System.out.println(" 4 : Exit");
					//taking numberical input 
					int inp = ip.nextInt();
					switch (inp) {
					case 1:
						System.out.println("Enter the File Name to be created:");
						String str = ip.next();
						File file = new File(folder, str);

						try {
							boolean value = file.createNewFile();
							if (value) {
								System.out.println("The new file is created.");
							} else {
								System.out.println("The file already exists.");
							}
						} catch (Exception e) {
							e.getStackTrace();
						}
						break;
					case 2:
						System.out.println("Enter the File Name to delete:");
						String name = ip.next();
						File file1 = new File(folder, name);

						try {
							boolean value = file1.delete();
							if (value) {
								System.out.println("The file name you entered is Deleted.");
							} else {
								System.out.println("File Not Found in the Directory.");
							}
						} catch (Exception e) {
							e.getStackTrace();
						}
						break;
					case 3:
						System.out.println("Enter a keyword to search:");
						String search = ip.next();
						boolean flag1 = false;
						File arr1[] = folder.listFiles();
						System.out.println("File :\n");
						for (int i = 0; i < arr1.length; i++) {
							if (arr1[i].getName().startsWith(search)) {
								flag1 = true;
								System.out.println(arr1[i]);
							}
						}
						if (flag1 == false) {
							System.out.println("No file found in the Directory");
						}

						break;
					case 4:
						condition = false;
						ChooseOption();
						break;
					default:
						System.out.println("Invalid Choice!!!");
						System.out.println("Please enter correct choice again\n");

					}
				}
				break;
			case 3:
				System.out.println("Closing Your Application...\n");
				System.out.println("-----Thank You------");
				break;
			default:
				System.out.println("You have made an invalid choice!");
				System.out.println("Please enter correct choice\n");
				ChooseOption();
				break;

			}

		}

	}