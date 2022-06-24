package cinema;

public class Ticket {

    private int row;
    private int column;
    private int price;

    public Ticket() {}

    public Ticket(int row, int column) {
        this.row = row;
        this.column = column;
        if (this.row <= 4) {
            this.price = 10;
        } else {
            this.price = 8;
        }
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
