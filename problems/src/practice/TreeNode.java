package practice;

public class TreeNode {


   public static class Node{
        Node next;
        int val;
        public  Node (int val){
            this.val =val;
        }
    }
    public  static  void tree(Node head){
        Node fast;
        Node slow;
        fast =head;
        slow = head;
       Node second ;
        while(fast!=null&&fast.next.next!=null){

            slow =slow.next;
            fast =fast.next.next ;

            }
        second =slow;
        Node reSecond = ReverseList(slow);
        Node output =null;
        while(head.next!=null){
          output= head ;


        }





    }

    public static  Node ReverseList(Node head){
        Node prev =null;
        Node cur ;
        Node next;
        cur =head;
        while (cur!=null){
            next = cur.next;
            cur.next = prev;
            prev= cur;
            cur = next;
            }
      return prev;
    }
    public  static Node Mergelist(Node a , Node b){
        Node result = null;
        if(a==null) return  b;
        if(b==null)  return a;
        if(a.val<=b.val){
              result = a;
              result.next = Mergelist(  a.next, b);

        }else {
            result = b;
            result.next = Mergelist(a, b.next);
        }


       return result ;
    }


    public static Node merge(Node a, Node b){

      if(a==null) return  b;
      if(b==null) return  a;
      Node mergeNode =null;
      Node current = null;
      if(a.val<=b.val){
          mergeNode =a ;
          a=a.next;
      } else{
          mergeNode =b;
          b=b.next;
      }
        current =mergeNode;
      while (a!=null && b !=null){
          if(a.val<=b.val){
              current.next =a;
              a=a.next;
          }else{
              current.next =b ;
              b=b.next;
          }
               current=current.next;
      }
      if(a==null){
          current.next=b;
      }

      else {
          current.next=a;
      }

      return mergeNode ;



    }


    public static  Node findFirstCommonNode(Node head1, Node head2){
            Node curren1= head1;
            while (curren1!=null){
                Node current2 =head2;
                 while (curren1!=null){
                     if (curren1==current2) {
                         return curren1;
                     }
                    current2 = current2.next;
                 }
                curren1 =curren1.next;

            }
          return  null;
    }

    public  static Node findCommUseStack(Node head1, Node head2){
            Stack<Node> stack1 =new Stack<>();
            Stack<Node> stack2 = addToStack(head2);
            Node cur1 =head1;
            Node cur2 =head2;
            while (cur1!=null){
                stack1.push(cur1);
                cur1=cur1.next;
            }
            while (!stack1.empty()&& !stack2.empty()){
                Node temp =null;
                if(stack1.peek()==stack2.peek()) {
                      temp= stack1.pop();

                    stack2.pop();

                }
                if (stack1.peek()!=stack2.peek())
                    return  temp;

            }


           return null;
    }
    public  static  Stack<Node> addToStack(Node head) {
          Stack<Node>  stack = new Stack<>();
          Node current = head;
          while (current!=null) {
              stack.push(current);
              current =current.next;

          }

       return  stack;
    }


     public  int getLength(Node head) {

       Node  current = head ;
       int i =0 ;
       while (current!=null){
           i++;
           current =current.next;
       }

      return  i;

     }



    public static void main(String[] args) {
        Node a =new Node(3) ;
        Node b =new Node(4) ;
        Node c =new Node(5) ;
        a.next = b;
        b.next = c;
//        System.out.println(a.next.val);
      Node d= ReverseList(a);
//       Node e = null;
//       Node head = d;
//           while (d!=null){
//                e= d;
////               System.out.println(d.val);
//               d=d.next;
////               e= e.next;
//
//
//           }
                Node m =new Node(1) ;
                 Node n =new Node(  1 );
                 Node k =new Node(2) ;
                 m.next =n;
                 n.next= k;
//                    Node f =   Mergelist(a,m) ;
//            while (f!=null){
//                System.out.println(f.val);
//                f=f.next;
//
//     }
            while (d!=null){
                System.out.println(d.val);
                d =d.next ;
            }



    }






}
