package scheduler;

import java.io.IOException;

public class SchedulerTest {

  public static void main(String[] args) throws IOException {
    System.out.println("choice");
    System.out.println("R: RoundRobin, L: LeastWaiting, P: PriorityCustomer");
    int choice = System.in.read();
    Scheduler scheduler;
    if (choice == 'R'){
      scheduler = new RoundRobin();
    }
    else if (choice == 'L'){
      scheduler= new LeastWaiting();
    }
    else if (choice == 'P'){
      scheduler = new PriorityCustomer();
    }
    else{
      scheduler = new RoundRobin();
    }

    scheduler.getNextCall();
    scheduler.sendCallToAgent();
  }

}
