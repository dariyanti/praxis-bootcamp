package vending;

public enum Coin {
    PENNY(1), NICKLE(5), DIME(10), QUARTER(25);

    private int denomination; // setelah kelas tulis tipedta dan variabelnya

    private Coin(int denomination) {// denomination berjenis integer
        this.denomination = denomination;
    }

    public int getDenomination() {
        return denomination;
    }
}