public class TakeACab implements Services {
  private String name = "TakeACab";

  public TakeACab() {
  }

  @Override
  public int computeFare(Request request) {
    int paidFare = request.getBaseFare(33) + request.getSurcharge(200, 0, 2359);

    return paidFare;
  }

  public String toString() {
    return this.name;
  }

}
