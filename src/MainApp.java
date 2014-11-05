import java.io.*;

public class MainApp {

	private static User arrayUsers[] = new User[10];
	private static Course arrayCourses[] = new Course[10];
	private static Teachers arrayTeachers[] = new Teachers[10];
	private static int numUsers = 0;
	private static int numCourses = 0;
	private static int numTeachers = 0;
	private static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
	/**
	 * Main function
	 * @param args
	 * @throws IOException 
	 */

	public static void main(String[] args) throws IOException{
		int option = showMenu();
		while(option != 0){
			switch(option){
			case 1:
				User u = addNewUser();
				arrayUsers[numUsers] = u;					
				numUsers++;
				break;
			case 2:
				boolean readingError;
				do{ 
					System.out.println("Which user? (insert array index)");
					BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
					try{
						int index = Integer.parseInt(buffer.readLine());
						modifyUser(arrayUsers[index]);
						readingError = false;
					}catch(Exception e){
						System.out.println("There is no user in the given index");
						readingError = true;
					}
				}while(readingError);
				break;
			case 3:
				break;
					
				case 4:
					
					Course c= addNewCourse();
					arrayCourses[numCourses] = c;					
					numCourses++;
					
					break;
					
				case 5:
					
					deleteCourse();
					
					
					break;
					
				case 6:
					Teachers t= addNewTeachers();
					arrayTeachers[numTeachers] = t;					
					numCourses++;
					break;
					
				case 7:
					deleteTeachers();
					break;
					
			case 0:
				break;
			}
			option = showMenu();
		}

	}

	/**
	 * Displays a menu and returns option selected
	 * @return option selected
	 */
	public static int showMenu() {
		int result = -1;
		boolean readingError = true;
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		while(readingError){
			System.out.println("\tMenu");
			System.out.println("==========");
			System.out.println("1. - Add new User");
			System.out.println("2. - Modify existing User");
			System.out.println("3. - Delete User (TODO)");
			System.out.println("4. - Add new course");
			System.out.println("5. - Delete course");
			System.out.println("6. - Add new teacher");
			System.out.println("7. - Delete teacher");
			System.out.println("0. - Exit");
			try{
				String option = buffer.readLine();	
				result = Integer.parseInt(option);
				readingError = false;
			}catch(Exception e){
				readingError = true;
			}
		}		
		return result;
	}

	/**
	 * Asks user for User properties and creates a new one
	 * @return
	 */
	public static User addNewUser() {

		int id, age; id = age = -1;
		String name, surname; name = surname = "";
		boolean readingError;
		do {
			try{
				System.out.println("id:");
				id = Integer.parseInt(buffer.readLine());
				System.out.println("Name:");
				name = buffer.readLine();
				System.out.println("Surname:");
				surname = buffer.readLine();
				System.out.println("age:");
				age = Integer.parseInt(buffer.readLine());
				readingError = false;
			}catch(Exception e){
				System.out.println("Incorrect value!!");
				readingError = true;
			}
		} while(readingError);
		return new User(id, name, surname, age);
	}
	
	public static void modifyUser(User user){
		System.out.println("===== Current user data =====");
		System.out.println(user.toString());
		System.out.println("===== Insert new data =====");
		User newOne = addNewUser();
		user.setId(newOne.getId());
		user.setName(newOne.getName());
		user.setSurname(newOne.getSurname());
		user.setAge(newOne.getAge());
		System.out.println("Changes done!");
	}

	public static void deleteUser(int id) {

		for (int i = 0; i < arrayUsers.length; i++) {

			if(id==arrayUsers[i].getId()) {
				arrayUsers[i]=null;
			}

		}

	}

	
	public static Course addNewCourse() {
		int id=0;
		String name="";
		boolean readingError;
		do {
			try{
				System.out.println("id:");
				id = Integer.parseInt(buffer.readLine());
				System.out.println("Name:");
				name = buffer.readLine();
				readingError = false;
			}catch(Exception e){
				System.out.println("Incorrect value!!");
				readingError = true;
			}
		} while(readingError);
		return new Course(id, name);
	}
	
	public static void deleteCourse() throws IOException {
		try {

			System.out.println("Please enter the id");
			int id=Integer.parseInt(buffer.readLine());

			for(int i=0;i<arrayCourses.length;i++) {
				if(id == arrayCourses[i].getId()) {
					arrayCourses[i]=null;
				}
			}

		}catch(Exception e) {
			System.out.println("ID does not exists");
		}
		
	}

	/**
	 * Add Teachers
	 * @return
	 */
	public static Teachers addNewTeachers() {

		int id, age; id = age = -1;
		String name, surname; name = surname = "";
		boolean readingError;
		do {
			try{
				System.out.println("id:");
				id = Integer.parseInt(buffer.readLine());
				System.out.println("Name:");
				name = buffer.readLine();
				System.out.println("Surname:");
				surname = buffer.readLine();
				System.out.println("age:");
				age = Integer.parseInt(buffer.readLine());
				readingError = false;
			}catch(Exception e){
				System.out.println("Incorrect value!!");
				readingError = true;
			}
		} while(readingError);
		return new Teachers(id, name, surname, age);
	}

	/**
	 * Delete Teachers
	 * @return
	 */
	public static void deleteTeachers() throws IOException {
		int id; id = -1;

				BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("id:");
				id = Integer.parseInt(buffer.readLine());

				//Verificamos que el id ya existe
				int posicion = -1;
				for(int i=0; i< arrayTeachers.length;i++)
				{
					if(arrayTeachers[i] != null && arrayTeachers[i].getId() == id){ 
						posicion = i;
					}
				}
				//Si no lo encontramos  ... excepcion	
				if(posicion == -1)System.out.println("ID does not exist!!!");

				//Si lo encontramos lo borramos
				else arrayTeachers[posicion] = null;
	}
	
}
