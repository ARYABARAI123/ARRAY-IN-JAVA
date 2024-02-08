package Assignment2;
import java.util.ArrayList;
public class Main_2
{
public static void main(String[] args)
{
Input_2 inp = new Input_2();
int[] data = inp.inputData();
Parts_2 part = new Parts_2();
part.part 1(data);
int indexVal = part.part2(data);
System.out.println("The index value of the first number which has the smallest distance to it's next neighbor is:" + indexVal);
ArrayList<Integer> arrayList = part.part3();
System.out.println("Array List: " + arrayList);
}
}
