
/**
 * Conditionals Lesson
 *
 * @author (Manal)
 * @version (04.09.2019)
 */
public class Conditionals
{
    private int a = 10;
    private int b = 20;
    private int c = 10;
    public String checkMaxNumbers(int num1, int num2){
        if (num1 > num2){
            return "Num1 is bigger";
        }
        else if (num1 < num2){
            return "Num2 is bigger";
        }
        else {
            return "They are Equal";
        }
    }
    public boolean checkMax(){
        if (a > b){
            return true;
        }
        else if (a > c){
            return true;
        }
        else {
            return false;
        }
    }
}
