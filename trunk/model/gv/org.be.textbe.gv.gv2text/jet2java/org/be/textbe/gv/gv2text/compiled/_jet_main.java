package org.be.textbe.gv.gv2text.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_main implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_main() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_if_6_1 = new TagInfo("c:if", //$NON-NLS-1$
            6, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "isVariableDefined('org.eclipse.jet.resource.project.name')", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        // Main entry point for org.be.gv.gv2text 
        // 
        //TODO: find out if this is used anywhere. org.be.textbe.beviz.BEView does not use it.
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_6_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_6_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_6_1.setRuntimeParent(null);
        _jettag_c_if_6_1.setTagInfo(_td_c_if_6_1);
        _jettag_c_if_6_1.doStart(context, out);
        while (_jettag_c_if_6_1.okToProcessBody()) {
            out.write("    <ws:file template=\"templates/gv.jet\" path=\"{$org.eclipse.jet.resource.project.name}/temp.dot\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_6_1.handleBodyContent(out);
        }
        _jettag_c_if_6_1.doEnd();
    }
}
