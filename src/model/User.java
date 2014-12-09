package model;

/**
 * @author LeonardoSotillo
 * @author FernandoRainier
 * version 1.0.0
 */
public class User {
    
    private String name;
    private String lastName;
    private String id;
    private String dateOfbirth;
    private String email;
    private String address;
    private String userName;
    private String profile;
    private String password;
     
    /**
     * Method for initializing the user`s attributes
     * @param name Name of the user
     * @param lastName Lastname of the user
     * @param id
     * @param CDdateOfbirth
     * @param email E-mail of the user
     * @param userName
     * @param profile
     * @param password Password of the user to be login on to the system
     * @param address
     */
    public User(String name, String lastName, String id, String CDdateOfbirth, String email, String userName, String profile, String address, String password)
    {
        this.name        = name;
        this.lastName    = lastName;
        this.id          = id;
        this.dateOfbirth = CDdateOfbirth;
        this.email       = email;
        this.address     = address;
        this.userName    = userName;
        this.profile     = profile;
        this.password    = password;
    }

    public User(String text, String text0, String text1, String text2, String CBprofile, String toLowerCaseUserName, String text3) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDateOfbirth() {
        return dateOfbirth;
    }

    public void setDateOfbirth(String dateOfbirth) {
        this.dateOfbirth = dateOfbirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}
