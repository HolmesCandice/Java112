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

class MultPC {
    CPU cpu;
    HDD hdd;
    int MultiPC_CPU;
    int MultiPC_HDD;

    public MultPC(int a,int b) {
        this.cpu = new CPU(2.4);
        this.hdd = new HDD(160);
        MultiPC_CPU = a;
        MultiPC_HDD = b;
    }

    public double getCost() {
        return (cpu.getCost() * MultiPC_CPU + hdd.getCost() * MultiPC_HDD) * 1.2;
    }

    public double getPrice() {
        return (cpu.getCost() * MultiPC_CPU + hdd.getCost() * MultiPC_HDD) * 1.8;
    }
}

public class J02 {
    public static void main(String[] args) {

        PC pc = new PC();
        MultPC MultPC1 = new MultPC(2,4);
        MultPC MultPC2 = new MultPC(4,8);

        System.out.println("PC cost:" + pc.getCost() + ", price:" + pc.getPrice());
        System.out.println("MultPC: " + MultPC1.MultiPC_CPU + "CPU, " + MultPC1.MultiPC_HDD + "HD, " + "cost:" + MultPC1.getCost() + ", priec:" + MultPC1.getPrice());
        System.out.println("MultPC: " + MultPC2.MultiPC_CPU + "CPU, " + MultPC2.MultiPC_HDD + "HD, " + "cost:" + MultPC2.getCost() + ", priec:" + MultPC2.getPrice());
        

        
    }
}

