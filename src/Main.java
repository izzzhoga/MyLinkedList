public class Main {
    static public void main(String[] args) {
        LinkList list = new LinkList();
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.addFirst(0);
        list.addLast(5);
        list.addLast(6);
        list.add(6, "insert");
        list.remove(1);
        list.printLinkList();
        System.out.println("First: " + list.getFirst());
        System.out.println("Last: " + list.getLast());
        System.out.println("Size: " + list.getSize());
    }
}
