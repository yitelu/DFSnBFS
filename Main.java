class Main {


  public static void main(String[] args) {

    Node tree = sampleTree();
    System.out.println("this is BFS");
    bfs.traversal(tree);
    System.out.println("this is DFS");
    dfs.traversal(tree);
  }

  private static Node sampleTree(){

    Node root = new Node("A",
                new Node("B",
                    new Node("C"), new Node("D")),
                new Node("E",
                    new Node("F"), new Node("G",
                                  new Node("H"), null)));

    /*
    **                   A
    **                 /   \
    **                B     E
    **              /  \    /  \
    **             C    D  F    G
    **                           \
    **                            H
    **
    */                          

    return root;
  }
}