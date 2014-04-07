package ProjectComponent;
import DocumentComponent.*;

import java.util.*;

/**
 * Write a description of class Project here.
 * 
 * @author (your name) 
 * @version 1
 */
public class Project
{
    //declarations 
    AclComponent.authentication user; //object of AclComponent 

    public int projectid;
    public String projectName;
    public String sector; 
    public String projectDesciption;

    //added 
    private ProjectBudget projectBudget;
    private ProjectSchedule projectSchedule;
    private ProjectPlan projectPlan;
    private Costing costing;
    private FeasibilityStudy feasibilityStudy;
    private FundingArrangement fundingArrangement;
    private MonthlyExpenditureReport monthlyExpenditureReport;
    private QuarterlyProgressReport quarterlyProgressReport;
    private FinalReport finalReport;
    private ExPostEvaluation exPostEvaluation;
    /**
     * Create contructor project with project name and project description
     * @param project name and projectDescription 
     * 
     */   
    public Project(String projectName, String projectDescription,String sector )
    {
        //constructor code
        int min=1000;
        int max=9999;
        Random rand = new Random();
        projectid= rand.nextInt((max - min) + 1) + min; //assign a random numerical value to the project id each time the object project is called 
        projectName=projectName;
        projectDescription=projectDescription;
        sector=sector;
    }

    
    /***
     * Add a project Name and Desciption 
     * @param project name and project description
     * @return "Failure" or "success"
     */
    public String addProject(String projectName, String projectDescription)
    {
        if (user.hasAccess())
        {
            //create the project

            // Project project = new Project(projectName, projectDescription);


            //code to pass the information to the persistence layer

            return "SUCCESS";
        }
        else
        {
            return "FAILURE";
        }
    }

    /**
     * Edit roject name and desciption 
     * @param project name and description
     * @return
     */
    public void editProject(String projectName,String projectDescription)
    {
        projectName=projectName;
        projectDescription=projectDescription;   

    }

    
    // code added here  
    public ProjectSchedule establishProjectSchedule()
    {
        // put your code here
        return new ProjectSchedule();
    }

    public ProjectBudget establishProjectBudget()
    {
        // put your code here
        return new ProjectBudget();
    }

    public void prepareDocument(){

    }
    public void recordMonthlyExpenditureReport(){
    }
    public void recordQuarterlyProgressReport(){
    }
    
    /**
     * Display the contents of the project 
     */
    public String  toString()
    {

        return ("Project Name:"+projectName+"\tProject Description:"+projectDesciption); //will be updated in version 2
    }
}
