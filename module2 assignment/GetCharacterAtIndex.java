package Module2;

public class GetCharacterAtIndex
{
    public static void main(String[] args) 
    {
        String str = "Tops Technologies!";
        int index1 = 0;
        int index2 = 10;
        char char1 = str.charAt(index1);
        char char2 = str.charAt(index2);
        System.out.println("The character at position " + index1 + " is " + char1);
        System.out.println("The character at position " + index2 + " is " + char2);
    }
}
