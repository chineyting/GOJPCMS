package DocumentComponent;


/**
 * Write a description of class ProjectBudget here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ProjectBudget eextend Document
{
    // instance variables - replace the example below with your own
    public int budg, newBudg;
    

    /**
     * Constructor for objects of class ProjectBudget
     */
    public ProjectBudget(String docID,String docName)
    {
        // initialise instance variables
        super(docID,docName)
    }

  
  //set Budget
    public int setBudget(int y)
    {
        
         budg = y;
         
    }
    
    //update Budget
    
    public void updateBudget(int y)
    {
      newBudg = int y;
      budg = newBudg;
    
    }
    
    //return Budget
    public void getBudet()
    {
        return budg;
    }
}
