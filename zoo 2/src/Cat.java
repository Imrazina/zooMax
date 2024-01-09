public class Cat extends Animal implements Domastic {

  private String klikucha;
  private String person;
  private String address;

  public Cat(String klikucha, String person, String address) {
    super(4, "Cat", "Meow");
    this.klikucha = klikucha;
    this.person = person;
    this.address = address;
  }

  public String getKlikucha() {
    return klikucha;
  }

  public void setKlikucha(String klikucha) {
    this.klikucha = klikucha;
  }

  @Override
  public String toString() {
    return this.getKlikucha() + " is: " + this.getName() +
        ":legNumber is " + this.getLegNumber() + " and pronounce='" + this.getPronounce() + '\'';
  }

  @Override
  public void setPerson(String personName) {
    this.person = personName;
  }

  @Override
  public String getPerson() {
    return this.person;
  }

  @Override
  public void setAddress(String address) {
    this.address = address;
  }

  @Override
  public String getAddress() {
    return this.address;
  }
}
