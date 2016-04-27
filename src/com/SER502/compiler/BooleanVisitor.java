package com.SER502.compiler;

import com.SER502.parser.HelloBaseVisitor;
import com.SER502.parser.HelloParser;
import com.SER502.parser.HelloParser.AndORNotLabelContext;

public class BooleanVisitor  extends HelloBaseVisitor<Boolean> {
	
	@Override
	public Boolean visitAndORNotLabel(AndORNotLabelContext ctx) {
		Boolean left=visit(ctx.leftexpr);
		Boolean right=visit(ctx.rightexpr);
		switch(ctx.op.getType()){
		case HelloParser.AND:
		if(left&&right){
				System.out.println("AND True");
				return true;
			}else
				return false;
		case HelloParser.OR:
			if(left||right){
				System.out.println("OR True");
				return true;
			}else
				return false;
		case HelloParser.NOT:
			if(left!=right){
				System.out.println("NOT True");
				return true;
			}else
				return false;
			
		}
		return false;	
	}
}
