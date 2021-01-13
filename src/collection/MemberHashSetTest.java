package collection;

public class MemberHashSetTest {

  public static void main(String[] args) {
    MemberHashSet memberHashSet = new MemberHashSet();
    Member member1 = new Member(1, "Lee");
    Member member2 = new Member(2, "Kim");
    Member member3 = new Member(3, "Park");
    Member member4 = new Member(3, "Park");

    memberHashSet.addMember(member1);
    memberHashSet.addMember(member2);
    memberHashSet.addMember(member3);
    memberHashSet.addMember(member4);
    for (Member member: memberHashSet.getHashSet()) {
      System.out.println(member);
    }
    System.out.println(memberHashSet);
    memberHashSet.removeMember(2);
    memberHashSet.removeMember(4);
    System.out.println(memberHashSet);
  }

}
