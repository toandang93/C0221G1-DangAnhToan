package bai_11_collectionFarmword.thuc_hanh.cai_dat_BST;

public class TreeNode<E> {
    protected E element;
    protected TreeNode<E> left;
    protected TreeNode<E> right;

    public TreeNode() {
    }

    public TreeNode(E e) {
        element = e;
    }
}
