package c322.homework.homework5.partc;

public class Lot implements LotInterface {
    int length, width;

    public void setSize(int length, int width) {
        this.length = length;
        this.width = width;
    }

        public int getLength () {
            return length;
        }

        public int getWidth() {
            return  width;
        }
    }
