public class CinemaTicket {
    static String cinemaName = "Multikino";
    String filmTitle;
    int row;
    int seat;
    float price;

    public CinemaTicket(String filmTitle, int row, int seat) {
        this.filmTitle = filmTitle;
        this.row = row;
        this.seat = seat;
        if(row == 1 || row == 2){
            price = 10f;
        } else {
            price = 25f;
        }
    }
    String displayTicket(){
        return "Cinema: " + cinemaName + "\nFilm: " + filmTitle + "\nRow: " + row + "\nSeat: " + seat + "\nPrice: " + price;
    }
}
