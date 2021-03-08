class Main {
  public static void main(String[] args) {
    Tree tree1 = new Tree();
    Tree tree2 = new Tree("maple","broadleaf",true, "red");

    tree1.display();
    tree2.display();

    tree1.setName("Spruce");
    tree1.setType("broadleaf");
    tree1.setFall(false);
    tree1.setColor("red");

    tree1.display();


  }
}