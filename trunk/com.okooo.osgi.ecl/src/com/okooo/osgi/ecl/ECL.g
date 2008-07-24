grammar ECL;

@lexer::header {
	package com.okooo.osgi.ecl;
}
@parser::header{
	package com.okooo.osgi.ecl;
	import java.util.Map;
	import java.util.HashMap;
}
@members{
	//define virtual memory to store variable data
	private Map<String, String> memory=new HashMap<String, String>();
}
prog	:	line*
	;
line	:	actionStmt ';' NEWLINE*
	|	installStmt ';' NEWLINE*
	|	';' NEWLINE*
	;
actionStmt	:	actionName idSet{
				CommandUtil.performAction($actionName.text,$idSet.idSet);
			}
		;
actionName	:	'update' | 'start' | 'stop' | 'restart'
		;

installStmt	:	'install ' jarSet{
				CommandUtil.install($jarSet.jarSet);
			}
		;

idSet	returns[java.util.Set<Long> idSet]
	:	arrayIdSet{
			$idSet=$arrayIdSet.idSet;
		}
	|	rangeIdSet{
			$idSet=$rangeIdSet.idSet;
		}
	;	
arrayIdSet	returns[java.util.Set<Long> idSet]
	@init{
		$idSet=new java.util.HashSet<Long>();
	}
	:	(id1=DIGIT{
			$idSet.add(new Long($id1.text));
		})(',' id2=DIGIT{
			$idSet.add(new Long($id2.text));
		})*
	;
rangeIdSet	returns[java.util.Set<Long> idSet]
	@init{
		$idSet=new java.util.HashSet<Long>();
		Long start=0L;
		Long end=0L;
	}:	 id1=DIGIT{
			start=new Long($id1.text);
		} '.' '.' id2=DIGIT{
			end=new Long($id2.text);
		}
	{
		if(end<start){
			Long temp=end;
			end=start;
			start=temp;
		}
		for(Long id=start;id<=end;id++){
			$idSet.add(id);
		}
	}
	;
jarSet	returns[java.util.Set<String> jarSet]
	:	(
			j1=jar{
				$jarSet.add($j1.text);
			}
		)
		(
			','j2=jar{
				$jarSet.add($j2.text);
			}
		)*
	;

jar	:	(ALPHA | DIGIT | '.' | '_' | '-')+
	;

DIGIT	:	('0'..'9')+
	;
ALPHA	:	'a'..'z' | 'A'..'Z'
	;

NEWLINE	:	'\r'?'\n'
	;

WS	:	(' ' | '\t' | '\r' | '\n')+{skip();}
	;
