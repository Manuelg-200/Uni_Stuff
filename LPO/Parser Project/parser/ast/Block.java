package progetto2023_lpo22_37.parser.ast;

import static java.util.Objects.requireNonNull;

import progetto2023_lpo22_37.visitors.Visitor;

public class Block implements Stmt {
    private final StmtSeq stmtSeq;

    public Block(StmtSeq stmtSeq) {
        this.stmtSeq = requireNonNull(stmtSeq);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" + stmtSeq + ")";
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visitBlock(stmtSeq);
    }
}