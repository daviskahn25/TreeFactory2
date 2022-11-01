public class Tree {

    public String size;
    public int red;
    public int green;
    public int blue;

    public String trunkcolor;

    public Tree(String pSize, int pRed, int pGreen, int pBlue, String pTrunk){
        size = pSize;
        red = pRed;
        green = pGreen;
        blue = pBlue;
        trunkcolor = pTrunk;
    }

    public void printinfo(){
        System.out.println("The tree is " +  size + " with " + red+"," + green+"," + blue + " leaves and a " + trunkcolor);
    }


}
