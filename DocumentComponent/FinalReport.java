package DocumentComponent;


/**
 * Write a description of class FinalReport here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FinalReport
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class FinalReport
     */
    public FinalReport(String docID, String docName)
    {
        // initialise instance variables
        super(docID,docName);
    }

// prints document
    public void printDetails()
    {
    }
  
  //return document name  
    public getDocName(String docName)
    {
        return docName;
    }
    
    //returns document ID
    public String getDocId(String docID)
    {
        return docID;
    }
}
