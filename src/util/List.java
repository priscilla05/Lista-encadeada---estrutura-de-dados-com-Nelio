package util;

public class List {

    private No head;


    public void add(Double value) {
        No no = new No();
        no.setValue(value);
        no.setNext(head);
        head = no;

    }

    @Override
    public String toString() {
       StringBuffer sb = new StringBuffer();
       sb.append("[");

       No ponteiro = head;
       while (ponteiro !=null){
           sb.append(ponteiro.getValue()+ " ");
           ponteiro.getNext();
       }
       sb.append("]");
       return sb.toString();
    }
}