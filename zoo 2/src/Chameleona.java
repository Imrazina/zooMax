public class Chameleona extends Animal implements Domastic, Reptile {

  private String person;
  private String address;

  public Chameleona() {
    super(4, "Chameleon", "la;skjdfnbgsd;");
    this.person = "Resonance";
    this.address = "Cz";
  }

  @Override
  public void setPerson(String personName) {
  }

  @Override
  public String getPerson() {
    return this.person;
  }

  @Override
  public void setAddress(String address) {
  }

  @Override
  public String getAddress() {
    return address;
  }

  @Override
  public int skinCost() {
    return 20;
  }

  @Override
  public String toString() {
    return "Chameleona{" +
        "person='" + person + '\'' +
        ", address='" + address + '\'' +
        + this.skinCost() +
        "} " + super.toString();
  }
}
