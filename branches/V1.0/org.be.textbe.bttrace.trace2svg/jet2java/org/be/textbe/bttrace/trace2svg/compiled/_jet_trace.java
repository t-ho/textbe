package org.be.textbe.bttrace.trace2svg.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_trace implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_trace() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_2_4 = new TagInfo("c:get", //$NON-NLS-1$
            2, 4,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "//bt/@value", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_5_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            5, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_6_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            6, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "//activate", //$NON-NLS-1$
                "p", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_7_3 = new TagInfo("c:setVariable", //$NON-NLS-1$
            7, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$i+1", //$NON-NLS-1$
                "i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_9_2 = new TagInfo("c:choose", //$NON-NLS-1$
            9, 2,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_10_2 = new TagInfo("c:when", //$NON-NLS-1$
            10, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_10_35 = new TagInfo("c:get", //$NON-NLS-1$
            10, 35,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "//activate/@color", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_13_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            13, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_14_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            14, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "//interleave", //$NON-NLS-1$
                "p", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_15_3 = new TagInfo("c:setVariable", //$NON-NLS-1$
            15, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$i+1", //$NON-NLS-1$
                "i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_17_2 = new TagInfo("c:choose", //$NON-NLS-1$
            17, 2,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_18_2 = new TagInfo("c:when", //$NON-NLS-1$
            18, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_18_39 = new TagInfo("c:get", //$NON-NLS-1$
            18, 39,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "//interleave/@color", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_48_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            48, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_49_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            49, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "//trace/nodeGroup", //$NON-NLS-1$
                "p", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_50_3 = new TagInfo("c:setVariable", //$NON-NLS-1$
            50, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$i+1", //$NON-NLS-1$
                "i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_54_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            54, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "j", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_55_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            55, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "//trace/loopNodeGroup", //$NON-NLS-1$
                "p", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_56_3 = new TagInfo("c:setVariable", //$NON-NLS-1$
            56, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$j+1", //$NON-NLS-1$
                "j", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_59_2 = new TagInfo("c:choose", //$NON-NLS-1$
            59, 2,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_60_3 = new TagInfo("c:when", //$NON-NLS-1$
            60, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_62_3 = new TagInfo("c:otherwise", //$NON-NLS-1$
            62, 3,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_62_25 = new TagInfo("c:get", //$NON-NLS-1$
            62, 25,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_66_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            66, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "loop", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_67_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            67, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "//trace/nodeGroup", //$NON-NLS-1$
                "node", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_67_55 = new TagInfo("c:get", //$NON-NLS-1$
            67, 55,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$node/activeNode/@value", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_67_97 = new TagInfo("c:iterate", //$NON-NLS-1$
            67, 97,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$node/interleaveNode", //$NON-NLS-1$
                "iNode", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_67_153 = new TagInfo("c:get", //$NON-NLS-1$
            67, 153,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$iNode/@value", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_67_199 = new TagInfo("c:setVariable", //$NON-NLS-1$
            67, 199,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$loop+1", //$NON-NLS-1$
                "loop", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_67_244 = new TagInfo("c:choose", //$NON-NLS-1$
            67, 244,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$loop", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_67_270 = new TagInfo("c:when", //$NON-NLS-1$
            67, 270,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_67_298 = new TagInfo("c:otherwise", //$NON-NLS-1$
            67, 298,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_choose_67_350 = new TagInfo("c:choose", //$NON-NLS-1$
            67, 350,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$j", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_67_373 = new TagInfo("c:when", //$NON-NLS-1$
            67, 373,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_67_400 = new TagInfo("c:otherwise", //$NON-NLS-1$
            67, 400,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_choose_67_413 = new TagInfo("c:choose", //$NON-NLS-1$
            67, 413,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_67_436 = new TagInfo("c:when", //$NON-NLS-1$
            67, 436,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_67_463 = new TagInfo("c:otherwise", //$NON-NLS-1$
            67, 463,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_setVariable_67_528 = new TagInfo("c:setVariable", //$NON-NLS-1$
            67, 528,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "loop", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_67_567 = new TagInfo("c:iterate", //$NON-NLS-1$
            67, 567,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "//trace/loopNodeGroup", //$NON-NLS-1$
                "node", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_67_622 = new TagInfo("c:choose", //$NON-NLS-1$
            67, 622,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$loop", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_67_648 = new TagInfo("c:when", //$NON-NLS-1$
            67, 648,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_67_675 = new TagInfo("c:otherwise", //$NON-NLS-1$
            67, 675,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_67_718 = new TagInfo("c:get", //$NON-NLS-1$
            67, 718,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$node/activeNode/@value", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_67_760 = new TagInfo("c:iterate", //$NON-NLS-1$
            67, 760,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$node/interleaveNode", //$NON-NLS-1$
                "iNode", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_67_816 = new TagInfo("c:get", //$NON-NLS-1$
            67, 816,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$iNode/@value", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_67_862 = new TagInfo("c:setVariable", //$NON-NLS-1$
            67, 862,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$loop+1", //$NON-NLS-1$
                "loop", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_106_4 = new TagInfo("c:setVariable", //$NON-NLS-1$
            106, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_107_3 = new TagInfo("c:iterate", //$NON-NLS-1$
            107, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "//delay", //$NON-NLS-1$
                "p", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_108_4 = new TagInfo("c:setVariable", //$NON-NLS-1$
            108, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$i+1", //$NON-NLS-1$
                "i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_110_3 = new TagInfo("c:choose", //$NON-NLS-1$
            110, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_111_3 = new TagInfo("c:when", //$NON-NLS-1$
            111, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_111_30 = new TagInfo("c:get", //$NON-NLS-1$
            111, 30,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "//delay/@value", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("<script type = \"text/ecmascript\"><![CDATA[");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t//");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_2_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_2_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_2_4.setRuntimeParent(null);
        _jettag_c_get_2_4.setTagInfo(_td_c_get_2_4);
        _jettag_c_get_2_4.doStart(context, out);
        _jettag_c_get_2_4.doEnd();
        out.write(NL);         
        out.write("\tvar activeColor = \"orange\";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tvar interleaveColor = \"blanchedalmond\";");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_setVariable_5_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_5_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_5_2.setRuntimeParent(null);
        _jettag_c_setVariable_5_2.setTagInfo(_td_c_setVariable_5_2);
        _jettag_c_setVariable_5_2.doStart(context, out);
        _jettag_c_setVariable_5_2.doEnd();
        RuntimeTagElement _jettag_c_iterate_6_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_6_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_6_2.setRuntimeParent(null);
        _jettag_c_iterate_6_2.setTagInfo(_td_c_iterate_6_2);
        _jettag_c_iterate_6_2.doStart(context, out);
        while (_jettag_c_iterate_6_2.okToProcessBody()) {
            RuntimeTagElement _jettag_c_setVariable_7_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_7_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_7_3.setRuntimeParent(_jettag_c_iterate_6_2);
            _jettag_c_setVariable_7_3.setTagInfo(_td_c_setVariable_7_3);
            _jettag_c_setVariable_7_3.doStart(context, out);
            _jettag_c_setVariable_7_3.doEnd();
            _jettag_c_iterate_6_2.handleBodyContent(out);
        }
        _jettag_c_iterate_6_2.doEnd();
        RuntimeTagElement _jettag_c_choose_9_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_9_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_choose_9_2.setRuntimeParent(null);
        _jettag_c_choose_9_2.setTagInfo(_td_c_choose_9_2);
        _jettag_c_choose_9_2.doStart(context, out);
        JET2Writer _jettag_c_choose_9_2_saved_out = out;
        while (_jettag_c_choose_9_2.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_when_10_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_10_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_10_2.setRuntimeParent(_jettag_c_choose_9_2);
            _jettag_c_when_10_2.setTagInfo(_td_c_when_10_2);
            _jettag_c_when_10_2.doStart(context, out);
            JET2Writer _jettag_c_when_10_2_saved_out = out;
            while (_jettag_c_when_10_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("\tactiveColor = \"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_10_35 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_10_35); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_10_35.setRuntimeParent(_jettag_c_when_10_2);
                _jettag_c_get_10_35.setTagInfo(_td_c_get_10_35);
                _jettag_c_get_10_35.doStart(context, out);
                _jettag_c_get_10_35.doEnd();
                out.write("\";");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_when_10_2.handleBodyContent(out);
            }
            out = _jettag_c_when_10_2_saved_out;
            _jettag_c_when_10_2.doEnd();
            _jettag_c_choose_9_2.handleBodyContent(out);
        }
        out = _jettag_c_choose_9_2_saved_out;
        _jettag_c_choose_9_2.doEnd();
        RuntimeTagElement _jettag_c_setVariable_13_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_13_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_13_2.setRuntimeParent(null);
        _jettag_c_setVariable_13_2.setTagInfo(_td_c_setVariable_13_2);
        _jettag_c_setVariable_13_2.doStart(context, out);
        _jettag_c_setVariable_13_2.doEnd();
        RuntimeTagElement _jettag_c_iterate_14_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_14_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_14_2.setRuntimeParent(null);
        _jettag_c_iterate_14_2.setTagInfo(_td_c_iterate_14_2);
        _jettag_c_iterate_14_2.doStart(context, out);
        while (_jettag_c_iterate_14_2.okToProcessBody()) {
            RuntimeTagElement _jettag_c_setVariable_15_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_15_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_15_3.setRuntimeParent(_jettag_c_iterate_14_2);
            _jettag_c_setVariable_15_3.setTagInfo(_td_c_setVariable_15_3);
            _jettag_c_setVariable_15_3.doStart(context, out);
            _jettag_c_setVariable_15_3.doEnd();
            _jettag_c_iterate_14_2.handleBodyContent(out);
        }
        _jettag_c_iterate_14_2.doEnd();
        RuntimeTagElement _jettag_c_choose_17_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_17_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_choose_17_2.setRuntimeParent(null);
        _jettag_c_choose_17_2.setTagInfo(_td_c_choose_17_2);
        _jettag_c_choose_17_2.doStart(context, out);
        JET2Writer _jettag_c_choose_17_2_saved_out = out;
        while (_jettag_c_choose_17_2.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write("\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_when_18_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_18_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_18_2.setRuntimeParent(_jettag_c_choose_17_2);
            _jettag_c_when_18_2.setTagInfo(_td_c_when_18_2);
            _jettag_c_when_18_2.doStart(context, out);
            JET2Writer _jettag_c_when_18_2_saved_out = out;
            while (_jettag_c_when_18_2.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("\tinterleaveColor = \"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_18_39 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_39); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_18_39.setRuntimeParent(_jettag_c_when_18_2);
                _jettag_c_get_18_39.setTagInfo(_td_c_get_18_39);
                _jettag_c_get_18_39.doStart(context, out);
                _jettag_c_get_18_39.doEnd();
                out.write("\";");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_when_18_2.handleBodyContent(out);
            }
            out = _jettag_c_when_18_2_saved_out;
            _jettag_c_when_18_2.doEnd();
            _jettag_c_choose_17_2.handleBodyContent(out);
        }
        out = _jettag_c_choose_17_2_saved_out;
        _jettag_c_choose_17_2.doEnd();
        out.write("\tfunction f (groupId, fill) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn function () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tvar children = document.getElementById(groupId).childNodes;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tfor (var i = 0; i < children.length; ++i) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tvar child = children.item(i);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tif (child.nodeName == \"polygon\") { child.setAttribute(\"fill\", fill); }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t};");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(" \tfunction activate (nodeId) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" \t\treturn f (nodeId, activeColor);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tfunction whiten (nodeId) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn f (nodeId, \"white\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tfunction interleave (nodeId) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn f (nodeId, interleaveColor);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tfunction darken (nodeId) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn f (nodeId, \"magenta\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t//jumlah nodegroup");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_setVariable_48_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_48_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_48_2.setRuntimeParent(null);
        _jettag_c_setVariable_48_2.setTagInfo(_td_c_setVariable_48_2);
        _jettag_c_setVariable_48_2.doStart(context, out);
        _jettag_c_setVariable_48_2.doEnd();
        RuntimeTagElement _jettag_c_iterate_49_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_49_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_49_2.setRuntimeParent(null);
        _jettag_c_iterate_49_2.setTagInfo(_td_c_iterate_49_2);
        _jettag_c_iterate_49_2.doStart(context, out);
        while (_jettag_c_iterate_49_2.okToProcessBody()) {
            RuntimeTagElement _jettag_c_setVariable_50_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_50_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_50_3.setRuntimeParent(_jettag_c_iterate_49_2);
            _jettag_c_setVariable_50_3.setTagInfo(_td_c_setVariable_50_3);
            _jettag_c_setVariable_50_3.doStart(context, out);
            _jettag_c_setVariable_50_3.doEnd();
            _jettag_c_iterate_49_2.handleBodyContent(out);
        }
        _jettag_c_iterate_49_2.doEnd();
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t//jumlah loopnodegroup");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_setVariable_54_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_54_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_54_2.setRuntimeParent(null);
        _jettag_c_setVariable_54_2.setTagInfo(_td_c_setVariable_54_2);
        _jettag_c_setVariable_54_2.doStart(context, out);
        _jettag_c_setVariable_54_2.doEnd();
        RuntimeTagElement _jettag_c_iterate_55_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_55_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_55_2.setRuntimeParent(null);
        _jettag_c_iterate_55_2.setTagInfo(_td_c_iterate_55_2);
        _jettag_c_iterate_55_2.doStart(context, out);
        while (_jettag_c_iterate_55_2.okToProcessBody()) {
            RuntimeTagElement _jettag_c_setVariable_56_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_56_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_56_3.setRuntimeParent(_jettag_c_iterate_55_2);
            _jettag_c_setVariable_56_3.setTagInfo(_td_c_setVariable_56_3);
            _jettag_c_setVariable_56_3.doStart(context, out);
            _jettag_c_setVariable_56_3.doEnd();
            _jettag_c_iterate_55_2.handleBodyContent(out);
        }
        _jettag_c_iterate_55_2.doEnd();
        out.write("\tvar back = 0;");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_choose_59_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_59_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_choose_59_2.setRuntimeParent(null);
        _jettag_c_choose_59_2.setTagInfo(_td_c_choose_59_2);
        _jettag_c_choose_59_2.doStart(context, out);
        JET2Writer _jettag_c_choose_59_2_saved_out = out;
        while (_jettag_c_choose_59_2.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write("\t\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_when_60_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_60_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_60_3.setRuntimeParent(_jettag_c_choose_59_2);
            _jettag_c_when_60_3.setTagInfo(_td_c_when_60_3);
            _jettag_c_when_60_3.doStart(context, out);
            JET2Writer _jettag_c_when_60_3_saved_out = out;
            while (_jettag_c_when_60_3.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("\tback = 0; ");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_when_60_3.handleBodyContent(out);
            }
            out = _jettag_c_when_60_3_saved_out;
            _jettag_c_when_60_3.doEnd();
            out.write("\t\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_otherwise_62_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_62_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_otherwise_62_3.setRuntimeParent(_jettag_c_choose_59_2);
            _jettag_c_otherwise_62_3.setTagInfo(_td_c_otherwise_62_3);
            _jettag_c_otherwise_62_3.doStart(context, out);
            JET2Writer _jettag_c_otherwise_62_3_saved_out = out;
            while (_jettag_c_otherwise_62_3.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("\tback = ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_62_25 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_62_25); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_62_25.setRuntimeParent(_jettag_c_otherwise_62_3);
                _jettag_c_get_62_25.setTagInfo(_td_c_get_62_25);
                _jettag_c_get_62_25.doStart(context, out);
                _jettag_c_get_62_25.doEnd();
                out.write(";");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_otherwise_62_3.handleBodyContent(out);
            }
            out = _jettag_c_otherwise_62_3_saved_out;
            _jettag_c_otherwise_62_3.doEnd();
            _jettag_c_choose_59_2.handleBodyContent(out);
        }
        out = _jettag_c_choose_59_2_saved_out;
        _jettag_c_choose_59_2.doEnd();
        out.write("\tvar s = [");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_setVariable_66_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_66_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_66_2.setRuntimeParent(null);
        _jettag_c_setVariable_66_2.setTagInfo(_td_c_setVariable_66_2);
        _jettag_c_setVariable_66_2.doStart(context, out);
        _jettag_c_setVariable_66_2.doEnd();
        out.write("\t");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_iterate_67_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_67_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_67_2.setRuntimeParent(null);
        _jettag_c_iterate_67_2.setTagInfo(_td_c_iterate_67_2);
        _jettag_c_iterate_67_2.doStart(context, out);
        while (_jettag_c_iterate_67_2.okToProcessBody()) {
            out.write("\t[ ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_67_55 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_67_55); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_67_55.setRuntimeParent(_jettag_c_iterate_67_2);
            _jettag_c_get_67_55.setTagInfo(_td_c_get_67_55);
            _jettag_c_get_67_55.doStart(context, out);
            _jettag_c_get_67_55.doEnd();
            RuntimeTagElement _jettag_c_iterate_67_97 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_67_97); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_67_97.setRuntimeParent(_jettag_c_iterate_67_2);
            _jettag_c_iterate_67_97.setTagInfo(_td_c_iterate_67_97);
            _jettag_c_iterate_67_97.doStart(context, out);
            while (_jettag_c_iterate_67_97.okToProcessBody()) {
                out.write(" , ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_67_153 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_67_153); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_67_153.setRuntimeParent(_jettag_c_iterate_67_97);
                _jettag_c_get_67_153.setTagInfo(_td_c_get_67_153);
                _jettag_c_get_67_153.doStart(context, out);
                _jettag_c_get_67_153.doEnd();
                _jettag_c_iterate_67_97.handleBodyContent(out);
            }
            _jettag_c_iterate_67_97.doEnd();
            out.write(" ]");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_setVariable_67_199 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_67_199); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_67_199.setRuntimeParent(_jettag_c_iterate_67_2);
            _jettag_c_setVariable_67_199.setTagInfo(_td_c_setVariable_67_199);
            _jettag_c_setVariable_67_199.doStart(context, out);
            _jettag_c_setVariable_67_199.doEnd();
            RuntimeTagElement _jettag_c_choose_67_244 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_67_244); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_choose_67_244.setRuntimeParent(_jettag_c_iterate_67_2);
            _jettag_c_choose_67_244.setTagInfo(_td_c_choose_67_244);
            _jettag_c_choose_67_244.doStart(context, out);
            JET2Writer _jettag_c_choose_67_244_saved_out = out;
            while (_jettag_c_choose_67_244.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_when_67_270 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_67_270); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_when_67_270.setRuntimeParent(_jettag_c_choose_67_244);
                _jettag_c_when_67_270.setTagInfo(_td_c_when_67_270);
                _jettag_c_when_67_270.doStart(context, out);
                JET2Writer _jettag_c_when_67_270_saved_out = out;
                while (_jettag_c_when_67_270.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    _jettag_c_when_67_270.handleBodyContent(out);
                }
                out = _jettag_c_when_67_270_saved_out;
                _jettag_c_when_67_270.doEnd();
                RuntimeTagElement _jettag_c_otherwise_67_298 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_67_298); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_otherwise_67_298.setRuntimeParent(_jettag_c_choose_67_244);
                _jettag_c_otherwise_67_298.setTagInfo(_td_c_otherwise_67_298);
                _jettag_c_otherwise_67_298.doStart(context, out);
                JET2Writer _jettag_c_otherwise_67_298_saved_out = out;
                while (_jettag_c_otherwise_67_298.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write(" ,");  //$NON-NLS-1$        
                    _jettag_c_otherwise_67_298.handleBodyContent(out);
                }
                out = _jettag_c_otherwise_67_298_saved_out;
                _jettag_c_otherwise_67_298.doEnd();
                _jettag_c_choose_67_244.handleBodyContent(out);
            }
            out = _jettag_c_choose_67_244_saved_out;
            _jettag_c_choose_67_244.doEnd();
            _jettag_c_iterate_67_2.handleBodyContent(out);
        }
        _jettag_c_iterate_67_2.doEnd();
        RuntimeTagElement _jettag_c_choose_67_350 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_67_350); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_choose_67_350.setRuntimeParent(null);
        _jettag_c_choose_67_350.setTagInfo(_td_c_choose_67_350);
        _jettag_c_choose_67_350.doStart(context, out);
        JET2Writer _jettag_c_choose_67_350_saved_out = out;
        while (_jettag_c_choose_67_350.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_when_67_373 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_67_373); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_67_373.setRuntimeParent(_jettag_c_choose_67_350);
            _jettag_c_when_67_373.setTagInfo(_td_c_when_67_373);
            _jettag_c_when_67_373.doStart(context, out);
            JET2Writer _jettag_c_when_67_373_saved_out = out;
            while (_jettag_c_when_67_373.okToProcessBody()) {
                out = out.newNestedContentWriter();
                _jettag_c_when_67_373.handleBodyContent(out);
            }
            out = _jettag_c_when_67_373_saved_out;
            _jettag_c_when_67_373.doEnd();
            RuntimeTagElement _jettag_c_otherwise_67_400 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_67_400); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_otherwise_67_400.setRuntimeParent(_jettag_c_choose_67_350);
            _jettag_c_otherwise_67_400.setTagInfo(_td_c_otherwise_67_400);
            _jettag_c_otherwise_67_400.doStart(context, out);
            JET2Writer _jettag_c_otherwise_67_400_saved_out = out;
            while (_jettag_c_otherwise_67_400.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_choose_67_413 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_67_413); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_choose_67_413.setRuntimeParent(_jettag_c_otherwise_67_400);
                _jettag_c_choose_67_413.setTagInfo(_td_c_choose_67_413);
                _jettag_c_choose_67_413.doStart(context, out);
                JET2Writer _jettag_c_choose_67_413_saved_out = out;
                while (_jettag_c_choose_67_413.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    RuntimeTagElement _jettag_c_when_67_436 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_67_436); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_when_67_436.setRuntimeParent(_jettag_c_choose_67_413);
                    _jettag_c_when_67_436.setTagInfo(_td_c_when_67_436);
                    _jettag_c_when_67_436.doStart(context, out);
                    JET2Writer _jettag_c_when_67_436_saved_out = out;
                    while (_jettag_c_when_67_436.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        _jettag_c_when_67_436.handleBodyContent(out);
                    }
                    out = _jettag_c_when_67_436_saved_out;
                    _jettag_c_when_67_436.doEnd();
                    RuntimeTagElement _jettag_c_otherwise_67_463 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_67_463); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_otherwise_67_463.setRuntimeParent(_jettag_c_choose_67_413);
                    _jettag_c_otherwise_67_463.setTagInfo(_td_c_otherwise_67_463);
                    _jettag_c_otherwise_67_463.doStart(context, out);
                    JET2Writer _jettag_c_otherwise_67_463_saved_out = out;
                    while (_jettag_c_otherwise_67_463.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write(" ,");  //$NON-NLS-1$        
                        _jettag_c_otherwise_67_463.handleBodyContent(out);
                    }
                    out = _jettag_c_otherwise_67_463_saved_out;
                    _jettag_c_otherwise_67_463.doEnd();
                    _jettag_c_choose_67_413.handleBodyContent(out);
                }
                out = _jettag_c_choose_67_413_saved_out;
                _jettag_c_choose_67_413.doEnd();
                _jettag_c_otherwise_67_400.handleBodyContent(out);
            }
            out = _jettag_c_otherwise_67_400_saved_out;
            _jettag_c_otherwise_67_400.doEnd();
            _jettag_c_choose_67_350.handleBodyContent(out);
        }
        out = _jettag_c_choose_67_350_saved_out;
        _jettag_c_choose_67_350.doEnd();
        RuntimeTagElement _jettag_c_setVariable_67_528 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_67_528); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_67_528.setRuntimeParent(null);
        _jettag_c_setVariable_67_528.setTagInfo(_td_c_setVariable_67_528);
        _jettag_c_setVariable_67_528.doStart(context, out);
        _jettag_c_setVariable_67_528.doEnd();
        RuntimeTagElement _jettag_c_iterate_67_567 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_67_567); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_67_567.setRuntimeParent(null);
        _jettag_c_iterate_67_567.setTagInfo(_td_c_iterate_67_567);
        _jettag_c_iterate_67_567.doStart(context, out);
        while (_jettag_c_iterate_67_567.okToProcessBody()) {
            out.write(" ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_choose_67_622 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_67_622); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_choose_67_622.setRuntimeParent(_jettag_c_iterate_67_567);
            _jettag_c_choose_67_622.setTagInfo(_td_c_choose_67_622);
            _jettag_c_choose_67_622.doStart(context, out);
            JET2Writer _jettag_c_choose_67_622_saved_out = out;
            while (_jettag_c_choose_67_622.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_when_67_648 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_67_648); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_when_67_648.setRuntimeParent(_jettag_c_choose_67_622);
                _jettag_c_when_67_648.setTagInfo(_td_c_when_67_648);
                _jettag_c_when_67_648.doStart(context, out);
                JET2Writer _jettag_c_when_67_648_saved_out = out;
                while (_jettag_c_when_67_648.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    _jettag_c_when_67_648.handleBodyContent(out);
                }
                out = _jettag_c_when_67_648_saved_out;
                _jettag_c_when_67_648.doEnd();
                RuntimeTagElement _jettag_c_otherwise_67_675 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_67_675); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_otherwise_67_675.setRuntimeParent(_jettag_c_choose_67_622);
                _jettag_c_otherwise_67_675.setTagInfo(_td_c_otherwise_67_675);
                _jettag_c_otherwise_67_675.doStart(context, out);
                JET2Writer _jettag_c_otherwise_67_675_saved_out = out;
                while (_jettag_c_otherwise_67_675.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write(" ,");  //$NON-NLS-1$        
                    _jettag_c_otherwise_67_675.handleBodyContent(out);
                }
                out = _jettag_c_otherwise_67_675_saved_out;
                _jettag_c_otherwise_67_675.doEnd();
                _jettag_c_choose_67_622.handleBodyContent(out);
            }
            out = _jettag_c_choose_67_622_saved_out;
            _jettag_c_choose_67_622.doEnd();
            out.write(" [ ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_67_718 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_67_718); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_67_718.setRuntimeParent(_jettag_c_iterate_67_567);
            _jettag_c_get_67_718.setTagInfo(_td_c_get_67_718);
            _jettag_c_get_67_718.doStart(context, out);
            _jettag_c_get_67_718.doEnd();
            RuntimeTagElement _jettag_c_iterate_67_760 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_67_760); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_67_760.setRuntimeParent(_jettag_c_iterate_67_567);
            _jettag_c_iterate_67_760.setTagInfo(_td_c_iterate_67_760);
            _jettag_c_iterate_67_760.doStart(context, out);
            while (_jettag_c_iterate_67_760.okToProcessBody()) {
                out.write(" , ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_67_816 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_67_816); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_67_816.setRuntimeParent(_jettag_c_iterate_67_760);
                _jettag_c_get_67_816.setTagInfo(_td_c_get_67_816);
                _jettag_c_get_67_816.doStart(context, out);
                _jettag_c_get_67_816.doEnd();
                _jettag_c_iterate_67_760.handleBodyContent(out);
            }
            _jettag_c_iterate_67_760.doEnd();
            out.write(" ]");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_setVariable_67_862 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_67_862); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_67_862.setRuntimeParent(_jettag_c_iterate_67_567);
            _jettag_c_setVariable_67_862.setTagInfo(_td_c_setVariable_67_862);
            _jettag_c_setVariable_67_862.doStart(context, out);
            _jettag_c_setVariable_67_862.doEnd();
            _jettag_c_iterate_67_567.handleBodyContent(out);
        }
        _jettag_c_iterate_67_567.doEnd();
        out.write(NL);         
        out.write("\t];");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tvar sequence = [];");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tfor (var i = 0; i < s.length; i++) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tvar frame = [];");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tvar k = (i == 0) ? (s.length - 1) : (i - 1);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tfor (var j = 0; j < s[k].length; ++j) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif(i == back){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tfor(var jj = 0 ; jj < s[s.length-1].length ; jj++){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tframe[frame.length] = whiten(\"node\" + s[s.length-1][jj]);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tframe[frame.length] = whiten(\"node\" + s[k][j]);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\telse {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tframe[frame.length] = whiten(\"node\" + s[k][j]);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tframe[frame.length] = activate(\"node\" + s[i][0]);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tfor (var j = 1; j < s[i].length; ++j) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tframe[frame.length] = interleave(\"node\" + s[i][j]);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tsequence[i] = frame;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tvar loop = -1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tfunction StartAnimation() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("  \t\tdelay = setTimeout(\"run()\", 1);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" \t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(" \tfunction run () {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" \t\tfor(var i = 0 ; i < s.length ; i++){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" \t\t\tfor(var j = 0 ; j < s[i].length ; j++){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" \t\t\t\twhiten(\"node\"+s[i][j])();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" \t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" \t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" \t\tvar delay = 1000;");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_setVariable_106_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_106_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_106_4.setRuntimeParent(null);
        _jettag_c_setVariable_106_4.setTagInfo(_td_c_setVariable_106_4);
        _jettag_c_setVariable_106_4.doStart(context, out);
        _jettag_c_setVariable_106_4.doEnd();
        RuntimeTagElement _jettag_c_iterate_107_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_107_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_107_3.setRuntimeParent(null);
        _jettag_c_iterate_107_3.setTagInfo(_td_c_iterate_107_3);
        _jettag_c_iterate_107_3.doStart(context, out);
        while (_jettag_c_iterate_107_3.okToProcessBody()) {
            RuntimeTagElement _jettag_c_setVariable_108_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_108_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_108_4.setRuntimeParent(_jettag_c_iterate_107_3);
            _jettag_c_setVariable_108_4.setTagInfo(_td_c_setVariable_108_4);
            _jettag_c_setVariable_108_4.doStart(context, out);
            _jettag_c_setVariable_108_4.doEnd();
            _jettag_c_iterate_107_3.handleBodyContent(out);
        }
        _jettag_c_iterate_107_3.doEnd();
        RuntimeTagElement _jettag_c_choose_110_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_110_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_choose_110_3.setRuntimeParent(null);
        _jettag_c_choose_110_3.setTagInfo(_td_c_choose_110_3);
        _jettag_c_choose_110_3.doStart(context, out);
        JET2Writer _jettag_c_choose_110_3_saved_out = out;
        while (_jettag_c_choose_110_3.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write("\t\t");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_when_111_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_111_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_111_3.setRuntimeParent(_jettag_c_choose_110_3);
            _jettag_c_when_111_3.setTagInfo(_td_c_when_111_3);
            _jettag_c_when_111_3.doStart(context, out);
            JET2Writer _jettag_c_when_111_3_saved_out = out;
            while (_jettag_c_when_111_3.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("\t\tdelay = ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_111_30 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_111_30); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_111_30.setRuntimeParent(_jettag_c_when_111_3);
                _jettag_c_get_111_30.setTagInfo(_td_c_get_111_30);
                _jettag_c_get_111_30.doStart(context, out);
                _jettag_c_get_111_30.doEnd();
                out.write(";");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_when_111_3.handleBodyContent(out);
            }
            out = _jettag_c_when_111_3_saved_out;
            _jettag_c_when_111_3.doEnd();
            _jettag_c_choose_110_3.handleBodyContent(out);
        }
        out = _jettag_c_choose_110_3_saved_out;
        _jettag_c_choose_110_3.doEnd();
        out.write(" \t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" \t\tif (loop != sequence.length - 1) { loop += 1; }");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" \t\telse { ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" \t\t\tif(back >= s.length){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" \t\t\t\t//for(var i = 0 ; i < s.length ; i++){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" \t\t\t\t//\tfor(var j = 0 ; j < s[i].length ; j++){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" \t\t\t\t//\t\twhiten(\"node\"+s[i][j])();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" \t\t\t\t//\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" \t\t\t\t//}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" \t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" \t\t\telse{");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t \t\t\tloop = back; ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t \t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" \t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" \t\tvar framerun = sequence[loop];");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" \t\tfor (var i = 0; i < framerun.length; ++i) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" \t\t\tframerun[i]();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t//if(back > s.length && loop == s.length - 1){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t//\tsetTimeout(\"die()\", delay);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t//}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t//else {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t \t\tsetTimeout(\"run()\", delay);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t \t//}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" \t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" \t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" \tfunction die(){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" \t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" \t\tfor(var i = 0 ; i < s.length ; i++){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" \t\t\tfor(var j = 0 ; j < s[i].length ; j++){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" \t\t\t\twhiten(\"node\"+s[i][j])();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" \t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" \t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" \t\tsetTimeout(\"die()\", delay);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" \t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("]]></script>");  //$NON-NLS-1$        
    }
}
