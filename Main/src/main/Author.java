
package main;

public class Author {
    private final int authorID;
    public String Name;

    public Author(int authorID, String Name) {
        this.authorID = authorID;
        this.Name = Name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getAuthorID() {
        return authorID;
    }
    
    @Override
    public String toString() {
        return "Author{" + "authorID=" + authorID 
                + ", Name=" + Name + '}';
    }
    
    
}
