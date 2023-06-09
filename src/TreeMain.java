import java.util.ArrayList;
import java.util.List;

public class TreeMain {
    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.add(7);
        tree.add(3);
        tree.add(9);
        tree.add(2);
        tree.add(1);
        tree.add(5);
        tree.add(4);
        tree.add(6);
        tree.add(8);
        tree.add(10);
        tree.add(12);
        tree.add(11);
        tree.add(13);



        List<Integer> dfsOrderItems = new ArrayList<>();
        tree.dfs(dfsOrderItems::add);
//        tree.dfs(integer -> dfsOrderItems.add(integer));
        System.out.println(dfsOrderItems);

        List<Integer> bfsOrderItems = new ArrayList<>();
        tree.bfs(bfsOrderItems::add);
        System.out.println(bfsOrderItems);

//        System.out.println(tree.size());

//        System.out.println(tree.contains(5)); // true
//        System.out.println(tree.contains(2)); // true
//        System.out.println(tree.contains(10)); // true
//        System.out.println(tree.contains(-1)); // false
//        System.out.println(tree.contains(4)); // false
//
//        System.out.println(tree.findFirst()); // 1
//        tree.remove(1);
//        System.out.println(tree.findFirst()); // 2
//        tree.remove(2);
//        System.out.println(tree.findFirst()); // 3
//        tree.remove(3);
//
//        System.out.println(tree.findFirst()); // 4

        // dfs depth-first-search  // поиск в глубину
        // bfs breath-first-search // поиск в ширину
//        System.out.println(tree.findLast()); // 10
        System.out.println(tree.getChildrenCount()); // 5

    }

}
