package scheduler;

public class LeastWaiting implements Scheduler{

  @Override
  public void getNextCall() {
    System.out.println("get next call from waiting");
  }

  @Override
  public void sendCallToAgent() {
    System.out.println("send call to agent who has least waiting");
  }
}
