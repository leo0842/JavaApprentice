package map;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {

  private HashMap<Integer, Member> hashMap;

  public MemberHashMap() {
    hashMap = new HashMap<>();
  }

  public void addMember(Member member) {
    hashMap.put(member.getMemberId(), member);
  }

  public void removeMember(int memberId) {
    if (hashMap.containsKey(memberId)) {
      hashMap.remove(memberId);
    } else {
      System.out.println("not member");
    }
  }
  public void showInfo(){
    Iterator<Integer> ir = hashMap.keySet().iterator();
    while (ir.hasNext()){
      int key = ir.next();
      System.out.println(hashMap.get(key));
    }
  }

  @Override
  public String toString() {
    return "MemberHashMap{" +
        "hashMap=" + hashMap +
        '}';
  }

  public HashMap<Integer, Member> getHashMap() {
    return hashMap;
  }
}
