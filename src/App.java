import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner tangentbord = new Scanner(System.in)){
            System.out.println("Hur långt har du till jobbet?");
            int KM = tangentbord.nextInt();
            System.out.println("Bor du med din partner?");
            tangentbord.nextLine();
            String sambo = tangentbord.nextLine();
            System.out.println("Hur länge varar din anställning?");
            int anst = tangentbord.nextInt();
            if ((KM>=50 && sambo.equalsIgnoreCase("ja")) && anst>=3)
            {
                System.out.println("Du får skatteavdrag");
            }
            else if(KM>=50 && sambo.equalsIgnoreCase("nej") && anst>=1)
            {
                System.out.println("Du får skatteavdrag");   
            }
            else
            {
                System.out.println("Du får inte skatteavdrag");
            }
            
            System.out.println("Ange en uträkning");
            tangentbord.nextLine();
            String uträkning = tangentbord.nextLine();
            int plats = uträkning.indexOf("+");
            String förstatal = uträkning.substring(0, plats);
            String andratal = uträkning.substring(plats+1);
            int a = Integer.parseInt(förstatal);
            int b = Integer.parseInt(andratal);
            b+=a;
            System.out.println(b);

            System.out.println("ange ditt första nummer");
            int nummer1 = tangentbord.nextInt();
            System.out.println("ange ditt andra nummer");
            int nummer2 = tangentbord.nextInt();
            System.out.println("ange ditt tredje nummer");
            int nummer3 = tangentbord.nextInt();
            int[] storlek = new int[3];
            System.out.println(storlek);
            if(nummer1>nummer2 && nummer1>nummer3)
            {
                storlek[2]=nummer1;
            }
            else if(nummer1<nummer2 &&nummer1<nummer2)
            {
                storlek[0]=nummer1;
            }
            

            
        }
    }
}
