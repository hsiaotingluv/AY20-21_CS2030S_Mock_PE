public class Request {
  private int distance;
  private int numberOfPassengers;
  private int time;

  public Request(int distance, int numberOfPassengers, int time) {
    this.distance = distance;
    this.numberOfPassengers = numberOfPassengers;
    this.time = time;
  }

  public int getBaseFare(int fare) {
    return this.distance * fare;
  }

  public int getSurcharge(int fare, int startTime, int endTime) {
    if (this.time >= startTime && this.time <= endTime) {
      return fare;
    } else {
      return 0;
    }
  }

  public int getPaidFare(int fare) {
    return fare / this.numberOfPassengers;
  }

}
