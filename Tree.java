class Tree {

  {
    String treeName;
    String treeType;
    boolean leavesFall;
    String leafColor;
  }

  Tree() {
    treeName = "";
    treeType = "";
    leavesFall = false;
    leafColor = "";
  }

  Tree(String aTreeName, String aTreeType, boolean aLeavesFall, String aLeafColor) {
    treeName = aTreeName;
    treeType = aTreeType;
    leavesFall = aLeavesFall;
    leafColor = aLeafColor;
  }

  public void setName(String aTreeName) {
    name = treeName;
  }

  public void setType(String aTreeType) {
    name = treeType;
  }

  public void setFall(boolean aLeavesFall) {
    name = leavesFall;

  }

  public void setColor(String aLeafColor) {
    name = leafColor;
  }

  public String getName() {
    return treeName;
  }

  public String getType() {
    return treeType;
  }

  public String getFall() {
    return leavesFall;
  }

  public String getColor() {
    return leafColor;
  }

  String print() {
    System.out.println("This is a " + getName.treeName + ". It is a " + getType.treeType
        + " and it's leaves are currently " + getColor.leafColor + ". It "
        + (getFall.leavesFall == true ? "does" : "does not") + " lose it's leaves in the winter.");
  }

}
