import java.io.*;
import java.util.*;
/**
 * Write a description of class Infoparser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Infoparser
{
    // instance variables - replace the example below with your own
//    private List<Integer> ArrayOfInstr = new;
  public int PC = 0x0007A060;
    /**
     * Constructor for objects of class Infoparser
     */
//     public void main()
//     {
//         // initialise instance variables
//         //readfile("instructions.txt");
//         
//         decode(ArrayOfInstr);
//         
//     }

//     public void readfile(String filepath){
//         try{
//             Scanner s = new Scanner(new File("filepath"));
//             ArrayOfInstr = new ArrayList<>();
//             while (s.hasNextInt()){
//                 ArrayOfInstr.add(s.nextInt());
//             }
//             s.close();
//             System.out.println(ArrayOfInstr);
//         }
//         catch (FileNotFoundException e){
//             e.printStackTrace();
//         }
// 
//     }
    public void decode(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0x022DA822);
        list.add(0x8EF30018);
        list.add(0x12A70004);
        list.add(0x02689820);
        list.add(0xad930018);
        list.add(0x02697824);
        list.add(0xad8FFFF4);
        list.add(0x018C6020);
        list.add(0x02A4A825);
        list.add(0x158FFFF6);
        list.add(0x8E59FFF0);
        
    for (int i = 0; i < list.size(); i++){
        ToInstr t = new ToInstr();
        System.out.println(Integer.toHexString(PC));
//         System.out.print(Integer.toHexString(t.PC));
//         System.out.print(String.format("%05X%",(0xFFFFF & t.PC)));
        System.out.println(t.convert(list.get(i),PC));
        PC += 4;
    }
}
}
