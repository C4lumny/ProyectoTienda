package Usuario;

import java.io.Serializable;


public class Admin implements Serializable{
    private String userName;
    private String password;
    private String storeName;

    public Admin() {
    }

    public Admin(String userName, String password, String storeName) {
        this.userName = userName;
        this.password = password;
        this.storeName = storeName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    @Override
    public String toString() {
        return "Admin{" + "userName=" + userName + ", password=" + password + ", storeName=" + storeName + '}';
    }
    
    
    
}
