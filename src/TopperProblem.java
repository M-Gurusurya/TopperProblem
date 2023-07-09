import java.util.*;
public class TopperProblem {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int number=sc.nextInt();
            int evensum=0;
            int oddsum=0;
            while(number!=0)
            {
                int x=number%10;
                if(x%2==0)
                {
                    evensum+=x;
                }
                else{
                    oddsum+=x;
                }
                number=number/10;
            }
            if(oddsum==evensum)
                System.out.print("true");
            else
                System.out.print("false");
        }
}
