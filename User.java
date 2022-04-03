import java.util.ArrayList;
/**
 * UserClass
 */
public class User {

    String userName;
    String password;
    ArrayList <Project> projects;

    public User(String userName, String password){

        this.userName = userName;
        this.password = password;
        projects = new ArrayList<>();
    }


    public void addProject(Project project){

        projects.add(project);
    }


    public Project ReceiveProject(int projectNumber){

        return projects.get(projectNumber-1);
    }


    public final void ChangePassword(String newPassword){

        password = newPassword;
    }
    public String GetUserName(){

        return userName;
    }
    public String GetPassword(){

        return password;
    }
}