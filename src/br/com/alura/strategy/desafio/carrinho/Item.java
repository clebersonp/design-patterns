package br.com.alura.strategy.desafio.carrinho;

public class Item {

    private final String upcCode;
    private final double price;

    public Item(final String upcCode, final double price) {
        super();
        this.upcCode = upcCode;
        this.price = price;
    }

    public String getUpcCode() {
        return this.upcCode;
    }

    public double getPrice() {
        return this.price;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = (prime * result) + ((this.upcCode == null) ? 0 : this.upcCode.hashCode());
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        final Item other = (Item) obj;
        if (this.upcCode == null) {
            if (other.upcCode != null) {
                return false;
            }
        } else if (!this.upcCode.equals(other.upcCode)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Item [upcCode=" + this.upcCode + ", price=" + this.price + "]";
    }
}