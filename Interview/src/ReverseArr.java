import java.util.Arrays;
import java.util.Scanner;

public class ReverseArr {


        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            while(scanner.hasNextInt())
            {
                int len = scanner.nextInt();
                int[] array = new int[len];
                int[] copy = new int[len];
                for(int i=0;i<len;i++)
                {
                    array[i] = scanner.nextInt();
                    copy[i] = array[i];
                }
                Arrays.sort(copy);
                int left = 0,right = len-1;
                while(left<len && copy[left]==array[left]) left++;
                while(right>=0 && copy[right]==array[right]) right--;


                int i;
                for(i=0;i<=right-left;i++)
                {
                    if(copy[left+i]!=array[right-i])
                        break;
                }
                if(i>right-left)
                    System.out.println("yes");
                else
                    System.out.println("no");
            }
        }

    }

