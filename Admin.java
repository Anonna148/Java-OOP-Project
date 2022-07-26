public class Admin //extends Librarian 
{
    //private Librarian librarian[] = new Librarian [10];

    private String adminUsername, adminPassword;

    public void set_Username(String username)
    {
        this.adminUsername = username;
    }

    public void set_Password(String password)
    {
        this.adminPassword = password;
    }

    public String get_Username()
    {
        return adminUsername; 
    }
    public String get_Password()
    {
        return adminPassword; 
    }

    // =========================== Admin LogIn Validation =========================== //
    public int validation()
    {
        if(get_Username().equals("Fahad") && get_Password().equals("Fahad123"))
        {
            //System.out.println("\n\tSuccessfully logged in\n");
            return 1;
        }
        else
        {
            //System.out.println("\nIncorrect username or password\n");
            return 0;
        }
    }
}