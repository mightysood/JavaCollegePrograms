import java.io.*;

class bufferedreader{
    public static void main(String Args[])throws IOException{
        InputStreamReader ir =new InputStreamReader(System.in);  
        BufferedReader rd = new BufferedReader(ir);
        String str = rd.readLine();
        System.out.println(str);
    }
}