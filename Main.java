class Main {
  public static void main(String[] args) {
    Tree tree1 = new Tree();    // creates a new object tree1 
    Tree tree2 = new Tree("maple","broadleaf",true, "red");  // creates a new object tree2 and assigns its variables value

    tree1.display();
    tree2.display(); //runs display or print message on the tree objects

    tree1.setName("Spruce");
    tree1.setType("broadleaf");
    tree1.setFall(false);
    tree1.setColor("red");  //these assign values to the variables of tree1

    tree1.display(); //runs the display method with the new values of tree1


  }
}