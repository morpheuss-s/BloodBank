/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BloodBankManagement;

/**
 *
 * @author pault
 */
public class User {
        //Initialize Variables
    private String firstName;
    private String lastName;
    private String middleName;
    
    private String accountStatus;
    private String roleType;
    
    private String email;
    private String phoneNumber;
    
    private String username;
    private String password;
    
    private int userID;
    private boolean active;
    
    
        //Constructor
    public User(String firstName, String lastName,String middleName, String accountStatus,
                String roleType, String email, String phoneNumber, String username, String password, int userID) {
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        
        this.accountStatus = accountStatus;
        this.roleType = roleType;
        
        this.email = email;
        this.phoneNumber = phoneNumber;
        
        this.username = username;
        this.password = password;
        
        this.userID = userID;
        active = false;
    }
    
    
        //Methods
    public void setActive(boolean bool){
        active = bool;
    }
    
    //Getters
    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public String getMiddleName(){
        return middleName;
    }
    
    public String getAccountStatus(){
        return accountStatus;
    }
    
    public String getRoleType(){
        return roleType;
    }
    
    public String getEmail(){
        return email;
    }
    
    public String getPhoneNumber(){
        return phoneNumber;
    }
    
    public String getUsername(){
        return username;
    }
    
    public String getPassword(){
        return password;
    }
    
    public int getUserID(){
        return userID;
    }
    
    public boolean getActive(){
        return active;
    }
    
    
}
