public class ProjectTest {
    public static void main(String[] args){
        ProjectClass project = new ProjectClass();
        project.setName("n");
        System.out.println(project.getName());

        ProjectClass derel = new ProjectClass("derel");
        System.out.println(derel.getName());

        ProjectClass austin = new ProjectClass("Austin","Make Austin Great Again");
        System.out.println(austin.getName() + " " + austin.getDescription());
    }
}
