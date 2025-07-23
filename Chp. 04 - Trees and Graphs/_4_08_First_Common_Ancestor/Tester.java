<<<<<<< HEAD

=======
// github.com/Basteen-A
>>>>>>> fc671dfccc4c844803cd16bc4e158dfcfa4a68fb

package _4_08_First_Common_Ancestor;

import common.TreeNode;
import common.TreeFunctions;

public class Tester {
    public static void main(String[] args) {
        TreeNode tree = TreeFunctions.createBST();
        System.out.println("*** Test 4.8: First Common Ancestor\n");
        System.out.println("Common ancestor (should be 5): " + FirstCommonAncestor.commonAnc(tree, tree.left, tree.right.right));
        System.out.println("Common ancestor (should be 8): " + FirstCommonAncestor.commonAnc(tree, tree.right, tree.right.left));
    }
}
