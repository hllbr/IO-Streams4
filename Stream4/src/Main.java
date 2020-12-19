
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args) {
        //Dosyalarda dönüştürme işlemi yapmadan okuma işlemleri gerçekleştirmek için filewriter ve filereader kullanıyoruz.
        
        FileWriter fileWriter = null;
        //try-catch içerisinde yapmak istemediğimiz için yapıyı null oalrak başlatıyoruz.
        try {
            fileWriter = new FileWriter("doya doya.txt",true);
            
            
            fileWriter.write("@prince / hllbr is wonderfull about software area\n");
            
            fileWriter.write("hllbr will one day become the CEO of group companies\n");
            
            fileWriter.write("2055");
        } catch (IOException ex) {
            System.out.println("Dosya oluşturma(açılırken) işlemleri sırasında bir adet IOException meydana geldi");
        }finally{
            if(fileWriter != null){
                try {
                    fileWriter.close();
                } catch (IOException ex) {
                    System.out.println("Dosya Kapatılırken bir adet IOException meydana geldi ");
                }
            }
        }
    }
    
}
