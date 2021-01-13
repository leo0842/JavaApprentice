package collection;

import java.util.HashSet;

public class MemberHashSet {

  private HashSet<Member> hashSet;

  public MemberHashSet() {
    hashSet = new HashSet<>();
  }

  public void addMember(Member member) {
    hashSet.add(member);
  }


  public boolean removeMember(int memberId) {
    for (Member member : hashSet) {
      if (member.getMemberId() == memberId) {
        hashSet.remove(member);
        return true;
      }
    }
    return false;


  }

  @Override
  public String toString() {
    return "MemberHashSet{" +
        "hashSet=" + hashSet +
        '}';
  }

  public HashSet<Member> getHashSet() {
    return hashSet;
  }
}
