package jobsheet11;

public class SingleLinkedList24 {
    NodeMahasiswa24 head;
    NodeMahasiswa24 tail;

    boolean isEmpty (){
        return (head== null);
    }

    public void print(){
        if (!isEmpty()) {
            NodeMahasiswa24 tmp = head;
            System.out.println("isi linked list:\t");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
                
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void addFirst (Mahasiswa24 input){
        NodeMahasiswa24 ndInput = new NodeMahasiswa24(input,null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
            
        }else {
            ndInput.next = head;
            head = ndInput;
        }
    }
    public void addLast(Mahasiswa24 input){
        NodeMahasiswa24 ndInput = new NodeMahasiswa24(input,null);
         if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }
    public void insertAfter(String key, Mahasiswa24 input) {
        NodeMahasiswa24 ndInput = new NodeMahasiswa24(input, null);
        NodeMahasiswa24 temp = head;
        do {
            if (temp.data.nama.equalsIgnoreCase(key)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }
    public void insertAt(int index, Mahasiswa24 input) {
        if (index < 0) {
            System.out.println("Index salah");
        } else if (index == 0) {
            NodeMahasiswa24 ndInput = new NodeMahasiswa24(input, head);
            head = ndInput;
            if (tail == null) {
                tail = ndInput;
            }
        } else {
            NodeMahasiswa24 temp = head;
            for (int i = 0; i < index - 1; i++) {
                if (temp != null) {
                    temp = temp.next;
                }
            }
            if (temp != null) {
                NodeMahasiswa24 ndInput = new NodeMahasiswa24(input, temp.next);
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
            }
        }
    }

    public void getdata (int index){
        NodeMahasiswa24 tmp = head;
        for (int i= 0; i <index; i++){
            tmp =tmp.next;
        }
        tmp.data.tampilInformasi();
    }
    public int indexOf(String key){
        NodeMahasiswa24 tmp = head;
        int index = 0;
        while (tmp != null && !tmp.data.nama.equalsIgnoreCase(key)) {
            tmp = tmp.next;
            index++;
        }

        if (tmp == null) {
            return -1;
        }else{
            return index;
        }
    }
    
    public void removeFirst(){
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        }else if(head == tail){
            head = tail = null;
        }else{
            head = head.next;
        }
    }
    
    public void removeLast(){
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        }else if ( head == tail){
            head = tail = null;
        }else{
            NodeMahasiswa24 temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }

    public void remove (String key){
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        }else{
            NodeMahasiswa24 temp = head;
            while (temp != null) {
                if (temp.data.nama.equalsIgnoreCase(key) && temp == head) {
                    this.removeFirst();
                    break;
                }else if (temp.data.nama.equalsIgnoreCase(key)){
                    temp.next = temp.next.next;
                    if (temp.next == null) {
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }
    
    public void removeAt(int index){
        if (index == 0) {
            removeFirst();
        }else{
            NodeMahasiswa24 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        }
    }
}
