/*   Created by IntelliJ IDEA.
 *   Author: Aman Kumar
 *   Date: 2/28/2021
 *   Time: 1:19 PM
 *   File: main.java
 */

public class main {
    public static void main(String[] args) {
        SinglyLinkedList object= new SinglyLinkedList();
        object.addFront(new Node(12));
        object.addFront(new Node(13));
        object.addFront(new Node(45));
        object.addLast(new Node(17));
        object.deleteFront();
        object.display();
        System.out.println(object);
    }
}
