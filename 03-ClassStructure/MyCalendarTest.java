public class MyCalendarTest {
    public static void main(String[] args) {
        MyCalendar.year = 2021;
        MyCalendar.month = 9;
        MyCalendar.day = 15;
        System.out.println(MyCalendar.myDate());
        System.out.println(MyCalendar.days());
        System.out.println(MyCalendar.month());
    }
}
