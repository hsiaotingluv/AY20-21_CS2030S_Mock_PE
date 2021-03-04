public class Cab extends Cars {
  private String name = "Cab";

  public Cab(String liscensePlate, int time) {
    super(liscensePlate, time);
  }

  public int getTime() {
    return super.getTime();
  }

  @Override
  public boolean checkService(Services service) {
    return (service instanceof JustRide) || (service instanceof TakeACab);
  }

  @Override
  public String toString() {
    String str = String.format("%s %s", this.name, super.toString());
    return str;
  }

}
