package mediatheque;

public class PrintBooksVisitor implements ItemVisitor {
    @Override
    public void visit(Book book) {
        System.out.println(book);
    }

    @Override
    public void visit(CD cd) {
    }
}
