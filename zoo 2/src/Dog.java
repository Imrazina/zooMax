public class Dog extends Animal implements Domastic{

  private String person;

  public Dog(String person) {
    super(4, "dog", "Gaw");
    this.person = person;
  }

  @Override
  public void setPerson(String personName) {
    System.out.println("Byte!");
  }

  @Override
  public String getPerson() {
    return person;
  }

  @Override
  public void setAddress(String address) {
  }

  @Override
  public String getAddress() {
    return "Konura";
  }
}
