package inter;

import symbols.*;

public class If extends Stmt {
    Expr expr;
    Stmt stmt;

    public If(Expr x, Stmt s) {
        expr = x;
        stmt = s;
        if (expr.type != Type.Bool)
            expr.error("boolean requieren in if");
    }

    public void gen(int b, int a) {
        int label = newLabel();
        expr.jumping(0, a);
        emitlabel(label);
        stmt.gen(label, a);
    }
}