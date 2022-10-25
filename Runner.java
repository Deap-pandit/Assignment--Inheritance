
    import java.util.Scanner;

    public class Runner {

        public static void main(String[] args) {
            Clock myClock = new Clock();
            System.out.println("My time :" + myClock.getTime());

            Scanner scan= new Scanner(System.in);
            System.out.println(" Hou many hours ahead is your timezone ");
            int timezone = scan.nextInt();
            scan.close();
            WorldClock worldClck = new WorldClock(timezone);
            System.out.println( " MY time +" + timezone + ":"+worldClck.getTime());


        }
    }


