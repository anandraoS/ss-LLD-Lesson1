package Lesson5.InterfaceSeggregationPrinciple.problematiccode;

public class Buyer implements User{
    @Override
    public boolean canBuyProducts() {
        return false;
    }

    @Override
    public boolean canAddProducts() {
        return false;
    }

    @Override
    public boolean canModifyProducts() {
        return false;
    }

    @Override
    public boolean canApproveProducts() {
        return false;
    }
}
