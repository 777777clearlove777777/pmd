/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */
/* Generated By:JJTree: Do not edit this line. ASTElExpression.java */

package net.sourceforge.pmd.lang.vf.ast;

public class ASTElExpression extends AbstractVfNode {
    public ASTElExpression(int id) {
        super(id);
    }

    /**
     * Accept the visitor. *
     */
    @Override
    public Object jjtAccept(VfParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
