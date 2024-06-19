package app;

// Клас розрахунку вартості товару,
// враховуючи вартість доставки
// ЗАВДАННЯ: Виправити код класу.
// Клас успадковує клас CalcCostBase.
public class CalcCostDelivery {

    // Вартість доставки
    private final static double deliveryPrice = 7;

    // Розрахунок вартості товару,
    // з урахуванням вартості доставки
    public double calcCost(Product product) {
        return product.getQuota() * product.getPrice()
                + deliveryPrice;
    }
}
