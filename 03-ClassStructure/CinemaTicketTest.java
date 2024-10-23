public class CinemaTicketTest {
    public static void main(String[] args) {
        CinemaTicket ticket1 = new CinemaTicket("Minionki rozrabiaja", 4, 5);
        CinemaTicket ticket2 = new CinemaTicket("Kac Wawa", 2, 9);
        System.out.println(ticket1.displayTicket());
        System.out.println(ticket2.displayTicket());
    }
}
