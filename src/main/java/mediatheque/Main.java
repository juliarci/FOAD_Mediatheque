package mediatheque;

public class Main {
    public static void main(String[] args) {
        Mediatheque mediatheque = new Mediatheque();

        mediatheque.addItem(new Book("J.R.R. Tolkien", "Le Seigneur des Anneaux"));
        mediatheque.addItem(new Book("Philip K. Dick", "Le Maître du Haut Château"));
        mediatheque.addItem(new CD(12, "Sergeant Peppers"));

        System.out.println("- Catalogue complet :");
        mediatheque.printCatalog();

        System.out.println("\n- Affichage uniquement des livres :");
        mediatheque.applyVisitor(new PrintBooksVisitor());

        System.out.println("\n- Affichage uniquement des CDs :");
        mediatheque.applyVisitor(new PrintCDsVisitor());
    }
}
