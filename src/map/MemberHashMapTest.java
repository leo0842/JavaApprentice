package map;

public class MemberHashMapTest {

  public static void main(String[] args) {

    MemberHashMap memberHashMap = new MemberHashMap();
    Member member1 = new Member(1, "Lee");
    Member member2 = new Member(2, "Kim");
    Member member3 = new Member(3, "Park");
    Member member4 = new Member(3, "Park2");
    memberHashMap.addMember(member1);
    memberHashMap.addMember(member2);
    memberHashMap.addMember(member3);
    memberHashMap.addMember(member4);
    memberHashMap.showInfo();
    System.out.println(memberHashMap);
    memberHashMap.removeMember(2);
    System.out.println(memberHashMap);
    System.out.println(memberHashMap.getHashMap().values());
  }

}
