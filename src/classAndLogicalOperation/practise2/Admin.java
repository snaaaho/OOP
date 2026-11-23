package classAndLogicalOperation.practise2;

public class Admin {
    private String adminName;
    private String password;
    private int usrId;

    Admin(String adminName, String password, int usrId){
        this.adminName = adminName;
        this.password = password;
        this.usrId = usrId;
    }

    int getUsrId(){
        return usrId;
    }
}
