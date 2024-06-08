public class Cinema {
  private String name;
  private int numOfSeat;
  private int tktPrice;

  public Cinema() {}

  public Cinema(String n, int s, int p) {
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
    return "Name : " + this.name + ", Tkt Price : " + this.tktPrice
        + ", Seat : " + this.numOfSeat;
  }

  public static String fullHouseIncome(int numOfSeat, int tktPrice) {

    return "$" + numOfSeat * tktPrice;

  }


  public static void main(String[] args) {
    Cinema c = new Cinema("Boardway Cinema", 100, 80);

    System.out.println(c.toString());
    System.out.println(Cinema.fullHouseIncome(100, 80));
  }


}
