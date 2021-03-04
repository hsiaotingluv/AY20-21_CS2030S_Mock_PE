public class JustRide implements Services {
  private String name = "JustRide";

  public JustRide() {
  }

  @Override
  public int computeFare(Request request) {
    int paidFare = request.getBaseFare(22) +
        request.getSurcharge(500, 600, 900);

    return paidFare;
  }

  public String toString() {
    return this.name;
  }

}
