package DocumentComponent;


/**
 * Write a description of class Document here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Document
{
    public String docID;
    public String docName;
    public String info;

    //Creating document given parameter
    public Document (String docID, String docName){
        this.docID=docID;
        this.docName=docName;
    }

    public String getDocId(){
        return this.docID;
    }

    public void printDoc(){}

    public String toString()
    {
        return info;
    }

    public void saveDoc(){}

    public void deleteDoc(){}

    public String getDocName(){
        return docName;
    }
}
