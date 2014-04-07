package ProjectComponent;


/**
 * Write a description of class CapitalProject here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CapitalProject extends Project
{
    // instance variables - replace the example below with your own
    private Contract contract;
    public String task;

    /**
     * Constructor for objects of class CapitalProject
     */
    public CapitalProject (String projectName, String projectDescription,String sector,Contract contract )
    {
        super(projectName,projectDescription,sector);
        this.contract = contract;
    }
    
    //return location of project
    public void getLocation( Map l)
    {
        return Map.(l);
    }
    
    //set task 
    public void setTask( String task)
    {
        this.task= task;
    }
    
    

    
}
