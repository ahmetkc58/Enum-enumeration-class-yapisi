
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 /*

kulanıcı id isim yaşadığı şehir ve sevdiği renk 
custumer oluşturmamız lazım main 


 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Customer> list = new ArrayList<>();
        list.add(new Customer(1, "ahmet", City.kayseri, Color.mavi));
        list.add(new Customer(2, "mehmet", City.burdur, Color.kırmızı));
        list.add(new Customer(3, "ali", City.konya, Color.yeşil));
        list.add(new Customer(4,"ahmet2",City.burdur,Color.mor));
        City burdur = City.burdur;
        System.out.println(burdur);
        
        for (Customer i : list) {
            System.out.println(i.getcolor());//sadece liste kullanılan  color kısmını yazdırır
        }

    }

}
