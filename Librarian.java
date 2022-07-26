public class Librarian extends LibrarianList
{
    protected String librarian_Name, librarian_ID, librarian_Username, librarian_Password;
    // private Librarian librarian[] = new Librarian [10];
    Books books[];
    Students students[];

    public Librarian (String lName, String lID, String lUsername, String lPassword)
    {
        this.librarian_Name = lName;
        this.librarian_ID = lID;
        this.librarian_Username = lUsername;
        this.librarian_Password = lPassword;
    }

    public Librarian (String lUsername, String lPassword)
    {
        this.librarian_Username = lUsername;
        this.librarian_Password = lPassword;
    }
    
    public String getName()
    {
        return librarian_Name;
    }
    public String getID()
    {
        return librarian_ID;
    }
    public String getUsername()
    {
        return librarian_Username;
    }
    public String getPassword()
    {
        return librarian_Password;
    }
    public void LibrarianDetails()
    {
        System.out.println("Name: " + librarian_Name + "\nID: " + librarian_ID);
    }

    // ==================== Librarian Log In Management ==================== // => Error (-_-)
    
    /*public void librarianLogin (Librarian obj)
    {
        for(Librarian e : librarian)
        {
            if(e.librarian_Username.equals(obj.librarian_Username)&& e.librarian_Password.equals(obj.librarian_Password))
            {
                System.out.println("Login Success");
            }
            else
            {
                System.out.println("Incorrect info");
            }
            System.out.println(e);
        }
    } */
}