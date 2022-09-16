class Main {
  public static void main(String[] args) {

    Box one = new Box();
    Box two = new Box("red");
    Box three = new Box ("blue", true, false);
    
    one.close();
    one.open();
    one.tellColor();
    one.changeColor("Yellow");
    System.out.println(one);
    
    
  }
}
