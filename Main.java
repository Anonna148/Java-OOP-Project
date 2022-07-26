public class Main {
    public static void main(String[] args) {
        Admin Fahad = new Admin();
        Librarian lib1 = new Librarian();
        Librarian lib2 = new Librarian();
        Librarian lib3 = new Librarian();
        Fahad.showAllLibrarians();
        Fahad.insertLibrarian(lib1, "Salim", "1245", "salim", "Salim12");
        Fahad.insertLibrarian(lib2, "Kalim", "1299", "kalim", "Kalim12");
        Fahad.insertLibrarian(lib3, "Fualim", "1895", "fualim", "Fualim2");
        Fahad.showAllLibrarians();
        Fahad.removeLibrarian(lib2);    // Removing lib2 object
        Fahad.showAllLibrarians();
        
        lib2.LibrarianDetails();    // Bug => removed lib2 object, but it is still in the memory and useable.

        // lib1.librarianLogin(lib1);
        //System.out.println(lib1.getName() + lib1.getID() + lib1.getUsername() + lib1.getPassword());
    }
}