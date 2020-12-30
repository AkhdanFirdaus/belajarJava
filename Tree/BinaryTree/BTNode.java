public class BTNode {
  BTNode left, right;
  Mahasiswa data;

  public BTNode() {
    left = null;
    right = null;
    data = null;
  }

  public BTNode(Mahasiswa n) {
    left = null;
    right = null;
    data = n;
  }

  public void setLeft(BTNode n) {
    left = n;
  }

  public void setRight(BTNode n) {
    right = n;
  }

  public BTNode getLeft() {
    return left;
  }

  public BTNode getRight() {
    return right;
  }

  public void setData(Mahasiswa d) {
    data = d;
  }

  public Mahasiswa getData() {
    return data;
  }
}
