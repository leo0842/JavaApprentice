package map;

import java.util.TreeMap;

public class MemberTreeMap {

  TreeMap<Integer, Member> treeMap;

  public MemberTreeMap() {
    treeMap = new TreeMap<>();
  }

  public TreeMap<Integer, Member> getTreeMap() {
    return treeMap;
  }

  @Override
  public String toString() {
    return "MemberTreeMap{" +
        "treeMap=" + treeMap +
        '}';
  }
  public void showInfo(){
    for (int memberId: treeMap.keySet()){
      System.out.println(treeMap.get(memberId));
    }
  }
}
