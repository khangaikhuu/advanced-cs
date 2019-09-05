
/**
 * Write a description of class myArray here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class myArray
{
  private int [] myIntArray = {1, 3, 4, 5, 10};
  private int [] myIntArrayTwo = new int[4];
  private String[] mrKhangai = {"1", "2", "3"};
  private String[] msAminerdene = {"Hey", "Ohh", "Hi", "Ok"};
  private double[] khulan = {1.2, 2.9, 3.4, 4.6}; 
  private char[] tsengel = {'a', 'b', 'c', 'd', 'e'};
  private int [] jason = {140, 193};
 private long[] juanCarlos = {1,6,8,3};
  private int [] anudari = {3,4,7,9};
	private float [] khangarid = {3.22f, 7.22f, 11.22f, 15.22f, 19.22f};
  private double [] hannah = {2.5,4.6,9.1};
  private String[] bilguundalai = {"Yes", "No", "JutsuMeister1008"};
  private int [] haYeon = {};
  private String[] erhkem = {"3", "2", "32", "hi", "P"};
  private float [] manal = {1.1f, 1.2f, 1.3f, 1.4f, 1.5f};  
  
  public double getMyElementKhulan(int index)
  {
    return khulan[index];
  }
  public void addNumberKhulan(double num, int index)
  {
    khulan[index] = num;
  }
  public int getSizeOfArrayKhulan()
  {
    return khulan.length;
  }
  
  public int getSizeOfArrayTsengel()
  {
    return tsengel.length;
  }
  
  public void addNumberTsengel(char num, int index)
  {
    tsengel[index] = num;
  }
  
  public char getMyElementTsengel(int index)
  {
    return tsengel[index];
  }
  
  
  
  public String getMyElementMrKhangai(int index)
  {
    return mrKhangai[index];
  }
    
  public long getMyElementjuanCarlos(int index)
  {
    return juanCarlos[index];
  }
  
  public void addNumberMrKhangai(String num, int index)
  {
    mrKhangai[index] = num;
  }
  
  public int getSizeOfArrayMrKhangai()
  {
    return mrKhangai.length;
  }
  
  public void addNumberKhangarid (float num, int index)
  {
    khangarid[index] = num;
  }
  
  public float getMyElementKhangarid(int index)
  {
    return khangarid[index];
  }
  public void addNumberJuan(long num, int index)
  {
    juanCarlos[index] = num;
  }
  
  
  
  public int getSizeofArrayjuanCarlos()
  {
    return juanCarlos.length;
  }
  
  public void addNumberJason(int num, int index)
  {
    jason[index] = num;
  }
  public int getSizeOfArrayJason()
  {
    return jason.length;
  }
  public int getMyElementJason (int index)
  {
    return jason[index];
  }
  
	public int getSizeOfArrayKhangarid()
  {
    return khangarid.length;
  }
  
 public int getSizeOfArrayErkhem()
  {
    return erhkem.length;
  }
  public void addNumberErkhem(String str, int index)
  {
    erhkem[index] = str;
  }
  
  public String getMyElementErkhem(int index)
  {
    return erhkem[index];
  }
  
  public void addNumberAnudari(int num, int index)
  {
    anudari[index] = index;
  }
  public int getSizeOfArrayAnudari()
  {
    return anudari.length;
  }
    
  public int getMyElementAnudari(int index)
  {
    return anudari[index];
  }
  
 public int getSizeOfArrayHannah()
  {
    return hannah.length;
  }
  
  public void addNumberHannah(double num, int index)
  {
    hannah[index] = num;    
  }
  
  public double getMyElementHannah(int index)
  {
   return hannah[index]; 
  }
    public String getMyElementMsAmina(int index)
  {
    return msAminerdene[index];
  }
  public int getSizeOfArrayMsAmina()
  {
        return msAminerdene.length;
  }
  
  public void addNumberMsAmina(String num, int index)
  {
    msAminerdene[index] = num;
  }
  
  public String getMyElementBilguundalai(int index)
  {
    return bilguundalai[index];
  }
	public void addNumberBilguundalai(String num, int index)
  {
    bilguundalai[index] = num;
  }
	public int getSizeOfArrayBilguundalai()
  {
  	return bilguundalai.length;
  }
  
  public int getSizeOfArrayhaYeon()
  {
    return haYeon.length;
  }
  
  public void addNumberHayeon(int num, int index)
  {
    haYeon[index] = num;
  }
  
  public int getMyElementHayeon(int index)
  {
    return haYeon[index];
  }
  
  public int sizeOfArrayManal()
  {
      return manal.length;
  }
  public void addElementManal(float f, int i)
  {
      manal[i] = f;
  }
  public float getMyElementManal(int i)
  {
      return manal[i];
  }
}

  

