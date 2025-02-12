package edu.realemj.oregon;

public class Supplies {
    private double totalFood;
    private int totalBullets;
    private int totalMoney;

    public double getTotalFood() { return totalFood; }
    public int getTotalBullets() { return totalBullets; }
    public int getTotalMoney() { return totalMoney; }

    public void setTotalFood(double food) { totalFood = food; }
    public void setTotalBullets(int bullets) { totalBullets = bullets; }
    public void setTotalMoney(int money) { totalMoney = money; }

    public String toString() {
        String s = "";
        s += "***********************\n";
        s += "SUPPLIES:\n";
        s += "Food: " + totalFood + "\n";
        s += "Bullets: " + totalBullets + "\n";
        s += "Money: " + totalMoney + "\n";
        s += "***********************\n";
        return s;
    }
}
