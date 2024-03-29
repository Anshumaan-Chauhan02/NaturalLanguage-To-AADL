package main;
import java.lang.*;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import lib.TextToAADLParser;
import lib.TextToAADLVisitor;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;


public class Visitor<Object> extends AbstractParseTreeVisitor<Object> implements TextToAADLVisitor<Object> {
    String[] system_names = new String[20];
    Integer[] sys_connection = new Integer[20];
    String[] created_systems = new String[20];
    String[][] system_declaration = new String[30][2];
    String[] system_subcomponents = new String[10];
    String[] portnames = new String[10];
    int index_ports = 0;
    int index_subcomponents = 0;
    String[] connections = new String[10];
    int index_connections = 0;
    String[] sys_features = new String[20];
    int index_features = 0;
    int index = 0;
    int index_created = 0;

    Visitor() {
        for (int i = 0; i <= 19; i++) {
            sys_connection[i] = 0;
        }
    }

    /**
     * Visit a parse tree produced by {@link TextToAADLParser#nlparch}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    @Override
    public Object visitNlparch(TextToAADLParser.NlparchContext ctx) {
//        System.out.println(ctx.getText());
        return visitChildren(ctx);
    }

    /**
     * Visit a parse tree produced by {@link TextToAADLParser#sentences}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    @Override
    public Object visitSentences(TextToAADLParser.SentencesContext ctx) {

//        System.out.println(ctx.getText());
        return visitChildren(ctx);
    }

    /**
     * Visit a parse tree produced by {@link TextToAADLParser#sentence}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    @Override
    public Object visitSentence(TextToAADLParser.SentenceContext ctx) {
//        while(ctx.structural_stmt().iterator().hasNext()) {
//            ctx.structural_stmt().iterator().next();
//            System.out.println(ctx.structural_stmt().iterator().next().getText());
//
//        }
        return visitChildren(ctx);
    }

    /**
     * Visit a parse tree produced by {@link TextToAADLParser#functional_stmts}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    @Override
    public Object visitFunctional_stmts(TextToAADLParser.Functional_stmtsContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * Visit a parse tree produced by {@link TextToAADLParser#structural_stmt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    @Override
    public Object visitStructural_stmt(TextToAADLParser.Structural_stmtContext ctx) {


        String[] system_consists = new String[10];
        int index_consists = 0;
        String ctx_construction = ctx.getText();
        boolean var = false;
        StringTokenizer st = new StringTokenizer(ctx_construction, ",. ");
        StringTokenizer st2 = new StringTokenizer(ctx_construction, ",. ");
        String token_prev = "";
        StringTokenizer st3 = new StringTokenizer(ctx.struct_multinoun().getText(), ",. ");
        String main_comp=ctx.Struct_noun().getText();
        while (st3.hasMoreTokens()) {
            String token_name = st3.nextToken();
//            if (token_name.equals("consists") || token_name.equals("and") || token_name.equals("\n")) {
//                if (token_name.equals("consists")) {
                    system_consists[index_consists] = token_prev;
                    index_consists = index_consists + 1;
//                }
//                continue;
//            } else {

                for (int i = 0; i <= index - 1; i++) {

                    if (token_name.equals(system_names[i])) {
                        var = true;
                    }

                }
                if (var == false) {
                    system_names[index] = token_name;
                    index = index + 1;
                }
                var = false;
//            }
            if (token_name.equals("\n")) {

            } else {
                token_prev = token_name;
            }

        }
        boolean check_sys_name = false;
        for (int i = 0; i <= index - 1; i++) {
            check_sys_name = false;
            String x[] = new String[2];
            for (int j = 0; j <= index_created - 1; j++) {
                if (system_names[i].equals(created_systems[j])) {
                    check_sys_name = true;
                }
            }
            if (check_sys_name) {
                continue;
            } else {
                x = system_generate(system_names[i]);
                created_systems[index_created] = system_names[i];
                index_created = index_created + 1;
                for (int k = 0; k <= x.length - 1; k++) {
                    system_declaration[i][k] = x[k];

                }

            }
        }
        for (int i = 0; i <= index - 1; i++) {
            String newString = "";
            boolean check_sub = false;
            String n_c = "";
            for (int m = 0; m <= index_consists - 1; m++) {
                if (system_names[i].equals(system_consists[m])) {
                    check_sub = true;
                    n_c = system_consists[m];
                }
            }


            String args[] = new String[10];
            int index_args = 0;
            if (check_sub == true) {
                while (st2.hasMoreTokens()) {
                    String text = st2.nextToken();

                    if ((text.equals(n_c)) || (text.equals("consists")) || (text.equals("\n")) || (text.equals("and")) || (text.equals(null))) {
                        continue;
                    } else {
                        args[index_args] = text;
                        index_args = index_args + 1;
                    }
                }
                String[] new_args = new String[index_args];
                for (int b = 0; b <= index_args - 1; b++) {
                    new_args[b] = args[b];
                }
                boolean var_sub = false;
                for (int l = 0; l <= system_declaration[i][1].length() - 1; l++) {
                    char nl = '\n';
                    if ((system_declaration[i][1].charAt(l) == nl) && (!var_sub)) {

                        newString = system_declaration[i][1].charAt(l) + newString + subcomponents_generation(new_args);
                        String list_of_subc = "";
                        for (int m = 0; m <= new_args.length - 1; m++) {
                            list_of_subc = list_of_subc + " " + new_args[m];
                        }
                        boolean in_subcom = false;
                        int ind_in_subcomp = 0;
                        for (int a = 0; a <= index_subcomponents - 1; a++) {
                            StringTokenizer stsub = new StringTokenizer(system_subcomponents[a]);
                            String stmain = stsub.nextToken();
                            if (system_names[i].equals(stmain)) {
                                in_subcom = true;
                                ind_in_subcomp = a;
                            }
                        }
                        if (!in_subcom) {
                            system_subcomponents[index_subcomponents] = system_names[i] + list_of_subc;
                            index_subcomponents += 1;
                            var_sub = true;
                        } else {
                            system_subcomponents[ind_in_subcomp] = system_subcomponents[ind_in_subcomp] + list_of_subc;
                        }

                    } else {
                        newString = newString + system_declaration[i][1].charAt(l);
                    }
                }
                system_declaration[i][1] = newString;
            }

        }
        return null;
    }

    public String subcomponents_generation(String[] args) {
        String ret_subcomponent = "\n\tsubcomponents\n ";
        for (int i = 0; i <= args.length - 1; i++) {
            if ((args[i].equals("\n")) || (args[i].equals("consists")) || (args[i].equals("and"))) {
                continue;
            } else {
                ret_subcomponent = ret_subcomponent + "\t\t" + "this_" + args[i] + ": system " + args[i] + ".work;" + "\n";
            }

        }
        return ret_subcomponent;
    }

    public String[] system_generate(String sys_name) {
        String system_start = "system " + sys_name;
        String system_end = "end " + sys_name + ";" + "\n";
        String system_imp_start = "system implementation " + sys_name + ".work" + "\n";
        String system_imp_end = "end " + sys_name + ".work;" + "\n";
        String[] sys_return = new String[2];
        sys_return[0] = system_start + "\n" + system_end;
        sys_return[1] = system_imp_start + system_imp_end;
        return sys_return;
    }


    /**
     * Visit a parse tree produced by {@link TextToAADLParser#functional_stmt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    @Override
    public Object visitFunctional_stmt(TextToAADLParser.Functional_stmtContext ctx) {
//          System.out.println(ctx.getText());
//        System.out.println(ctx.Struct_noun());
//        System.out.println(ctx.FROM()==null);
//        System.out.println(ctx.TO()==null);
//        System.out.println(ctx.multi_flow().getText());
        String multf = ctx.multi_flow().getText();
        StringTokenizer st = new StringTokenizer(multf, " ");
        String[] flows = new String[10];
        for (int i = 0; i <= 9; i++) {
            flows[i] = "";
        }
        int index_flows = 0;
        while (st.hasMoreTokens()) {
            String sts = st.nextToken();
            if (sts.equals("and") || sts.equals(",")) {
                index_flows = index_flows + 1;
            } else {
                flows[index_flows] = flows[index_flows] + sts + " ";
            }
        }
        for (int i = 0; i <= index_flows; i++) {
            int count_within_token = 0;
            StringTokenizer flow_tokenize = new StringTokenizer(flows[i]);
            while (flow_tokenize.hasMoreTokens()) {
//                System.out.println(flow_tokenize.nextToken());
                flow_tokenize.nextToken();
                count_within_token += 1;
            }
            String new_flow = "";
            flow_tokenize = new StringTokenizer(flows[i]);
            if (count_within_token > 1) {
                while (flow_tokenize.hasMoreTokens()) {
                    String x = flow_tokenize.nextToken();
                    new_flow = new_flow + x + "_";
                }
                String new_flow_updated = "";
                for (int s = 0; s <= new_flow.length() - 2; s++) {
                    new_flow_updated = new_flow_updated + new_flow.charAt(s);
                }
                flows[i] = new_flow_updated;
            }
        }
        Iterator<TerminalNode> number_of_stnoun = ctx.Struct_noun().iterator();
        int number_of_sn = 0;
        String newString = "";
        int index_number = 0;
        while (number_of_stnoun.hasNext()) {
            String token = number_of_stnoun.next().toString();

            number_of_sn += 1;

            boolean in_sys_features = false;
            for (int i = 0; i <= index_features - 1; i++) {

                if (token.equals(sys_features[i])) {

                    in_sys_features = true;
                    break;
                }
            }
            if (!in_sys_features) {
                for (int j = 0; j <= index - 1; j++) {
                    if (token.equals(system_names[j])) {
                        index_number = j;
                    }
                }
                boolean newline_var = false;
                for (int k = 0; k <= system_declaration[index_number][0].length() - 1; k++) {
                    if ((system_declaration[index_number][0].charAt(k) == '\n') && (!newline_var)) {
                        newString = newString + "\n\tfeatures\n";
                        newline_var = true;
                        sys_features[index_features] = system_names[index_number];
                        index_features += 1;
                    } else {
                        newString = newString + system_declaration[index_number][0].charAt(k);
                    }
                }
                system_declaration[index_number][0] = newString;
                newString = "";
            }

        }
        //Now features has been added now, we add ports
//        System.out.println(ctx.FUNC_VERB());
        Iterator<TerminalNode> funcverbs = ctx.FUNC_VERB().iterator();
        String func_verb_used = "";
        while (funcverbs.hasNext()) {
            String fv = funcverbs.next().getText();
            if (fv.equals("imports") || fv.equals("transfers") || fv.equals("distributes")) {
                func_verb_used = fv;
            }
        }
        Integer[] number_of_in_ports = new Integer[number_of_sn + 1];
        Integer[] number_of_out_ports = new Integer[number_of_sn + 1];
        for (int i = 0; i <= number_of_sn; i++) {
            number_of_in_ports[i] = 0;
            number_of_out_ports[i] = 0;
        }

        if (number_of_sn == 1) {
            if (func_verb_used.equals("imports"))
                number_of_in_ports[0] = index_flows + 1;
            if (func_verb_used.equals("transfers"))
                number_of_out_ports[0] = index_flows + 1;

            Iterator<TerminalNode> stuct_nouns_used = ctx.Struct_noun().iterator();
            while (stuct_nouns_used.hasNext()) {
                int ind = 0;
                String t = stuct_nouns_used.next().getText();
                for (int i = 0; i <= index - 1; i++) {
                    if (t.equals(system_names[i])) {
                        ind = i;
                    }
                }
                boolean newline_var = true;
                int var_count_newline = 0;
                String newdecl = "";
                for (int i = 0; i <= system_declaration[ind][0].length() - 1; i++) {
                    if (system_declaration[ind][0].charAt(i) == '\n') {
                        var_count_newline += 1;
                    }
                    if ((var_count_newline == 2) && (newline_var)) {
                        newline_var = true;
                        int index_portnames = 0;
                        boolean already_in_ports = false;
                        for (int j = 0; j <= number_of_in_ports[0] - 1; j++) {
                            for (int k = 0; k <= index_ports - 1; k++) {
                                StringTokenizer stp = new StringTokenizer(portnames[k]);
                                String port_comp = stp.nextToken();
                                if (port_comp.equals(system_names[ind])) {
                                    already_in_ports = true;
                                    index_portnames = k;
                                }
                            }
                            if (already_in_ports) {

                                StringTokenizer stp = new StringTokenizer(portnames[index_portnames]);
                                stp.nextToken();
                                boolean if_named_port = false;
                                while (stp.hasMoreTokens()) {
                                    String portname_current = stp.nextToken();
                                    if (flows[j].equals(portname_current)) {
                                        if_named_port = true;
                                    }
                                }
                                if (if_named_port) {
                                    newdecl = newdecl + "\n\t\t" + flows[j] + "_from_outside" + ": in data port;";
                                    portnames[index_portnames] = portnames[index_portnames] + " " + flows[j] + "_from_outside";
                                } else {
                                    newdecl = newdecl + "\n\t\t" + flows[j] + ": in data port;";
                                    portnames[index_portnames] = portnames[index_portnames] + " " + flows[j];
                                }

                            } else {
                                portnames[index_ports] = system_names[ind] + " " + flows[j];
                                index_ports += 1;
                                newdecl = newdecl + "\n\t\t" + flows[j] + ": in data port;";
                            }
                        }
                        for (int j = 0; j <= number_of_out_ports[0] - 1; j++) {
                            for (int k = 0; k <= index_ports - 1; k++) {
                                StringTokenizer stp = new StringTokenizer(portnames[k]);
                                String port_comp = stp.nextToken();
                                if (port_comp.equals(system_names[ind])) {
                                    already_in_ports = true;
                                    index_portnames = k;
                                }
                            }
                            if (already_in_ports) {

                                StringTokenizer stp = new StringTokenizer(portnames[index_portnames]);
                                stp.nextToken();
                                boolean if_named_port = false;
                                while (stp.hasMoreTokens()) {
                                    String portname_current = stp.nextToken();
                                    if (flows[j].equals(portname_current)) {
                                        if_named_port = true;
                                    }
                                }
                                if (if_named_port) {
                                    newdecl = newdecl + "\n\t\t" + flows[j] + "_to_outside" + ": out data port;";
                                    portnames[index_portnames] = portnames[index_portnames] + " " + flows[j] + "_to_outside";
                                } else {
                                    newdecl = newdecl + "\n\t\t" + flows[j] + ": out data port;";
                                    portnames[index_portnames] = portnames[index_portnames] + " " + flows[j];
                                }

                            } else {
                                portnames[index_ports] = system_names[ind] + " " + flows[j];
                                index_ports += 1;
                                newdecl = newdecl + "\n\t\t" + flows[j] + ": out data port;";
                            }
                        }
                        newline_var = false;
                    }
                    newdecl = newdecl + system_declaration[ind][0].charAt(i);
                }
                system_declaration[ind][0] = newdecl;
            }
        } else if ((number_of_sn == 2) && ((ctx.FROM() != null))) {
            if (func_verb_used.equals("imports")) {
                number_of_in_ports[0] = index_flows + 1;
                number_of_out_ports[1] = index_flows + 1;
            }

            Iterator<TerminalNode> stuct_nouns_used = ctx.Struct_noun().iterator();
            Iterator<TerminalNode> for_start = ctx.Struct_noun().iterator();
            String start = for_start.next().getText();
            String temp = for_start.next().getText();
            int struct_val = 0;
            while (stuct_nouns_used.hasNext()) {
                int ind = 0;
                String t = stuct_nouns_used.next().getText();
                for (int i = 0; i <= index - 1; i++) {
                    if (t.equals(system_names[i])) {
                        ind = i;
                    }
                }
                boolean newline_var = true;
                int var_count_newline = 0;
                String newdecl = "";
                for (int i = 0; i <= system_declaration[ind][0].length() - 1; i++) {
                    if (system_declaration[ind][0].charAt(i) == '\n') {
                        var_count_newline += 1;
                    }
                    if ((var_count_newline == 2) && (newline_var)) {
                        newline_var = true;
                        int index_portnames = 0;
                        boolean already_in_ports = false;
                        for (int j = 0; j <= number_of_in_ports[struct_val] - 1; j++) {
                            for (int k = 0; k <= index_ports - 1; k++) {
                                StringTokenizer stp = new StringTokenizer(portnames[k]);
                                String port_comp = stp.nextToken();
                                if (port_comp.equals(system_names[ind])) {
                                    already_in_ports = true;
                                    index_portnames = k;
                                }
                            }
                            if (already_in_ports) {

                                StringTokenizer stp = new StringTokenizer(portnames[index_portnames]);
                                stp.nextToken();
                                boolean if_named_port = false;
                                while (stp.hasMoreTokens()) {
                                    String portname_current = stp.nextToken();
                                    if (flows[j].equals(portname_current)) {
                                        if_named_port = true;
                                    }
                                }
                                if (if_named_port) {

                                    newdecl = newdecl + "\n\t\t" + flows[j] + "_from_" + temp + ": in data port;";
                                    portnames[index_portnames] = portnames[index_portnames] + " " + flows[j] + "_from_" + temp;
                                } else {
                                    newdecl = newdecl + "\n\t\t" + flows[j] + ": in data port;";
                                    portnames[index_portnames] = portnames[index_portnames] + " " + flows[j];
                                }

                            } else {
                                portnames[index_ports] = system_names[ind] + " " + flows[j];
                                index_ports += 1;
                                newdecl = newdecl + "\n\t\t" + flows[j] + ": in data port;";
                            }
                        }
                        for (int j = 0; j <= number_of_out_ports[struct_val] - 1; j++) {
                            for (int k = 0; k <= index_ports - 1; k++) {
                                StringTokenizer stp = new StringTokenizer(portnames[k]);
                                String port_comp = stp.nextToken();
                                if (port_comp.equals(system_names[ind])) {
                                    already_in_ports = true;
                                    index_portnames = k;
                                }
                            }
                            if (already_in_ports) {

                                StringTokenizer stp = new StringTokenizer(portnames[index_portnames]);
                                stp.nextToken();
                                boolean if_named_port = false;
                                while (stp.hasMoreTokens()) {
                                    String portname_current = stp.nextToken();
                                    if (flows[j].equals(portname_current)) {
                                        if_named_port = true;
                                    }
                                }
                                if (if_named_port) {
                                    newdecl = newdecl + "\n\t\t" + flows[j] + "_to_" + start + ": out data port;";
                                    portnames[index_portnames] = portnames[index_portnames] + " " + flows[j] + "_to_" + start;
                                } else {
                                    newdecl = newdecl + "\n\t\t" + flows[j] + ": out data port;";
                                    portnames[index_portnames] = portnames[index_portnames] + " " + flows[j];
                                }

                            } else {
                                portnames[index_ports] = system_names[ind] + " " + flows[j];
                                index_ports += 1;
                                newdecl = newdecl + "\n\t\t" + flows[j] + ": out data port;";
                            }
                        }
                        newline_var = false;
                    }
                    newdecl = newdecl + system_declaration[ind][0].charAt(i);
                }
                system_declaration[ind][0] = newdecl;
                struct_val += 1;
            }
            stuct_nouns_used = ctx.Struct_noun().iterator();
            boolean[] check_sub = new boolean[2];
            String[] stn = new String[2];
            while (stuct_nouns_used.hasNext()) {
                for (int i = 0; i <= 1; i++) {
                    stn[i] = stuct_nouns_used.next().getText();
                    check_sub[i] = false;
                }
                boolean all_in_c = false;
                String comp = "";
                for (int i = 0; i <= index_subcomponents - 1; i++) {
                    StringTokenizer list_of_sub = new StringTokenizer(system_subcomponents[i]);
                    comp = list_of_sub.nextToken();
                    check_sub[0] = false;
                    check_sub[1] = false;
                    while (list_of_sub.hasMoreTokens()) {
                        String token = list_of_sub.nextToken();
                        if (token.equals(stn[0])) {
                            check_sub[0] = true;
                        }
                        if (token.equals(stn[1])) {
                            check_sub[1] = true;
                        }
                        if (check_sub[0] && check_sub[1]) {
                            all_in_c = true;
                        }
                    }
                }
                if (all_in_c) {
                    Iterator<TerminalNode> tostore = ctx.Struct_noun().iterator();
                    String tostorestn[] = new String[2];
                    tostorestn[0] = tostore.next().getText();
                    tostorestn[1] = tostore.next().getText();
                    int already_done_ports = 0;
                    int number_of_tokens_start = 0;
                    int number_of_tokens_last = 0;
                    for (int x = 0; x <= index_ports - 1; x++) {
                        StringTokenizer start_comp = new StringTokenizer(portnames[x]);
                        String start_node = start_comp.nextToken();
                        if (start_node.equals(tostorestn[0])) {
                            while (start_comp.hasMoreTokens()) {
                                number_of_tokens_start += 1;
                                start_comp.nextToken();
                            }
                        }
                        if (start_node.equals(tostorestn[1])) {
                            while (start_comp.hasMoreTokens()) {
                                number_of_tokens_last += 1;
                                start_comp.nextToken();
                            }
                        }
                    }
                    while (already_done_ports <= index_flows) {
                        int ind_c = 0;
                        for (int k = 0; k <= system_names.length - 1; k++) {

                            if (comp.equals(system_names[k])) {
                                ind_c = k;
                            }
                        }
                        String newdec = "";
                        boolean newlinevar = false;
                        int newlvar = 0;
                        int char_to_replace = 0;
                        for (int m = system_declaration[ind_c][1].length() - 1; m >= 0; m--) {
                            if ((system_declaration[ind_c][1].charAt(m) == '\n') && (newlinevar)) {
                                char_to_replace = m;
                                newlinevar = false;
                                break;

                            }
                            if (system_declaration[ind_c][1].charAt(m) == '\n') {
                                newlvar += 1;
                                if (newlvar == 1) {
                                    newlinevar = true;
                                }
                            }
                        }
                        boolean already_connections = false;
                        for (int y = 0; y <= index_connections - 1; y++) {
                            if (system_names[ind_c].equals(connections[y])) {
                                already_connections = true;
                            }
                        }


                        if (already_connections) {
                            String startport = "";
                            String endport = "";
                            for (int v = 0; v <= index_ports - 1; v++) {
                                StringTokenizer start_comp = new StringTokenizer(portnames[v]);
                                String start_node = start_comp.nextToken();
                                if (start_node.equals(tostorestn[0])) {
                                    int c_s = 0;
                                    while (start_comp.hasMoreTokens()) {

                                        endport = start_comp.nextToken();
                                        c_s += 1;

                                        if (c_s >= (number_of_tokens_start - index_flows + already_done_ports)) {

                                            break;
                                        }
                                    }
                                }
                                if (start_node.equals(tostorestn[1])) {
                                    int c_e = 0;
                                    while (start_comp.hasMoreTokens()) {
                                        startport = start_comp.nextToken();
                                        c_e += 1;
                                        if (c_e >= (number_of_tokens_last - index_flows + already_done_ports)) {
                                            break;
                                        }
                                    }
                                }
                            }
                            for (int i = 0; i <= system_declaration[ind_c][1].length() - 1; i++) {
                                if (i == char_to_replace) {

                                    sys_connection[ind_c] = sys_connection[ind_c] + 1;
                                    newdec = newdec + "\n\t\t" + system_names[ind_c] + sys_connection[ind_c] + ": port this_" + tostorestn[1] + "." + startport + "->" + "this_" + tostorestn[0] + "." + endport + ";\n";

                                } else {
                                    newdec = newdec + system_declaration[ind_c][1].charAt(i);
                                }
                            }
                            system_declaration[ind_c][1] = newdec;
                            already_done_ports += 1;
                        } else {
                            String startport = "";
                            String endport = "";

                            for (int v = 0; v <= index_ports - 1; v++) {
                                StringTokenizer start_comp = new StringTokenizer(portnames[v]);
                                String start_node = start_comp.nextToken();
                                if (start_node.equals(tostorestn[0])) {
                                    int c_s = 0;
                                    while (start_comp.hasMoreTokens()) {

                                        endport = start_comp.nextToken();
                                        c_s += 1;

                                        if (c_s >= (number_of_tokens_start - index_flows + already_done_ports)) {

                                            break;
                                        }
                                    }
                                }
                                if (start_node.equals(tostorestn[1])) {
                                    int c_e = 0;
                                    while (start_comp.hasMoreTokens()) {
                                        startport = start_comp.nextToken();
                                        c_e += 1;
                                        if (c_e >= (number_of_tokens_last - index_flows + already_done_ports)) {

                                            break;
                                        }
                                    }
                                }
                            }

                            for (int i = 0; i <= system_declaration[ind_c][1].length() - 1; i++) {
                                if (i == char_to_replace) {

                                    newdec = newdec + "\n\tconnections\n";
                                    sys_connection[ind_c] = 1;
                                    newdec = newdec + "\t\t" + system_names[ind_c] + sys_connection[ind_c] + ": port this_" + tostorestn[1] + "." + startport + "->" + "this_" + tostorestn[0] + "." + endport + ";\n";

                                } else {
                                    newdec = newdec + system_declaration[ind_c][1].charAt(i);
                                }
                            }
                            system_declaration[ind_c][1] = newdec;
                            connections[index_connections] = system_names[ind_c];
                            index_connections += 1;
                            already_done_ports += 1;
                        }
                    }
                }
            }
        } else if ((number_of_sn == 2) && (!(ctx.TO() == null))) {
            if (func_verb_used.equals("transfers") || func_verb_used.equals("distributes")) {
                number_of_out_ports[0] = index_flows + 1;
                number_of_in_ports[1] = index_flows + 1;
            }

            Iterator<TerminalNode> stuct_nouns_used = ctx.Struct_noun().iterator();
            Iterator<TerminalNode> for_start = ctx.Struct_noun().iterator();
            String start = for_start.next().getText();
            String temp = for_start.next().getText();
            int struct_val = 0;
            while (stuct_nouns_used.hasNext()) {
                int ind = 0;
                String t = stuct_nouns_used.next().getText();

                for (int i = 0; i <= index - 1; i++) {
                    if (t.equals(system_names[i])) {
                        ind = i;
                    }
                }
                boolean newline_var = true;
                int var_count_newline = 0;
                String newdecl = "";
                for (int i = 0; i <= system_declaration[ind][0].length() - 1; i++) {
                    if (system_declaration[ind][0].charAt(i) == '\n') {
                        var_count_newline += 1;
                    }
                    if ((var_count_newline == 2) && (newline_var)) {
                        newline_var = true;
                        int index_portnames = 0;
                        boolean already_in_ports = false;
                        for (int j = 0; j <= number_of_in_ports[struct_val] - 1; j++) {
                            for (int k = 0; k <= index_ports - 1; k++) {
                                StringTokenizer stp = new StringTokenizer(portnames[k]);
                                String port_comp = stp.nextToken();
                                if (port_comp.equals(system_names[ind])) {
                                    already_in_ports = true;
                                    index_portnames = k;
                                }
                            }
                            if (already_in_ports) {

                                StringTokenizer stp = new StringTokenizer(portnames[index_portnames]);
                                stp.nextToken();
                                boolean if_named_port = false;
                                while (stp.hasMoreTokens()) {
                                    String portname_current = stp.nextToken();
                                    if (flows[j].equals(portname_current)) {
                                        if_named_port = true;
                                    }
                                }
                                if (if_named_port) {
                                    newdecl = newdecl + "\n\t\t" + flows[j] + "_from_" + start + ": in data port;";
                                    portnames[index_portnames] = portnames[index_portnames] + " " + flows[j] + "_from_" + start;
                                } else {
                                    newdecl = newdecl + "\n\t\t" + flows[j] + ": in data port;";
                                    portnames[index_portnames] = portnames[index_portnames] + " " + flows[j];
                                }

                            } else {
                                portnames[index_ports] = system_names[ind] + " " + flows[j];
                                index_ports += 1;
                                newdecl = newdecl + "\n\t\t" + flows[j] + ": in data port;";
                            }
                        }
                        for (int j = 0; j <= number_of_out_ports[struct_val] - 1; j++) {
                            for (int k = 0; k <= index_ports - 1; k++) {
                                StringTokenizer stp = new StringTokenizer(portnames[k]);
                                String port_comp = stp.nextToken();
                                if (port_comp.equals(system_names[ind])) {
                                    already_in_ports = true;
                                    index_portnames = k;
                                }
                            }
                            if (already_in_ports) {

                                StringTokenizer stp = new StringTokenizer(portnames[index_portnames]);
                                stp.nextToken();
                                boolean if_named_port = false;
                                while (stp.hasMoreTokens()) {
                                    String portname_current = stp.nextToken();
                                    if (flows[j].equals(portname_current)) {
                                        if_named_port = true;
                                    }
                                }
                                if (if_named_port) {

                                    newdecl = newdecl + "\n\t\t" + flows[j] + "_to_" + temp + ": out data port;";
                                    portnames[index_portnames] = portnames[index_portnames] + " " + flows[j] + "_to_" + temp;
                                } else {
                                    newdecl = newdecl + "\n\t\t" + flows[j] + ": out data port;";
                                    portnames[index_portnames] = portnames[index_portnames] + " " + flows[j];
                                }

                            } else {
                                portnames[index_ports] = system_names[ind] + " " + flows[j];
                                index_ports += 1;
                                newdecl = newdecl + "\n\t\t" + flows[j] + ": out data port;";
                            }
                        }
                        newline_var = false;
                    }
                    newdecl = newdecl + system_declaration[ind][0].charAt(i);
                }
                system_declaration[ind][0] = newdecl;
                struct_val += 1;
            }
            stuct_nouns_used = ctx.Struct_noun().iterator();
            boolean[] check_sub = new boolean[2];
            String[] stn = new String[2];
            while (stuct_nouns_used.hasNext())

                for (int i = 0; i <= 1; i++) {
                    stn[i] = stuct_nouns_used.next().getText();
                    check_sub[i] = false;
                }

            boolean all_in_c = false;
            String comp = "";
            for (int i = 0; i <= index_subcomponents - 1; i++) {
                check_sub[0] = false;
                check_sub[1] = false;
                StringTokenizer list_of_sub = new StringTokenizer(system_subcomponents[i]);
                comp = list_of_sub.nextToken();
                while (list_of_sub.hasMoreTokens()) {
                    String token = list_of_sub.nextToken();
                    if (token.equals(stn[0])) {
                        check_sub[0] = true;
                    }
                    if (token.equals(stn[1])) {
                        check_sub[1] = true;
                    }
                    if (check_sub[0] && check_sub[1]) {
                        all_in_c = true;
                    }
                }
            }
            if (all_in_c) {
                Iterator<TerminalNode> tostore = ctx.Struct_noun().iterator();
                String tostorestn[] = new String[2];
                tostorestn[0] = tostore.next().getText();
                tostorestn[1] = tostore.next().getText();
                int already_done_ports = 0;
                int number_of_tokens_start = 0;
                int number_of_tokens_last = 0;
                for (int x = 0; x <= index_ports - 1; x++) {
                    StringTokenizer start_comp = new StringTokenizer(portnames[x]);
                    String start_node = start_comp.nextToken();
                    if (start_node.equals(tostorestn[0])) {
                        while (start_comp.hasMoreTokens()) {
                            number_of_tokens_start += 1;
                            start_comp.nextToken();
                        }
                    }
                    if (start_node.equals(tostorestn[1])) {
                        while (start_comp.hasMoreTokens()) {
                            number_of_tokens_last += 1;
                            start_comp.nextToken();
                        }
                    }
                }
                while (already_done_ports <= index_flows) {
                    int ind_c = 0;
                    for (int k = 0; k <= system_names.length - 1; k++) {

                        if (comp.equals(system_names[k])) {
                            ind_c = k;
                        }
                    }
                    String newdec = "";
                    boolean newlinevar = false;
                    int newlvar = 0;
                    int char_to_replace = 0;
                    for (int m = system_declaration[ind_c][1].length() - 1; m >= 0; m--) {
                        if ((system_declaration[ind_c][1].charAt(m) == '\n') && (newlinevar)) {
                            char_to_replace = m;
                            newlinevar = false;
                            break;

                        }
                        if (system_declaration[ind_c][1].charAt(m) == '\n') {
                            newlvar += 1;
                            if (newlvar == 1) {
                                newlinevar = true;
                            }
                        }
                    }
                    boolean already_connections = false;
                    for (int y = 0; y <= index_connections - 1; y++) {
                        if (system_names[ind_c].equals(connections[y])) {
                            already_connections = true;
                        }
                    }
                    if (already_connections) {

                        String startport = "";
                        String endport = "";
                        for (int v = 0; v <= index_ports - 1; v++) {
                            StringTokenizer start_comp = new StringTokenizer(portnames[v]);
                            String start_node = start_comp.nextToken();
                            if (start_node.equals(tostorestn[0])) {
                                int c_s = 0;
                                while (start_comp.hasMoreTokens()) {
                                    startport = start_comp.nextToken();
                                    c_s += 1;

                                    if (c_s >= (number_of_tokens_start - index_flows + already_done_ports)) {

                                        break;
                                    }
                                }
                            }
                            if (start_node.equals(tostorestn[1])) {
                                int c_e = 0;
                                while (start_comp.hasMoreTokens()) {
                                    endport = start_comp.nextToken();
                                    c_e += 1;

                                    if (c_e >= (number_of_tokens_last - index_flows + already_done_ports)) {

                                        break;
                                    }
                                }
                            }
                        }
                        for (int i = 0; i <= system_declaration[ind_c][1].length() - 1; i++) {
                            if (i == char_to_replace) {

                                sys_connection[ind_c] = sys_connection[ind_c] + 1;
                                newdec = newdec + "\n\t\t" + system_names[ind_c] + sys_connection[ind_c] + ": port this_" + tostorestn[0] + "." + startport + "->" + "this_" + tostorestn[1] + "." + endport + ";\n";

                            } else {
                                newdec = newdec + system_declaration[ind_c][1].charAt(i);
                            }
                        }
                        system_declaration[ind_c][1] = newdec;
                        already_done_ports += 1;
                    } else {

                        String startport = "";
                        String endport = "";
                        for (int v = 0; v <= index_ports - 1; v++) {
                            StringTokenizer start_comp = new StringTokenizer(portnames[v]);
                            String start_node = start_comp.nextToken();
                            if (start_node.equals(tostorestn[0])) {
                                int c_s = 0;
                                while (start_comp.hasMoreTokens()) {
                                    startport = start_comp.nextToken();
                                    c_s += 1;

                                    if (c_s >= (number_of_tokens_start - index_flows + already_done_ports)) {

                                        break;
                                    }
                                }
                            }
                            if (start_node.equals(tostorestn[1])) {
                                int c_e = 0;
                                while (start_comp.hasMoreTokens()) {
                                    endport = start_comp.nextToken();
                                    c_e += 1;

                                    if (c_e >= (number_of_tokens_last - index_flows + already_done_ports)) {

                                        break;
                                    }
                                }
                            }
                        }
                        for (int i = 0; i <= system_declaration[ind_c][1].length() - 1; i++) {
                            if (i == char_to_replace) {

                                newdec = newdec + "\n\tconnections\n";
                                sys_connection[ind_c] = 1;
                                newdec = newdec + "\t\t" + system_names[ind_c] + sys_connection[ind_c] + ": port this_" + tostorestn[0] + "." + startport + "->" + "this_" + tostorestn[1] + "." + endport + ";\n";

                            } else {
                                newdec = newdec + system_declaration[ind_c][1].charAt(i);
                            }
                        }
                        system_declaration[ind_c][1] = newdec;
                        connections[index_connections] = system_names[ind_c];
                        index_connections += 1;
                        already_done_ports += 1;
                    }
                }
            }
        } else if (number_of_sn == 3) {
            if (func_verb_used.equals("transfers")) {
                number_of_in_ports[0] = index_flows + 1;
                number_of_out_ports[0] = index_flows + 1;
                number_of_out_ports[1] = index_flows + 1;
                number_of_in_ports[2] = index_flows + 1;
            }

            Iterator<TerminalNode> stuct_nouns_used = ctx.Struct_noun().iterator();
            Iterator<TerminalNode> for_start = ctx.Struct_noun().iterator();
            String start = for_start.next().getText();
            String second = for_start.next().getText();
            String last = for_start.next().getText();
            int flow_going = -1;
            int struct_val = 0;
            while (stuct_nouns_used.hasNext()) {
                flow_going += 1;
                int ind = 0;
                String t = stuct_nouns_used.next().getText();
                for (int i = 0; i <= index - 1; i++) {
                    if (t.equals(system_names[i])) {
                        ind = i;
                    }
                }
                boolean newline_var = true;
                int var_count_newline = 0;
                String newdecl = "";
                for (int i = 0; i <= system_declaration[ind][0].length() - 1; i++) {
                    if (system_declaration[ind][0].charAt(i) == '\n') {
                        var_count_newline += 1;
                    }
                    if ((var_count_newline == 2) && (newline_var)) {
                        newline_var = true;
                        int index_portnames = 0;
                        boolean already_in_ports = false;
                        for (int j = 0; j <= number_of_in_ports[struct_val] - 1; j++) {
                            for (int k = 0; k <= index_ports - 1; k++) {
                                StringTokenizer stp = new StringTokenizer(portnames[k]);
                                String port_comp = stp.nextToken();
                                if (port_comp.equals(system_names[ind])) {
                                    already_in_ports = true;
                                    index_portnames = k;
                                }
                            }
                            if (already_in_ports) {

                                StringTokenizer stp = new StringTokenizer(portnames[index_portnames]);
                                stp.nextToken();
                                boolean if_named_port = false;
                                while (stp.hasMoreTokens()) {
                                    String portname_current = stp.nextToken();
                                    if (flows[j].equals(portname_current)) {
                                        if_named_port = true;
                                    }
                                }
                                if (if_named_port) {
                                    if (flow_going == 0) {
                                        newdecl = newdecl + "\n\t\t" + flows[j] + "_from_" + second + ": in data port;";
                                        portnames[index_portnames] = portnames[index_portnames] + " " + flows[j] + "_from_" + second;
                                    }

                                    if (flow_going == 2) {
                                        newdecl = newdecl + "\n\t\t" + flows[j] + "_from_" + start + ": in data port;";
                                        portnames[index_portnames] = portnames[index_portnames] + " " + flows[j] + "_from_" + start;
                                    }

                                } else {
                                    newdecl = newdecl + "\n\t\t" + flows[j] + ": in data port;";
                                    portnames[index_portnames] = portnames[index_portnames] + " " + flows[j];
                                }

                            } else {
                                portnames[index_ports] = system_names[ind] + " " + flows[j];
                                index_ports += 1;
                                newdecl = newdecl + "\n\t\t" + flows[j] + ": in data port;";
                            }
                        }
                        for (int j = 0; j <= number_of_out_ports[struct_val] - 1; j++) {
                            for (int k = 0; k <= index_ports - 1; k++) {
                                StringTokenizer stp = new StringTokenizer(portnames[k]);
                                String port_comp = stp.nextToken();
                                if (port_comp.equals(system_names[ind])) {
                                    already_in_ports = true;
                                    index_portnames = k;
                                }
                            }
                            if (already_in_ports) {

                                StringTokenizer stp = new StringTokenizer(portnames[index_portnames]);
                                stp.nextToken();
                                boolean if_named_port = false;
                                while (stp.hasMoreTokens()) {
                                    String portname_current = stp.nextToken();
                                    if (flows[j].equals(portname_current)) {
                                        if_named_port = true;
                                    }
                                }
                                if (if_named_port) {
                                    if (flow_going == 0) {
                                        newdecl = newdecl + "\n\t\t" + flows[j] + "_to_" + last + ": out data port;";
                                        portnames[index_portnames] = portnames[index_portnames] + " " + flows[j] + "_to_" + last;
                                    }
                                    if (flow_going == 1) {
                                        newdecl = newdecl + "\n\t\t" + flows[j] + "_to_" + start + ": out data port;";
                                        portnames[index_portnames] = portnames[index_portnames] + " " + flows[j] + "_to_" + start;
                                    }

                                } else {
                                    newdecl = newdecl + "\n\t\t" + flows[j] + ": out data port;";
                                    portnames[index_portnames] = portnames[index_portnames] + " " + flows[j];
                                }

                            } else {
                                portnames[index_ports] = system_names[ind] + " " + flows[j];
                                index_ports += 1;
                                newdecl = newdecl + "\n\t\t" + flows[j] + ": out data port;";
                            }
                        }
                        newline_var = false;
                    }
                    newdecl = newdecl + system_declaration[ind][0].charAt(i);
                }
                system_declaration[ind][0] = newdecl;
                struct_val += 1;
            }
            stuct_nouns_used = ctx.Struct_noun().iterator();
            boolean[] check_sub = new boolean[2];
            boolean[] check_sub_2 = new boolean[2];
            String[] stn = new String[3];
            while (stuct_nouns_used.hasNext())

                for (int i = 0; i <= 2; i++) {
                    stn[i] = stuct_nouns_used.next().getText();
                    if (i < 2) {
                        check_sub[i] = false;
                        check_sub_2[i] = false;
                    }
                }
            boolean all_in_c = false;
            boolean all_in_c_1 = false;
            String comp = "";
            String comp2 = "";
            for (int i = 0; i <= index_subcomponents - 1; i++) {
                check_sub[0] = false;
                check_sub[1] = false;
                check_sub_2[0] = false;
                check_sub_2[1] = false;
                StringTokenizer list_of_sub = new StringTokenizer(system_subcomponents[i]);
                StringTokenizer list_of_sub_2 = new StringTokenizer(system_subcomponents[i]);
                comp = list_of_sub.nextToken();
                comp2 = list_of_sub_2.nextToken();
                while (list_of_sub.hasMoreTokens()) {
                    String token = list_of_sub.nextToken();
                    if (token.equals(stn[0])) {
                        check_sub[0] = true;
                    }
                    if (token.equals(stn[1])) {
                        check_sub[1] = true;
                    }
                    if (check_sub[0] && check_sub[1]) {
                        all_in_c = true;
                    }
                }
                while (list_of_sub_2.hasMoreTokens()) {
                    String token = list_of_sub_2.nextToken();
                    if (token.equals(stn[0])) {
                        check_sub_2[0] = true;
                    }
                    if (token.equals(stn[2])) {
                        check_sub_2[1] = true;
                    }
                    if (check_sub_2[0] && check_sub_2[1]) {
                        all_in_c_1 = true;
                    }
                }
            }
            if (all_in_c) {
                int ind_c = 0;
                for (int k = 0; k <= system_names.length - 1; k++) {

                    if (comp.equals(system_names[k])) {
                        ind_c = k;
                    }
                }
                String newdec = "";
                boolean newlinevar = false;
                int newlvar = 0;
                int char_to_replace = 0;
                for (int m = system_declaration[ind_c][1].length() - 1; m >= 0; m--) {
                    if ((system_declaration[ind_c][1].charAt(m) == '\n') && (newlinevar)) {
                        char_to_replace = m;
                        newlinevar = false;
                        break;

                    }
                    if (system_declaration[ind_c][1].charAt(m) == '\n') {
                        newlvar += 1;
                        if (newlvar == 1) {
                            newlinevar = true;
                        }
                    }
                }
                boolean already_connections = false;
                for (int y = 0; y <= index_connections - 1; y++) {
                    if (system_names[ind_c].equals(connections[y])) {
                        already_connections = true;
                    }
                }
                if (already_connections) {
                    Iterator<TerminalNode> tostore = ctx.Struct_noun().iterator();
                    String tostorestn[] = new String[2];
                    tostorestn[0] = tostore.next().getText();
                    tostorestn[1] = tostore.next().getText();
                    String startport = "";
                    String endport = "";
                    String second_last = "";
                    for (int v = 0; v <= index_ports - 1; v++) {
                        StringTokenizer start_comp = new StringTokenizer(portnames[v]);
                        String start_node = start_comp.nextToken();
                        if (start_node.equals(tostorestn[0])) {
                            while (start_comp.hasMoreTokens()) {
                                second_last = endport;
                                endport = start_comp.nextToken();
                            }
                        }
                        if (start_node.equals(tostorestn[1])) {
                            while (start_comp.hasMoreTokens()) {
                                startport = start_comp.nextToken();
                            }
                        }
                    }
                    for (int i = 0; i <= system_declaration[ind_c][1].length() - 1; i++) {
                        if (i == char_to_replace) {

                            sys_connection[ind_c] = sys_connection[ind_c] + 1;
                            newdec = newdec + "\n\t\t" + system_names[ind_c] + sys_connection[ind_c] + ": port this_" + tostorestn[1] + "." + startport + "->" + "this_" + tostorestn[0] + "." + second_last + ";\n";

                        } else {
                            newdec = newdec + system_declaration[ind_c][1].charAt(i);
                        }
                    }
                    system_declaration[ind_c][1] = newdec;
                } else {
                    Iterator<TerminalNode> tostore = ctx.Struct_noun().iterator();
                    String tostorestn[] = new String[2];
                    tostorestn[0] = tostore.next().getText();
                    tostorestn[1] = tostore.next().getText();
                    String startport = "";
                    String endport = "";
                    String second_last = "";
                    for (int v = 0; v <= index_ports - 1; v++) {
                        StringTokenizer start_comp = new StringTokenizer(portnames[v]);
                        String start_node = start_comp.nextToken();
                        if (start_node.equals(tostorestn[0])) {
                            while (start_comp.hasMoreTokens()) {
                                second_last = endport;
                                endport = start_comp.nextToken();
                            }
                        }
                        if (start_node.equals(tostorestn[1])) {
                            while (start_comp.hasMoreTokens()) {
                                startport = start_comp.nextToken();
                            }
                        }
                    }
                    for (int i = 0; i <= system_declaration[ind_c][1].length() - 1; i++) {
                        if (i == char_to_replace) {

                            newdec = newdec + "\n\tconnections\n";
                            sys_connection[ind_c] = 1;
                            newdec = newdec + "\n\t\t" + system_names[ind_c] + sys_connection[ind_c] + ": port this_" + tostorestn[1] + "." + startport + "->" + "this_" + tostorestn[0] + "." + second_last + ";\n";

                        } else {
                            newdec = newdec + system_declaration[ind_c][1].charAt(i);
                        }
                    }
                    system_declaration[ind_c][1] = newdec;
                    connections[index_connections] = system_names[ind_c];
                    index_connections += 1;
                }
            }
            if (all_in_c_1) {
                int ind_c = 0;
                for (int k = 0; k <= system_names.length - 1; k++) {

                    if (comp2.equals(system_names[k])) {
                        ind_c = k;
                    }
                }
                String newdec = "";
                boolean newlinevar = false;
                int newlvar = 0;
                int char_to_replace = 0;
                for (int m = system_declaration[ind_c][1].length() - 1; m >= 0; m--) {
                    if ((system_declaration[ind_c][1].charAt(m) == '\n') && (newlinevar)) {
                        char_to_replace = m;
                        newlinevar = false;
                        break;

                    }
                    if (system_declaration[ind_c][1].charAt(m) == '\n') {
                        newlvar += 1;
                        if (newlvar == 1) {
                            newlinevar = true;
                        }
                    }
                }
                boolean already_connections = false;
                for (int y = 0; y <= index_connections - 1; y++) {
                    if (system_names[ind_c].equals(connections[y])) {
                        already_connections = true;
                    }
                }
                if (already_connections) {
                    Iterator<TerminalNode> tostore = ctx.Struct_noun().iterator();
                    String tostorestn[] = new String[2];
                    tostorestn[0] = tostore.next().getText();
                    tostore.next();
                    tostorestn[1] = tostore.next().getText();
                    String startport = "";
                    String endport = "";
                    for (int v = 0; v <= index_ports - 1; v++) {
                        StringTokenizer start_comp = new StringTokenizer(portnames[v]);
                        String start_node = start_comp.nextToken();
                        if (start_node.equals(tostorestn[0])) {
                            while (start_comp.hasMoreTokens()) {
                                startport = start_comp.nextToken();
                            }
                        }
                        if (start_node.equals(tostorestn[1])) {
                            while (start_comp.hasMoreTokens()) {
                                endport = start_comp.nextToken();
                            }
                        }
                    }
                    for (int i = 0; i <= system_declaration[ind_c][1].length() - 1; i++) {
                        if (i == char_to_replace) {

                            sys_connection[ind_c] = sys_connection[ind_c] + 1;
                            newdec = newdec + "\n\t\t" + system_names[ind_c] + sys_connection[ind_c] + ": port this_" + tostorestn[0] + "." + startport + "->" + "this_" + tostorestn[1] + "." + endport + ";\n";

                        } else {
                            newdec = newdec + system_declaration[ind_c][1].charAt(i);
                        }
                    }
                    system_declaration[ind_c][1] = newdec;
                } else {
                    Iterator<TerminalNode> tostore = ctx.Struct_noun().iterator();
                    String tostorestn[] = new String[2];
                    tostorestn[0] = tostore.next().getText();
                    tostore.next();
                    tostorestn[1] = tostore.next().getText();
                    String startport = "";
                    String endport = "";
                    for (int v = 0; v <= index_ports - 1; v++) {
                        StringTokenizer start_comp = new StringTokenizer(portnames[v]);
                        String start_node = start_comp.nextToken();
                        if (start_node.equals(tostorestn[0])) {
                            while (start_comp.hasMoreTokens()) {
                                startport = start_comp.nextToken();
                            }
                        }
                        if (start_node.equals(tostorestn[1])) {
                            while (start_comp.hasMoreTokens()) {
                                endport = start_comp.nextToken();
                            }
                        }
                    }
                    for (int i = 0; i <= system_declaration[ind_c][1].length() - 1; i++) {
                        if (i == char_to_replace) {

                            newdec = newdec + "\n\tconnections\n";
                            sys_connection[ind_c] = 1;
                            newdec = newdec + "\n\t\t" + system_names[ind_c] + sys_connection[ind_c] + ": port this_" + tostorestn[0] + "." + startport + "->" + "this_" + tostorestn[1] + "." + endport + ";\n";

                        } else {
                            newdec = newdec + system_declaration[ind_c][1].charAt(i);
                        }
                    }
                    system_declaration[ind_c][1] = newdec;
                    connections[index_connections] = system_names[ind_c];
                    index_connections += 1;
                }
            }
        }

        return null;
    }

    /**
     * Visit a parse tree produced by {@link TextToAADLParser#energizing_stmt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    @Override
    public Object visitEnergizing_stmt(TextToAADLParser.Energizing_stmtContext ctx) {
        String multf = ctx.multi_flow(0).getText();
        StringTokenizer st = new StringTokenizer(multf, " ");
        String[] flows = new String[10];
        for (int i = 0; i <= 9; i++) {
            flows[i] = "";
        }
        int index_flows = 0;
        while (st.hasMoreTokens()) {
            String sts = st.nextToken();
            if (sts.equals("and") || sts.equals(",")) {
                index_flows = index_flows + 1;
            } else {
                flows[index_flows] = flows[index_flows] + sts + " ";
            }
        }
        for (int i = 0; i <= index_flows; i++) {
            int count_within_token = 0;
            StringTokenizer flow_tokenize = new StringTokenizer(flows[i]);
            while (flow_tokenize.hasMoreTokens()) {
                flow_tokenize.nextToken();
                count_within_token += 1;
            }
            String new_flow = "";
            flow_tokenize = new StringTokenizer(flows[i]);
            if (count_within_token > 1) {
                while (flow_tokenize.hasMoreTokens()) {
                    String x = flow_tokenize.nextToken();
                    new_flow = new_flow + x + "_";
                }
                String new_flow_updated = "";
                for (int s = 0; s <= new_flow.length() - 2; s++) {
                    new_flow_updated = new_flow_updated + new_flow.charAt(s);
                }
                flows[i] = new_flow_updated;
            }
        }
        for(int k=0;k<=index_flows;k++) {
            flows[k] = flows[k].replaceAll("\\s", "");
        }

        int cap_same = 0;
        boolean did_cap = false;
        for (int i = 0; i <= index_ports - 1; i++) {
            StringTokenizer port_pass = new StringTokenizer(portnames[i]);
            String compname = port_pass.nextToken();
            if (compname.equals(ctx.Struct_noun().getText())) {
                while (port_pass.hasMoreTokens()) {
                    String next_token=port_pass.nextToken();
                    for (int k = 0; k <= index_flows; k++) {
                        if (flows[k].equals(next_token)) {
                            cap_same = k;
                            did_cap = true;
                        }
                    }
                }
            }
        }


        int number_of_sn = 0;
        String newString = "";
        int index_number = 0;

        String token = ctx.Struct_noun().getText();

        number_of_sn += 1;

        boolean in_sys_features = false;
        for (int i = 0; i <= index_features - 1; i++) {

            if (token.equals(sys_features[i])) {

                in_sys_features = true;
                break;
            }
        }
        if (!in_sys_features) {
            for (int j = 0; j <= index - 1; j++) {
                if (token.equals(system_names[j])) {
                    index_number = j;
                }
            }
            boolean newline_var = false;
            for (int k = 0; k <= system_declaration[index_number][0].length() - 1; k++) {
                if ((system_declaration[index_number][0].charAt(k) == '\n') && (!newline_var)) {
                    newString = newString + "\n\tfeatures\n";
                    newline_var = true;
                    sys_features[index_features] = system_names[index_number];
                    index_features += 1;
                } else {
                    newString = newString + system_declaration[index_number][0].charAt(k);
                }
            }
            system_declaration[index_number][0] = newString;
            newString = "";
        }
        int number_of_in_ports = 0;
        int number_of_out_ports = 0;
        String func_verb_used = ctx.FUNC_VERB(0).getText();
        if (func_verb_used.equals("imports"))
            number_of_in_ports = index_flows + 1;
        int ind = 0;

        for (int i = 0; i <= index - 1; i++) {
            if (token.equals(system_names[i])) {
                ind = i;
            }
        }
        boolean newline_var = false;
        int var_count_newline = 0;
        String newdecl = "";

        for (int i = 0; i <= system_declaration[ind][0].length() - 1; i++) {
            if (system_declaration[ind][0].charAt(i) == '\n') {
                var_count_newline += 1;
            }
            if ((var_count_newline == 2) && (!newline_var)) {
                newline_var = true;
                int index_portnames = 0;
                boolean already_in_ports = false;
                for (int j = 0; j <= number_of_in_ports - 1; j++) {
                    for (int k = 0; k <= index_ports - 1; k++) {
                        StringTokenizer stp = new StringTokenizer(portnames[k]);
                        String port_comp = stp.nextToken();
                        if (port_comp.equals(system_names[ind])) {
                            already_in_ports = true;
                            index_portnames = k;
                        }
                    }
                    if (already_in_ports) {

                        StringTokenizer stp = new StringTokenizer(portnames[index_portnames]);
                        stp.nextToken();
                        boolean if_named_port = false;
                        while (stp.hasMoreTokens()) {
                            String portname_current = stp.nextToken();
                            if (flows[j].equals(portname_current)) {
                                if_named_port = true;
                                break;
                            }
                        }
                        if ((cap_same == j)&&(did_cap)) {

                        } else {
                            if (if_named_port) {
                                newdecl = newdecl + "\n\t\t" + flows[j] + "_from_another_system" + ": in data port;";
                                portnames[index_portnames] = portnames[index_portnames] + " " + flows[j] + "_from_another_system";
                            } else {
                                newdecl = newdecl + "\n\t\t" + flows[j] + ": in data port;";
                                portnames[index_portnames] = portnames[index_portnames] + " " + flows[j];
                            }
                        }

                    } else {
                        portnames[index_ports] = system_names[ind] + " " + flows[j];
                        index_ports += 1;
                        newdecl = newdecl + "\n\t\t" + flows[j] + ": in data port;";
                    }

            }

        }
            newdecl = newdecl + system_declaration[ind][0].charAt(i);
    }
        system_declaration[ind][0] = newdecl;

        return null;
    }

    /**
     * Visit a parse tree produced by {@link TextToAADLParser#struct_multinoun}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    @Override
    public Object visitStruct_multinoun(TextToAADLParser.Struct_multinounContext ctx) {
//        System.out.println(ctx.toString());
        return visitChildren(ctx);
    }

    /**
     * Visit a parse tree produced by {@link TextToAADLParser#multi_flow}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    @Override
    public Object visitMulti_flow(TextToAADLParser.Multi_flowContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * Visit a parse tree produced by {@link TextToAADLParser#flow}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    @Override
    public Object visitFlow(TextToAADLParser.FlowContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * Visit a parse tree produced by {@link TextToAADLParser#material}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    @Override
    public Object visitMaterial(TextToAADLParser.MaterialContext ctx) {
        return visitChildren(ctx);
    }
}