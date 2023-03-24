public class Main {
    static public void main(String[] args) {
        LinkList list = new LinkList();
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst("two");
        list.addFirst(1);
        list.addFirst(0);
        list.addLast("five");
        list.addLast(6);
        list.add(6, "insert");
        list.remove(1);
        System.out.print("List: "); list.printLinkList();
        System.out.println("First: " + list.getFirst());
        System.out.println("Last: " + list.getLast());
        System.out.println("Size: " + list.getSize());
        System.out.println("Get element: " + list.get(5));
        //list.clear();
        //System.out.print("List: "); list.printLinkList();
    }
}
