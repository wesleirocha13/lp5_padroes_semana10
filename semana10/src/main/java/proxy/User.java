package proxy;

/**
 *
 * @author Weslei
 */
public class User {
    private String name;
    private String role;

    public User(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAdmin() {
        if(this.role.equals("admin")){
            return true;
        }else{
            return false;
        }
    }

    public void setRole(String role) {
        this.role = role;
    }
}
