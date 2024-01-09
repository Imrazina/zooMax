public abstract class Animal {

  private int legNumber;
  private String name;
  private String pronounce;

  public Animal(int legNumber, String name, String pronounce) {
    this.legNumber = legNumber;
    this.name = name;
    this.pronounce = pronounce;
  }

  public int getLegNumber() {
    return legNumber;
  }

  public void setLegNumber(int legNumber) {
    this.legNumber = legNumber;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPronounce() {
    return pronounce;
  }

  public void setPronounce(String pronounce) {
    this.pronounce = pronounce;
  }

  @Override
  public String toString() {
    return name +
        ":legNumber is " + legNumber + " and pronounce='" + pronounce + '\'';
  }
}
