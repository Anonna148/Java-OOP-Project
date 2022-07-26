import java.util.Scanner;

public class Start
{
    public static void main(String[] args)
    {
        System.out.println("\n******************* Welcome to the Library Management System *******************\n");
        boolean choice = true;
        Scanner sc = new Scanner(System.in);
        Admin obj = new Admin();
        LibrarianList list = new LibrarianList();

        while(choice)
        {
            mainMenu();

            int first = sc.nextInt();

            switch(first)
            {
                // ====================== For Admin Log In ====================== //
                case 1:
                    System.out.println("\n|||||||||||||||||||||||||||||||\n||========== Admin ==========||\n|||||||||||||||||||||||||||||||\n");
                    System.out.print("Username: ");
                    String userName = sc.next();
                    System.out.print("Password: ");
                    String passWord = sc.next();

                    obj.set_Username(userName);
                    obj.set_Password(passWord);
                    if(obj.validation() == 1)
                    {
                        System.out.println("\n\tLog In Successful\n");
                        librarianManagement();

                        while(true)
                        {
                            int second = sc.nextInt();

                            // *************************** Admin Management ***************************** //

                            switch (second)
                            {
                                case 1:
                                    Librarian librarian = addLibrarian(sc);
                                    list.insertLibrarian(librarian);
                                    System.out.println("\nSuccessfully created...\n");
                                    librarianManagement();
                                    break;
                                case 2:
                                    list.showAllLibrarians();
                                    librarianManagement();
                                    break;
                                case 3:
                                    System.out.print("Enter the librarian ID: ");
                                    String id1 = sc.next();
                                    list.removeLibrarian(id1);
                                    librarianManagement();
                                    break;
                                case 4:
                                    mainMenu();
                                    break;
                                default:
                                    System.out.println("Please enter a valid number!!");
                                    break;
                            }   
                        }
                    }
                    else
                    {
                        System.out.println("\n\tIncorrect username or password!\n");
                    }
                    break;
                
                    // ====================== For Librarian Log In ======================
                case 2:     
                    System.out.println("\n|||||||||||||||||||||||||||||||||||\n||========== Librarian ==========||\n|||||||||||||||||||||||||||||||||||\n");
                    System.out.print("Enter username: ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.print("Enter passowrd: ");
                    String password = sc.nextLine();
                    list.librarianValidation(name, password);                    
                    break;
                case 3:
                    System.out.println("\n*_*_*_* Exiting Application *_*_*_*");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please enter a valid number!!!");
            }
        }
    }

    private static void mainMenu()   // Main menu of the management system
    {
        System.out.println("Please select an option\n");
        System.out.println("\t1. Admin login");
        System.out.println("\t2. Librarian login");
        System.out.println("\t3. Exit Application\n");
        System.out.print("What do you want to do: ");
    }

    private static void librarianManagement()    // Admin panel (Managing librarians through admin)
    {
        System.out.println("Please select an option\n");
        System.out.println("\t1. Add a librarian");
        System.out.println("\t2. Show librarian list");
        System.out.println("\t3. Remove a librarian");
        System.out.println("\t4. Back");
        System.out.print("What do you want to do: ");
    }

    private static void studentManagement()    // Librarian panel (Managing students through librarian)
    {
        System.out.println("Please select an option\n");
        System.out.println("\t1. Add a student");
        System.out.println("\t2. Show student list");
        System.out.println("\t3. Remove a student");
        System.out.println("\t4. Borrow book to a student");
        System.out.println("\t5. Return book from a student");
        System.out.println("\t6. Back");
        System.out.print("What do you want to do: ");
    }

    private static void bookManagement()    // Librarian panel (Managing students through librarian)
    {
        System.out.println("Please select an option\n");
        System.out.println("\t1. Add a book");
        System.out.println("\t2. Remove a book");
        System.out.println("\t3. Add book amount");
        System.out.println("\t4. Update book amount");
        System.out.println("\t5. Back");
        System.out.print("What do you want to do: ");
    }

    private static Librarian addLibrarian(Scanner scanner)
    {
        String name, id, username, password;
        Librarian librarian;

        System.out.print("Enter the librarian name: ");
        scanner.nextLine();
        name = scanner.nextLine();
        System.out.print("Enter the librarian ID: ");
        id = scanner.nextLine();
        System.out.print("Enter the librarian username: ");
        username = scanner.nextLine();
        System.out.print("Enter the librarian password: ");
        password = scanner.nextLine();

        librarian = new Librarian(name, id, username, password);

        return librarian;
    }
    
    private static void loginLibrarian(Scanner scanner)
    {
        String name, password;
        //Librarian obj;

        

        //obj = new Librarian(name, password);
        //return obj;
    }
}