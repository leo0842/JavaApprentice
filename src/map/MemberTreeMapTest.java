package map;

public class MemberTreeMapTest {

  public static void main(String[] args) {
    MemberTreeMap memberTreeMap = new MemberTreeMap();

    Member member1 = new Member(1, "Lee");
    Member member2 = new Member(2, "Kim");
    Member member3 = new Member(3, "Park");

    memberTreeMap.treeMap.put(member1.getMemberId(), member1);
    memberTreeMap.treeMap.put(member2.getMemberId(), member2);
    memberTreeMap.treeMap.put(member3.getMemberId(), member3);

    memberTreeMap.showInfo();
  }




}
