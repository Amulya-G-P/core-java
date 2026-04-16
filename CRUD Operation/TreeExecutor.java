class TreeExecutor
{
    public static void main(String[] args) {

        Tree t = new Tree();
        boolean added;

        added = t.addTree("Neem");
        System.out.println(added);
        added = t.addTree("Mango");
        System.out.println(added);
        added = t.addTree("Banyan");
        System.out.println(added);
        added = t.addTree("Peepal");
        System.out.println(added);
        added = t.addTree("Coconut");
        System.out.println(added);
        added = t.addTree("Teak");
        System.out.println(added);
        added = t.addTree("Sandalwood");
        System.out.println(added);
        added = t.addTree("Oak");
        System.out.println(added);
        added = t.addTree("Pine");
        System.out.println(added);
        added = t.addTree("Maple");
        System.out.println(added);

        t.getTrees();

        String tree = t.getTreeByName("Neem");
        System.out.println(tree + " is available");

        boolean updated = t.updateTree("Oak", "Red Oak");
        System.out.println(updated);

        t.getTrees();

        boolean deleted = t.deleteTree("Pine");
        System.out.println(deleted + " is deleted");

        t.getTrees();
    }
}