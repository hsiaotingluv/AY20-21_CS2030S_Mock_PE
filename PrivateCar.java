public class PrivateCar extends Cars {
  private String name = "PrivateCar";

  public PrivateCar(String liscensePlate, int time) {
    super(liscensePlate, time);
  }

  @Override
  public boolean checkService(Services service) {
    return (service instanceof JustRide) || (service instanceof ShareARide);
  }

  @Override
  public String toString() {
    String str = String.format("%s %s", this.name, super.toString());
    return str;
  }

}
