class LCD {
    private String size;
    private int cost;

    LCD(String size) {
        this.size = size;
        if (size.equals("10")) {
            this.cost = 2000;
        } else if (size.equals("15")) {
            this.cost = 2500;
        } else if (size.equals("17")) {
            this.cost = 3000;
        }
    }

    int getCost() {
        return cost;
    }
}

class CPU {
    private double speed;
    private int cost;

    CPU(double speed) {
        this.speed = speed;
        if (speed == 1.66) {
            this.cost = 6000;
        } else if (speed == 2.2) {
            this.cost = 8000;
        } else if (speed == 2.4) {
            this.cost = 11000;
        }
    }

    int getCost() {
        return cost;
    }
}

class HD {
    private int size;
    private int cost;

    HD(int size) {
        this.size = size;
        if (size == 120) {
            this.cost = 2400;
        } else if (size == 160) {
            this.cost = 2800;
        }
    }

    int getCost() {
        return cost;
    }
}

class MiniNote {
    private LCD lcd;
    private CPU cpu;
    private HD hd;

    MiniNote() {
        this.lcd = new LCD("10");
        this.cpu = new CPU(1.66);
        this.hd = new HD(120);
    }

    double getCost() {
        return 1.4 * (lcd.getCost() + cpu.getCost() + hd.getCost());
    }

    int getPrice() {
        return (int)2 * (lcd.getCost() + cpu.getCost() + hd.getCost());
    }
}

class Note15 {
    private LCD lcd;
    private CPU cpu;
    private HD hd;

    Note15() {
        this.lcd = new LCD("15");
        this.cpu = new CPU(2.2);
        this.hd = new HD(160);
    }

    double getCost() {
        return 1.4 * (lcd.getCost() + cpu.getCost() + hd.getCost());
    }

    int getPrice() {
        return (int)2 * (lcd.getCost() + cpu.getCost() + hd.getCost());
    }
}
class AIPC {
    static boolean isExpensive(Note15 note15, PC pc) {
        return note15.getPrice() > pc.getPrice();
    }
}

public class J03 {
    public static void main(String[] args) {
        MiniNote miniNote = new MiniNote();
        Note15 note15 = new Note15();
        PC pc = new PC();

        System.out.println("MiniNote cost:" + miniNote.getCost() + ", price:" + miniNote.getPrice());
        System.out.println("Note15 cost:" + note15.getCost() + ", price:" + note15.getPrice());
        System.out.println("PC cost:" + pc.getCost() + ", price:" + pc.getPrice());

        boolean note15IsExpensive = AIPC.isExpensive(note15, pc);

        if (note15IsExpensive) {
            System.out.println("Note15 is more expensive than PC");
        } else {
            System.out.println("PC is more expensive than Note15");
        }
    }
}
