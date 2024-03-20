import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class prtintEvenNumberWithName {
    public static  void main(String [] args){
        String inputString ="Agnic";
        List<Integer> evenNumber = IntStream.rangeClosed(1,50).filter(num-> num % 2 ==0 ).boxed()
                .collect(Collectors.toList());
       List<Character> charList = inputString.chars().mapToObj(c-> (char) c).collect(Collectors.toList());
       System.out.println(evenNumber);
int count=0;
       for (int i=0 ;i<=evenNumber.size();i++){
             try {
                 if(charList.size() == count ){
                     System.out.println(evenNumber.get(i)+"::::"+ "none");
                 }else {
                     System.out.println(evenNumber.get(i)+"::::"+ charList.get(i));
                 }

             }catch (Exception exception){

             }





       }
    }
}
