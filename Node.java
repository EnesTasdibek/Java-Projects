import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


class BinarySrcTree extends BinarySearchTree{


//call parent

public BinarySrcTree() {
        
    
    super();
    }



//(Collins, page 434)

static void leftRotate(Node n){

n.right = n.left;
n.left = n;
}



static void fullLeft(Node n){


//iterate(?)

while (n != null) {
    leftRotate(n);
}


}


static void rightRotate(Node n){
    
n.left = n.right;
n.right = n;

}

static void fullRight(Node n){



while (n != null) {
    rightRotate(n);
}



}



/*returns whether a tree is balanced or not. If it is balanced, it returns a 0. If
the left subtree is unbalanced, it returns a negative value, and the actual value will be the
node number (counting from the root) of the unbalanced node. If the right subtree is
unbalanced, it returns a positive value, calculated the same way. */
   

//(Collins, page 80)

public int balance(Node n){




    if(n == null){

    return 0;
}

int leftsubtree = balance(n.left);
 

if (leftsubtree == -1){
return -1;
    
 }
  
   int rightsubtree = balance(n.left);
 

if (rightsubtree == 1 ){
return 1;
    
 }




else{

    return Math.min(rightsubtree, leftsubtree) ;
}
}

}

////////////////////////////////////////////////////////////////////////////////

// Below code referred from https://www.geeksforgeeks.org/binary-search-tree-set-1-search-and-insertion/

class Node {
	int key;
	Node left, right;

	public Node(int item) {
		key = item;
		left = right = null;
	}
}

class BinarySearchTree {
	 Node root;

	// Constructor
	BinarySearchTree() {
		root = null;
        
	}

	// A utility function to insert
	// a new node with given key in BST
	Node insert(Node node, int key) {
		// If the tree is empty, return a new node
		if (node == null) {
			node = new Node(key);
			return node;
		}

		// Otherwise, recur down the tree
		if (key < node.key)
			node.left = insert(node.left, key);
		else if (key > node.key)
			node.right = insert(node.right, key);

		// Return the (unchanged) node pointer
		return node;
	}

	// Utility function to search a key in a BST
	Node search(Node root, int key) {
		// Base Cases: root is null or key is present at root
		if (root == null || root.key == key)
			return root;

		// Key is greater than root's key
		if (root.key < key)
			return search(root.right, key);

		// Key is smaller than root's key
		return search(root.left, key);
	}




	// Driver Code
	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();


	







System.out.println("Enter the filepath");

 Scanner keyboard = new Scanner(System.in);
    
    
    System.out.println("Enter file directory");
    String fileDir = keyboard.nextLine();



        Scanner scanner;
        try {
            scanner = new Scanner(new File(fileDir));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return;
        }

        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            System.out.println(number);
        
        tree.root = tree.insert(tree.root, number);
        }





System.out.println("Search a number");



        int NUM = keyboard.nextInt();


        // Key to be found
int key = NUM;


    BinarySrcTree tree2 = new BinarySrcTree();


Node n = new Node(key);

       System.out.println(tree2.balance(n));

if(tree2.balance(n) == 0){

    System.out.println("Balanced");
}


		// Searching in a BST
		if (tree.search(tree.root, key) == null)
			System.out.println(key + " not found");
		else
			System.out.println(key + " found");

	
	}
}
