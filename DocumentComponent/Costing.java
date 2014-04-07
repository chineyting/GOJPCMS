package DocumentComponent;


/**
 * Write a description of class Costing here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Costing extends Document
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Costing
     */
    public Costing(String docID, String docName)
    {
        super(docID,docName);
    }
    //calculates cost 
    public int calcCost(int rawMat, int miscellaneous, int salary, int machinery, int utility)
    {
    
        return rawMat + miscellaneous + salary + machinery + utility;
    }
    
    // generates monthly estimated cost
    public int getEstMonthlyExp( int rawMat, int miscellaneous, int salary, int machinery, int utility)
    {
      int expense;
      expense = calcCost()/12;
      return expense;
    }
    
    // returns cost of  project
    public String createDoc()
    {
        String result = "";
        result += Documents.toString();
        result += "Cost of project : " + Cost; 
    }
    
}
