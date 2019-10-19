import java.util.Stack;

public class _20ValidParentheses {
    public boolean isValid(String s) {
        char[] letters = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        if(letters.length==0){
            return true;
        }
        if(letters.length<2&&letters.length>0){
            return false;
        }

        for(int i=0;i<letters.length;i++){
            if(letters[i]=='('||letters[i]=='['||letters[i]=='{'){
                stack.push(letters[i]);
            }else{
                if(!stack.isEmpty()){
                    Character pop = stack.pop();
                    if(letters[i]==')'&&pop!='('){
                        return false;
                    }
                    if(letters[i]==']'&&pop!='['){
                        return false;
                    }
                    if(letters[i]=='}'&&pop!='{'){
                        return false;
                    }
                }else {
                    return false;
                }
            }

        }
        if(!stack.isEmpty()){
            return false;
        }


        return  true;
    }
}
