public class Booking implements Comparable<Booking> {
  private Cars car;
  private Services service;
  private Request request;
  private int fare;
  private int waitingTime;

  public Booking(Cars car, Services service, Request request) throws IllegalArgumentException {
    if (!car.checkService(service)) {
      throw new IllegalArgumentException(
          String.format("%s does not provide the %s service.", car.toString(), service.toString()));
    }
    this.car = car;
    this.service = service;
    this.request = request;
    this.fare = service.computeFare(request);
    this.waitingTime = car.getTime();
  }

  public int getFare() {
    return this.fare;
  }

  public int getWaitingTime() {
    return this.waitingTime;
  }

  @Override
  public int compareTo(Booking booking) {
    if (this.fare == booking.getFare()) {
      return this.waitingTime - booking.getWaitingTime();
    } else {
      return this.fare - booking.getFare();
    }
  }
}
