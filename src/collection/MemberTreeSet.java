package collection;

import java.util.TreeSet;

public class MemberTreeSet {

  private TreeSet<Member> memberTreeSet;

  public MemberTreeSet() {
    memberTreeSet = new TreeSet<>();
  }

  public void addMember(Member member) {
    memberTreeSet.add(member);
  }

  public boolean removeMember(int memberId) {
    for (Member member: memberTreeSet){
      if (member.getMemberId() == memberId) {
        memberTreeSet.remove(member);
        return true;
      }
    }
    return false;
  }

  @Override
  public String toString() {
    return "MemberTreeSet{" +
        "memberTreeSet=" + memberTreeSet +
        '}';
  }

  public TreeSet<Member> getMemberTreeSet() {
    return memberTreeSet;
  }
}
