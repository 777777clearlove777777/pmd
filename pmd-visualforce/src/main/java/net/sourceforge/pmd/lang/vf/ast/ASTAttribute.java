/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */
/* Generated By:JJTree: Do not edit this line. ASTAttribute.java */

package net.sourceforge.pmd.lang.vf.ast;

public class ASTAttribute extends AbstractVfNode {

    private String name;

    public ASTAttribute(int id) {
        super(id);
    }

    /**
     * @return Returns the name.
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     *            The name to set.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return boolean - true if the element has a namespace-prefix, false
     *         otherwise
     */
    public boolean isHasNamespacePrefix() {
        return name.indexOf(':') >= 0;
    }

    /**
     * @return String - the part of the name that is before the (first) colon
     *         (":")
     */
    public String getNamespacePrefix() {
        int colonIndex = name.indexOf(':');
        return colonIndex >= 0 ? name.substring(0, colonIndex) : "";
    }

    /**
     * @return String - The part of the name that is after the first colon
     *         (":"). If the name does not contain a colon, the full name is
     *         returned.
     */
    public String getLocalName() {
        int colonIndex = name.indexOf(':');
        return colonIndex >= 0 ? name.substring(colonIndex + 1) : name;
    }

    /**
     * Accept the visitor. *
     */
    @Override
    public Object jjtAccept(VfParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
