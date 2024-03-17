import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.sql.SQLSyntaxErrorException;

//public class Main {
//    public static void main(String[] args){
//        int Number=0;
//        InputStreamReader Input=new InputStreamReader(System.in);
//        BufferedReader Buffer=new BufferedReader(Input);
//        try {
//            Number=Integer.parseInt(Buffer.readLine());
//            System.out.println(Number+1);
//            Buffer.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
//}

//public class Main {
//    public static void main(String[] args) throws IOException {
//        int Number=0;
//        InputStreamReader Input=new InputStreamReader(System.in);
//        BufferedReader Buffer=null;
//        try {
//            Buffer=new BufferedReader(Input);
//            Number=Integer.parseInt(Buffer.readLine());
//            System.out.println(Number+1);
//        }finally{
//            //Buffer.close();
//        }
//    }
//}

public class Main {
    public static void main(String[] args) throws IOException {
        int Number = 0;
        try(BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in))){
            Number=Integer.parseInt(buffer.readLine());
            System.out.println(Number+5);
        }//Auto Closing[Closable Interfcae]
    }
}
