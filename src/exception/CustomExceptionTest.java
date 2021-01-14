package exception;

class Member{
  private String memberId;

  public String getMemberId() {
    return memberId;
  }

  public void setMemberId(String memberId) throws CustomException {
    if (memberId == null){
      throw new CustomException("null is prohibited");
    }
    else if (memberId.length() < 8 || memberId.length() > 20){
      throw new CustomException("Id length should be within 8 to 20");
    }
    this.memberId = memberId;
  }
}
public class CustomExceptionTest {

  public static void main(String[] args) {

    Member member = new Member();
    try {
      member.setMemberId("as");
    } catch (CustomException e) {
      System.out.println(e);
    }
  }
}
