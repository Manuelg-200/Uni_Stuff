package progetto2023_lpo22_37.parser.ast;

import progetto2023_lpo22_37.visitors.Visitor;

public class Fst extends UnaryOp {
    
    public Fst(Exp exp) {
        super(exp);
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visitFst(exp);
    }
}
