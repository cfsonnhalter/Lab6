import java.awt.print.Printable;

class Tree {

  private String treeName;
  private String treeType;
  private boolean leavesFall;
  private String leafColor; // creates instance variables for each attribute

  Tree() {
    treeName = " ";
    treeType = " ";
    leavesFall = false;
    leafColor = " "; // Tree constructor assigns blank values to the variables
  }

  Tree(String aTreeName, String aTreeType, boolean aLeavesFall, String aLeafColor) {
    treeName = aTreeName;
    treeType = aTreeType;
    leavesFall = aLeavesFall;
    leafColor = aLeafColor; // this Tree contructor defines the origianl variables as the variables in our
                            // set statements
  }

  void setName(String aTreeName) {
    treeName = aTreeName;
  }

  void setType(String aTreeType) {
    treeType = aTreeType;
  }

  void setFall(boolean aLeavesFall) {
    leavesFall = aLeavesFall;
  }

  void setColor(String aLeafColor) {
    leafColor = aLeafColor; // these methods allows the variables to be assigned values
  }

  String getName() {
    return treeName;
  }

  String getType() {
    return treeType;
  }

  boolean getFall() {
    return leavesFall;
  }

  String getColor() {
    return leafColor; // these methods allow for the display method to retrieve the variables from the
                      // assigned value
  }

  public String display() {
    if (aLeavesFall == true) {
      return "This is a " + Tree.getName() + " tree. It is a " + Tree.getType() + " and its leaves are currently " + Tree.getColor() + ". It does lose its leaves in the winter.";
    } else {
      return "This is a " + Tree.getName() + " tree. It is a " + Tree.getType() + " and its leave are currently " + Tree.getColor() + ". It does NOT lose its leaves in the winter.";
    }

  }
}
