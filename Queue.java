public class Queue {
    static int amount = 5000;
       public static class QNode {
       private int data;
       private QNode next;

        public QNode(int x) {
            this.data = x;
            this.next = null;
        }
        public QNode(){
        }
    }

    public QNode front = null;
    public QNode rear = null;

    public void withDurandDeposits(int x){
        QNode node = new QNode(x);
        if (front == null){
            System.out.println("Balance is Underflow and Empty");
            front = node;
        }else {
            rear.next = node;
        }
        rear = node;
        System.out.println("Successfully withDraw and Deposit the data : " + x);
    }

    /// Method to display 
    public void display() {
        if (front == null)
            System.out.println("No withDraws and Deposits is Empty");
        QNode temp = new QNode();
        temp = front;
        while (temp != null) {
            System.out.println(temp.data);
            amount = amount + (temp.data);
            temp = temp.next;
        }
        System.out.println("Total Balance is "+ amount);
    }

    //Method to push 
    public void withDrawAll(){
        if (front == null){
            System.out.println("Queue is Balance Underflow and Empty");
            return;
        }
        while (front != null){
            QNode temp = front;
            System.out.println("Successfully withDraws the data : " + front.data);
            front = front.next;
        }
        rear = null;
    }


    public void size(){
        if (front == null){
            System.out.println("Que is No withDraws and Deposits Empty Size is Zero");
            return;
        }
        int i=0;
        while (front != null) {
            i++;
            front = front.next;
        }
        System.out.println("Que is withDraws and Deposits is Size is " + i);
    }


    public static void main(String[] args) {
        Queue Que = new Queue();



        //Method to push nad remove int element in the Queue using front rear
        Que.withDurandDeposits(60);
        Que.withDurandDeposits(-100);
        Que.withDurandDeposits(70);
        Que.withDurandDeposits(-40);
        Que.display();


        //Method to find size
        Que.size();

        //Method to remove all
        Que.withDrawAll();


    }

}
