/*
 * $Id: Panel_DataTag.java,v 1.7 2003/07/09 19:04:26 rlubke Exp $
 */

/*
 * Copyright 2003 Sun Microsystems, Inc. All rights reserved.
 * SUN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.sun.faces.taglib.html_basic;


import javax.faces.component.UIComponent;
import javax.faces.component.UIPanel;
import com.sun.faces.taglib.FacesTag;
import javax.servlet.jsp.JspException;

/**
 *
 * @version $Id: Panel_DataTag.java,v 1.7 2003/07/09 19:04:26 rlubke Exp $
 * 
 * @see	Blah
 * @see	Bloo
 *
 */

public class Panel_DataTag extends FacesTag {
    
    //
    // Protected Constants
    //

    //
    // Class Variables
    //

    //
    // Instance Variables
    //
    protected String var = null;
    
    // Attribute Instance Variables

    // Relationship Instance Variables

    //
    // Constructors and Initializers    
    //
    
    public Panel_DataTag()
    {
        super();
    }

    //
    // Class methods
    //

    // 
    // Accessors
    //
    public void setVar(String var) {
        this.var = var;
    }

    public String getVar() {
        return var;
    }

    public void release() {
        super.release();
        this.var = null;
    }

    
    protected void overrideProperties(UIComponent component) {
        super.overrideProperties(component);
        if (getVar() != null) {
            component.setAttribute("var", getVar());
        }
    }

    public String getLocalRendererType() { return ("Data"); }    

    public String getComponentType() { return ("Panel"); }    

}
