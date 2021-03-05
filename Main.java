class Main {
  public static void main(String[] args) {
    Tree tree1 = new Tree();
    Tree tree2 = new Tree("maple","broadleaf",true, "red");

    print(tree1);
    print(tree2);

    tree1.setName("Spruce");
    tree1.setType("broadleaf");
    tree1.setFall(false);
    tree1.setColor("red");

    print(tree1);


  }
}