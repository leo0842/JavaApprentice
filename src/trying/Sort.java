package trying;

public interface Sort {

  void ascending();

  void descending();

  String description();

  default String together(){
    ascending();
    descending();
    return description();
  }

}
