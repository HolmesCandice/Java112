class LCD {
    int size;

    public LCD(int size) {
        this.size = size;
    }

    public int getCost() {
        if (size == 10) {
            return 2000;
        } else if (size == 15) {
            return 2500;
        } else if (size == 17) {
            return 3000;
        } else {
            return 0;  // Handle unsupported size
        }
    }
}

class CPU {
    double speed;

    public CPU(double speed) {
        this.speed = speed;
    }

    public int getCost() {
        if (speed == 1.66) {
            return 6000;
        } else if (speed == 2.2) {
            return 8000;
        } else if (speed == 2.4) {
            return 11000;
        } else {
            return 0;  // Handle unsupported speed
        }
    }
}

class HDD {
    int capacity;

    public HDD(int capacity) {
        this.capacity = capacity;
    }

    public int getCost() {
        if (capacity == 120) {
            return 2400;
        } else if (capacity == 160) {
            return 2800;
        } else {
            return 0;  // Handle unsupported capacity
        }
    }
}

class Nole15 {
    LCD lcd;
    CPU cpu;
    HDD hdd;

    public Nole15() {
        this.lcd = new LCD(15);
        this.cpu = new CPU(2.2);
        this.hdd = new HDD(160);
    }

    public double getCost() {
        return (lcd.getCost() + cpu.getCost() + hdd.getCost()) * 1.4;
    }

    public double getPrice() {
        return (lcd.getCost() + cpu.getCost() + hdd.getCost()) * 2;  // 定價是其需件成本的2.2倍
    }
}

class PC {
    CPU cpu;
    HDD hdd;

    public PC() {
        this.cpu = new CPU(2.4);
        this.hdd = new HDD(160);
    }

    public double getCost() {
        return (cpu.getCost() + hdd.getCost()) + 500;
    }

    public double getPrice() {
        return (cpu.getCost() + hdd.getCost()) * 1.8;
    }
}

class AllPC{
    Nole15 nole15 = new Nole15();
    PC pc = new PC();

    public boolean isExpensive(){
        if (nole15.getPrice() > pc.getPrice()) 
            return true;
        else
        return false;
    }
}
public class J03 {
    public static void main(String[] args) {
        AllPC Allpc = new AllPC();

        if (Allpc.isExpensive() == true)
            System.out.println("Note15 is more expensive than PC");
        else 
            System.out.println("PC is more expensive than Note15");
    }
}

