public class Crocodile extends Animal implements Reptile{

  public Crocodile() {
    super(4, "crocodile", "Rrrrrrrrr");
  }

  @Override
  public int skinCost() {
    return 2000;
  }

  @Override
  public String toString() {
    return super.toString() + this.skinCost();
  }
}
