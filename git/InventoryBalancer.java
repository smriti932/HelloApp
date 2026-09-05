
   public class InventoryBalancer {

    static void analyzeInventory(int[] sectionA, int[] sectionB) {

        int totalA = 0;
        int totalB = 0;

        // Calculate totals
        for (int i = 0; i < sectionA.length; i++) {
            totalA = totalA + sectionA[i];
            totalB = totalB + sectionB[i];
        }

        // Check balance
        if (totalA == totalB) {
            System.out.println("Section A Total: " + totalA +
                    " | Section B Total: " + totalB +
                    " | Status: Balanced");
        } else {
            System.out.println("Section A Total: " + totalA +
                    " | Section B Total: " + totalB +
                    " | Status: Not Balanced");
        }

        // Find highest quantity
        int highest = sectionA[0];
        String section = "Section A";
        int item = 0;

        for (int i = 0; i < sectionA.length; i++) {

            if (sectionA[i] > highest) {
                highest = sectionA[i];
                section = "Section A";
                item = i;
            }

            if (sectionB[i] > highest) {
                highest = sectionB[i];
                section = "Section B";
                item = i;
            }
        }

        System.out.println("Highest Quantity: " + highest +
                " (" + section + ", Item " + item + ")");
    }

    public static void main(String[] args) {

        int[] sectionA = {20, 15, 30};
        int[] sectionB = {25, 10, 30};

        analyzeInventory(sectionA, sectionB);
    }
}