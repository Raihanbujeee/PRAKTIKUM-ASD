package jobsheet9;

public class StackSurat24 {
    Surat24[] stack;
    int size;
    int top;

    StackSurat24(int size) {
        this.size = size;
        stack = new Surat24[size];
        top = -1;
    }

    boolean isFull() {
        return this.top == this.size - 1;
    }

    boolean isEmpty() {
        return this.top == -1;
    }

    void push(Surat24 s) {
        if (!isFull()) {
            top++;
            stack[top] = s;
        } else {
            System.out.println("stack penuh!");
        }
    }

    Surat24 pop() {
        if(!isEmpty()) {
           Surat24 s = stack[top];
            top--;
            return s; 
        } else {
            System.out.println("stack kosong!");
            return null;
        }
    } 

    Surat24 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    int cariSurat(String target) {
        for(int i = 0; i <= top; i++) {
            if (stack[i].namaMhs.equalsIgnoreCase(target)) {
                return i;
            }
        }
        return -1;
    }

    void tampilkanSurat(int i) {
        System.out.println("Surat milik " + stack[i].namaMhs + " ditemukan pada tumpukan ke " + (top+1-i));
    }
}
