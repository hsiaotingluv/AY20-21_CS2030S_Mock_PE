public class ShareARide implements Services{
  private String name = "ShareARide";

  public ShareARide() {
  }

  @Override
  public int computeFare(Request request) {
    int baseFare = request.getBaseFare(50) + request.getSurcharge(500, 600, 900);
    int paidFare = request.getPaidFare(baseFare);

    return paidFare;
  }

  @Override
  public String toString() {
    return this.name;
  }

}
