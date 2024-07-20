import java.util.Scanner;
public class Main{
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       
       
       
       System.out.println("Enter mark of tests 1");
       int TestOne= input.nextInt();

       System.out.println("Enter marks of tests 2 ");
       int TestTwo= input.nextInt();

       System.out.println("Enter marks of Assigment ");
       int AssigmentMark = input.nextInt();

       int a = TestOne  * 30/  100;
       int b = TestTwo  *30  /  100 ;
       int c = AssigmentMark * 40/ 100;

int d = (a + b) ;

      // int Percent= 60/100*a + b;
     //  int Percentage = 40/100 *c;
       int SemesterMark = d+c;
       System.out.println("Semester Marks:"+ SemesterMark+"%");
       if(SemesterMark<= 39){
        System.out.println(" :Fail ..." );
      }
      else if( SemesterMark >=40 && SemesterMark<75 ){
        System.out.println(" :Pass...");
      }
      else if(SemesterMark>75 && SemesterMark <=100){
        System.out.println(" Pass with Distinction...");
      }
    

      System.out.println("Enter exam mark");
      int ExamMark = input.nextInt();

      System.out.println("Exam Mark:"+ ExamMark);

   if (ExamMark <=39 ){
        System.out.println(" :Fail...");
      }
else if(ExamMark >=40 && ExamMark <=49){
  System.out.println("Qualify for a Subtitution exam");
}
      
else if (ExamMark >=50 && ExamMark<75){
  System.out.println(" :Pass...");
}
else if(ExamMark >=75 && ExamMark<=100){
  System.out.println(" Pass with Distinction");
}

    



      int FinalMark = ExamMark *40/100 + SemesterMark*60/100;
      System.out.println("FinalMark :" +FinalMark+"%");
      if(FinalMark<= 29){
        System.out.println("Level 1 (Fail ...)" );
      }
      else if( FinalMark >=30 && FinalMark<=39 ){
        System.out.println("Level 2 (Elementary achievement...)");
      }
      else if(FinalMark>=40 && FinalMark<=49){
        System.out.println("Level 3 (Adequate achievement ...)");
      }
      else if (FinalMark >=50 && FinalMark <=59){
        System.out.println("Level 4 (Moderate achievement...)");
      }
else if (FinalMark >=60 && FinalMark<=69){
  System.out.println("Level 5 (Substantial achievement...)");
}
else if(FinalMark >=70 && FinalMark<=79){
  System.out.println("Level 6 (Meritorious achievement...)");
}
else if(FinalMark>=80 && FinalMark<=100){
  System.out.println("Level 7 (Outstanding achievement...)");
}
    }
}
