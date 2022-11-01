public class RunTreeProgram {

    public static void main(String[] args) {
        RunTreeProgram runTree = new RunTreeProgram();

    }

    public RunTreeProgram(){
        Tree first;
        first = new Tree("big", 255, 0, 0, "blue trunk");
        first.printinfo();

        Tree second;
        second = new Tree("small",230,230,250, "blue trunk");
        second.printinfo();

    }
}
