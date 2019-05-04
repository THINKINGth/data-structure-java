/*
 * Java 实现单链表
 */
package LList;
class Node{
    private String elem = null;
    private Node next = null;
    public Node(String e, Node n)
    {
        this.elem = e;
        this.next = n;
    }
    public Node getNext(){
        return this.next;
    }
    public String getElem(){
        return this.elem;
    }
    public void setElem(String s){
        this.elem = s;
    }
    public void setNext(Node node){
        this.next = node;
    }
}
class LList {
    private Node head = null;
    public boolean is_empty(){
        if (this.head == null){
            return true;
        }
        else{
            return false;
        }
    }

    public void append(Node node){
        if(is_empty()){
            this.head = node;
        }
        else {
            Node p = this.head;
            while(p.getNext() != null){
                p = p.getNext();
            }
            p.setNext(node);
        }
    }

    public void first_append(Node node){
        if(is_empty()){
            this.head = node;
        }
        else{
            node.setNext(this.head);
            this.head = node;
        }
    }

    public String pop(){
        if(is_empty()){
            return "错误，单链表为空";
        }
        Node p = this.head;
        if(p.getNext() == null){
            String s = p.getElem();
            p.setNext(null);
            return s;
        }
        while (p.getNext().getNext() != null) {
            p = p.getNext();
        }
        String s = p.getNext().getElem();
        p.setNext(null);
        return s;
    }

    public String first_pop(){
        if(is_empty()){
            return "错误，单链表为空";
        }
        String s = this.head.getElem();
        this.head = this.head.getNext();
        return s;
    }

    public int length(){
        Node p = this.head;
        int times = 0;
        while(p != null){
            times += 1;
            p = p.getNext();
        }
        return times;
    }

    public void print(){
        Node p = this.head;
        while(p != null){
            System.out.print(p.getElem() + " ");
            p = p.getNext();
        }
    }

    public void sorting(){
        Node p = this.head;
        if((p == null)&&(p.getNext() == null)){
            return;
        }
        Node crt = p.getNext();
        while(crt != null){
            String s = crt.getElem();
            p = this.head;
            while((!p.equals(crt))&&(Integer.parseInt(p.getElem()) < Integer.parseInt(s))){
                p = p.getNext();
            }
            while(!p.equals(crt)){
                String n = p.getElem();
                p.setElem(s);
                s = n;
                p = p.getNext();
            }
            crt.setElem(s);
            crt = crt.getNext();
        }
    }
}
