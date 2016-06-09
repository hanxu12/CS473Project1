
/**
 * Write a description of class ToInstr here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ToInstr
{
    // instance variables - replace the example below with your own
    String instr;
    public String convert(int instruction, int oldPC){
        int opcode = (instruction & 0xFC000000)>>>26;
//        System.out.println(opcode);
        if (opcode == 0){
            int rs = (instruction & 0x3E00000)>>>21;
            int rt = (instruction & 0x1F0000)>>>16;
            int rd = (instruction & 0xF800) >> 11;
            int funct = (instruction & 0x3F);
//             System.out.println(rs);
//             System.out.println(rt);
//             System.out.println(rd);
//             System.out.println(funct);
            switch(funct){
            case 34:
            instr = "sub";
                break;
            case 32:
            instr = "add";
                break;
            case 36:
            instr = "and";
                break;
            case 37:
            instr = "or";
                break;
            case 42:
            instr = "slt";
                break;
            default: 
            instr = "nop";
                break;
            }
        return (instr + " $" + rd + "," + "$" + rs + "," + "$" + rt);
    }
    // I type
    else {
        short imm = (short)(instruction & 0x0000FFFF);
        int rs = (instruction & 0x3E00000)>>>21;
        int rt = (instruction & 0x1F0000)>>>16;
        int hex = Integer.valueOf(String.valueOf(imm), 16);
//         System.out.println("oldPC" + oldPC);
//         System.out.println("deci of imm" + imm);
//         System.out.println("hex of imm" + hex);
//         int addrr = imm * 4;
//         System.out.println(oldPC+ 4 + imm*4);
//         System.out.println(oldPC + 4 + imm<<2);
//         System.out.println("shifted imm" + addrr);
//        System.out.println(PC);
//        System.out.println(PC);
        int branchaddr = oldPC + 4 + imm * 4;
//         System.out.println("addr" + addr);
        switch(opcode){
            case 35:
                instr = "lw";
                return (instr + " $" + rt + "," + imm + "($" + rs + ")");
            case 4:
                instr = "beq";
                return (instr + " $" + rs + "," + "$" + rt + ",address 0x" + Integer.toHexString(branchaddr));
               //beq sign-extended and multiplied by 4
              //  break;
            case 43:
                instr = "sw";
                return (instr + " $" + rt + "," + imm + "($" + rs + ")");   
            case 5:
                instr = "bne";
                return (instr + " $" + rs + "," + "$" + rt + ",address 0x" + Integer.toHexString(branchaddr));
            default:
                instr = "nop";
                return (instr + " $" + rt + "," + imm + "($" + rs + ")");
        }    
        
    }
}
    // a tiny method for converting decimal integer to hex interger
    public int DeciToHex(int n) {
  return Integer.valueOf(String.valueOf(n), 16);
}
}

//1. difference imm
//2.&4 or >>2

