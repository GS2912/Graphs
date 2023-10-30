public class queue {
    
        public static class Node{
            int data;
            Node next;
    
             Node(int data){
                this.data=data;
                this.next=null;
            }
        }
    
        public static Node front;
        public static Node rear;
    
        Node push(int data){
            Node nn= new Node(data);
            if(front==null){
                front=nn;
                rear = front;
                return front;
            }
            
            rear.next = nn;
           rear = nn;
    
            return front;
        }
    
        int pop(){
             if(front==null){
                return -1;
            }
            int dt= front.data;
            front= front.next;
            return dt;
        }
    
        int peek(){
            if(front==null){
                return -1;
            }
            return front.data;
        }
    
    public static void main(String args[]){
        queue s = new queue();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(30);
        s.pop();
        s.pop();
        s.peek();
        s.push(100);
        s.peek();
    }
    
    }
