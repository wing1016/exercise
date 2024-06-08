public class Stadium {
  private String name;
  private int numOfSeat;
  private int tktPrice;

  public Stadium() {}

  public Stadium(String n, int s, int p) {
    this.name = n;
    this.numOfSeat = s;
    this.tktPrice = p;
  }

  public void setName(String n) {
    this.name = n;
  }

  public void setNumOfSeat(int s) {
    this.numOfSeat = s;
  }

  public void setTktPrice(int p) {
    this.tktPrice = p;
  }

  public String getName() {
    return this.name;
  }

  public int getNumOfSeat() {
    return this.numOfSeat;
  }

  public int getTktPrice() {
    return this.tktPrice;
  }

  public String toString() {
    return "Name : " + this.name + ", Tkt Price : " + this.tktPrice + ", Seat : "
        + this.numOfSeat;
  }

  public static void main(String[] args) {
    Stadium c = new Stadium("Olympic Stadium", 30000, 250);
    System.out.println(c.toString());

    //Using fullHouseIncome from class "Cinema"
    System.out.println(Cinema.fullHouseIncome(30000, 250));
  }

}
