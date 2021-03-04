public abstract class Cars {
  private String liscensePlate;
  private int time;

  public Cars(String liscensePlate, int time) {
    this.liscensePlate = liscensePlate;
    this.time = time;
  }

  public int getTime() {
    return this.time;
  }

  public abstract boolean checkService(Services service);

  @Override
  public String toString() {
    String str = "";
    if (this.time <= 1) {
      str = String.format("%s (%d min away)", this.liscensePlate, this.time);
    } else {
      str = String.format("%s (%d mins away)", this.liscensePlate, this.time);
    }
    return str;
  }
}
