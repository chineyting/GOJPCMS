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

// return Document ID
    public String getDocId(){
        return this.docID;
    }

// Prints document
    public void printDoc(){}

//returns information on Document
    public String toString()
    {
        return info;
    }

//Saves document
    public void saveDoc(){}

//deletes document
    public void deleteDoc(){}

//returns document name
    public String getDocName(){
        return docName;
    }
}
