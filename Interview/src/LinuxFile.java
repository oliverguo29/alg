import java.util.Scanner;
import java.util.Stack;

public class LinuxFile {
    /**
     *  /a/./b/../../c/
     */

    public static void main(String[] args) {


            Scanner sc = new Scanner(System.in);
            while (sc.hasNext()) {
                String s = sc.next();
                String[] strs = s.split("/");
                Stack<String> stack = new Stack<String>();
                for (int i = 0; i < strs.length; i++) {
                    String cur = strs[i];
                    if (cur.equals(".") || cur.equals("")) {
                        continue;
                    } else if (cur.equals("..")) {
                        if(!stack.isEmpty()) {
                            stack.pop();
                        }
                    } else {
                        stack.push(cur);
                    }
                }
                String res = "";
                while (!stack.isEmpty()) {
                    String cur = stack.pop();
                    res = "/" + cur + res;
                }
                if(res.equals("")) {
                    res = "/";
                }
                System.out.println(res);
            }
            sc.close();

        }

    }

