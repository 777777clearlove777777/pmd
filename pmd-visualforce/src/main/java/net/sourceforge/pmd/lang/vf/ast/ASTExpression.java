/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.vf.ast;

public class ASTExpression extends AbstractVfNode {
    public ASTExpression(int id) {
        super(id);
    }

    /** Accept the visitor. **/
    @Override
    public Object jjtAccept(VfParserVisitor visitor, Object data) {

        return visitor.visit(this, data);
    }
}
