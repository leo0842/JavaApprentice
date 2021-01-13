package generic;

public class Material<T extends BaseMaterial>{

  private T material;

  public T getMaterial() {
    return material;
  }

  public void setMaterial(T material) {
    this.material = material;
  }

  @Override
  public String toString() {
    return material.toString();
  }

  public void doPrinting() {
    material.doPrinting();
  }
}
