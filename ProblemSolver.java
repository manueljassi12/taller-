public class ProblemSolver {

    public static void main(String[] args) {
        // Define integer variables for the known quantities
        int numNotebooks = 8;
        int costPerNotebook = 25;
        int numPens = 7;
        int totalSpent = 298;

        // Calculate the total cost of the notebooks
        int totalNotebookCost = numNotebooks * costPerNotebook;

        // Calculate the total amount spent on pens
        int totalPenCost = totalSpent - totalNotebookCost;

        // Calculate the cost of a single pen
        int costPerPen = totalPenCost / numPens;

        // Print the problem statement and the solution to the console
        System.out.println("Problema: Luis compró 8 cuadernos a 25 pesos cada uno y 7 bolígrafos. En total se gastó 298 pesos, ¿cuánto costó cada bolígrafo?");
        System.out.println("Solución:");
        System.out.println("Costo total de los cuadernos: " + numNotebooks + " * " + costPerNotebook + " = " + totalNotebookCost + " pesos.");
        System.out.println("Dinero gastado en bolígrafos: " + totalSpent + " - " + totalNotebookCost + " = " + totalPenCost + " pesos.");
        System.out.println("Costo de cada bolígrafo: " + totalPenCost + " / " + numPens + " = " + costPerPen + " pesos.");
        System.out.println("\nRespuesta: Cada bolígrafo costó " + costPerPen + " pesos.");
    }
}
