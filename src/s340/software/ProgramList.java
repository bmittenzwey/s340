/**
 *
 * @author altino
 */
package s340.software;

import s340.software.os.Program;
import s340.software.os.ProgramBuilder;

//A collection of programs
public class ProgramList {

    public static Program p1() {
        ProgramBuilder b1 = new ProgramBuilder();
        b1.size(14);    //program is size 14 to accomdate the extra variables
        b1.loadi(0);    //load 0 into the acc
        b1.store(90);   // store 0 into the first available location in data size
        b1.loadi(3);    // load 3 into the accumlator 
        for(int j= 92; j < 102; j++)
        {
        b1.store(j);    //for loop through it and store 3 inside 92-102
        }
        for(int j= 92; j < 102; j++)
        {
        b1.load(j);     //load the contents of location starting at 92
        b1.add(90);     //add contents of location 90 to the acc
        b1.store(90);   //store the contents back into location 90
        }
        b1.output();    //show me the answer
        b1.end();       //end the program 

        Program p1 = b1.build();
        return p1;
                
        
        
//        int sum = 900;
//        int max = 902;
//        
//        int i = 904;
//        b1.start(0);
//        b1.loadi(0);
//        b1.store(sum); // sum = 0
//        b1.loadi(101); 
//        b1.store(max); // max = 0
//        
//        b1.loadi(1); // acc = 1
//        b1.tax(); // x = acc 
//        b1.loadi(1); // acc = 1
//        b1.sub(max);     
//        b1.jpos(54);
//        b1.jzero(54);
//        b1.txa();
//        b1.store(i);
//        b1.load(sum);
//        b1.add(i);
//        b1.store(sum);
//        b1.load(i);
//        b1.tax();
//        b1.incx();
//        
//        b1.load(max);
//        b1.subi(1);
//        b1.store(max);
//        
//        b1.jmp(22);
//        
//        b1.load(sum);
//        
//        
//        b1.output();
//        b1.end();
    }

    public static Program p2() {
        //This program starts at 100 and ends at 148
        //compute and print J*K for each J and K between 1 and 5 – so compute and print 
        //1*1, 1*2, 1*3, 1*4, 1*5, 2*1, 2*2, 2*3, 2*4, 2*5,3*1, etc.

        ProgramBuilder b2 = new ProgramBuilder();
        b2.size(14);    //program is size 14 to accomdate the extra variables
        b2.loadi(0);    //load 0 into the acc
        b2.store(192);   // store 0 into the first available location in data size
        b2.loadi(3);    // load 3 into the accumlator 
        for(int j= 194; j < 204; j++)
        {
        b2.store(j);    //for loop through it and store 3 inside 92-102
        }
        for(int j= 194; j < 204; j++)
        {
        b2.load(j);     //load the contents of location starting at 92
        b2.add(192);     //add contents of location 90 to the acc
        b2.store(192);   //store the contents back into location 90
        }
        b2.output();    //show me the answer
        b2.end();       //end the program 

        Program p2 = b2.build();
        return p2;
    }

    public static Program p3() {
        //this program starts at 200 and ends at 256
        //calculates the sum of the first 100 squares
        ProgramBuilder b3 = new ProgramBuilder();

        b3.size(14);    //program is size 14 to accomdate the extra variables
        b3.loadi(0);    //load 0 into the acc
        b3.store(90);   // store 0 into the first available location in data size
        b3.loadi(3);    // load 3 into the accumlator 
        for(int j= 92; j < 102; j++)
        {
        b3.store(j);    //for loop through it and store 3 inside 92-102
        }
        for(int j= 92; j < 102; j++)
        {
        b3.load(j);     //load the contents of location starting at 92
        b3.add(90);     //add contents of location 90 to the acc
        b3.store(90);   //store the contents back into location 90
        }
        b3.output();    //show me the answer
        b3.end();       //end the program 
//        int sum3 = 920;
//        int max3 = 922;
//        int i3 = 924;
//        int iSquared = 926;
//        
//        b3.start(200);
//        b3.loadi(0);
//        b3.store(sum3);
//        b3.loadi(101);
//        b3.store(max3);
//        b3.loadi(1);
//        b3.tax();
//        b3.loadi(1);
//        b3.sub(max3);
//        b3.jpos(250);
//        b3.jzero(250);
//        b3.txa();
//        b3.store(i3);
//        b3.load(i3);
//        b3.mul(i3); // i * i (i squared)
//        b3.store(iSquared);
//        b3.load(sum3);
//        b3.add(iSquared);
//        b3.store(sum3);
//        b3.load(i3);
//        b3.tax();
//        b3.incx();
//        b3.load(max3);
//        b3.subi(1);
//        b3.store(max3);
//        b3.jmp(212);
//        b3.load(sum3);
//        b3.output();
//        b3.end();
//
        Program p3 = b3.build();
        return p3;
    }

    public static Program p4() {
      
        ProgramBuilder b4 = new ProgramBuilder();

        b4.size(14);    //program is size 14 to accomdate the extra variables
        b4.loadi(0);    //load 0 into the acc
        b4.store(90);   // store 0 into the first available location in data size
        b4.loadi(3);    // load 3 into the accumlator 
        for(int j= 92; j < 102; j++)
        {
        b4.store(j);    //for loop through it and store 3 inside 92-102
        }
        for(int j= 92; j < 102; j++)
        {
        b4.load(j);     //load the contents of location starting at 92
        b4.add(90);     //add contents of location 90 to the acc
        b4.store(90);   //store the contents back into location 90
        }
        b4.output();    //show me the answer
        b4.end();       //end the program 
//      int j4 = 930;
//      int k4 = 932;
//      int max4 = 934;
//      b4.start(300);
//      b4.loadi(31);
//      b4.store(j4); //j = 31
//      b4.loadi(35);
//      b4.store(max4); // max = 35
//      b4.load(j4);
//      b4.sub(max4);  // while(j <= max)
//        
//      b4.jpos(346); // jump to end of outer loop 
//      b4.loadi(31);
//      b4.store(k4); // k = 31
//      b4.load(k4);
//      b4.sub(max4); // while(k <= max)
//      b4.jpos(338); //jump to end of inner loop
//      
//      b4.load(k4);
//      b4.mul(j4); // acc = j * k
//      b4.output(); // System.out.println(acc);
//      b4.load(k4); 
//      b4.inca(); // k+= 1
//      b4.store(k4);
//      b4.jmp(318); /// jump to start of inner loop
//      
//      b4.load(j4);
//      b4.inca();
//      b4.store(j4); // j+= 1
//      b4.jmp(308); // jump to start of outer loop
//      
//      
//      b4.end(); 

        Program p4 = b4.build();
        return p4;
    }
}
