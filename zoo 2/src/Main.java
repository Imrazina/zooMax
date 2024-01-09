public class Main {

  public static void main(String[] args) {
    Cat lord = new Cat("Lord", "Ann", "House");
    Dog dog = new Dog("Dan");
    Crocodile crocodile = new Crocodile();
    Cat destroyer = new Cat("Lifkas", "Dc. Fufelshmerc", "Fufelshmerc Evil Corporated");
    Cat newbee = new Cat("Faith", "Barbarossa", "Brnishe");
    newbee.setLegNumber(5);
    Chameleona chameleona = new Chameleona();

    System.out.println(lord);
    System.out.println(dog);
    System.out.println(crocodile);
    System.out.println(destroyer);
    System.out.println(newbee);
    System.out.println(chameleona);
  }
}