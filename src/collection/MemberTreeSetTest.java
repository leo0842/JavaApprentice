package collection;

public class MemberTreeSetTest {

  public static void main(String[] args) {
    MemberTreeSet memberTreeSet = new MemberTreeSet();
    Member member1 = new Member(1, "Lee");
    Member member2 = new Member(2, "Kim");
    Member member3 = new Member(3, "Park");
    Member member4 = new Member(3, "Park");

    memberTreeSet.addMember(member1);
    memberTreeSet.addMember(member2);
    memberTreeSet.addMember(member3);
    memberTreeSet.addMember(member4);
    System.out.println(memberTreeSet);
    System.out.println(memberTreeSet.removeMember(2));
    System.out.println(memberTreeSet);

  }

}
