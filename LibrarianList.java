public class LibrarianList {
    
    private Librarian librarian[] = new Librarian[10];

        // =========================== Adding Librarians =========================== //
    public void insertLibrarian(Librarian ob)
	{
		int flag = 0;
		for(int i=0; i<librarian.length; i++)
		{
			if(librarian[i] == null)
			{
				librarian[i] = ob;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("Librarian Account Inserted");
		}
		else
		{
			System.out.println("Can Not Insert");
		}
	}
        // =========================== Removing Librarians =========================== //
    public void removeLibrarian(String id)
	{
		int flag = 0;
		for(int i=0; i<librarian.length; i++)
		{
			if(librarian[i].librarian_ID.equals(id))
			{
				librarian[i] = null;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
        {
            System.out.println("Librarian Account Removed");
        }
		else
        {
            System.out.println("Can Not Remove");
        }
	}
        // =========================== Get Librarians =========================== //
    public Librarian getLibrarian(String lID, String lName)
	{
		Librarian c = null;
		
		for(int i=0; i<librarian.length; i++)
		{
			if(librarian[i] != null)
			{
				if(librarian[i].getID().equals(lID) && librarian[i].getName().equals(lName))
				{
					c = librarian[i];
					break;
				}
			}
		}
		if(c != null)
		{
			System.out.println("Librarian Found");
		}
		else
		{
			System.out.println("Librarian Not Found");
		}
		return c;
	}
    // =========================== Show All Librarians =========================== //
    public void showAllLibrarians()
    {
        System.out.println("==****************************==");
        for (Librarian lib : librarian)
        {
            if(lib != null)
            {
                System.out.println("Librarian ID: " + lib.getID());
                System.out.println("Librarian Name: " + lib.getName() + "\n");
            }
        }
        System.out.println("==****************************==");
    }

	// =========================== Librarian login Process =========================== //
	public void librarianValidation(String name, String pass)
	{
		for (int i=0; i<librarian.length; i++)
		{
			if(librarian[i].librarian_Username.equals(name) && librarian[i].librarian_Password.equals(pass))
			{
				System.out.println("LogIn successful");
			}
			else
			{
				System.out.println("Incorrect username or password...");
			}
		}
	}
}