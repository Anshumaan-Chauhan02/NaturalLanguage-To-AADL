grammar TextToAADL;
@header
{
    package lib;
}

nlparch : sentences+;
sentences: sentence+;
sentence : (structural_stmt+)| (functional_stmts+) ;
functional_stmts: ((functional_stmt)|(energizing_stmt)) end ;
structural_stmt : Struct_noun struct_verb struct_multinoun end;
functional_stmt: (Struct_noun func_verb multi_flow)
                 ((from Struct_noun)? (to Struct_noun)?|(and func_verb it to (flow|Struct_noun)))?;
energizing_stmt: Struct_noun func_verb multi_flow and energy_verb (it|them) to multi_flow;
struct_multinoun : (Struct_noun comma struct_multinoun) | (Struct_noun and Struct_noun) | (Struct_noun) ;
multi_flow: flow | (flow and flow ) | (flow comma multi_flow);
flow : material | energy | SIGNAL;
material : solid | liquid | gas;
Struct_noun : [A-Z]+[_A-Z]*;
comma : ',';
and: 'and';
end: '.';
it: 'it';
to: 'to';
them: 'them';
from: 'from';
struct_verb: 'consists';
energy_verb:'energizes'|'deenergizes';
func_verb: 'contains'|'imports'|'exports'|'converts'|'transfers'|'receives'|'distributes'|'separates'|'couples'|'stores'|'supplies'|'connected';
energy : 'thermal energy' | 'electrical energy' | 'mechanical energy' ;
solid: 'ground coffee';
liquid : 'water' | 'liquid coffee' | 'hot water';
gas : 'steam';
SIGNAL : [a-zA-Z0-9_]+;
WS : [ \t\r\n]+ -> skip;