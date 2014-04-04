package ProjectComponent;


/**
 * Write a description of class TechnicalAssistanceProject here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TechnicalAssistanceProject extends Project
{
    // instance variables - replace the example below with your own
    private Consultant consultant;

    /**
     * Constructor for objects of class TechnicalAssistanceProject
     */
    public TechnicalAssistanceProject (String projectName, String projectDescription,String sector,Consultant cons)
    {
         super(projectName,projectDescription,sector);
        this.consultant = cons;
    }

    
    public void addConsultant(Consultant cons)
    {
        
    }
}
