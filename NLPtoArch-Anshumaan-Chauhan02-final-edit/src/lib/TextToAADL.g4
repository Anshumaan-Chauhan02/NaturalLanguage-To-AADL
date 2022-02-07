grammar TextToAADL;
@header
{
    package lib;
}

nlparch : sentences+;

sentences: sentence+;

sentence : (structural_stmts+)| (functional_stmts+) ;

functional_stmts: ((functional_stmt)|(energizing_stmt)) End WS;

structural_stmts: ((structural_stmt)|(connection_stmt)) End WS;

structural_stmt : Struct_noun WS Struct_verb WS struct_multinoun;

connection_stmt: Struct_noun WS Connected_Verb WS TO WS struct_multinoun;

functional_stmt: (Struct_noun WS FUNC_VERB WS multi_flow WS FROM WS Struct_noun WS TO WS Struct_noun)|
                  (Struct_noun WS FUNC_VERB WS multi_flow WS TO WS Struct_noun) |
                  (Struct_noun WS FUNC_VERB WS multi_flow WS FROM WS Struct_noun)|
                  (Struct_noun WS FUNC_VERB WS multi_flow WS And WS FUNC_VERB WS IT WS TO WS flow)|
                  (Struct_noun WS FUNC_VERB WS multi_flow);

energizing_stmt: Struct_noun WS FUNC_VERB WS multi_flow WS And WS FUNC_VERB WS TO WS multi_flow;

struct_multinoun : (Struct_noun WS Comma WS struct_multinoun) |
                    (Struct_noun WS And WS Struct_noun) |
                    (Struct_noun) ;

multi_flow: flow |
            (flow WS And WS flow ) |
            (flow WS Comma WS multi_flow);

flow : material|
       ENERGY|
       SIGNAL;

material : SOLID|
           LIQUID|
           GAS;

Struct_noun : [A-Z0-9]+[_A-Z0-9]*;
Connected_Verb: 'connected';
Comma : ',';
And: 'and';
End: '.';

IT: 'it';

TO: 'to';

THEM: 'them';

FROM: 'from';

Struct_verb: 'consists';

FUNC_VERB: 'contains'|'imports'|'exports'|'converts'|'transfers'|'receives'|'energizes'|'deenergizes'|'distributes'|'separates'|'couples'|'stores'|'supplies';

ENERGY : 'thermal energy' | 'electrical energy' | 'mechanical energy'| 'heat' ;

SOLID: 'ground coffee';

LIQUID : 'water' | 'liquid coffee' | 'hot water';

GAS : 'steam' | 'flowing air'| 'hot flowing air';

SIGNAL : [a-zA-Z0-9]+[_a-zA-Z0-9]*;

WS : [ \t\r\n]+;







