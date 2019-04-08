public class test {


    public static void main(String[] args){
       String expr = func("Winside");
       System.out.print(expr);
    }
   static String func(String s){
        return s.length() >0 ? (s.substring(1) + s.charAt(0)):"";
    }
}
