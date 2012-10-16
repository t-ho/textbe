package org.be.textbe.gv.gv2text.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_gv implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_gv() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_4_1 = new TagInfo("c:get", //$NON-NLS-1$
            4, 1,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "/Graph/@type", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_5_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            5, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "s", //$NON-NLS-1$
                "//statement", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_6_2 = new TagInfo("c:if", //$NON-NLS-1$
            6, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$s/@left", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_6_24 = new TagInfo("c:get", //$NON-NLS-1$
            6, 24,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$s/@left", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_6_51 = new TagInfo("c:get", //$NON-NLS-1$
            6, 51,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$s/@right", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_7_3 = new TagInfo("c:if", //$NON-NLS-1$
            7, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$s/@context", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_7_28 = new TagInfo("c:get", //$NON-NLS-1$
            7, 28,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$s/@context", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_7_59 = new TagInfo("c:setVariable", //$NON-NLS-1$
            7, 59,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "first", //$NON-NLS-1$
                "'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_7_103 = new TagInfo("c:iterate", //$NON-NLS-1$
            7, 103,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "a", //$NON-NLS-1$
                "$s//attribute", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_8_4 = new TagInfo("c:if", //$NON-NLS-1$
            8, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$first='false'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_8_41 = new TagInfo("c:if", //$NON-NLS-1$
            8, 41,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$first='true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_8_68 = new TagInfo("c:setVariable", //$NON-NLS-1$
            8, 68,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "first", //$NON-NLS-1$
                "'false'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_8_120 = new TagInfo("c:get", //$NON-NLS-1$
            8, 120,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$a/@key", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_8_146 = new TagInfo("c:get", //$NON-NLS-1$
            8, 146,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$a/@value", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_9_3 = new TagInfo("c:if", //$NON-NLS-1$
            9, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$s/source", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_9_26 = new TagInfo("c:get", //$NON-NLS-1$
            9, 26,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$s/source/@id", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_9_58 = new TagInfo("c:get", //$NON-NLS-1$
            9, 58,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$s/source/port/@id", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_9_95 = new TagInfo("c:get", //$NON-NLS-1$
            9, 95,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$s/source/port/@compass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_9_140 = new TagInfo("c:get", //$NON-NLS-1$
            9, 140,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$s/target/target/@id", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_9_179 = new TagInfo("c:get", //$NON-NLS-1$
            9, 179,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$s/target/target/port/@id", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        // Graphviz M2T 
        // File: gv.jet 
        // Date: 23/07/09 
        RuntimeTagElement _jettag_c_get_4_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_4_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_4_1.setRuntimeParent(null);
        _jettag_c_get_4_1.setTagInfo(_td_c_get_4_1);
        _jettag_c_get_4_1.doStart(context, out);
        _jettag_c_get_4_1.doEnd();
        out.write(" structs {");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_5_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_5_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_5_1.setRuntimeParent(null);
        _jettag_c_iterate_5_1.setTagInfo(_td_c_iterate_5_1);
        _jettag_c_iterate_5_1.doStart(context, out);
        while (_jettag_c_iterate_5_1.okToProcessBody()) {
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_if_6_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_6_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_6_2.setRuntimeParent(_jettag_c_iterate_5_1);
            _jettag_c_if_6_2.setTagInfo(_td_c_if_6_2);
            _jettag_c_if_6_2.doStart(context, out);
            while (_jettag_c_if_6_2.okToProcessBody()) {
                RuntimeTagElement _jettag_c_get_6_24 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_6_24); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_6_24.setRuntimeParent(_jettag_c_if_6_2);
                _jettag_c_get_6_24.setTagInfo(_td_c_get_6_24);
                _jettag_c_get_6_24.doStart(context, out);
                _jettag_c_get_6_24.doEnd();
                out.write("=");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_6_51 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_6_51); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_6_51.setRuntimeParent(_jettag_c_if_6_2);
                _jettag_c_get_6_51.setTagInfo(_td_c_get_6_51);
                _jettag_c_get_6_51.doStart(context, out);
                _jettag_c_get_6_51.doEnd();
                _jettag_c_if_6_2.handleBodyContent(out);
            }
            _jettag_c_if_6_2.doEnd();
            RuntimeTagElement _jettag_c_if_7_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_7_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_7_3.setRuntimeParent(_jettag_c_iterate_5_1);
            _jettag_c_if_7_3.setTagInfo(_td_c_if_7_3);
            _jettag_c_if_7_3.doStart(context, out);
            while (_jettag_c_if_7_3.okToProcessBody()) {
                RuntimeTagElement _jettag_c_get_7_28 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_7_28); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_7_28.setRuntimeParent(_jettag_c_if_7_3);
                _jettag_c_get_7_28.setTagInfo(_td_c_get_7_28);
                _jettag_c_get_7_28.doStart(context, out);
                _jettag_c_get_7_28.doEnd();
                out.write(" [");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_setVariable_7_59 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_7_59); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_7_59.setRuntimeParent(_jettag_c_if_7_3);
                _jettag_c_setVariable_7_59.setTagInfo(_td_c_setVariable_7_59);
                _jettag_c_setVariable_7_59.doStart(context, out);
                _jettag_c_setVariable_7_59.doEnd();
                RuntimeTagElement _jettag_c_iterate_7_103 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_7_103); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_7_103.setRuntimeParent(_jettag_c_if_7_3);
                _jettag_c_iterate_7_103.setTagInfo(_td_c_iterate_7_103);
                _jettag_c_iterate_7_103.doStart(context, out);
                while (_jettag_c_iterate_7_103.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_if_8_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_8_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_if_8_4.setRuntimeParent(_jettag_c_iterate_7_103);
                    _jettag_c_if_8_4.setTagInfo(_td_c_if_8_4);
                    _jettag_c_if_8_4.doStart(context, out);
                    while (_jettag_c_if_8_4.okToProcessBody()) {
                        out.write(", ");  //$NON-NLS-1$        
                        _jettag_c_if_8_4.handleBodyContent(out);
                    }
                    _jettag_c_if_8_4.doEnd();
                    RuntimeTagElement _jettag_c_if_8_41 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_8_41); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_if_8_41.setRuntimeParent(_jettag_c_iterate_7_103);
                    _jettag_c_if_8_41.setTagInfo(_td_c_if_8_41);
                    _jettag_c_if_8_41.doStart(context, out);
                    while (_jettag_c_if_8_41.okToProcessBody()) {
                        RuntimeTagElement _jettag_c_setVariable_8_68 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_8_68); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_setVariable_8_68.setRuntimeParent(_jettag_c_if_8_41);
                        _jettag_c_setVariable_8_68.setTagInfo(_td_c_setVariable_8_68);
                        _jettag_c_setVariable_8_68.doStart(context, out);
                        _jettag_c_setVariable_8_68.doEnd();
                        _jettag_c_if_8_41.handleBodyContent(out);
                    }
                    _jettag_c_if_8_41.doEnd();
                    RuntimeTagElement _jettag_c_get_8_120 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_120); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_8_120.setRuntimeParent(_jettag_c_iterate_7_103);
                    _jettag_c_get_8_120.setTagInfo(_td_c_get_8_120);
                    _jettag_c_get_8_120.doStart(context, out);
                    _jettag_c_get_8_120.doEnd();
                    out.write("=");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_8_146 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_146); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_8_146.setRuntimeParent(_jettag_c_iterate_7_103);
                    _jettag_c_get_8_146.setTagInfo(_td_c_get_8_146);
                    _jettag_c_get_8_146.doStart(context, out);
                    _jettag_c_get_8_146.doEnd();
                    _jettag_c_iterate_7_103.handleBodyContent(out);
                }
                _jettag_c_iterate_7_103.doEnd();
                out.write("];");  //$NON-NLS-1$        
                _jettag_c_if_7_3.handleBodyContent(out);
            }
            _jettag_c_if_7_3.doEnd();
            RuntimeTagElement _jettag_c_if_9_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_9_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_9_3.setRuntimeParent(_jettag_c_iterate_5_1);
            _jettag_c_if_9_3.setTagInfo(_td_c_if_9_3);
            _jettag_c_if_9_3.doStart(context, out);
            while (_jettag_c_if_9_3.okToProcessBody()) {
                RuntimeTagElement _jettag_c_get_9_26 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_26); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_9_26.setRuntimeParent(_jettag_c_if_9_3);
                _jettag_c_get_9_26.setTagInfo(_td_c_get_9_26);
                _jettag_c_get_9_26.doStart(context, out);
                _jettag_c_get_9_26.doEnd();
                out.write(":");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_9_58 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_58); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_9_58.setRuntimeParent(_jettag_c_if_9_3);
                _jettag_c_get_9_58.setTagInfo(_td_c_get_9_58);
                _jettag_c_get_9_58.doStart(context, out);
                _jettag_c_get_9_58.doEnd();
                out.write(":");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_9_95 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_95); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_9_95.setRuntimeParent(_jettag_c_if_9_3);
                _jettag_c_get_9_95.setTagInfo(_td_c_get_9_95);
                _jettag_c_get_9_95.doStart(context, out);
                _jettag_c_get_9_95.doEnd();
                out.write(" -> ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_9_140 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_140); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_9_140.setRuntimeParent(_jettag_c_if_9_3);
                _jettag_c_get_9_140.setTagInfo(_td_c_get_9_140);
                _jettag_c_get_9_140.doStart(context, out);
                _jettag_c_get_9_140.doEnd();
                out.write(":");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_9_179 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_179); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_9_179.setRuntimeParent(_jettag_c_if_9_3);
                _jettag_c_get_9_179.setTagInfo(_td_c_get_9_179);
                _jettag_c_get_9_179.doStart(context, out);
                _jettag_c_get_9_179.doEnd();
                out.write(":n;");  //$NON-NLS-1$        
                _jettag_c_if_9_3.handleBodyContent(out);
            }
            _jettag_c_if_9_3.doEnd();
            out.write(" ");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_iterate_5_1.handleBodyContent(out);
        }
        _jettag_c_iterate_5_1.doEnd();
        out.write("}");  //$NON-NLS-1$        
    }
}
