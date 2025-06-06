package jobsheet11;

public class LinkedListLayananUnit {
     NodeMhsTugas head;
    NodeMhsTugas tail;

    int maxSize = 100;
    int size = 0;

    boolean isEmpty(){
        return (head == null);
    }
    public void kosongkan() {
        head = tail = null;
        System.out.println("Antrian telah dikosongkan.");
    }

    public boolean cekAntrianPenuh() {
        return size >= maxSize;
    }
    public void mengosongkanAntrian() {
        head = tail = null;
        System.out.println("Antrian Dikosongkan");
    }

    public void daftarkanData(MahasiswaTugas input){
        NodeMhsTugas ndInput = new NodeMhsTugas(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        }else{
            tail.next = ndInput;
            tail = ndInput;
        }
        System.out.println(ndInput.data.nama + " Berhasil masuk ke antrian" );
    }
    
    public void memanggilAntrian(){
        if (isEmpty()) {
            System.out.println("Antrian Kosong tidak ada yang bisa dipanggil");
        }else if(head == tail){
            System.out.println(head.data.nama + " Dipanggil");
            head = tail = null;
        }else{
            System.out.println(head.data.nama + " Dipanggil");
            head = head.next;
        }
    }
    


    public void tampilAntrianDepanTerakhir(){
        if (isEmpty()) {
            System.out.println("Antrian Kosong tidak ada yang bisa ditampilkan");
        }else{
            System.out.println("Antrian terdepan: ");
            head.data.tampilInformasi();
            System.out.println("Antrian Terakhir: ");
            tail.data.tampilInformasi();
        }
    }

    public void tampilMahasiswaYangMengantri() {
    int count = 0;
    NodeMhsTugas temp = head;

    while (temp != null) {
        count++;
        temp = temp.next;
    }

    System.out.println("Jumlah data dalam linked list: " + count);
    }
}
