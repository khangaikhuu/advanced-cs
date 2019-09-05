
/**
 * My own array
 *
 * @author (Erkhem)
 * @version (1.0)
 */
public class MyArray
{
    private int[] myIntArray = {1, 3, 4 ,5 ,10};
    private int [] myIntArrayTwo = new int[4];
    private String[] mrErkhem = {"1", "2", "3"};
    private String[] erkhem = {"Hey","Hi", "Hello"};
    
    public void modifyIndex(String str, int index)
    {
        erkhem[index] = str;
    }
    
    public String returnIndex(int index)
    {
        return erkhem[index];
    }
    
    public int getSizeArray()
    {
        return erkhem.length;
    }
    
    public void MyArray()
    {   
        
    }
    
}
