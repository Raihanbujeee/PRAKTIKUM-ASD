package jobsheet9;

public class StackTugasMahasiswa24 {
    Mahasiswa24[] stack;
    int top, size;

    public StackTugasMahasiswa24(int size) {
        this.size = size;
        stack = new Mahasiswa24[size];
        top = -1;
    }

    public boolean isfull() {
        return top == size - 1;
    }

    public boolean isempty() {
        return top == -1;
    }

    public void push(Mahasiswa24 mhs) {
        if (!isfull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh!! Tidak bisa menambahkan tugas");
        }
    }

    public Mahasiswa24 pop() {
        if (!isempty()) {
            Mahasiswa24 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong!! Tidak ada tugas untuk dinilai");
            return null;
        }
    }

    public Mahasiswa24 peek() {
        if (!isempty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong!! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    public void print() {
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }
}
