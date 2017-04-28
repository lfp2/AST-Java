package main;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTree;

import ast.*;
import visitor.*;

public class brgccf_lfp2_visitor extends brgccf_lfp2BaseVisitor<Object> {
	@Override
	public Object visitFormal(brgccf_lfp2Parser.FormalContext ctx){
		System.out.println("Visited Formal");
		Type t = (Type) this.visit(ctx.type());
		Identifier i = (Identifier) this.visit(ctx.Identifier());
		Formal formal = new Formal(t,i);
		return formal;
	}
	@Override
	public Object visitMethodDeclaration(brgccf_lfp2Parser.MethodDeclarationContext ctx){
		System.out.println("Visited Method Declaration");
		Formal formal = (Formal) this.visit(ctx.formal(0));
		Type at = formal.t;
		Identifier ai = formal.i;
		FormalList afl = new FormalList();
		VarDeclList avl = new VarDeclList();
		StatementList asl = new StatementList();
		Exp ae = (Exp) this.visit(ctx.expression());
		for(brgccf_lfp2Parser.FormalContext f1 : ctx.formal()){
			afl.addElement((Formal) this.visit(f1));
		}
		for(brgccf_lfp2Parser.VarDeclarationContext v1 : ctx.varDeclaration()){
			avl.addElement((VarDecl) this.visit(v1));
		}
		for(brgccf_lfp2Parser.StatementContext s1 : ctx.statement()){
			asl.addElement((Statement) this.visit(s1));
		}
		MethodDecl method = new MethodDecl(at,ai,afl,avl,asl,ae);
		return method;
	}
	@Override
	public Object visitGoal(brgccf_lfp2Parser.GoalContext ctx){
		System.out.println("Visited Goal");
		MainClass am = (MainClass) this.visit(ctx.mainClass());
		ClassDeclList cl = new ClassDeclList();
		for(brgccf_lfp2Parser.ClassDeclarationContext c1 : ctx.classDeclaration()){
			cl.addElement((ClassDecl) this.visit(c1));
		}
		Program program = new Program(am,cl);
		return program;
	}
	@Override
	public Object visitExpression(brgccf_lfp2Parser.ExpressionContext ctx){
		System.out.println("Visited Expression");
		
		return ctx; //remover
	}
}
