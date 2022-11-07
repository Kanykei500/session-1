import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        /*Student student1 = new Student();
        student1.FullName = "Myrzakanova Aruuke Ylanovna";
        student1.id = 1;
        student1.age = 18;
        student1.group = "Java";

        Student student2 = new Student();
        student2.FullName = "Toktosunova Aiperi Mirlanovna";
        student2.id = 2;
        student2.age = 17;
        student2.group = "Java Script-6";

        Student student3 = new Student();
        student3.FullName = "Aldanova Aisuluu Mukanovna";
        student3.id = 3;
        student3.age = 20;
        student3.group = "Java-7";

        Student student4 = new Student();
        student4.FullName = "Hurbek kyzy Mairam";
        student4.id = 4;
        student4.age = 23;
        student4.group = "Java-8";

        Student student5 = new Student();
        student5.FullName = "Askarbekov Tilek Joomartovich";
        student5.id = 5;
        student5.age = 24;
        student5.group = "Java Script-8";

        while(true){
            int id = new Scanner(System.in).nextInt();
            if(id == 0) break;
            else {

        switch (id) {
            case 1:
                student1.getInfo();
                break;
            case 2:
                student2.getInfo();
                break;
            case 3:
                student3.getInfo();
                break;
            case 4:
                student4.getInfo();
                break;
            case 5:
                student5.getInfo();
                break;
            default:
                System.out.println("defoult");
            }
        }*/


        Flower flower1 = new Flower();
        flower1.name = "Tulipa";
        flower1.price = 500;
        flower1.colour = "white";

        Flower flower2 = new Flower();
        flower2.name = "Tulipa";
        flower2.price = 470;
        flower2.colour = "yellow";

        Flower flower3 = new Flower();
        flower3.name = "Tulipa";
        flower3.price = 560;
        flower3.colour = "red";


        Flower flower4 = new Flower();
        flower4.name = "Rose";
        flower4.price = 600;
        flower4.colour = "pink";

        Flower flower5 = new Flower();
        flower5.name = "Rose";
        flower5.price = 700;
        flower5.colour = "blue";

        Flower flower6 = new Flower();
        flower6.name = "Rose";
        flower6.price = 800;
        flower6.colour = "red";

        Flower[] flowers = {flower1,flower2,flower3,flower4,flower5,flower6};
        getMaxPrice(flowers);
        separateFlowers(flowers);
    }

    public static void getMaxPrice(Flower[] flowers){
        int maxPrice = 0;
        for (Flower flower:flowers) {
            if(flower.price > maxPrice) maxPrice = flower.price;
        }
        System.out.println("Max Price : " + maxPrice);
    }

    public static void separateFlowers(Flower[] flowers){
        int roseCounter = 0, tulpanCounter = 0;
        for (Flower flower : flowers) {
            if(flower.name.equals("Rose")) roseCounter++;
            else tulpanCounter++;
        }
        Flower[] roses = new Flower[roseCounter];
        Flower[] tulpans = new Flower[tulpanCounter];

        for (int i = 0,k=0,j=0; i < flowers.length; i++) {
            if(flowers[i].name.equals("Rose")) {
                roses[k] = flowers[i];
                k++;
            }else {
                tulpans[j] = flowers[i];
                j++;
            }
        }
        System.out.println("Roses : " + Arrays.toString(roses));
        System.out.println("Tulpans : " + Arrays.toString(tulpans));


    }



}
