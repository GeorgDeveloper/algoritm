public class ListNode {
    int value;
    ListNode next;

    public ListNode() {
    }
    public ListNode(int value) {
        this.value = value;
    }

    public ListNode(int value, ListNode next) {
        this.value = value;
        this.next = next;
    }

//Реализовать следующие методы

    /**
     * Посчитать размер списка.
     */
    static int size(ListNode head) {
        int cnt = 0;
        if (head.next != null) {
            ListNode iter = head;
            while (iter != null) {
                cnt++;
                iter = iter.next;
            }
        } else {
            throw new UnsupportedOperationException("Пустой список");
        }
        return cnt;
    }

    /**
     * Написать строковое представление списка в формате
     * [first_value -> second_value -> ... -> last_value]
     */
    static String asString(ListNode head) {
        StringBuilder stb = new StringBuilder();
        if (head.next != null) {
            ListNode iter = head;
            stb.append('[');
            while (iter != null) {
                if (iter.next != null) {
                    stb.append(iter.value);
                    stb.append(' ');
                    iter = iter.next;
                } else {
                    stb.append(iter.value);
                    iter = null;
                }
            }
            stb.append(']');
        } else {
            throw new UnsupportedOperationException("Пустой список");
        }
        return stb.toString();
    }

    /**
     * Найти значение по индексу
     */
    static int getByIndex(ListNode head, int index) {
        int cnt = 0;
        int res = -1;
        if (head.next != null) {
            ListNode iter = head;
            while (iter != null) {
                if (cnt == index){
                    res = iter.value;
                }
                cnt++;
                iter = iter.next;

            }
        } else {
            throw new UnsupportedOperationException("Пустой список");
        }
        if (res != -1){
            return res;
        } else {
            throw new IndexOutOfBoundsException("Индекс не найден");
        }

    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(4)))); // 1 -> 2 -> 2 -> 4
//        ListNode node = new ListNode();
        System.out.println(size(node)); // 4
        System.out.println(asString(node)); // [1 -> 2 -> 2 -> 4]

        System.out.println(getByIndex(node, 0)); // 1
        System.out.println(getByIndex(node, 3)); // 4
        System.out.println(getByIndex(node, 4)); // new IndexOutOfBoundsException
    }
}
