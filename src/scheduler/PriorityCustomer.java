package scheduler;

public class PriorityCustomer implements Scheduler{

  @Override
  public void getNextCall() {
    System.out.println("get next call with priority customer");
  }

  @Override
  public void sendCallToAgent() {
    System.out.println("send call to agent who is veteran");
  }
}
