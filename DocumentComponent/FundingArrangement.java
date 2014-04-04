package DocumentComponent;


/**
 * Write a description of class FundingArrangement here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FundingArrangement extends Document
{
    private String fundingSource;
    private double amountOfFunds;
    private String type;
    

    /**
     * Constructor for objects of class FundingArrangement
     */
    public FundingArrangement(String docID, String docName,String fs,double aof,String typ)
    {
        super(docID,docName);
        this.fundingSource = fs;
        this.amountOfFunds = aof;
        this.type = typ;
    }

    
}
