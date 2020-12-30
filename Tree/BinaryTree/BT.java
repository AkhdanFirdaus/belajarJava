public class BT {
  private BTNode root;

  public BT() {
    root = null;
  }

  public Boolean isEmpty() {
    return root == null;
  }

  public void insert(Mahasiswa data) {
    root = insert(root, data);
  }

  private BTNode insert(BTNode node, Mahasiswa data) {
    if (node == null)
      node = new BTNode(data);
    else {
      if (node.getRight() == null)
        node.right = insert(node.right, data);
      else
        node.left = insert(node.left, data);
    }
    return node;
  }

  public int countNodes() {
    return countNodes(root);
  }

  private int countNodes(BTNode r) {
    if (r == null)
      return 0;
    else {
      int i = 1;
      i += countNodes(r.getLeft());
      i += countNodes(r.getRight());
      return i;
    }
  }

  public boolean search(Mahasiswa val, Boolean byNim) {
    return search(root, val, byNim);
  }

  public boolean search(BTNode r, Mahasiswa val, Boolean byNim) {
    if (byNim) {
      if (r.getData().getNim() == val.getNim())
        return true;
    } else {
      if (r.getData().getNama().contains(val.getNama()))
        return true;

    }
    if (r.getLeft() != null)
      if (search(r.getLeft(), val, byNim))
        return true;
    if (r.getRight() != null)
      if (search(r.getRight(), val, byNim))
        return true;
    return false;
  }

  public void inorder() {
    inorder(root);
  }

  private void inorder(BTNode r) {
    if (r != null) {
      inorder(r.getLeft());
      System.out.println();
      r.getData().show();
      System.out.println();
      inorder(r.getRight());
    }
  }

  public void preorder() {
    preorder(root);
  }

  private void preorder(BTNode r) {
    if (r != null) {
      System.out.println();
      r.getData().show();
      System.out.println();
      preorder(r.getLeft());
      preorder(r.getRight());
    }
  }

  public void postOrder() {
    postOrder(root);
  }

  private void postOrder(BTNode r) {
    if (r != null) {
      postOrder(r.getLeft());
      postOrder(r.getRight());
      System.out.println();
      r.getData().show();
    }
  }
}
