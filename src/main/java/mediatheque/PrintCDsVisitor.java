package mediatheque;

public class PrintCDsVisitor implements ItemVisitor {
    @Override
    public void visit(Book book) {
    }

    @Override
    public void visit(CD cd) {
        System.out.println(cd);
    }
}
