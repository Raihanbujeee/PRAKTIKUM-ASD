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
}
