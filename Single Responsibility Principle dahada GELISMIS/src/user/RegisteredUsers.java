package user;

public class RegisteredUsers {

    UserInformation userInformation;
    String id, pass;

    public RegisteredUsers() {
    }


    public UserInformation getUserInformation() {
        return userInformation;
    }

    public void setUserInformation(UserInformation userInformation) {
        this.userInformation = userInformation;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "RegisteredUsers{" + "userInformation=" + userInformation + ", id=" + id + ", pass=" + pass + '}';
    }
    

}
