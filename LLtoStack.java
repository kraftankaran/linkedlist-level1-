import java.util.*;
public class LLtoStack {

    public static class lltostack{
        private LinkedList<Integer> list;
        public lltostack(){
            list = new LinkedList<>();

        }
        public void push(int v){
            list.addFirst(v);
        }
        public int pop(){
            if(list.size()==0){
                System.out.println("empty list");
                return -1;
            }
            else {
                int getfirst = list.getFirst();
                list.removeFirst();
                return getfirst;
            }
        }


        public int peek(){
            if(list.size()==0){
                System.out.println("empty list");
                return -1;
            }else{
                return list.getFirst();
            }
        }
        public int size(){
            return list.size();
        }

        
    }
    public static void main(String[] args) {
        
    }
    
}
