private class Tree {

  {
    String treeName;
    String treeType;
    boolean leavesFall;
    String leafColor;
  }

  Tree() 
  {
    treeName = "";
    treeType = "";
    leavesFall = false;
    leafColor = "";
  }

  Tree(String aTreeName, String aTreeType, boolean aLeavesFall, String aLeafColor)
  {
    treeName = aTreeName;
    treeType = aTreeType;
    leavesFall = aLeavesFall;
    leafColor = aLeafColor;
  }

  public void setName(String theName){
    this.name = theName;
  }

  public void setType(String theType){
    this.name = theType;
  }

  public void setFall(boolean theFall){
    this.name = theFall;

  }

  public void setColor(String theColor){
    this.name = theColor;
  }

  public String getName(){
    return tName;
  }

  public String getType(){
    return tType;
  }

  public String getFall(){
    return tFall;
  }

  public String getColor(){
    return tColor;
  }

  String print()
  {
    System.out.println("This is a " + getName.theName + ". It is a " + getType.theType + " and it's leaves are currently " + getColor.theColor + ". It " + (getFall.theFall == true ? "does" : "does not") + " lose it's leaves in the winter.");
  }


}













  
