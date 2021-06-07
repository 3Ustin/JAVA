import java.util.*;
public class ProjectClass{
    private String name;
    private String description;
    ProjectClass(){
    }
    ProjectClass(String n){
        name = n;
    }
    ProjectClass(String n, String d){
        name = n;
        description = d;
    }

    public void setName(String n) {
        this.name = n;
    }
    public void setDescription(String d) {
        this.description = d;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
}