
package com.plagus_server.analysis.lingustic.javascript;// Generated from JavaScriptParser.g4 by ANTLR 4.7.2

import org.antlr.v4.runtime.FailedPredicateException;
import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.VocabularyImpl;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaScriptParser extends JavaScriptBaseParser {
  static {
    RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION);
  }

  protected static final DFA[] _decisionToDFA;
  protected static final PredictionContextCache _sharedContextCache =
          new PredictionContextCache();
  public static final int
          HashBangLine = 1, MultiLineComment = 2, SingleLineComment = 3, RegularExpressionLiteral = 4,
          OpenBracket = 5, CloseBracket = 6, OpenParen = 7, CloseParen = 8, OpenBrace = 9,
          CloseBrace = 10, SemiColon = 11, Comma = 12, Assign = 13, QuestionMark = 14, Colon = 15,
          Ellipsis = 16, Dot = 17, PlusPlus = 18, MinusMinus = 19, Plus = 20, Minus = 21, BitNot = 22,
          Not = 23, Multiply = 24, Divide = 25, Modulus = 26, Power = 27, NullCoalesce = 28,
          Hashtag = 29, RightShiftArithmetic = 30, LeftShiftArithmetic = 31, RightShiftLogical = 32,
          LessThan = 33, MoreThan = 34, LessThanEquals = 35, GreaterThanEquals = 36, Equals_ = 37,
          NotEquals = 38, IdentityEquals = 39, IdentityNotEquals = 40, BitAnd = 41, BitXOr = 42,
          BitOr = 43, And = 44, Or = 45, MultiplyAssign = 46, DivideAssign = 47, ModulusAssign = 48,
          PlusAssign = 49, MinusAssign = 50, LeftShiftArithmeticAssign = 51, RightShiftArithmeticAssign = 52,
          RightShiftLogicalAssign = 53, BitAndAssign = 54, BitXorAssign = 55, BitOrAssign = 56,
          PowerAssign = 57, ARROW = 58, NullLiteral = 59, BooleanLiteral = 60, DecimalLiteral = 61,
          HexIntegerLiteral = 62, OctalIntegerLiteral = 63, OctalIntegerLiteral2 = 64,
          BinaryIntegerLiteral = 65, BigHexIntegerLiteral = 66, BigOctalIntegerLiteral = 67,
          BigBinaryIntegerLiteral = 68, BigDecimalIntegerLiteral = 69, Break = 70, Do = 71,
          Instanceof = 72, Typeof = 73, Case = 74, Else = 75, New = 76, Var = 77, Catch = 78,
          Finally = 79, Return = 80, Void = 81, Continue = 82, For = 83, Switch = 84, While = 85,
          Debugger = 86, Function = 87, This = 88, With = 89, Default = 90, If = 91, Throw = 92,
          Delete = 93, In = 94, Try = 95, As = 96, From = 97, Class = 98, Enum = 99, Extends = 100,
          Super = 101, Const = 102, Export = 103, Import = 104, Async = 105, Await = 106, Implements = 107,
          Let = 108, Private = 109, Public = 110, Interface = 111, Package = 112, Protected = 113,
          Static = 114, Yield = 115, Identifier = 116, StringLiteral = 117, TemplateStringLiteral = 118,
          WhiteSpaces = 119, LineTerminator = 120, HtmlComment = 121, CDataComment = 122,
          UnexpectedCharacter = 123;
  public static final int
          RULE_program = 0, RULE_sourceElement = 1, RULE_statement = 2, RULE_block = 3,
          RULE_statementList = 4, RULE_importStatement = 5, RULE_importFromBlock = 6,
          RULE_moduleItems = 7, RULE_importDefault = 8, RULE_importNamespace = 9,
          RULE_importFrom = 10, RULE_aliasName = 11, RULE_exportStatement = 12,
          RULE_exportFromBlock = 13, RULE_declaration = 14, RULE_variableStatement = 15,
          RULE_variableDeclarationList = 16, RULE_variableDeclaration = 17, RULE_emptyStatement = 18,
          RULE_expressionStatement = 19, RULE_ifStatement = 20, RULE_iterationStatement = 21,
          RULE_varModifier = 22, RULE_continueStatement = 23, RULE_breakStatement = 24,
          RULE_returnStatement = 25, RULE_yieldStatement = 26, RULE_withStatement = 27,
          RULE_switchStatement = 28, RULE_caseBlock = 29, RULE_caseClauses = 30,
          RULE_caseClause = 31, RULE_defaultClause = 32, RULE_labelledStatement = 33,
          RULE_throwStatement = 34, RULE_tryStatement = 35, RULE_catchProduction = 36,
          RULE_finallyProduction = 37, RULE_debuggerStatement = 38, RULE_functionDeclaration = 39,
          RULE_classDeclaration = 40, RULE_classTail = 41, RULE_classElement = 42,
          RULE_methodDefinition = 43, RULE_formalParameterList = 44, RULE_formalParameterArg = 45,
          RULE_lastFormalParameterArg = 46, RULE_functionBody = 47, RULE_sourceElements = 48,
          RULE_arrayLiteral = 49, RULE_elementList = 50, RULE_arrayElement = 51,
          RULE_objectLiteral = 52, RULE_propertyAssignment = 53, RULE_propertyName = 54,
          RULE_arguments = 55, RULE_argument = 56, RULE_expressionSequence = 57,
          RULE_singleExpression = 58, RULE_assignable = 59, RULE_anoymousFunction = 60,
          RULE_arrowFunctionParameters = 61, RULE_arrowFunctionBody = 62, RULE_assignmentOperator = 63,
          RULE_literal = 64, RULE_numericLiteral = 65, RULE_bigintLiteral = 66,
          RULE_identifierName = 67, RULE_reservedWord = 68, RULE_keyword = 69, RULE_getter = 70,
          RULE_setter = 71, RULE_eos = 72;

  private static String[] makeRuleNames() {
    return new String[]{
            "program", "sourceElement", "statement", "block", "statementList", "importStatement",
            "importFromBlock", "moduleItems", "importDefault", "importNamespace",
            "importFrom", "aliasName", "exportStatement", "exportFromBlock", "declaration",
            "variableStatement", "variableDeclarationList", "variableDeclaration",
            "emptyStatement", "expressionStatement", "ifStatement", "iterationStatement",
            "varModifier", "continueStatement", "breakStatement", "returnStatement",
            "yieldStatement", "withStatement", "switchStatement", "caseBlock", "caseClauses",
            "caseClause", "defaultClause", "labelledStatement", "throwStatement",
            "tryStatement", "catchProduction", "finallyProduction", "debuggerStatement",
            "functionDeclaration", "classDeclaration", "classTail", "classElement",
            "methodDefinition", "formalParameterList", "formalParameterArg", "lastFormalParameterArg",
            "functionBody", "sourceElements", "arrayLiteral", "elementList", "arrayElement",
            "objectLiteral", "propertyAssignment", "propertyName", "arguments", "argument",
            "expressionSequence", "singleExpression", "assignable", "anoymousFunction",
            "arrowFunctionParameters", "arrowFunctionBody", "assignmentOperator",
            "literal", "numericLiteral", "bigintLiteral", "identifierName", "reservedWord",
            "keyword", "getter", "setter", "eos"
    };
  }

  public static final String[] ruleNames = makeRuleNames();

  private static String[] makeLiteralNames() {
    return new String[]{
            null, null, null, null, null, "'['", "']'", "'('", "')'", "'{'", "'}'",
            "';'", "','", "'='", "'?'", "':'", "'...'", "'.'", "'++'", "'--'", "'+'",
            "'-'", "'~'", "'!'", "'*'", "'/'", "'%'", "'**'", "'??'", "'#'", "'>>'",
            "'<<'", "'>>>'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'==='",
            "'!=='", "'&'", "'^'", "'|'", "'&&'", "'||'", "'*='", "'/='", "'%='",
            "'+='", "'-='", "'<<='", "'>>='", "'>>>='", "'&='", "'^='", "'|='", "'**='",
            "'=>'", "'null'", null, null, null, null, null, null, null, null, null,
            null, "'break'", "'do'", "'instanceof'", "'typeof'", "'case'", "'else'",
            "'new'", "'var'", "'catch'", "'finally'", "'return'", "'void'", "'continue'",
            "'for'", "'switch'", "'while'", "'debugger'", "'function'", "'this'",
            "'with'", "'default'", "'if'", "'throw'", "'delete'", "'in'", "'try'",
            "'as'", "'from'", "'class'", "'enum'", "'extends'", "'super'", "'const'",
            "'export'", "'import'", "'async'", "'await'", "'implements'", "'let'",
            "'private'", "'public'", "'interface'", "'package'", "'protected'", "'static'",
            "'yield'"
    };
  }

  private static final String[] _LITERAL_NAMES = makeLiteralNames();

  private static String[] makeSymbolicNames() {
    return new String[]{
            null, "HashBangLine", "MultiLineComment", "SingleLineComment", "RegularExpressionLiteral",
            "OpenBracket", "CloseBracket", "OpenParen", "CloseParen", "OpenBrace",
            "CloseBrace", "SemiColon", "Comma", "Assign", "QuestionMark", "Colon",
            "Ellipsis", "Dot", "PlusPlus", "MinusMinus", "Plus", "Minus", "BitNot",
            "Not", "Multiply", "Divide", "Modulus", "Power", "NullCoalesce", "Hashtag",
            "RightShiftArithmetic", "LeftShiftArithmetic", "RightShiftLogical", "LessThan",
            "MoreThan", "LessThanEquals", "GreaterThanEquals", "Equals_", "NotEquals",
            "IdentityEquals", "IdentityNotEquals", "BitAnd", "BitXOr", "BitOr", "And",
            "Or", "MultiplyAssign", "DivideAssign", "ModulusAssign", "PlusAssign",
            "MinusAssign", "LeftShiftArithmeticAssign", "RightShiftArithmeticAssign",
            "RightShiftLogicalAssign", "BitAndAssign", "BitXorAssign", "BitOrAssign",
            "PowerAssign", "ARROW", "NullLiteral", "BooleanLiteral", "DecimalLiteral",
            "HexIntegerLiteral", "OctalIntegerLiteral", "OctalIntegerLiteral2", "BinaryIntegerLiteral",
            "BigHexIntegerLiteral", "BigOctalIntegerLiteral", "BigBinaryIntegerLiteral",
            "BigDecimalIntegerLiteral", "Break", "Do", "Instanceof", "Typeof", "Case",
            "Else", "New", "Var", "Catch", "Finally", "Return", "Void", "Continue",
            "For", "Switch", "While", "Debugger", "Function", "This", "With", "Default",
            "If", "Throw", "Delete", "In", "Try", "As", "From", "Class", "Enum",
            "Extends", "Super", "Const", "Export", "Import", "Async", "Await", "Implements",
            "Let", "Private", "Public", "Interface", "Package", "Protected", "Static",
            "Yield", "Identifier", "StringLiteral", "TemplateStringLiteral", "WhiteSpaces",
            "LineTerminator", "HtmlComment", "CDataComment", "UnexpectedCharacter"
    };
  }

  private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
  public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

  /**
   * @deprecated Use {@link #VOCABULARY} instead.
   */
  @Deprecated
  public static final String[] tokenNames;

  static {
    tokenNames = new String[_SYMBOLIC_NAMES.length];
    for (int i = 0; i < tokenNames.length; i++) {
      tokenNames[i] = VOCABULARY.getLiteralName(i);
      if (tokenNames[i] == null) {
        tokenNames[i] = VOCABULARY.getSymbolicName(i);
      }

      if (tokenNames[i] == null) {
        tokenNames[i] = "<INVALID>";
      }
    }
  }

  @Override
  @Deprecated
  public String[] getTokenNames() {
    return tokenNames;
  }

  @Override

  public Vocabulary getVocabulary() {
    return VOCABULARY;
  }

  @Override
  public String getGrammarFileName() {
    return "JavaScriptParser.g4";
  }

  @Override
  public String[] getRuleNames() {
    return ruleNames;
  }

  @Override
  public String getSerializedATN() {
    return _serializedATN;
  }

  @Override
  public ATN getATN() {
    return _ATN;
  }

  public JavaScriptParser(TokenStream input) {
    super(input);
    _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
  }

  public static class ProgramContext extends ParserRuleContext {
    public TerminalNode EOF() {
      return getToken(JavaScriptParser.EOF, 0);
    }

    public TerminalNode HashBangLine() {
      return getToken(JavaScriptParser.HashBangLine, 0);
    }

    public SourceElementsContext sourceElements() {
      return getRuleContext(SourceElementsContext.class, 0);
    }

    public ProgramContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_program;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterProgram(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitProgram(this);
    }
  }

  public final ProgramContext program() throws RecognitionException {
    ProgramContext _localctx = new ProgramContext(_ctx, getState());
    enterRule(_localctx, 0, RULE_program);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(147);
        _errHandler.sync(this);
        switch (getInterpreter().adaptivePredict(_input, 0, _ctx)) {
          case 1: {
            setState(146);
            match(HashBangLine);
          }
          break;
        }
        setState(150);
        _errHandler.sync(this);
        switch (getInterpreter().adaptivePredict(_input, 1, _ctx)) {
          case 1: {
            setState(149);
            sourceElements();
          }
          break;
        }
        setState(152);
        match(EOF);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class SourceElementContext extends ParserRuleContext {
    public StatementContext statement() {
      return getRuleContext(StatementContext.class, 0);
    }

    public SourceElementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_sourceElement;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterSourceElement(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitSourceElement(this);
    }
  }

  public final SourceElementContext sourceElement() throws RecognitionException {
    SourceElementContext _localctx = new SourceElementContext(_ctx, getState());
    enterRule(_localctx, 2, RULE_sourceElement);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(154);
        statement();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class StatementContext extends ParserRuleContext {
    public BlockContext block() {
      return getRuleContext(BlockContext.class, 0);
    }

    public VariableStatementContext variableStatement() {
      return getRuleContext(VariableStatementContext.class, 0);
    }

    public ImportStatementContext importStatement() {
      return getRuleContext(ImportStatementContext.class, 0);
    }

    public ExportStatementContext exportStatement() {
      return getRuleContext(ExportStatementContext.class, 0);
    }

    public EmptyStatementContext emptyStatement() {
      return getRuleContext(EmptyStatementContext.class, 0);
    }

    public ClassDeclarationContext classDeclaration() {
      return getRuleContext(ClassDeclarationContext.class, 0);
    }

    public ExpressionStatementContext expressionStatement() {
      return getRuleContext(ExpressionStatementContext.class, 0);
    }

    public IfStatementContext ifStatement() {
      return getRuleContext(IfStatementContext.class, 0);
    }

    public IterationStatementContext iterationStatement() {
      return getRuleContext(IterationStatementContext.class, 0);
    }

    public ContinueStatementContext continueStatement() {
      return getRuleContext(ContinueStatementContext.class, 0);
    }

    public BreakStatementContext breakStatement() {
      return getRuleContext(BreakStatementContext.class, 0);
    }

    public ReturnStatementContext returnStatement() {
      return getRuleContext(ReturnStatementContext.class, 0);
    }

    public YieldStatementContext yieldStatement() {
      return getRuleContext(YieldStatementContext.class, 0);
    }

    public WithStatementContext withStatement() {
      return getRuleContext(WithStatementContext.class, 0);
    }

    public LabelledStatementContext labelledStatement() {
      return getRuleContext(LabelledStatementContext.class, 0);
    }

    public SwitchStatementContext switchStatement() {
      return getRuleContext(SwitchStatementContext.class, 0);
    }

    public ThrowStatementContext throwStatement() {
      return getRuleContext(ThrowStatementContext.class, 0);
    }

    public TryStatementContext tryStatement() {
      return getRuleContext(TryStatementContext.class, 0);
    }

    public DebuggerStatementContext debuggerStatement() {
      return getRuleContext(DebuggerStatementContext.class, 0);
    }

    public FunctionDeclarationContext functionDeclaration() {
      return getRuleContext(FunctionDeclarationContext.class, 0);
    }

    public StatementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_statement;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterStatement(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitStatement(this);
    }
  }

  public final StatementContext statement() throws RecognitionException {
    StatementContext _localctx = new StatementContext(_ctx, getState());
    enterRule(_localctx, 4, RULE_statement);
    try {
      setState(176);
      _errHandler.sync(this);
      switch (getInterpreter().adaptivePredict(_input, 2, _ctx)) {
        case 1:
          enterOuterAlt(_localctx, 1);
        {
          setState(156);
          block();
        }
        break;
        case 2:
          enterOuterAlt(_localctx, 2);
        {
          setState(157);
          variableStatement();
        }
        break;
        case 3:
          enterOuterAlt(_localctx, 3);
        {
          setState(158);
          importStatement();
        }
        break;
        case 4:
          enterOuterAlt(_localctx, 4);
        {
          setState(159);
          exportStatement();
        }
        break;
        case 5:
          enterOuterAlt(_localctx, 5);
        {
          setState(160);
          emptyStatement();
        }
        break;
        case 6:
          enterOuterAlt(_localctx, 6);
        {
          setState(161);
          classDeclaration();
        }
        break;
        case 7:
          enterOuterAlt(_localctx, 7);
        {
          setState(162);
          expressionStatement();
        }
        break;
        case 8:
          enterOuterAlt(_localctx, 8);
        {
          setState(163);
          ifStatement();
        }
        break;
        case 9:
          enterOuterAlt(_localctx, 9);
        {
          setState(164);
          iterationStatement();
        }
        break;
        case 10:
          enterOuterAlt(_localctx, 10);
        {
          setState(165);
          continueStatement();
        }
        break;
        case 11:
          enterOuterAlt(_localctx, 11);
        {
          setState(166);
          breakStatement();
        }
        break;
        case 12:
          enterOuterAlt(_localctx, 12);
        {
          setState(167);
          returnStatement();
        }
        break;
        case 13:
          enterOuterAlt(_localctx, 13);
        {
          setState(168);
          yieldStatement();
        }
        break;
        case 14:
          enterOuterAlt(_localctx, 14);
        {
          setState(169);
          withStatement();
        }
        break;
        case 15:
          enterOuterAlt(_localctx, 15);
        {
          setState(170);
          labelledStatement();
        }
        break;
        case 16:
          enterOuterAlt(_localctx, 16);
        {
          setState(171);
          switchStatement();
        }
        break;
        case 17:
          enterOuterAlt(_localctx, 17);
        {
          setState(172);
          throwStatement();
        }
        break;
        case 18:
          enterOuterAlt(_localctx, 18);
        {
          setState(173);
          tryStatement();
        }
        break;
        case 19:
          enterOuterAlt(_localctx, 19);
        {
          setState(174);
          debuggerStatement();
        }
        break;
        case 20:
          enterOuterAlt(_localctx, 20);
        {
          setState(175);
          functionDeclaration();
        }
        break;
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class BlockContext extends ParserRuleContext {
    public TerminalNode OpenBrace() {
      return getToken(JavaScriptParser.OpenBrace, 0);
    }

    public TerminalNode CloseBrace() {
      return getToken(JavaScriptParser.CloseBrace, 0);
    }

    public StatementListContext statementList() {
      return getRuleContext(StatementListContext.class, 0);
    }

    public BlockContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_block;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterBlock(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitBlock(this);
    }
  }

  public final BlockContext block() throws RecognitionException {
    BlockContext _localctx = new BlockContext(_ctx, getState());
    enterRule(_localctx, 6, RULE_block);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(178);
        match(OpenBrace);
        setState(180);
        _errHandler.sync(this);
        switch (getInterpreter().adaptivePredict(_input, 3, _ctx)) {
          case 1: {
            setState(179);
            statementList();
          }
          break;
        }
        setState(182);
        match(CloseBrace);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class StatementListContext extends ParserRuleContext {
    public List<StatementContext> statement() {
      return getRuleContexts(StatementContext.class);
    }

    public StatementContext statement(int i) {
      return getRuleContext(StatementContext.class, i);
    }

    public StatementListContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_statementList;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterStatementList(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitStatementList(this);
    }
  }

  public final StatementListContext statementList() throws RecognitionException {
    StatementListContext _localctx = new StatementListContext(_ctx, getState());
    enterRule(_localctx, 8, RULE_statementList);
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
        setState(185);
        _errHandler.sync(this);
        _alt = 1;
        do {
          switch (_alt) {
            case 1: {
              {
                setState(184);
                statement();
              }
            }
            break;
            default:
              throw new NoViableAltException(this);
          }
          setState(187);
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input, 4, _ctx);
        } while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class ImportStatementContext extends ParserRuleContext {
    public TerminalNode Import() {
      return getToken(JavaScriptParser.Import, 0);
    }

    public ImportFromBlockContext importFromBlock() {
      return getRuleContext(ImportFromBlockContext.class, 0);
    }

    public ImportStatementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_importStatement;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterImportStatement(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitImportStatement(this);
    }
  }

  public final ImportStatementContext importStatement() throws RecognitionException {
    ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
    enterRule(_localctx, 10, RULE_importStatement);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(189);
        match(Import);
        setState(190);
        importFromBlock();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class ImportFromBlockContext extends ParserRuleContext {
    public ImportFromContext importFrom() {
      return getRuleContext(ImportFromContext.class, 0);
    }

    public EosContext eos() {
      return getRuleContext(EosContext.class, 0);
    }

    public ImportNamespaceContext importNamespace() {
      return getRuleContext(ImportNamespaceContext.class, 0);
    }

    public ModuleItemsContext moduleItems() {
      return getRuleContext(ModuleItemsContext.class, 0);
    }

    public ImportDefaultContext importDefault() {
      return getRuleContext(ImportDefaultContext.class, 0);
    }

    public TerminalNode StringLiteral() {
      return getToken(JavaScriptParser.StringLiteral, 0);
    }

    public ImportFromBlockContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_importFromBlock;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterImportFromBlock(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitImportFromBlock(this);
    }
  }

  public final ImportFromBlockContext importFromBlock() throws RecognitionException {
    ImportFromBlockContext _localctx = new ImportFromBlockContext(_ctx, getState());
    enterRule(_localctx, 12, RULE_importFromBlock);
    int _la;
    try {
      setState(204);
      _errHandler.sync(this);
      switch (_input.LA(1)) {
        case OpenBrace:
        case Multiply:
        case NullLiteral:
        case BooleanLiteral:
        case Break:
        case Do:
        case Instanceof:
        case Typeof:
        case Case:
        case Else:
        case New:
        case Var:
        case Catch:
        case Finally:
        case Return:
        case Void:
        case Continue:
        case For:
        case Switch:
        case While:
        case Debugger:
        case Function:
        case This:
        case With:
        case Default:
        case If:
        case Throw:
        case Delete:
        case In:
        case Try:
        case As:
        case From:
        case Class:
        case Enum:
        case Extends:
        case Super:
        case Const:
        case Export:
        case Import:
        case Async:
        case Await:
        case Implements:
        case Let:
        case Private:
        case Public:
        case Interface:
        case Package:
        case Protected:
        case Static:
        case Yield:
        case Identifier:
          enterOuterAlt(_localctx, 1);
        {
          setState(193);
          _errHandler.sync(this);
          _la = _input.LA(1);
          if (((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (NullLiteral - 59)) | (1L << (BooleanLiteral - 59)) | (1L << (Break - 59)) | (1L << (Do - 59)) | (1L << (Instanceof - 59)) | (1L << (Typeof - 59)) | (1L << (Case - 59)) | (1L << (Else - 59)) | (1L << (New - 59)) | (1L << (Var - 59)) | (1L << (Catch - 59)) | (1L << (Finally - 59)) | (1L << (Return - 59)) | (1L << (Void - 59)) | (1L << (Continue - 59)) | (1L << (For - 59)) | (1L << (Switch - 59)) | (1L << (While - 59)) | (1L << (Debugger - 59)) | (1L << (Function - 59)) | (1L << (This - 59)) | (1L << (With - 59)) | (1L << (Default - 59)) | (1L << (If - 59)) | (1L << (Throw - 59)) | (1L << (Delete - 59)) | (1L << (In - 59)) | (1L << (Try - 59)) | (1L << (As - 59)) | (1L << (From - 59)) | (1L << (Class - 59)) | (1L << (Enum - 59)) | (1L << (Extends - 59)) | (1L << (Super - 59)) | (1L << (Const - 59)) | (1L << (Export - 59)) | (1L << (Import - 59)) | (1L << (Async - 59)) | (1L << (Await - 59)) | (1L << (Implements - 59)) | (1L << (Let - 59)) | (1L << (Private - 59)) | (1L << (Public - 59)) | (1L << (Interface - 59)) | (1L << (Package - 59)) | (1L << (Protected - 59)) | (1L << (Static - 59)) | (1L << (Yield - 59)) | (1L << (Identifier - 59)))) != 0)) {
            {
              setState(192);
              importDefault();
            }
          }

          setState(197);
          _errHandler.sync(this);
          switch (_input.LA(1)) {
            case Multiply: {
              setState(195);
              importNamespace();
            }
            break;
            case OpenBrace: {
              setState(196);
              moduleItems();
            }
            break;
            default:
              throw new NoViableAltException(this);
          }
          setState(199);
          importFrom();
          setState(200);
          eos();
        }
        break;
        case StringLiteral:
          enterOuterAlt(_localctx, 2);
        {
          setState(202);
          match(StringLiteral);
          setState(203);
          eos();
        }
        break;
        default:
          throw new NoViableAltException(this);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class ModuleItemsContext extends ParserRuleContext {
    public TerminalNode OpenBrace() {
      return getToken(JavaScriptParser.OpenBrace, 0);
    }

    public TerminalNode CloseBrace() {
      return getToken(JavaScriptParser.CloseBrace, 0);
    }

    public List<AliasNameContext> aliasName() {
      return getRuleContexts(AliasNameContext.class);
    }

    public AliasNameContext aliasName(int i) {
      return getRuleContext(AliasNameContext.class, i);
    }

    public List<TerminalNode> Comma() {
      return getTokens(JavaScriptParser.Comma);
    }

    public TerminalNode Comma(int i) {
      return getToken(JavaScriptParser.Comma, i);
    }

    public ModuleItemsContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_moduleItems;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterModuleItems(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitModuleItems(this);
    }
  }

  public final ModuleItemsContext moduleItems() throws RecognitionException {
    ModuleItemsContext _localctx = new ModuleItemsContext(_ctx, getState());
    enterRule(_localctx, 14, RULE_moduleItems);
    int _la;
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
        setState(206);
        match(OpenBrace);
        setState(212);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input, 8, _ctx);
        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
          if (_alt == 1) {
            {
              {
                setState(207);
                aliasName();
                setState(208);
                match(Comma);
              }
            }
          }
          setState(214);
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input, 8, _ctx);
        }
        setState(219);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (NullLiteral - 59)) | (1L << (BooleanLiteral - 59)) | (1L << (Break - 59)) | (1L << (Do - 59)) | (1L << (Instanceof - 59)) | (1L << (Typeof - 59)) | (1L << (Case - 59)) | (1L << (Else - 59)) | (1L << (New - 59)) | (1L << (Var - 59)) | (1L << (Catch - 59)) | (1L << (Finally - 59)) | (1L << (Return - 59)) | (1L << (Void - 59)) | (1L << (Continue - 59)) | (1L << (For - 59)) | (1L << (Switch - 59)) | (1L << (While - 59)) | (1L << (Debugger - 59)) | (1L << (Function - 59)) | (1L << (This - 59)) | (1L << (With - 59)) | (1L << (Default - 59)) | (1L << (If - 59)) | (1L << (Throw - 59)) | (1L << (Delete - 59)) | (1L << (In - 59)) | (1L << (Try - 59)) | (1L << (As - 59)) | (1L << (From - 59)) | (1L << (Class - 59)) | (1L << (Enum - 59)) | (1L << (Extends - 59)) | (1L << (Super - 59)) | (1L << (Const - 59)) | (1L << (Export - 59)) | (1L << (Import - 59)) | (1L << (Async - 59)) | (1L << (Await - 59)) | (1L << (Implements - 59)) | (1L << (Let - 59)) | (1L << (Private - 59)) | (1L << (Public - 59)) | (1L << (Interface - 59)) | (1L << (Package - 59)) | (1L << (Protected - 59)) | (1L << (Static - 59)) | (1L << (Yield - 59)) | (1L << (Identifier - 59)))) != 0)) {
          {
            setState(215);
            aliasName();
            setState(217);
            _errHandler.sync(this);
            _la = _input.LA(1);
            if (_la == Comma) {
              {
                setState(216);
                match(Comma);
              }
            }

          }
        }

        setState(221);
        match(CloseBrace);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class ImportDefaultContext extends ParserRuleContext {
    public AliasNameContext aliasName() {
      return getRuleContext(AliasNameContext.class, 0);
    }

    public TerminalNode Comma() {
      return getToken(JavaScriptParser.Comma, 0);
    }

    public ImportDefaultContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_importDefault;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterImportDefault(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitImportDefault(this);
    }
  }

  public final ImportDefaultContext importDefault() throws RecognitionException {
    ImportDefaultContext _localctx = new ImportDefaultContext(_ctx, getState());
    enterRule(_localctx, 16, RULE_importDefault);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(223);
        aliasName();
        setState(224);
        match(Comma);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class ImportNamespaceContext extends ParserRuleContext {
    public TerminalNode Multiply() {
      return getToken(JavaScriptParser.Multiply, 0);
    }

    public TerminalNode As() {
      return getToken(JavaScriptParser.As, 0);
    }

    public IdentifierNameContext identifierName() {
      return getRuleContext(IdentifierNameContext.class, 0);
    }

    public ImportNamespaceContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_importNamespace;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterImportNamespace(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitImportNamespace(this);
    }
  }

  public final ImportNamespaceContext importNamespace() throws RecognitionException {
    ImportNamespaceContext _localctx = new ImportNamespaceContext(_ctx, getState());
    enterRule(_localctx, 18, RULE_importNamespace);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(226);
        match(Multiply);
        setState(229);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == As) {
          {
            setState(227);
            match(As);
            setState(228);
            identifierName();
          }
        }

      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class ImportFromContext extends ParserRuleContext {
    public TerminalNode From() {
      return getToken(JavaScriptParser.From, 0);
    }

    public TerminalNode StringLiteral() {
      return getToken(JavaScriptParser.StringLiteral, 0);
    }

    public ImportFromContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_importFrom;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterImportFrom(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitImportFrom(this);
    }
  }

  public final ImportFromContext importFrom() throws RecognitionException {
    ImportFromContext _localctx = new ImportFromContext(_ctx, getState());
    enterRule(_localctx, 20, RULE_importFrom);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(231);
        match(From);
        setState(232);
        match(StringLiteral);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class AliasNameContext extends ParserRuleContext {
    public List<IdentifierNameContext> identifierName() {
      return getRuleContexts(IdentifierNameContext.class);
    }

    public IdentifierNameContext identifierName(int i) {
      return getRuleContext(IdentifierNameContext.class, i);
    }

    public TerminalNode As() {
      return getToken(JavaScriptParser.As, 0);
    }

    public AliasNameContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_aliasName;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterAliasName(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitAliasName(this);
    }
  }

  public final AliasNameContext aliasName() throws RecognitionException {
    AliasNameContext _localctx = new AliasNameContext(_ctx, getState());
    enterRule(_localctx, 22, RULE_aliasName);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(234);
        identifierName();
        setState(237);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == As) {
          {
            setState(235);
            match(As);
            setState(236);
            identifierName();
          }
        }

      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class ExportStatementContext extends ParserRuleContext {
    public ExportStatementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_exportStatement;
    }

    public ExportStatementContext() {
    }

    public void copyFrom(ExportStatementContext ctx) {
      super.copyFrom(ctx);
    }
  }

  public static class ExportDefaultDeclarationContext extends ExportStatementContext {
    public TerminalNode Export() {
      return getToken(JavaScriptParser.Export, 0);
    }

    public TerminalNode Default() {
      return getToken(JavaScriptParser.Default, 0);
    }

    public SingleExpressionContext singleExpression() {
      return getRuleContext(SingleExpressionContext.class, 0);
    }

    public EosContext eos() {
      return getRuleContext(EosContext.class, 0);
    }

    public ExportDefaultDeclarationContext(ExportStatementContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterExportDefaultDeclaration(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitExportDefaultDeclaration(this);
    }
  }

  public static class ExportDeclarationContext extends ExportStatementContext {
    public TerminalNode Export() {
      return getToken(JavaScriptParser.Export, 0);
    }

    public EosContext eos() {
      return getRuleContext(EosContext.class, 0);
    }

    public ExportFromBlockContext exportFromBlock() {
      return getRuleContext(ExportFromBlockContext.class, 0);
    }

    public DeclarationContext declaration() {
      return getRuleContext(DeclarationContext.class, 0);
    }

    public ExportDeclarationContext(ExportStatementContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterExportDeclaration(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitExportDeclaration(this);
    }
  }

  public final ExportStatementContext exportStatement() throws RecognitionException {
    ExportStatementContext _localctx = new ExportStatementContext(_ctx, getState());
    enterRule(_localctx, 24, RULE_exportStatement);
    try {
      setState(251);
      _errHandler.sync(this);
      switch (getInterpreter().adaptivePredict(_input, 14, _ctx)) {
        case 1:
          _localctx = new ExportDeclarationContext(_localctx);
          enterOuterAlt(_localctx, 1);
        {
          setState(239);
          match(Export);
          setState(242);
          _errHandler.sync(this);
          switch (_input.LA(1)) {
            case OpenBrace:
            case Multiply: {
              setState(240);
              exportFromBlock();
            }
            break;
            case Var:
            case Function:
            case Class:
            case Const:
            case Async:
            case Let: {
              setState(241);
              declaration();
            }
            break;
            default:
              throw new NoViableAltException(this);
          }
          setState(244);
          eos();
        }
        break;
        case 2:
          _localctx = new ExportDefaultDeclarationContext(_localctx);
          enterOuterAlt(_localctx, 2);
        {
          setState(246);
          match(Export);
          setState(247);
          match(Default);
          setState(248);
          singleExpression(0);
          setState(249);
          eos();
        }
        break;
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class ExportFromBlockContext extends ParserRuleContext {
    public ImportNamespaceContext importNamespace() {
      return getRuleContext(ImportNamespaceContext.class, 0);
    }

    public ImportFromContext importFrom() {
      return getRuleContext(ImportFromContext.class, 0);
    }

    public EosContext eos() {
      return getRuleContext(EosContext.class, 0);
    }

    public ModuleItemsContext moduleItems() {
      return getRuleContext(ModuleItemsContext.class, 0);
    }

    public ExportFromBlockContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_exportFromBlock;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterExportFromBlock(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitExportFromBlock(this);
    }
  }

  public final ExportFromBlockContext exportFromBlock() throws RecognitionException {
    ExportFromBlockContext _localctx = new ExportFromBlockContext(_ctx, getState());
    enterRule(_localctx, 26, RULE_exportFromBlock);
    try {
      setState(263);
      _errHandler.sync(this);
      switch (_input.LA(1)) {
        case Multiply:
          enterOuterAlt(_localctx, 1);
        {
          setState(253);
          importNamespace();
          setState(254);
          importFrom();
          setState(255);
          eos();
        }
        break;
        case OpenBrace:
          enterOuterAlt(_localctx, 2);
        {
          setState(257);
          moduleItems();
          setState(259);
          _errHandler.sync(this);
          switch (getInterpreter().adaptivePredict(_input, 15, _ctx)) {
            case 1: {
              setState(258);
              importFrom();
            }
            break;
          }
          setState(261);
          eos();
        }
        break;
        default:
          throw new NoViableAltException(this);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class DeclarationContext extends ParserRuleContext {
    public VariableStatementContext variableStatement() {
      return getRuleContext(VariableStatementContext.class, 0);
    }

    public ClassDeclarationContext classDeclaration() {
      return getRuleContext(ClassDeclarationContext.class, 0);
    }

    public FunctionDeclarationContext functionDeclaration() {
      return getRuleContext(FunctionDeclarationContext.class, 0);
    }

    public DeclarationContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_declaration;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterDeclaration(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitDeclaration(this);
    }
  }

  public final DeclarationContext declaration() throws RecognitionException {
    DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
    enterRule(_localctx, 28, RULE_declaration);
    try {
      setState(268);
      _errHandler.sync(this);
      switch (_input.LA(1)) {
        case Var:
        case Const:
        case Let:
          enterOuterAlt(_localctx, 1);
        {
          setState(265);
          variableStatement();
        }
        break;
        case Class:
          enterOuterAlt(_localctx, 2);
        {
          setState(266);
          classDeclaration();
        }
        break;
        case Function:
        case Async:
          enterOuterAlt(_localctx, 3);
        {
          setState(267);
          functionDeclaration();
        }
        break;
        default:
          throw new NoViableAltException(this);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class VariableStatementContext extends ParserRuleContext {
    public VarModifierContext varModifier() {
      return getRuleContext(VarModifierContext.class, 0);
    }

    public VariableDeclarationListContext variableDeclarationList() {
      return getRuleContext(VariableDeclarationListContext.class, 0);
    }

    public EosContext eos() {
      return getRuleContext(EosContext.class, 0);
    }

    public VariableStatementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_variableStatement;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterVariableStatement(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitVariableStatement(this);
    }
  }

  public final VariableStatementContext variableStatement() throws RecognitionException {
    VariableStatementContext _localctx = new VariableStatementContext(_ctx, getState());
    enterRule(_localctx, 30, RULE_variableStatement);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(270);
        varModifier();
        setState(271);
        variableDeclarationList();
        setState(272);
        eos();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class VariableDeclarationListContext extends ParserRuleContext {
    public List<VariableDeclarationContext> variableDeclaration() {
      return getRuleContexts(VariableDeclarationContext.class);
    }

    public VariableDeclarationContext variableDeclaration(int i) {
      return getRuleContext(VariableDeclarationContext.class, i);
    }

    public List<TerminalNode> Comma() {
      return getTokens(JavaScriptParser.Comma);
    }

    public TerminalNode Comma(int i) {
      return getToken(JavaScriptParser.Comma, i);
    }

    public VariableDeclarationListContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_variableDeclarationList;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterVariableDeclarationList(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitVariableDeclarationList(this);
    }
  }

  public final VariableDeclarationListContext variableDeclarationList() throws RecognitionException {
    VariableDeclarationListContext _localctx = new VariableDeclarationListContext(_ctx, getState());
    enterRule(_localctx, 32, RULE_variableDeclarationList);
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
        setState(274);
        variableDeclaration();
        setState(279);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input, 18, _ctx);
        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
          if (_alt == 1) {
            {
              {
                setState(275);
                match(Comma);
                setState(276);
                variableDeclaration();
              }
            }
          }
          setState(281);
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input, 18, _ctx);
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class VariableDeclarationContext extends ParserRuleContext {
    public AssignableContext assignable() {
      return getRuleContext(AssignableContext.class, 0);
    }

    public TerminalNode Assign() {
      return getToken(JavaScriptParser.Assign, 0);
    }

    public SingleExpressionContext singleExpression() {
      return getRuleContext(SingleExpressionContext.class, 0);
    }

    public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_variableDeclaration;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterVariableDeclaration(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitVariableDeclaration(this);
    }
  }

  public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
    VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
    enterRule(_localctx, 34, RULE_variableDeclaration);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(282);
        assignable();
        setState(285);
        _errHandler.sync(this);
        switch (getInterpreter().adaptivePredict(_input, 19, _ctx)) {
          case 1: {
            setState(283);
            match(Assign);
            setState(284);
            singleExpression(0);
          }
          break;
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class EmptyStatementContext extends ParserRuleContext {
    public TerminalNode SemiColon() {
      return getToken(JavaScriptParser.SemiColon, 0);
    }

    public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_emptyStatement;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterEmptyStatement(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitEmptyStatement(this);
    }
  }

  public final EmptyStatementContext emptyStatement() throws RecognitionException {
    EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
    enterRule(_localctx, 36, RULE_emptyStatement);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(287);
        match(SemiColon);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class ExpressionStatementContext extends ParserRuleContext {
    public ExpressionSequenceContext expressionSequence() {
      return getRuleContext(ExpressionSequenceContext.class, 0);
    }

    public EosContext eos() {
      return getRuleContext(EosContext.class, 0);
    }

    public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_expressionStatement;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterExpressionStatement(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitExpressionStatement(this);
    }
  }

  public final ExpressionStatementContext expressionStatement() throws RecognitionException {
    ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
    enterRule(_localctx, 38, RULE_expressionStatement);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(289);
        if (!(this.notOpenBraceAndNotFunction()))
          throw new FailedPredicateException(this, "this.notOpenBraceAndNotFunction()");
        setState(290);
        expressionSequence();
        setState(291);
        eos();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class IfStatementContext extends ParserRuleContext {
    public TerminalNode If() {
      return getToken(JavaScriptParser.If, 0);
    }

    public TerminalNode OpenParen() {
      return getToken(JavaScriptParser.OpenParen, 0);
    }

    public ExpressionSequenceContext expressionSequence() {
      return getRuleContext(ExpressionSequenceContext.class, 0);
    }

    public TerminalNode CloseParen() {
      return getToken(JavaScriptParser.CloseParen, 0);
    }

    public List<StatementContext> statement() {
      return getRuleContexts(StatementContext.class);
    }

    public StatementContext statement(int i) {
      return getRuleContext(StatementContext.class, i);
    }

    public TerminalNode Else() {
      return getToken(JavaScriptParser.Else, 0);
    }

    public IfStatementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_ifStatement;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterIfStatement(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitIfStatement(this);
    }
  }

  public final IfStatementContext ifStatement() throws RecognitionException {
    IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
    enterRule(_localctx, 40, RULE_ifStatement);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(293);
        match(If);
        setState(294);
        match(OpenParen);
        setState(295);
        expressionSequence();
        setState(296);
        match(CloseParen);
        setState(297);
        statement();
        setState(300);
        _errHandler.sync(this);
        switch (getInterpreter().adaptivePredict(_input, 20, _ctx)) {
          case 1: {
            setState(298);
            match(Else);
            setState(299);
            statement();
          }
          break;
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class IterationStatementContext extends ParserRuleContext {
    public IterationStatementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_iterationStatement;
    }

    public IterationStatementContext() {
    }

    public void copyFrom(IterationStatementContext ctx) {
      super.copyFrom(ctx);
    }
  }

  public static class DoStatementContext extends IterationStatementContext {
    public TerminalNode Do() {
      return getToken(JavaScriptParser.Do, 0);
    }

    public StatementContext statement() {
      return getRuleContext(StatementContext.class, 0);
    }

    public TerminalNode While() {
      return getToken(JavaScriptParser.While, 0);
    }

    public TerminalNode OpenParen() {
      return getToken(JavaScriptParser.OpenParen, 0);
    }

    public ExpressionSequenceContext expressionSequence() {
      return getRuleContext(ExpressionSequenceContext.class, 0);
    }

    public TerminalNode CloseParen() {
      return getToken(JavaScriptParser.CloseParen, 0);
    }

    public EosContext eos() {
      return getRuleContext(EosContext.class, 0);
    }

    public DoStatementContext(IterationStatementContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterDoStatement(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitDoStatement(this);
    }
  }

  public static class WhileStatementContext extends IterationStatementContext {
    public TerminalNode While() {
      return getToken(JavaScriptParser.While, 0);
    }

    public TerminalNode OpenParen() {
      return getToken(JavaScriptParser.OpenParen, 0);
    }

    public ExpressionSequenceContext expressionSequence() {
      return getRuleContext(ExpressionSequenceContext.class, 0);
    }

    public TerminalNode CloseParen() {
      return getToken(JavaScriptParser.CloseParen, 0);
    }

    public StatementContext statement() {
      return getRuleContext(StatementContext.class, 0);
    }

    public WhileStatementContext(IterationStatementContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterWhileStatement(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitWhileStatement(this);
    }
  }

  public static class ForStatementContext extends IterationStatementContext {
    public TerminalNode For() {
      return getToken(JavaScriptParser.For, 0);
    }

    public TerminalNode OpenParen() {
      return getToken(JavaScriptParser.OpenParen, 0);
    }

    public List<TerminalNode> SemiColon() {
      return getTokens(JavaScriptParser.SemiColon);
    }

    public TerminalNode SemiColon(int i) {
      return getToken(JavaScriptParser.SemiColon, i);
    }

    public TerminalNode CloseParen() {
      return getToken(JavaScriptParser.CloseParen, 0);
    }

    public StatementContext statement() {
      return getRuleContext(StatementContext.class, 0);
    }

    public List<ExpressionSequenceContext> expressionSequence() {
      return getRuleContexts(ExpressionSequenceContext.class);
    }

    public ExpressionSequenceContext expressionSequence(int i) {
      return getRuleContext(ExpressionSequenceContext.class, i);
    }

    public VariableStatementContext variableStatement() {
      return getRuleContext(VariableStatementContext.class, 0);
    }

    public ForStatementContext(IterationStatementContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterForStatement(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitForStatement(this);
    }
  }

  public static class ForInStatementContext extends IterationStatementContext {
    public TerminalNode For() {
      return getToken(JavaScriptParser.For, 0);
    }

    public TerminalNode OpenParen() {
      return getToken(JavaScriptParser.OpenParen, 0);
    }

    public TerminalNode In() {
      return getToken(JavaScriptParser.In, 0);
    }

    public ExpressionSequenceContext expressionSequence() {
      return getRuleContext(ExpressionSequenceContext.class, 0);
    }

    public TerminalNode CloseParen() {
      return getToken(JavaScriptParser.CloseParen, 0);
    }

    public StatementContext statement() {
      return getRuleContext(StatementContext.class, 0);
    }

    public SingleExpressionContext singleExpression() {
      return getRuleContext(SingleExpressionContext.class, 0);
    }

    public VariableStatementContext variableStatement() {
      return getRuleContext(VariableStatementContext.class, 0);
    }

    public ForInStatementContext(IterationStatementContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterForInStatement(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitForInStatement(this);
    }
  }

  public static class ForOfStatementContext extends IterationStatementContext {
    public TerminalNode For() {
      return getToken(JavaScriptParser.For, 0);
    }

    public TerminalNode OpenParen() {
      return getToken(JavaScriptParser.OpenParen, 0);
    }

    public TerminalNode Identifier() {
      return getToken(JavaScriptParser.Identifier, 0);
    }

    public ExpressionSequenceContext expressionSequence() {
      return getRuleContext(ExpressionSequenceContext.class, 0);
    }

    public TerminalNode CloseParen() {
      return getToken(JavaScriptParser.CloseParen, 0);
    }

    public StatementContext statement() {
      return getRuleContext(StatementContext.class, 0);
    }

    public SingleExpressionContext singleExpression() {
      return getRuleContext(SingleExpressionContext.class, 0);
    }

    public VariableStatementContext variableStatement() {
      return getRuleContext(VariableStatementContext.class, 0);
    }

    public TerminalNode Await() {
      return getToken(JavaScriptParser.Await, 0);
    }

    public ForOfStatementContext(IterationStatementContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterForOfStatement(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitForOfStatement(this);
    }
  }

  public final IterationStatementContext iterationStatement() throws RecognitionException {
    IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
    enterRule(_localctx, 42, RULE_iterationStatement);
    int _la;
    try {
      setState(358);
      _errHandler.sync(this);
      switch (getInterpreter().adaptivePredict(_input, 27, _ctx)) {
        case 1:
          _localctx = new DoStatementContext(_localctx);
          enterOuterAlt(_localctx, 1);
        {
          setState(302);
          match(Do);
          setState(303);
          statement();
          setState(304);
          match(While);
          setState(305);
          match(OpenParen);
          setState(306);
          expressionSequence();
          setState(307);
          match(CloseParen);
          setState(308);
          eos();
        }
        break;
        case 2:
          _localctx = new WhileStatementContext(_localctx);
          enterOuterAlt(_localctx, 2);
        {
          setState(310);
          match(While);
          setState(311);
          match(OpenParen);
          setState(312);
          expressionSequence();
          setState(313);
          match(CloseParen);
          setState(314);
          statement();
        }
        break;
        case 3:
          _localctx = new ForStatementContext(_localctx);
          enterOuterAlt(_localctx, 3);
        {
          setState(316);
          match(For);
          setState(317);
          match(OpenParen);
          setState(320);
          _errHandler.sync(this);
          switch (_input.LA(1)) {
            case RegularExpressionLiteral:
            case OpenBracket:
            case OpenParen:
            case OpenBrace:
            case PlusPlus:
            case MinusMinus:
            case Plus:
            case Minus:
            case BitNot:
            case Not:
            case NullLiteral:
            case BooleanLiteral:
            case DecimalLiteral:
            case HexIntegerLiteral:
            case OctalIntegerLiteral:
            case OctalIntegerLiteral2:
            case BinaryIntegerLiteral:
            case BigHexIntegerLiteral:
            case BigOctalIntegerLiteral:
            case BigBinaryIntegerLiteral:
            case BigDecimalIntegerLiteral:
            case Typeof:
            case New:
            case Void:
            case Function:
            case This:
            case Delete:
            case Class:
            case Super:
            case Import:
            case Async:
            case Await:
            case Yield:
            case Identifier:
            case StringLiteral:
            case TemplateStringLiteral: {
              setState(318);
              expressionSequence();
            }
            break;
            case Var:
            case Const:
            case Let: {
              setState(319);
              variableStatement();
            }
            break;
            case SemiColon:
              break;
            default:
              break;
          }
          setState(322);
          match(SemiColon);
          setState(324);
          _errHandler.sync(this);
          _la = _input.LA(1);
          if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << OctalIntegerLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OctalIntegerLiteral2 - 64)) | (1L << (BinaryIntegerLiteral - 64)) | (1L << (BigHexIntegerLiteral - 64)) | (1L << (BigOctalIntegerLiteral - 64)) | (1L << (BigBinaryIntegerLiteral - 64)) | (1L << (BigDecimalIntegerLiteral - 64)) | (1L << (Typeof - 64)) | (1L << (New - 64)) | (1L << (Void - 64)) | (1L << (Function - 64)) | (1L << (This - 64)) | (1L << (Delete - 64)) | (1L << (Class - 64)) | (1L << (Super - 64)) | (1L << (Import - 64)) | (1L << (Async - 64)) | (1L << (Await - 64)) | (1L << (Yield - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)) | (1L << (TemplateStringLiteral - 64)))) != 0)) {
            {
              setState(323);
              expressionSequence();
            }
          }

          setState(326);
          match(SemiColon);
          setState(328);
          _errHandler.sync(this);
          _la = _input.LA(1);
          if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << OctalIntegerLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OctalIntegerLiteral2 - 64)) | (1L << (BinaryIntegerLiteral - 64)) | (1L << (BigHexIntegerLiteral - 64)) | (1L << (BigOctalIntegerLiteral - 64)) | (1L << (BigBinaryIntegerLiteral - 64)) | (1L << (BigDecimalIntegerLiteral - 64)) | (1L << (Typeof - 64)) | (1L << (New - 64)) | (1L << (Void - 64)) | (1L << (Function - 64)) | (1L << (This - 64)) | (1L << (Delete - 64)) | (1L << (Class - 64)) | (1L << (Super - 64)) | (1L << (Import - 64)) | (1L << (Async - 64)) | (1L << (Await - 64)) | (1L << (Yield - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)) | (1L << (TemplateStringLiteral - 64)))) != 0)) {
            {
              setState(327);
              expressionSequence();
            }
          }

          setState(330);
          match(CloseParen);
          setState(331);
          statement();
        }
        break;
        case 4:
          _localctx = new ForInStatementContext(_localctx);
          enterOuterAlt(_localctx, 4);
        {
          setState(332);
          match(For);
          setState(333);
          match(OpenParen);
          setState(336);
          _errHandler.sync(this);
          switch (_input.LA(1)) {
            case RegularExpressionLiteral:
            case OpenBracket:
            case OpenParen:
            case OpenBrace:
            case PlusPlus:
            case MinusMinus:
            case Plus:
            case Minus:
            case BitNot:
            case Not:
            case NullLiteral:
            case BooleanLiteral:
            case DecimalLiteral:
            case HexIntegerLiteral:
            case OctalIntegerLiteral:
            case OctalIntegerLiteral2:
            case BinaryIntegerLiteral:
            case BigHexIntegerLiteral:
            case BigOctalIntegerLiteral:
            case BigBinaryIntegerLiteral:
            case BigDecimalIntegerLiteral:
            case Typeof:
            case New:
            case Void:
            case Function:
            case This:
            case Delete:
            case Class:
            case Super:
            case Import:
            case Async:
            case Await:
            case Yield:
            case Identifier:
            case StringLiteral:
            case TemplateStringLiteral: {
              setState(334);
              singleExpression(0);
            }
            break;
            case Var:
            case Const:
            case Let: {
              setState(335);
              variableStatement();
            }
            break;
            default:
              throw new NoViableAltException(this);
          }
          setState(338);
          match(In);
          setState(339);
          expressionSequence();
          setState(340);
          match(CloseParen);
          setState(341);
          statement();
        }
        break;
        case 5:
          _localctx = new ForOfStatementContext(_localctx);
          enterOuterAlt(_localctx, 5);
        {
          setState(343);
          match(For);
          setState(345);
          _errHandler.sync(this);
          _la = _input.LA(1);
          if (_la == Await) {
            {
              setState(344);
              match(Await);
            }
          }

          setState(347);
          match(OpenParen);
          setState(350);
          _errHandler.sync(this);
          switch (_input.LA(1)) {
            case RegularExpressionLiteral:
            case OpenBracket:
            case OpenParen:
            case OpenBrace:
            case PlusPlus:
            case MinusMinus:
            case Plus:
            case Minus:
            case BitNot:
            case Not:
            case NullLiteral:
            case BooleanLiteral:
            case DecimalLiteral:
            case HexIntegerLiteral:
            case OctalIntegerLiteral:
            case OctalIntegerLiteral2:
            case BinaryIntegerLiteral:
            case BigHexIntegerLiteral:
            case BigOctalIntegerLiteral:
            case BigBinaryIntegerLiteral:
            case BigDecimalIntegerLiteral:
            case Typeof:
            case New:
            case Void:
            case Function:
            case This:
            case Delete:
            case Class:
            case Super:
            case Import:
            case Async:
            case Await:
            case Yield:
            case Identifier:
            case StringLiteral:
            case TemplateStringLiteral: {
              setState(348);
              singleExpression(0);
            }
            break;
            case Var:
            case Const:
            case Let: {
              setState(349);
              variableStatement();
            }
            break;
            default:
              throw new NoViableAltException(this);
          }
          setState(352);
          match(Identifier);
          setState(353);
          if (!(this.p("of"))) throw new FailedPredicateException(this, "this.p(\"of\")");
          setState(354);
          expressionSequence();
          setState(355);
          match(CloseParen);
          setState(356);
          statement();
        }
        break;
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class VarModifierContext extends ParserRuleContext {
    public TerminalNode Var() {
      return getToken(JavaScriptParser.Var, 0);
    }

    public TerminalNode Let() {
      return getToken(JavaScriptParser.Let, 0);
    }

    public TerminalNode Const() {
      return getToken(JavaScriptParser.Const, 0);
    }

    public VarModifierContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_varModifier;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterVarModifier(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitVarModifier(this);
    }
  }

  public final VarModifierContext varModifier() throws RecognitionException {
    VarModifierContext _localctx = new VarModifierContext(_ctx, getState());
    enterRule(_localctx, 44, RULE_varModifier);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(360);
        _la = _input.LA(1);
        if (!(((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (Var - 77)) | (1L << (Const - 77)) | (1L << (Let - 77)))) != 0))) {
          _errHandler.recoverInline(this);
        } else {
          if (_input.LA(1) == Token.EOF) matchedEOF = true;
          _errHandler.reportMatch(this);
          consume();
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class ContinueStatementContext extends ParserRuleContext {
    public TerminalNode Continue() {
      return getToken(JavaScriptParser.Continue, 0);
    }

    public EosContext eos() {
      return getRuleContext(EosContext.class, 0);
    }

    public TerminalNode Identifier() {
      return getToken(JavaScriptParser.Identifier, 0);
    }

    public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_continueStatement;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterContinueStatement(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitContinueStatement(this);
    }
  }

  public final ContinueStatementContext continueStatement() throws RecognitionException {
    ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
    enterRule(_localctx, 46, RULE_continueStatement);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(362);
        match(Continue);
        setState(365);
        _errHandler.sync(this);
        switch (getInterpreter().adaptivePredict(_input, 28, _ctx)) {
          case 1: {
            setState(363);
            if (!(this.notLineTerminator()))
              throw new FailedPredicateException(this, "this.notLineTerminator()");
            setState(364);
            match(Identifier);
          }
          break;
        }
        setState(367);
        eos();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class BreakStatementContext extends ParserRuleContext {
    public TerminalNode Break() {
      return getToken(JavaScriptParser.Break, 0);
    }

    public EosContext eos() {
      return getRuleContext(EosContext.class, 0);
    }

    public TerminalNode Identifier() {
      return getToken(JavaScriptParser.Identifier, 0);
    }

    public BreakStatementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_breakStatement;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterBreakStatement(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitBreakStatement(this);
    }
  }

  public final BreakStatementContext breakStatement() throws RecognitionException {
    BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
    enterRule(_localctx, 48, RULE_breakStatement);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(369);
        match(Break);
        setState(372);
        _errHandler.sync(this);
        switch (getInterpreter().adaptivePredict(_input, 29, _ctx)) {
          case 1: {
            setState(370);
            if (!(this.notLineTerminator()))
              throw new FailedPredicateException(this, "this.notLineTerminator()");
            setState(371);
            match(Identifier);
          }
          break;
        }
        setState(374);
        eos();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class ReturnStatementContext extends ParserRuleContext {
    public TerminalNode Return() {
      return getToken(JavaScriptParser.Return, 0);
    }

    public EosContext eos() {
      return getRuleContext(EosContext.class, 0);
    }

    public ExpressionSequenceContext expressionSequence() {
      return getRuleContext(ExpressionSequenceContext.class, 0);
    }

    public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_returnStatement;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterReturnStatement(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitReturnStatement(this);
    }
  }

  public final ReturnStatementContext returnStatement() throws RecognitionException {
    ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
    enterRule(_localctx, 50, RULE_returnStatement);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(376);
        match(Return);
        setState(379);
        _errHandler.sync(this);
        switch (getInterpreter().adaptivePredict(_input, 30, _ctx)) {
          case 1: {
            setState(377);
            if (!(this.notLineTerminator()))
              throw new FailedPredicateException(this, "this.notLineTerminator()");
            setState(378);
            expressionSequence();
          }
          break;
        }
        setState(381);
        eos();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class YieldStatementContext extends ParserRuleContext {
    public TerminalNode Yield() {
      return getToken(JavaScriptParser.Yield, 0);
    }

    public EosContext eos() {
      return getRuleContext(EosContext.class, 0);
    }

    public ExpressionSequenceContext expressionSequence() {
      return getRuleContext(ExpressionSequenceContext.class, 0);
    }

    public YieldStatementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_yieldStatement;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterYieldStatement(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitYieldStatement(this);
    }
  }

  public final YieldStatementContext yieldStatement() throws RecognitionException {
    YieldStatementContext _localctx = new YieldStatementContext(_ctx, getState());
    enterRule(_localctx, 52, RULE_yieldStatement);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(383);
        match(Yield);
        setState(386);
        _errHandler.sync(this);
        switch (getInterpreter().adaptivePredict(_input, 31, _ctx)) {
          case 1: {
            setState(384);
            if (!(this.notLineTerminator()))
              throw new FailedPredicateException(this, "this.notLineTerminator()");
            setState(385);
            expressionSequence();
          }
          break;
        }
        setState(388);
        eos();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class WithStatementContext extends ParserRuleContext {
    public TerminalNode With() {
      return getToken(JavaScriptParser.With, 0);
    }

    public TerminalNode OpenParen() {
      return getToken(JavaScriptParser.OpenParen, 0);
    }

    public ExpressionSequenceContext expressionSequence() {
      return getRuleContext(ExpressionSequenceContext.class, 0);
    }

    public TerminalNode CloseParen() {
      return getToken(JavaScriptParser.CloseParen, 0);
    }

    public StatementContext statement() {
      return getRuleContext(StatementContext.class, 0);
    }

    public WithStatementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_withStatement;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterWithStatement(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitWithStatement(this);
    }
  }

  public final WithStatementContext withStatement() throws RecognitionException {
    WithStatementContext _localctx = new WithStatementContext(_ctx, getState());
    enterRule(_localctx, 54, RULE_withStatement);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(390);
        match(With);
        setState(391);
        match(OpenParen);
        setState(392);
        expressionSequence();
        setState(393);
        match(CloseParen);
        setState(394);
        statement();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class SwitchStatementContext extends ParserRuleContext {
    public TerminalNode Switch() {
      return getToken(JavaScriptParser.Switch, 0);
    }

    public TerminalNode OpenParen() {
      return getToken(JavaScriptParser.OpenParen, 0);
    }

    public ExpressionSequenceContext expressionSequence() {
      return getRuleContext(ExpressionSequenceContext.class, 0);
    }

    public TerminalNode CloseParen() {
      return getToken(JavaScriptParser.CloseParen, 0);
    }

    public CaseBlockContext caseBlock() {
      return getRuleContext(CaseBlockContext.class, 0);
    }

    public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_switchStatement;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterSwitchStatement(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitSwitchStatement(this);
    }
  }

  public final SwitchStatementContext switchStatement() throws RecognitionException {
    SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
    enterRule(_localctx, 56, RULE_switchStatement);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(396);
        match(Switch);
        setState(397);
        match(OpenParen);
        setState(398);
        expressionSequence();
        setState(399);
        match(CloseParen);
        setState(400);
        caseBlock();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class CaseBlockContext extends ParserRuleContext {
    public TerminalNode OpenBrace() {
      return getToken(JavaScriptParser.OpenBrace, 0);
    }

    public TerminalNode CloseBrace() {
      return getToken(JavaScriptParser.CloseBrace, 0);
    }

    public List<CaseClausesContext> caseClauses() {
      return getRuleContexts(CaseClausesContext.class);
    }

    public CaseClausesContext caseClauses(int i) {
      return getRuleContext(CaseClausesContext.class, i);
    }

    public DefaultClauseContext defaultClause() {
      return getRuleContext(DefaultClauseContext.class, 0);
    }

    public CaseBlockContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_caseBlock;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterCaseBlock(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitCaseBlock(this);
    }
  }

  public final CaseBlockContext caseBlock() throws RecognitionException {
    CaseBlockContext _localctx = new CaseBlockContext(_ctx, getState());
    enterRule(_localctx, 58, RULE_caseBlock);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(402);
        match(OpenBrace);
        setState(404);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == Case) {
          {
            setState(403);
            caseClauses();
          }
        }

        setState(410);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == Default) {
          {
            setState(406);
            defaultClause();
            setState(408);
            _errHandler.sync(this);
            _la = _input.LA(1);
            if (_la == Case) {
              {
                setState(407);
                caseClauses();
              }
            }

          }
        }

        setState(412);
        match(CloseBrace);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class CaseClausesContext extends ParserRuleContext {
    public List<CaseClauseContext> caseClause() {
      return getRuleContexts(CaseClauseContext.class);
    }

    public CaseClauseContext caseClause(int i) {
      return getRuleContext(CaseClauseContext.class, i);
    }

    public CaseClausesContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_caseClauses;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterCaseClauses(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitCaseClauses(this);
    }
  }

  public final CaseClausesContext caseClauses() throws RecognitionException {
    CaseClausesContext _localctx = new CaseClausesContext(_ctx, getState());
    enterRule(_localctx, 60, RULE_caseClauses);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(415);
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
            {
              setState(414);
              caseClause();
            }
          }
          setState(417);
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while (_la == Case);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class CaseClauseContext extends ParserRuleContext {
    public TerminalNode Case() {
      return getToken(JavaScriptParser.Case, 0);
    }

    public ExpressionSequenceContext expressionSequence() {
      return getRuleContext(ExpressionSequenceContext.class, 0);
    }

    public TerminalNode Colon() {
      return getToken(JavaScriptParser.Colon, 0);
    }

    public StatementListContext statementList() {
      return getRuleContext(StatementListContext.class, 0);
    }

    public CaseClauseContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_caseClause;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterCaseClause(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitCaseClause(this);
    }
  }

  public final CaseClauseContext caseClause() throws RecognitionException {
    CaseClauseContext _localctx = new CaseClauseContext(_ctx, getState());
    enterRule(_localctx, 62, RULE_caseClause);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(419);
        match(Case);
        setState(420);
        expressionSequence();
        setState(421);
        match(Colon);
        setState(423);
        _errHandler.sync(this);
        switch (getInterpreter().adaptivePredict(_input, 36, _ctx)) {
          case 1: {
            setState(422);
            statementList();
          }
          break;
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class DefaultClauseContext extends ParserRuleContext {
    public TerminalNode Default() {
      return getToken(JavaScriptParser.Default, 0);
    }

    public TerminalNode Colon() {
      return getToken(JavaScriptParser.Colon, 0);
    }

    public StatementListContext statementList() {
      return getRuleContext(StatementListContext.class, 0);
    }

    public DefaultClauseContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_defaultClause;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterDefaultClause(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitDefaultClause(this);
    }
  }

  public final DefaultClauseContext defaultClause() throws RecognitionException {
    DefaultClauseContext _localctx = new DefaultClauseContext(_ctx, getState());
    enterRule(_localctx, 64, RULE_defaultClause);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(425);
        match(Default);
        setState(426);
        match(Colon);
        setState(428);
        _errHandler.sync(this);
        switch (getInterpreter().adaptivePredict(_input, 37, _ctx)) {
          case 1: {
            setState(427);
            statementList();
          }
          break;
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class LabelledStatementContext extends ParserRuleContext {
    public TerminalNode Identifier() {
      return getToken(JavaScriptParser.Identifier, 0);
    }

    public TerminalNode Colon() {
      return getToken(JavaScriptParser.Colon, 0);
    }

    public StatementContext statement() {
      return getRuleContext(StatementContext.class, 0);
    }

    public LabelledStatementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_labelledStatement;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterLabelledStatement(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitLabelledStatement(this);
    }
  }

  public final LabelledStatementContext labelledStatement() throws RecognitionException {
    LabelledStatementContext _localctx = new LabelledStatementContext(_ctx, getState());
    enterRule(_localctx, 66, RULE_labelledStatement);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(430);
        match(Identifier);
        setState(431);
        match(Colon);
        setState(432);
        statement();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class ThrowStatementContext extends ParserRuleContext {
    public TerminalNode Throw() {
      return getToken(JavaScriptParser.Throw, 0);
    }

    public ExpressionSequenceContext expressionSequence() {
      return getRuleContext(ExpressionSequenceContext.class, 0);
    }

    public EosContext eos() {
      return getRuleContext(EosContext.class, 0);
    }

    public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_throwStatement;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterThrowStatement(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitThrowStatement(this);
    }
  }

  public final ThrowStatementContext throwStatement() throws RecognitionException {
    ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
    enterRule(_localctx, 68, RULE_throwStatement);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(434);
        match(Throw);
        setState(435);
        if (!(this.notLineTerminator()))
          throw new FailedPredicateException(this, "this.notLineTerminator()");
        setState(436);
        expressionSequence();
        setState(437);
        eos();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class TryStatementContext extends ParserRuleContext {
    public TerminalNode Try() {
      return getToken(JavaScriptParser.Try, 0);
    }

    public BlockContext block() {
      return getRuleContext(BlockContext.class, 0);
    }

    public CatchProductionContext catchProduction() {
      return getRuleContext(CatchProductionContext.class, 0);
    }

    public FinallyProductionContext finallyProduction() {
      return getRuleContext(FinallyProductionContext.class, 0);
    }

    public TryStatementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_tryStatement;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterTryStatement(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitTryStatement(this);
    }
  }

  public final TryStatementContext tryStatement() throws RecognitionException {
    TryStatementContext _localctx = new TryStatementContext(_ctx, getState());
    enterRule(_localctx, 70, RULE_tryStatement);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(439);
        match(Try);
        setState(440);
        block();
        setState(446);
        _errHandler.sync(this);
        switch (_input.LA(1)) {
          case Catch: {
            setState(441);
            catchProduction();
            setState(443);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 38, _ctx)) {
              case 1: {
                setState(442);
                finallyProduction();
              }
              break;
            }
          }
          break;
          case Finally: {
            setState(445);
            finallyProduction();
          }
          break;
          default:
            throw new NoViableAltException(this);
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class CatchProductionContext extends ParserRuleContext {
    public TerminalNode Catch() {
      return getToken(JavaScriptParser.Catch, 0);
    }

    public BlockContext block() {
      return getRuleContext(BlockContext.class, 0);
    }

    public TerminalNode OpenParen() {
      return getToken(JavaScriptParser.OpenParen, 0);
    }

    public TerminalNode CloseParen() {
      return getToken(JavaScriptParser.CloseParen, 0);
    }

    public AssignableContext assignable() {
      return getRuleContext(AssignableContext.class, 0);
    }

    public CatchProductionContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_catchProduction;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterCatchProduction(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitCatchProduction(this);
    }
  }

  public final CatchProductionContext catchProduction() throws RecognitionException {
    CatchProductionContext _localctx = new CatchProductionContext(_ctx, getState());
    enterRule(_localctx, 72, RULE_catchProduction);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(448);
        match(Catch);
        setState(454);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == OpenParen) {
          {
            setState(449);
            match(OpenParen);
            setState(451);
            _errHandler.sync(this);
            _la = _input.LA(1);
            if (_la == OpenBracket || _la == OpenBrace || _la == Identifier) {
              {
                setState(450);
                assignable();
              }
            }

            setState(453);
            match(CloseParen);
          }
        }

        setState(456);
        block();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class FinallyProductionContext extends ParserRuleContext {
    public TerminalNode Finally() {
      return getToken(JavaScriptParser.Finally, 0);
    }

    public BlockContext block() {
      return getRuleContext(BlockContext.class, 0);
    }

    public FinallyProductionContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_finallyProduction;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterFinallyProduction(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitFinallyProduction(this);
    }
  }

  public final FinallyProductionContext finallyProduction() throws RecognitionException {
    FinallyProductionContext _localctx = new FinallyProductionContext(_ctx, getState());
    enterRule(_localctx, 74, RULE_finallyProduction);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(458);
        match(Finally);
        setState(459);
        block();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class DebuggerStatementContext extends ParserRuleContext {
    public TerminalNode Debugger() {
      return getToken(JavaScriptParser.Debugger, 0);
    }

    public EosContext eos() {
      return getRuleContext(EosContext.class, 0);
    }

    public DebuggerStatementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_debuggerStatement;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterDebuggerStatement(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitDebuggerStatement(this);
    }
  }

  public final DebuggerStatementContext debuggerStatement() throws RecognitionException {
    DebuggerStatementContext _localctx = new DebuggerStatementContext(_ctx, getState());
    enterRule(_localctx, 76, RULE_debuggerStatement);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(461);
        match(Debugger);
        setState(462);
        eos();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class FunctionDeclarationContext extends ParserRuleContext {
    public TerminalNode Function() {
      return getToken(JavaScriptParser.Function, 0);
    }

    public TerminalNode Identifier() {
      return getToken(JavaScriptParser.Identifier, 0);
    }

    public TerminalNode OpenParen() {
      return getToken(JavaScriptParser.OpenParen, 0);
    }

    public TerminalNode CloseParen() {
      return getToken(JavaScriptParser.CloseParen, 0);
    }

    public TerminalNode OpenBrace() {
      return getToken(JavaScriptParser.OpenBrace, 0);
    }

    public FunctionBodyContext functionBody() {
      return getRuleContext(FunctionBodyContext.class, 0);
    }

    public TerminalNode CloseBrace() {
      return getToken(JavaScriptParser.CloseBrace, 0);
    }

    public TerminalNode Async() {
      return getToken(JavaScriptParser.Async, 0);
    }

    public TerminalNode Multiply() {
      return getToken(JavaScriptParser.Multiply, 0);
    }

    public FormalParameterListContext formalParameterList() {
      return getRuleContext(FormalParameterListContext.class, 0);
    }

    public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_functionDeclaration;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterFunctionDeclaration(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitFunctionDeclaration(this);
    }
  }

  public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
    FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
    enterRule(_localctx, 78, RULE_functionDeclaration);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(465);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == Async) {
          {
            setState(464);
            match(Async);
          }
        }

        setState(467);
        match(Function);
        setState(469);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == Multiply) {
          {
            setState(468);
            match(Multiply);
          }
        }

        setState(471);
        match(Identifier);
        setState(472);
        match(OpenParen);
        setState(474);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenBracket) | (1L << OpenBrace) | (1L << Ellipsis))) != 0) || _la == Identifier) {
          {
            setState(473);
            formalParameterList();
          }
        }

        setState(476);
        match(CloseParen);
        setState(477);
        match(OpenBrace);
        setState(478);
        functionBody();
        setState(479);
        match(CloseBrace);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class ClassDeclarationContext extends ParserRuleContext {
    public TerminalNode Class() {
      return getToken(JavaScriptParser.Class, 0);
    }

    public TerminalNode Identifier() {
      return getToken(JavaScriptParser.Identifier, 0);
    }

    public ClassTailContext classTail() {
      return getRuleContext(ClassTailContext.class, 0);
    }

    public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_classDeclaration;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterClassDeclaration(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitClassDeclaration(this);
    }
  }

  public final ClassDeclarationContext classDeclaration() throws RecognitionException {
    ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
    enterRule(_localctx, 80, RULE_classDeclaration);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(481);
        match(Class);
        setState(482);
        match(Identifier);
        setState(483);
        classTail();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class ClassTailContext extends ParserRuleContext {
    public TerminalNode OpenBrace() {
      return getToken(JavaScriptParser.OpenBrace, 0);
    }

    public TerminalNode CloseBrace() {
      return getToken(JavaScriptParser.CloseBrace, 0);
    }

    public TerminalNode Extends() {
      return getToken(JavaScriptParser.Extends, 0);
    }

    public SingleExpressionContext singleExpression() {
      return getRuleContext(SingleExpressionContext.class, 0);
    }

    public List<ClassElementContext> classElement() {
      return getRuleContexts(ClassElementContext.class);
    }

    public ClassElementContext classElement(int i) {
      return getRuleContext(ClassElementContext.class, i);
    }

    public ClassTailContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_classTail;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterClassTail(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitClassTail(this);
    }
  }

  public final ClassTailContext classTail() throws RecognitionException {
    ClassTailContext _localctx = new ClassTailContext(_ctx, getState());
    enterRule(_localctx, 82, RULE_classTail);
    int _la;
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
        setState(487);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == Extends) {
          {
            setState(485);
            match(Extends);
            setState(486);
            singleExpression(0);
          }
        }

        setState(489);
        match(OpenBrace);
        setState(493);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input, 46, _ctx);
        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
          if (_alt == 1) {
            {
              {
                setState(490);
                classElement();
              }
            }
          }
          setState(495);
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input, 46, _ctx);
        }
        setState(496);
        match(CloseBrace);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class ClassElementContext extends ParserRuleContext {
    public MethodDefinitionContext methodDefinition() {
      return getRuleContext(MethodDefinitionContext.class, 0);
    }

    public List<TerminalNode> Static() {
      return getTokens(JavaScriptParser.Static);
    }

    public TerminalNode Static(int i) {
      return getToken(JavaScriptParser.Static, i);
    }

    public List<TerminalNode> Identifier() {
      return getTokens(JavaScriptParser.Identifier);
    }

    public TerminalNode Identifier(int i) {
      return getToken(JavaScriptParser.Identifier, i);
    }

    public List<TerminalNode> Async() {
      return getTokens(JavaScriptParser.Async);
    }

    public TerminalNode Async(int i) {
      return getToken(JavaScriptParser.Async, i);
    }

    public EmptyStatementContext emptyStatement() {
      return getRuleContext(EmptyStatementContext.class, 0);
    }

    public PropertyNameContext propertyName() {
      return getRuleContext(PropertyNameContext.class, 0);
    }

    public TerminalNode Assign() {
      return getToken(JavaScriptParser.Assign, 0);
    }

    public SingleExpressionContext singleExpression() {
      return getRuleContext(SingleExpressionContext.class, 0);
    }

    public TerminalNode Hashtag() {
      return getToken(JavaScriptParser.Hashtag, 0);
    }

    public ClassElementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_classElement;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterClassElement(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitClassElement(this);
    }
  }

  public final ClassElementContext classElement() throws RecognitionException {
    ClassElementContext _localctx = new ClassElementContext(_ctx, getState());
    enterRule(_localctx, 84, RULE_classElement);
    int _la;
    try {
      int _alt;
      setState(516);
      _errHandler.sync(this);
      switch (getInterpreter().adaptivePredict(_input, 50, _ctx)) {
        case 1:
          enterOuterAlt(_localctx, 1);
        {
          setState(504);
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input, 48, _ctx);
          while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
            if (_alt == 1) {
              {
                setState(502);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 47, _ctx)) {
                  case 1: {
                    setState(498);
                    match(Static);
                  }
                  break;
                  case 2: {
                    setState(499);
                    if (!(this.n("static")))
                      throw new FailedPredicateException(this, "this.n(\"static\")");
                    setState(500);
                    match(Identifier);
                  }
                  break;
                  case 3: {
                    setState(501);
                    match(Async);
                  }
                  break;
                }
              }
            }
            setState(506);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input, 48, _ctx);
          }
          setState(507);
          methodDefinition();
        }
        break;
        case 2:
          enterOuterAlt(_localctx, 2);
        {
          setState(508);
          emptyStatement();
        }
        break;
        case 3:
          enterOuterAlt(_localctx, 3);
        {
          setState(510);
          _errHandler.sync(this);
          _la = _input.LA(1);
          if (_la == Hashtag) {
            {
              setState(509);
              match(Hashtag);
            }
          }

          setState(512);
          propertyName();
          setState(513);
          match(Assign);
          setState(514);
          singleExpression(0);
        }
        break;
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class MethodDefinitionContext extends ParserRuleContext {
    public PropertyNameContext propertyName() {
      return getRuleContext(PropertyNameContext.class, 0);
    }

    public TerminalNode OpenParen() {
      return getToken(JavaScriptParser.OpenParen, 0);
    }

    public TerminalNode CloseParen() {
      return getToken(JavaScriptParser.CloseParen, 0);
    }

    public TerminalNode OpenBrace() {
      return getToken(JavaScriptParser.OpenBrace, 0);
    }

    public FunctionBodyContext functionBody() {
      return getRuleContext(FunctionBodyContext.class, 0);
    }

    public TerminalNode CloseBrace() {
      return getToken(JavaScriptParser.CloseBrace, 0);
    }

    public TerminalNode Multiply() {
      return getToken(JavaScriptParser.Multiply, 0);
    }

    public TerminalNode Hashtag() {
      return getToken(JavaScriptParser.Hashtag, 0);
    }

    public FormalParameterListContext formalParameterList() {
      return getRuleContext(FormalParameterListContext.class, 0);
    }

    public GetterContext getter() {
      return getRuleContext(GetterContext.class, 0);
    }

    public SetterContext setter() {
      return getRuleContext(SetterContext.class, 0);
    }

    public MethodDefinitionContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_methodDefinition;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterMethodDefinition(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitMethodDefinition(this);
    }
  }

  public final MethodDefinitionContext methodDefinition() throws RecognitionException {
    MethodDefinitionContext _localctx = new MethodDefinitionContext(_ctx, getState());
    enterRule(_localctx, 86, RULE_methodDefinition);
    int _la;
    try {
      setState(563);
      _errHandler.sync(this);
      switch (getInterpreter().adaptivePredict(_input, 59, _ctx)) {
        case 1:
          enterOuterAlt(_localctx, 1);
        {
          setState(519);
          _errHandler.sync(this);
          _la = _input.LA(1);
          if (_la == Multiply) {
            {
              setState(518);
              match(Multiply);
            }
          }

          setState(522);
          _errHandler.sync(this);
          _la = _input.LA(1);
          if (_la == Hashtag) {
            {
              setState(521);
              match(Hashtag);
            }
          }

          setState(524);
          propertyName();
          setState(525);
          match(OpenParen);
          setState(527);
          _errHandler.sync(this);
          _la = _input.LA(1);
          if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenBracket) | (1L << OpenBrace) | (1L << Ellipsis))) != 0) || _la == Identifier) {
            {
              setState(526);
              formalParameterList();
            }
          }

          setState(529);
          match(CloseParen);
          setState(530);
          match(OpenBrace);
          setState(531);
          functionBody();
          setState(532);
          match(CloseBrace);
        }
        break;
        case 2:
          enterOuterAlt(_localctx, 2);
        {
          setState(535);
          _errHandler.sync(this);
          _la = _input.LA(1);
          if (_la == Multiply) {
            {
              setState(534);
              match(Multiply);
            }
          }

          setState(538);
          _errHandler.sync(this);
          _la = _input.LA(1);
          if (_la == Hashtag) {
            {
              setState(537);
              match(Hashtag);
            }
          }

          setState(540);
          getter();
          setState(541);
          match(OpenParen);
          setState(542);
          match(CloseParen);
          setState(543);
          match(OpenBrace);
          setState(544);
          functionBody();
          setState(545);
          match(CloseBrace);
        }
        break;
        case 3:
          enterOuterAlt(_localctx, 3);
        {
          setState(548);
          _errHandler.sync(this);
          _la = _input.LA(1);
          if (_la == Multiply) {
            {
              setState(547);
              match(Multiply);
            }
          }

          setState(551);
          _errHandler.sync(this);
          _la = _input.LA(1);
          if (_la == Hashtag) {
            {
              setState(550);
              match(Hashtag);
            }
          }

          setState(553);
          setter();
          setState(554);
          match(OpenParen);
          setState(556);
          _errHandler.sync(this);
          _la = _input.LA(1);
          if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenBracket) | (1L << OpenBrace) | (1L << Ellipsis))) != 0) || _la == Identifier) {
            {
              setState(555);
              formalParameterList();
            }
          }

          setState(558);
          match(CloseParen);
          setState(559);
          match(OpenBrace);
          setState(560);
          functionBody();
          setState(561);
          match(CloseBrace);
        }
        break;
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class FormalParameterListContext extends ParserRuleContext {
    public List<FormalParameterArgContext> formalParameterArg() {
      return getRuleContexts(FormalParameterArgContext.class);
    }

    public FormalParameterArgContext formalParameterArg(int i) {
      return getRuleContext(FormalParameterArgContext.class, i);
    }

    public List<TerminalNode> Comma() {
      return getTokens(JavaScriptParser.Comma);
    }

    public TerminalNode Comma(int i) {
      return getToken(JavaScriptParser.Comma, i);
    }

    public LastFormalParameterArgContext lastFormalParameterArg() {
      return getRuleContext(LastFormalParameterArgContext.class, 0);
    }

    public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_formalParameterList;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterFormalParameterList(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitFormalParameterList(this);
    }
  }

  public final FormalParameterListContext formalParameterList() throws RecognitionException {
    FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
    enterRule(_localctx, 88, RULE_formalParameterList);
    int _la;
    try {
      int _alt;
      setState(578);
      _errHandler.sync(this);
      switch (_input.LA(1)) {
        case OpenBracket:
        case OpenBrace:
        case Identifier:
          enterOuterAlt(_localctx, 1);
        {
          setState(565);
          formalParameterArg();
          setState(570);
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input, 60, _ctx);
          while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
            if (_alt == 1) {
              {
                {
                  setState(566);
                  match(Comma);
                  setState(567);
                  formalParameterArg();
                }
              }
            }
            setState(572);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input, 60, _ctx);
          }
          setState(575);
          _errHandler.sync(this);
          _la = _input.LA(1);
          if (_la == Comma) {
            {
              setState(573);
              match(Comma);
              setState(574);
              lastFormalParameterArg();
            }
          }

        }
        break;
        case Ellipsis:
          enterOuterAlt(_localctx, 2);
        {
          setState(577);
          lastFormalParameterArg();
        }
        break;
        default:
          throw new NoViableAltException(this);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class FormalParameterArgContext extends ParserRuleContext {
    public AssignableContext assignable() {
      return getRuleContext(AssignableContext.class, 0);
    }

    public TerminalNode Assign() {
      return getToken(JavaScriptParser.Assign, 0);
    }

    public SingleExpressionContext singleExpression() {
      return getRuleContext(SingleExpressionContext.class, 0);
    }

    public FormalParameterArgContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_formalParameterArg;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterFormalParameterArg(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitFormalParameterArg(this);
    }
  }

  public final FormalParameterArgContext formalParameterArg() throws RecognitionException {
    FormalParameterArgContext _localctx = new FormalParameterArgContext(_ctx, getState());
    enterRule(_localctx, 90, RULE_formalParameterArg);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(580);
        assignable();
        setState(583);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == Assign) {
          {
            setState(581);
            match(Assign);
            setState(582);
            singleExpression(0);
          }
        }

      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class LastFormalParameterArgContext extends ParserRuleContext {
    public TerminalNode Ellipsis() {
      return getToken(JavaScriptParser.Ellipsis, 0);
    }

    public SingleExpressionContext singleExpression() {
      return getRuleContext(SingleExpressionContext.class, 0);
    }

    public LastFormalParameterArgContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_lastFormalParameterArg;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterLastFormalParameterArg(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitLastFormalParameterArg(this);
    }
  }

  public final LastFormalParameterArgContext lastFormalParameterArg() throws RecognitionException {
    LastFormalParameterArgContext _localctx = new LastFormalParameterArgContext(_ctx, getState());
    enterRule(_localctx, 92, RULE_lastFormalParameterArg);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(585);
        match(Ellipsis);
        setState(586);
        singleExpression(0);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class FunctionBodyContext extends ParserRuleContext {
    public SourceElementsContext sourceElements() {
      return getRuleContext(SourceElementsContext.class, 0);
    }

    public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_functionBody;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterFunctionBody(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitFunctionBody(this);
    }
  }

  public final FunctionBodyContext functionBody() throws RecognitionException {
    FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
    enterRule(_localctx, 94, RULE_functionBody);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(589);
        _errHandler.sync(this);
        switch (getInterpreter().adaptivePredict(_input, 64, _ctx)) {
          case 1: {
            setState(588);
            sourceElements();
          }
          break;
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class SourceElementsContext extends ParserRuleContext {
    public List<SourceElementContext> sourceElement() {
      return getRuleContexts(SourceElementContext.class);
    }

    public SourceElementContext sourceElement(int i) {
      return getRuleContext(SourceElementContext.class, i);
    }

    public SourceElementsContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_sourceElements;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterSourceElements(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitSourceElements(this);
    }
  }

  public final SourceElementsContext sourceElements() throws RecognitionException {
    SourceElementsContext _localctx = new SourceElementsContext(_ctx, getState());
    enterRule(_localctx, 96, RULE_sourceElements);
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
        setState(592);
        _errHandler.sync(this);
        _alt = 1;
        do {
          switch (_alt) {
            case 1: {
              {
                setState(591);
                sourceElement();
              }
            }
            break;
            default:
              throw new NoViableAltException(this);
          }
          setState(594);
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input, 65, _ctx);
        } while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class ArrayLiteralContext extends ParserRuleContext {
    public TerminalNode OpenBracket() {
      return getToken(JavaScriptParser.OpenBracket, 0);
    }

    public ElementListContext elementList() {
      return getRuleContext(ElementListContext.class, 0);
    }

    public TerminalNode CloseBracket() {
      return getToken(JavaScriptParser.CloseBracket, 0);
    }

    public ArrayLiteralContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_arrayLiteral;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterArrayLiteral(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitArrayLiteral(this);
    }
  }

  public final ArrayLiteralContext arrayLiteral() throws RecognitionException {
    ArrayLiteralContext _localctx = new ArrayLiteralContext(_ctx, getState());
    enterRule(_localctx, 98, RULE_arrayLiteral);
    try {
      enterOuterAlt(_localctx, 1);
      {
        {
          setState(596);
          match(OpenBracket);
          setState(597);
          elementList();
          setState(598);
          match(CloseBracket);
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class ElementListContext extends ParserRuleContext {
    public List<TerminalNode> Comma() {
      return getTokens(JavaScriptParser.Comma);
    }

    public TerminalNode Comma(int i) {
      return getToken(JavaScriptParser.Comma, i);
    }

    public List<ArrayElementContext> arrayElement() {
      return getRuleContexts(ArrayElementContext.class);
    }

    public ArrayElementContext arrayElement(int i) {
      return getRuleContext(ArrayElementContext.class, i);
    }

    public ElementListContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_elementList;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterElementList(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitElementList(this);
    }
  }

  public final ElementListContext elementList() throws RecognitionException {
    ElementListContext _localctx = new ElementListContext(_ctx, getState());
    enterRule(_localctx, 100, RULE_elementList);
    int _la;
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
        setState(603);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input, 66, _ctx);
        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
          if (_alt == 1) {
            {
              {
                setState(600);
                match(Comma);
              }
            }
          }
          setState(605);
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input, 66, _ctx);
        }
        setState(607);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << Ellipsis) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << OctalIntegerLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OctalIntegerLiteral2 - 64)) | (1L << (BinaryIntegerLiteral - 64)) | (1L << (BigHexIntegerLiteral - 64)) | (1L << (BigOctalIntegerLiteral - 64)) | (1L << (BigBinaryIntegerLiteral - 64)) | (1L << (BigDecimalIntegerLiteral - 64)) | (1L << (Typeof - 64)) | (1L << (New - 64)) | (1L << (Void - 64)) | (1L << (Function - 64)) | (1L << (This - 64)) | (1L << (Delete - 64)) | (1L << (Class - 64)) | (1L << (Super - 64)) | (1L << (Import - 64)) | (1L << (Async - 64)) | (1L << (Await - 64)) | (1L << (Yield - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)) | (1L << (TemplateStringLiteral - 64)))) != 0)) {
          {
            setState(606);
            arrayElement();
          }
        }

        setState(617);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input, 69, _ctx);
        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
          if (_alt == 1) {
            {
              {
                setState(610);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                  {
                    {
                      setState(609);
                      match(Comma);
                    }
                  }
                  setState(612);
                  _errHandler.sync(this);
                  _la = _input.LA(1);
                } while (_la == Comma);
                setState(614);
                arrayElement();
              }
            }
          }
          setState(619);
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input, 69, _ctx);
        }
        setState(623);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (_la == Comma) {
          {
            {
              setState(620);
              match(Comma);
            }
          }
          setState(625);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class ArrayElementContext extends ParserRuleContext {
    public SingleExpressionContext singleExpression() {
      return getRuleContext(SingleExpressionContext.class, 0);
    }

    public TerminalNode Ellipsis() {
      return getToken(JavaScriptParser.Ellipsis, 0);
    }

    public ArrayElementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_arrayElement;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterArrayElement(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitArrayElement(this);
    }
  }

  public final ArrayElementContext arrayElement() throws RecognitionException {
    ArrayElementContext _localctx = new ArrayElementContext(_ctx, getState());
    enterRule(_localctx, 102, RULE_arrayElement);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(627);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == Ellipsis) {
          {
            setState(626);
            match(Ellipsis);
          }
        }

        setState(629);
        singleExpression(0);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class ObjectLiteralContext extends ParserRuleContext {
    public TerminalNode OpenBrace() {
      return getToken(JavaScriptParser.OpenBrace, 0);
    }

    public TerminalNode CloseBrace() {
      return getToken(JavaScriptParser.CloseBrace, 0);
    }

    public List<PropertyAssignmentContext> propertyAssignment() {
      return getRuleContexts(PropertyAssignmentContext.class);
    }

    public PropertyAssignmentContext propertyAssignment(int i) {
      return getRuleContext(PropertyAssignmentContext.class, i);
    }

    public List<TerminalNode> Comma() {
      return getTokens(JavaScriptParser.Comma);
    }

    public TerminalNode Comma(int i) {
      return getToken(JavaScriptParser.Comma, i);
    }

    public ObjectLiteralContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_objectLiteral;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterObjectLiteral(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitObjectLiteral(this);
    }
  }

  public final ObjectLiteralContext objectLiteral() throws RecognitionException {
    ObjectLiteralContext _localctx = new ObjectLiteralContext(_ctx, getState());
    enterRule(_localctx, 104, RULE_objectLiteral);
    int _la;
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
        setState(631);
        match(OpenBrace);
        setState(640);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << Ellipsis) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << Multiply) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << OctalIntegerLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OctalIntegerLiteral2 - 64)) | (1L << (BinaryIntegerLiteral - 64)) | (1L << (BigHexIntegerLiteral - 64)) | (1L << (BigOctalIntegerLiteral - 64)) | (1L << (BigBinaryIntegerLiteral - 64)) | (1L << (BigDecimalIntegerLiteral - 64)) | (1L << (Break - 64)) | (1L << (Do - 64)) | (1L << (Instanceof - 64)) | (1L << (Typeof - 64)) | (1L << (Case - 64)) | (1L << (Else - 64)) | (1L << (New - 64)) | (1L << (Var - 64)) | (1L << (Catch - 64)) | (1L << (Finally - 64)) | (1L << (Return - 64)) | (1L << (Void - 64)) | (1L << (Continue - 64)) | (1L << (For - 64)) | (1L << (Switch - 64)) | (1L << (While - 64)) | (1L << (Debugger - 64)) | (1L << (Function - 64)) | (1L << (This - 64)) | (1L << (With - 64)) | (1L << (Default - 64)) | (1L << (If - 64)) | (1L << (Throw - 64)) | (1L << (Delete - 64)) | (1L << (In - 64)) | (1L << (Try - 64)) | (1L << (As - 64)) | (1L << (From - 64)) | (1L << (Class - 64)) | (1L << (Enum - 64)) | (1L << (Extends - 64)) | (1L << (Super - 64)) | (1L << (Const - 64)) | (1L << (Export - 64)) | (1L << (Import - 64)) | (1L << (Async - 64)) | (1L << (Await - 64)) | (1L << (Implements - 64)) | (1L << (Let - 64)) | (1L << (Private - 64)) | (1L << (Public - 64)) | (1L << (Interface - 64)) | (1L << (Package - 64)) | (1L << (Protected - 64)) | (1L << (Static - 64)) | (1L << (Yield - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)) | (1L << (TemplateStringLiteral - 64)))) != 0)) {
          {
            setState(632);
            propertyAssignment();
            setState(637);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input, 72, _ctx);
            while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
              if (_alt == 1) {
                {
                  {
                    setState(633);
                    match(Comma);
                    setState(634);
                    propertyAssignment();
                  }
                }
              }
              setState(639);
              _errHandler.sync(this);
              _alt = getInterpreter().adaptivePredict(_input, 72, _ctx);
            }
          }
        }

        setState(643);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == Comma) {
          {
            setState(642);
            match(Comma);
          }
        }

        setState(645);
        match(CloseBrace);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class PropertyAssignmentContext extends ParserRuleContext {
    public PropertyAssignmentContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_propertyAssignment;
    }

    public PropertyAssignmentContext() {
    }

    public void copyFrom(PropertyAssignmentContext ctx) {
      super.copyFrom(ctx);
    }
  }

  public static class PropertyExpressionAssignmentContext extends PropertyAssignmentContext {
    public PropertyNameContext propertyName() {
      return getRuleContext(PropertyNameContext.class, 0);
    }

    public TerminalNode Colon() {
      return getToken(JavaScriptParser.Colon, 0);
    }

    public SingleExpressionContext singleExpression() {
      return getRuleContext(SingleExpressionContext.class, 0);
    }

    public PropertyExpressionAssignmentContext(PropertyAssignmentContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterPropertyExpressionAssignment(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitPropertyExpressionAssignment(this);
    }
  }

  public static class ComputedPropertyExpressionAssignmentContext extends PropertyAssignmentContext {
    public TerminalNode OpenBracket() {
      return getToken(JavaScriptParser.OpenBracket, 0);
    }

    public List<SingleExpressionContext> singleExpression() {
      return getRuleContexts(SingleExpressionContext.class);
    }

    public SingleExpressionContext singleExpression(int i) {
      return getRuleContext(SingleExpressionContext.class, i);
    }

    public TerminalNode CloseBracket() {
      return getToken(JavaScriptParser.CloseBracket, 0);
    }

    public TerminalNode Colon() {
      return getToken(JavaScriptParser.Colon, 0);
    }

    public ComputedPropertyExpressionAssignmentContext(PropertyAssignmentContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterComputedPropertyExpressionAssignment(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitComputedPropertyExpressionAssignment(this);
    }
  }

  public static class PropertyShorthandContext extends PropertyAssignmentContext {
    public SingleExpressionContext singleExpression() {
      return getRuleContext(SingleExpressionContext.class, 0);
    }

    public TerminalNode Ellipsis() {
      return getToken(JavaScriptParser.Ellipsis, 0);
    }

    public PropertyShorthandContext(PropertyAssignmentContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterPropertyShorthand(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitPropertyShorthand(this);
    }
  }

  public static class PropertySetterContext extends PropertyAssignmentContext {
    public SetterContext setter() {
      return getRuleContext(SetterContext.class, 0);
    }

    public TerminalNode OpenParen() {
      return getToken(JavaScriptParser.OpenParen, 0);
    }

    public FormalParameterArgContext formalParameterArg() {
      return getRuleContext(FormalParameterArgContext.class, 0);
    }

    public TerminalNode CloseParen() {
      return getToken(JavaScriptParser.CloseParen, 0);
    }

    public TerminalNode OpenBrace() {
      return getToken(JavaScriptParser.OpenBrace, 0);
    }

    public FunctionBodyContext functionBody() {
      return getRuleContext(FunctionBodyContext.class, 0);
    }

    public TerminalNode CloseBrace() {
      return getToken(JavaScriptParser.CloseBrace, 0);
    }

    public PropertySetterContext(PropertyAssignmentContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterPropertySetter(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitPropertySetter(this);
    }
  }

  public static class PropertyGetterContext extends PropertyAssignmentContext {
    public GetterContext getter() {
      return getRuleContext(GetterContext.class, 0);
    }

    public TerminalNode OpenParen() {
      return getToken(JavaScriptParser.OpenParen, 0);
    }

    public TerminalNode CloseParen() {
      return getToken(JavaScriptParser.CloseParen, 0);
    }

    public TerminalNode OpenBrace() {
      return getToken(JavaScriptParser.OpenBrace, 0);
    }

    public FunctionBodyContext functionBody() {
      return getRuleContext(FunctionBodyContext.class, 0);
    }

    public TerminalNode CloseBrace() {
      return getToken(JavaScriptParser.CloseBrace, 0);
    }

    public PropertyGetterContext(PropertyAssignmentContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterPropertyGetter(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitPropertyGetter(this);
    }
  }

  public static class FunctionPropertyContext extends PropertyAssignmentContext {
    public PropertyNameContext propertyName() {
      return getRuleContext(PropertyNameContext.class, 0);
    }

    public TerminalNode OpenParen() {
      return getToken(JavaScriptParser.OpenParen, 0);
    }

    public TerminalNode CloseParen() {
      return getToken(JavaScriptParser.CloseParen, 0);
    }

    public TerminalNode OpenBrace() {
      return getToken(JavaScriptParser.OpenBrace, 0);
    }

    public FunctionBodyContext functionBody() {
      return getRuleContext(FunctionBodyContext.class, 0);
    }

    public TerminalNode CloseBrace() {
      return getToken(JavaScriptParser.CloseBrace, 0);
    }

    public TerminalNode Async() {
      return getToken(JavaScriptParser.Async, 0);
    }

    public TerminalNode Multiply() {
      return getToken(JavaScriptParser.Multiply, 0);
    }

    public FormalParameterListContext formalParameterList() {
      return getRuleContext(FormalParameterListContext.class, 0);
    }

    public FunctionPropertyContext(PropertyAssignmentContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterFunctionProperty(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitFunctionProperty(this);
    }
  }

  public final PropertyAssignmentContext propertyAssignment() throws RecognitionException {
    PropertyAssignmentContext _localctx = new PropertyAssignmentContext(_ctx, getState());
    enterRule(_localctx, 106, RULE_propertyAssignment);
    int _la;
    try {
      setState(692);
      _errHandler.sync(this);
      switch (getInterpreter().adaptivePredict(_input, 79, _ctx)) {
        case 1:
          _localctx = new PropertyExpressionAssignmentContext(_localctx);
          enterOuterAlt(_localctx, 1);
        {
          setState(647);
          propertyName();
          setState(648);
          match(Colon);
          setState(649);
          singleExpression(0);
        }
        break;
        case 2:
          _localctx = new ComputedPropertyExpressionAssignmentContext(_localctx);
          enterOuterAlt(_localctx, 2);
        {
          setState(651);
          match(OpenBracket);
          setState(652);
          singleExpression(0);
          setState(653);
          match(CloseBracket);
          setState(654);
          match(Colon);
          setState(655);
          singleExpression(0);
        }
        break;
        case 3:
          _localctx = new FunctionPropertyContext(_localctx);
          enterOuterAlt(_localctx, 3);
        {
          setState(658);
          _errHandler.sync(this);
          switch (getInterpreter().adaptivePredict(_input, 75, _ctx)) {
            case 1: {
              setState(657);
              match(Async);
            }
            break;
          }
          setState(661);
          _errHandler.sync(this);
          _la = _input.LA(1);
          if (_la == Multiply) {
            {
              setState(660);
              match(Multiply);
            }
          }

          setState(663);
          propertyName();
          setState(664);
          match(OpenParen);
          setState(666);
          _errHandler.sync(this);
          _la = _input.LA(1);
          if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenBracket) | (1L << OpenBrace) | (1L << Ellipsis))) != 0) || _la == Identifier) {
            {
              setState(665);
              formalParameterList();
            }
          }

          setState(668);
          match(CloseParen);
          setState(669);
          match(OpenBrace);
          setState(670);
          functionBody();
          setState(671);
          match(CloseBrace);
        }
        break;
        case 4:
          _localctx = new PropertyGetterContext(_localctx);
          enterOuterAlt(_localctx, 4);
        {
          setState(673);
          getter();
          setState(674);
          match(OpenParen);
          setState(675);
          match(CloseParen);
          setState(676);
          match(OpenBrace);
          setState(677);
          functionBody();
          setState(678);
          match(CloseBrace);
        }
        break;
        case 5:
          _localctx = new PropertySetterContext(_localctx);
          enterOuterAlt(_localctx, 5);
        {
          setState(680);
          setter();
          setState(681);
          match(OpenParen);
          setState(682);
          formalParameterArg();
          setState(683);
          match(CloseParen);
          setState(684);
          match(OpenBrace);
          setState(685);
          functionBody();
          setState(686);
          match(CloseBrace);
        }
        break;
        case 6:
          _localctx = new PropertyShorthandContext(_localctx);
          enterOuterAlt(_localctx, 6);
        {
          setState(689);
          _errHandler.sync(this);
          _la = _input.LA(1);
          if (_la == Ellipsis) {
            {
              setState(688);
              match(Ellipsis);
            }
          }

          setState(691);
          singleExpression(0);
        }
        break;
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class PropertyNameContext extends ParserRuleContext {
    public IdentifierNameContext identifierName() {
      return getRuleContext(IdentifierNameContext.class, 0);
    }

    public TerminalNode StringLiteral() {
      return getToken(JavaScriptParser.StringLiteral, 0);
    }

    public NumericLiteralContext numericLiteral() {
      return getRuleContext(NumericLiteralContext.class, 0);
    }

    public TerminalNode OpenBracket() {
      return getToken(JavaScriptParser.OpenBracket, 0);
    }

    public SingleExpressionContext singleExpression() {
      return getRuleContext(SingleExpressionContext.class, 0);
    }

    public TerminalNode CloseBracket() {
      return getToken(JavaScriptParser.CloseBracket, 0);
    }

    public PropertyNameContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_propertyName;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterPropertyName(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitPropertyName(this);
    }
  }

  public final PropertyNameContext propertyName() throws RecognitionException {
    PropertyNameContext _localctx = new PropertyNameContext(_ctx, getState());
    enterRule(_localctx, 108, RULE_propertyName);
    try {
      setState(701);
      _errHandler.sync(this);
      switch (_input.LA(1)) {
        case NullLiteral:
        case BooleanLiteral:
        case Break:
        case Do:
        case Instanceof:
        case Typeof:
        case Case:
        case Else:
        case New:
        case Var:
        case Catch:
        case Finally:
        case Return:
        case Void:
        case Continue:
        case For:
        case Switch:
        case While:
        case Debugger:
        case Function:
        case This:
        case With:
        case Default:
        case If:
        case Throw:
        case Delete:
        case In:
        case Try:
        case As:
        case From:
        case Class:
        case Enum:
        case Extends:
        case Super:
        case Const:
        case Export:
        case Import:
        case Async:
        case Await:
        case Implements:
        case Let:
        case Private:
        case Public:
        case Interface:
        case Package:
        case Protected:
        case Static:
        case Yield:
        case Identifier:
          enterOuterAlt(_localctx, 1);
        {
          setState(694);
          identifierName();
        }
        break;
        case StringLiteral:
          enterOuterAlt(_localctx, 2);
        {
          setState(695);
          match(StringLiteral);
        }
        break;
        case DecimalLiteral:
        case HexIntegerLiteral:
        case OctalIntegerLiteral:
        case OctalIntegerLiteral2:
        case BinaryIntegerLiteral:
          enterOuterAlt(_localctx, 3);
        {
          setState(696);
          numericLiteral();
        }
        break;
        case OpenBracket:
          enterOuterAlt(_localctx, 4);
        {
          setState(697);
          match(OpenBracket);
          setState(698);
          singleExpression(0);
          setState(699);
          match(CloseBracket);
        }
        break;
        default:
          throw new NoViableAltException(this);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class ArgumentsContext extends ParserRuleContext {
    public TerminalNode OpenParen() {
      return getToken(JavaScriptParser.OpenParen, 0);
    }

    public TerminalNode CloseParen() {
      return getToken(JavaScriptParser.CloseParen, 0);
    }

    public List<ArgumentContext> argument() {
      return getRuleContexts(ArgumentContext.class);
    }

    public ArgumentContext argument(int i) {
      return getRuleContext(ArgumentContext.class, i);
    }

    public List<TerminalNode> Comma() {
      return getTokens(JavaScriptParser.Comma);
    }

    public TerminalNode Comma(int i) {
      return getToken(JavaScriptParser.Comma, i);
    }

    public ArgumentsContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_arguments;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterArguments(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitArguments(this);
    }
  }

  public final ArgumentsContext arguments() throws RecognitionException {
    ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
    enterRule(_localctx, 110, RULE_arguments);
    int _la;
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
        setState(703);
        match(OpenParen);
        setState(715);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << Ellipsis) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << OctalIntegerLiteral))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (OctalIntegerLiteral2 - 64)) | (1L << (BinaryIntegerLiteral - 64)) | (1L << (BigHexIntegerLiteral - 64)) | (1L << (BigOctalIntegerLiteral - 64)) | (1L << (BigBinaryIntegerLiteral - 64)) | (1L << (BigDecimalIntegerLiteral - 64)) | (1L << (Typeof - 64)) | (1L << (New - 64)) | (1L << (Void - 64)) | (1L << (Function - 64)) | (1L << (This - 64)) | (1L << (Delete - 64)) | (1L << (Class - 64)) | (1L << (Super - 64)) | (1L << (Import - 64)) | (1L << (Async - 64)) | (1L << (Await - 64)) | (1L << (Yield - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)) | (1L << (TemplateStringLiteral - 64)))) != 0)) {
          {
            setState(704);
            argument();
            setState(709);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input, 81, _ctx);
            while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
              if (_alt == 1) {
                {
                  {
                    setState(705);
                    match(Comma);
                    setState(706);
                    argument();
                  }
                }
              }
              setState(711);
              _errHandler.sync(this);
              _alt = getInterpreter().adaptivePredict(_input, 81, _ctx);
            }
            setState(713);
            _errHandler.sync(this);
            _la = _input.LA(1);
            if (_la == Comma) {
              {
                setState(712);
                match(Comma);
              }
            }

          }
        }

        setState(717);
        match(CloseParen);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class ArgumentContext extends ParserRuleContext {
    public SingleExpressionContext singleExpression() {
      return getRuleContext(SingleExpressionContext.class, 0);
    }

    public TerminalNode Identifier() {
      return getToken(JavaScriptParser.Identifier, 0);
    }

    public TerminalNode Ellipsis() {
      return getToken(JavaScriptParser.Ellipsis, 0);
    }

    public ArgumentContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_argument;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterArgument(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitArgument(this);
    }
  }

  public final ArgumentContext argument() throws RecognitionException {
    ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
    enterRule(_localctx, 112, RULE_argument);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(720);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == Ellipsis) {
          {
            setState(719);
            match(Ellipsis);
          }
        }

        setState(724);
        _errHandler.sync(this);
        switch (getInterpreter().adaptivePredict(_input, 85, _ctx)) {
          case 1: {
            setState(722);
            singleExpression(0);
          }
          break;
          case 2: {
            setState(723);
            match(Identifier);
          }
          break;
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class ExpressionSequenceContext extends ParserRuleContext {
    public List<SingleExpressionContext> singleExpression() {
      return getRuleContexts(SingleExpressionContext.class);
    }

    public SingleExpressionContext singleExpression(int i) {
      return getRuleContext(SingleExpressionContext.class, i);
    }

    public List<TerminalNode> Comma() {
      return getTokens(JavaScriptParser.Comma);
    }

    public TerminalNode Comma(int i) {
      return getToken(JavaScriptParser.Comma, i);
    }

    public ExpressionSequenceContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_expressionSequence;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterExpressionSequence(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitExpressionSequence(this);
    }
  }

  public final ExpressionSequenceContext expressionSequence() throws RecognitionException {
    ExpressionSequenceContext _localctx = new ExpressionSequenceContext(_ctx, getState());
    enterRule(_localctx, 114, RULE_expressionSequence);
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
        setState(726);
        singleExpression(0);
        setState(731);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input, 86, _ctx);
        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
          if (_alt == 1) {
            {
              {
                setState(727);
                match(Comma);
                setState(728);
                singleExpression(0);
              }
            }
          }
          setState(733);
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input, 86, _ctx);
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class SingleExpressionContext extends ParserRuleContext {
    public SingleExpressionContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_singleExpression;
    }

    public SingleExpressionContext() {
    }

    public void copyFrom(SingleExpressionContext ctx) {
      super.copyFrom(ctx);
    }
  }

  public static class TemplateStringExpressionContext extends SingleExpressionContext {
    public SingleExpressionContext singleExpression() {
      return getRuleContext(SingleExpressionContext.class, 0);
    }

    public TerminalNode TemplateStringLiteral() {
      return getToken(JavaScriptParser.TemplateStringLiteral, 0);
    }

    public TemplateStringExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterTemplateStringExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitTemplateStringExpression(this);
    }
  }

  public static class TernaryExpressionContext extends SingleExpressionContext {
    public List<SingleExpressionContext> singleExpression() {
      return getRuleContexts(SingleExpressionContext.class);
    }

    public SingleExpressionContext singleExpression(int i) {
      return getRuleContext(SingleExpressionContext.class, i);
    }

    public TerminalNode QuestionMark() {
      return getToken(JavaScriptParser.QuestionMark, 0);
    }

    public TerminalNode Colon() {
      return getToken(JavaScriptParser.Colon, 0);
    }

    public TernaryExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterTernaryExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitTernaryExpression(this);
    }
  }

  public static class LogicalAndExpressionContext extends SingleExpressionContext {
    public List<SingleExpressionContext> singleExpression() {
      return getRuleContexts(SingleExpressionContext.class);
    }

    public SingleExpressionContext singleExpression(int i) {
      return getRuleContext(SingleExpressionContext.class, i);
    }

    public TerminalNode And() {
      return getToken(JavaScriptParser.And, 0);
    }

    public LogicalAndExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterLogicalAndExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitLogicalAndExpression(this);
    }
  }

  public static class PowerExpressionContext extends SingleExpressionContext {
    public List<SingleExpressionContext> singleExpression() {
      return getRuleContexts(SingleExpressionContext.class);
    }

    public SingleExpressionContext singleExpression(int i) {
      return getRuleContext(SingleExpressionContext.class, i);
    }

    public TerminalNode Power() {
      return getToken(JavaScriptParser.Power, 0);
    }

    public PowerExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterPowerExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitPowerExpression(this);
    }
  }

  public static class PreIncrementExpressionContext extends SingleExpressionContext {
    public TerminalNode PlusPlus() {
      return getToken(JavaScriptParser.PlusPlus, 0);
    }

    public SingleExpressionContext singleExpression() {
      return getRuleContext(SingleExpressionContext.class, 0);
    }

    public PreIncrementExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterPreIncrementExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitPreIncrementExpression(this);
    }
  }

  public static class ObjectLiteralExpressionContext extends SingleExpressionContext {
    public ObjectLiteralContext objectLiteral() {
      return getRuleContext(ObjectLiteralContext.class, 0);
    }

    public ObjectLiteralExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterObjectLiteralExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitObjectLiteralExpression(this);
    }
  }

  public static class MetaExpressionContext extends SingleExpressionContext {
    public TerminalNode New() {
      return getToken(JavaScriptParser.New, 0);
    }

    public TerminalNode Dot() {
      return getToken(JavaScriptParser.Dot, 0);
    }

    public TerminalNode Identifier() {
      return getToken(JavaScriptParser.Identifier, 0);
    }

    public MetaExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterMetaExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitMetaExpression(this);
    }
  }

  public static class InExpressionContext extends SingleExpressionContext {
    public List<SingleExpressionContext> singleExpression() {
      return getRuleContexts(SingleExpressionContext.class);
    }

    public SingleExpressionContext singleExpression(int i) {
      return getRuleContext(SingleExpressionContext.class, i);
    }

    public TerminalNode In() {
      return getToken(JavaScriptParser.In, 0);
    }

    public InExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterInExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitInExpression(this);
    }
  }

  public static class LogicalOrExpressionContext extends SingleExpressionContext {
    public List<SingleExpressionContext> singleExpression() {
      return getRuleContexts(SingleExpressionContext.class);
    }

    public SingleExpressionContext singleExpression(int i) {
      return getRuleContext(SingleExpressionContext.class, i);
    }

    public TerminalNode Or() {
      return getToken(JavaScriptParser.Or, 0);
    }

    public LogicalOrExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterLogicalOrExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitLogicalOrExpression(this);
    }
  }

  public static class NotExpressionContext extends SingleExpressionContext {
    public TerminalNode Not() {
      return getToken(JavaScriptParser.Not, 0);
    }

    public SingleExpressionContext singleExpression() {
      return getRuleContext(SingleExpressionContext.class, 0);
    }

    public NotExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterNotExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitNotExpression(this);
    }
  }

  public static class PreDecreaseExpressionContext extends SingleExpressionContext {
    public TerminalNode MinusMinus() {
      return getToken(JavaScriptParser.MinusMinus, 0);
    }

    public SingleExpressionContext singleExpression() {
      return getRuleContext(SingleExpressionContext.class, 0);
    }

    public PreDecreaseExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterPreDecreaseExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitPreDecreaseExpression(this);
    }
  }

  public static class ArgumentsExpressionContext extends SingleExpressionContext {
    public SingleExpressionContext singleExpression() {
      return getRuleContext(SingleExpressionContext.class, 0);
    }

    public ArgumentsContext arguments() {
      return getRuleContext(ArgumentsContext.class, 0);
    }

    public ArgumentsExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterArgumentsExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitArgumentsExpression(this);
    }
  }

  public static class AwaitExpressionContext extends SingleExpressionContext {
    public TerminalNode Await() {
      return getToken(JavaScriptParser.Await, 0);
    }

    public SingleExpressionContext singleExpression() {
      return getRuleContext(SingleExpressionContext.class, 0);
    }

    public AwaitExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterAwaitExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitAwaitExpression(this);
    }
  }

  public static class ThisExpressionContext extends SingleExpressionContext {
    public TerminalNode This() {
      return getToken(JavaScriptParser.This, 0);
    }

    public ThisExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterThisExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitThisExpression(this);
    }
  }

  public static class FunctionExpressionContext extends SingleExpressionContext {
    public AnoymousFunctionContext anoymousFunction() {
      return getRuleContext(AnoymousFunctionContext.class, 0);
    }

    public FunctionExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterFunctionExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitFunctionExpression(this);
    }
  }

  public static class UnaryMinusExpressionContext extends SingleExpressionContext {
    public TerminalNode Minus() {
      return getToken(JavaScriptParser.Minus, 0);
    }

    public SingleExpressionContext singleExpression() {
      return getRuleContext(SingleExpressionContext.class, 0);
    }

    public UnaryMinusExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterUnaryMinusExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitUnaryMinusExpression(this);
    }
  }

  public static class AssignmentExpressionContext extends SingleExpressionContext {
    public List<SingleExpressionContext> singleExpression() {
      return getRuleContexts(SingleExpressionContext.class);
    }

    public SingleExpressionContext singleExpression(int i) {
      return getRuleContext(SingleExpressionContext.class, i);
    }

    public TerminalNode Assign() {
      return getToken(JavaScriptParser.Assign, 0);
    }

    public AssignmentExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterAssignmentExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitAssignmentExpression(this);
    }
  }

  public static class PostDecreaseExpressionContext extends SingleExpressionContext {
    public SingleExpressionContext singleExpression() {
      return getRuleContext(SingleExpressionContext.class, 0);
    }

    public TerminalNode MinusMinus() {
      return getToken(JavaScriptParser.MinusMinus, 0);
    }

    public PostDecreaseExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterPostDecreaseExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitPostDecreaseExpression(this);
    }
  }

  public static class TypeofExpressionContext extends SingleExpressionContext {
    public TerminalNode Typeof() {
      return getToken(JavaScriptParser.Typeof, 0);
    }

    public SingleExpressionContext singleExpression() {
      return getRuleContext(SingleExpressionContext.class, 0);
    }

    public TypeofExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterTypeofExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitTypeofExpression(this);
    }
  }

  public static class InstanceofExpressionContext extends SingleExpressionContext {
    public List<SingleExpressionContext> singleExpression() {
      return getRuleContexts(SingleExpressionContext.class);
    }

    public SingleExpressionContext singleExpression(int i) {
      return getRuleContext(SingleExpressionContext.class, i);
    }

    public TerminalNode Instanceof() {
      return getToken(JavaScriptParser.Instanceof, 0);
    }

    public InstanceofExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterInstanceofExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitInstanceofExpression(this);
    }
  }

  public static class UnaryPlusExpressionContext extends SingleExpressionContext {
    public TerminalNode Plus() {
      return getToken(JavaScriptParser.Plus, 0);
    }

    public SingleExpressionContext singleExpression() {
      return getRuleContext(SingleExpressionContext.class, 0);
    }

    public UnaryPlusExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterUnaryPlusExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitUnaryPlusExpression(this);
    }
  }

  public static class DeleteExpressionContext extends SingleExpressionContext {
    public TerminalNode Delete() {
      return getToken(JavaScriptParser.Delete, 0);
    }

    public SingleExpressionContext singleExpression() {
      return getRuleContext(SingleExpressionContext.class, 0);
    }

    public DeleteExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterDeleteExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitDeleteExpression(this);
    }
  }

  public static class ImportExpressionContext extends SingleExpressionContext {
    public TerminalNode Import() {
      return getToken(JavaScriptParser.Import, 0);
    }

    public TerminalNode OpenParen() {
      return getToken(JavaScriptParser.OpenParen, 0);
    }

    public SingleExpressionContext singleExpression() {
      return getRuleContext(SingleExpressionContext.class, 0);
    }

    public TerminalNode CloseParen() {
      return getToken(JavaScriptParser.CloseParen, 0);
    }

    public ImportExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterImportExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitImportExpression(this);
    }
  }

  public static class EqualityExpressionContext extends SingleExpressionContext {
    public List<SingleExpressionContext> singleExpression() {
      return getRuleContexts(SingleExpressionContext.class);
    }

    public SingleExpressionContext singleExpression(int i) {
      return getRuleContext(SingleExpressionContext.class, i);
    }

    public TerminalNode Equals_() {
      return getToken(JavaScriptParser.Equals_, 0);
    }

    public TerminalNode NotEquals() {
      return getToken(JavaScriptParser.NotEquals, 0);
    }

    public TerminalNode IdentityEquals() {
      return getToken(JavaScriptParser.IdentityEquals, 0);
    }

    public TerminalNode IdentityNotEquals() {
      return getToken(JavaScriptParser.IdentityNotEquals, 0);
    }

    public EqualityExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterEqualityExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitEqualityExpression(this);
    }
  }

  public static class BitXOrExpressionContext extends SingleExpressionContext {
    public List<SingleExpressionContext> singleExpression() {
      return getRuleContexts(SingleExpressionContext.class);
    }

    public SingleExpressionContext singleExpression(int i) {
      return getRuleContext(SingleExpressionContext.class, i);
    }

    public TerminalNode BitXOr() {
      return getToken(JavaScriptParser.BitXOr, 0);
    }

    public BitXOrExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterBitXOrExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitBitXOrExpression(this);
    }
  }

  public static class SuperExpressionContext extends SingleExpressionContext {
    public TerminalNode Super() {
      return getToken(JavaScriptParser.Super, 0);
    }

    public SuperExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterSuperExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitSuperExpression(this);
    }
  }

  public static class MultiplicativeExpressionContext extends SingleExpressionContext {
    public List<SingleExpressionContext> singleExpression() {
      return getRuleContexts(SingleExpressionContext.class);
    }

    public SingleExpressionContext singleExpression(int i) {
      return getRuleContext(SingleExpressionContext.class, i);
    }

    public TerminalNode Multiply() {
      return getToken(JavaScriptParser.Multiply, 0);
    }

    public TerminalNode Divide() {
      return getToken(JavaScriptParser.Divide, 0);
    }

    public TerminalNode Modulus() {
      return getToken(JavaScriptParser.Modulus, 0);
    }

    public MultiplicativeExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterMultiplicativeExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitMultiplicativeExpression(this);
    }
  }

  public static class BitShiftExpressionContext extends SingleExpressionContext {
    public List<SingleExpressionContext> singleExpression() {
      return getRuleContexts(SingleExpressionContext.class);
    }

    public SingleExpressionContext singleExpression(int i) {
      return getRuleContext(SingleExpressionContext.class, i);
    }

    public TerminalNode LeftShiftArithmetic() {
      return getToken(JavaScriptParser.LeftShiftArithmetic, 0);
    }

    public TerminalNode RightShiftArithmetic() {
      return getToken(JavaScriptParser.RightShiftArithmetic, 0);
    }

    public TerminalNode RightShiftLogical() {
      return getToken(JavaScriptParser.RightShiftLogical, 0);
    }

    public BitShiftExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterBitShiftExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitBitShiftExpression(this);
    }
  }

  public static class ParenthesizedExpressionContext extends SingleExpressionContext {
    public TerminalNode OpenParen() {
      return getToken(JavaScriptParser.OpenParen, 0);
    }

    public ExpressionSequenceContext expressionSequence() {
      return getRuleContext(ExpressionSequenceContext.class, 0);
    }

    public TerminalNode CloseParen() {
      return getToken(JavaScriptParser.CloseParen, 0);
    }

    public ParenthesizedExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterParenthesizedExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitParenthesizedExpression(this);
    }
  }

  public static class AdditiveExpressionContext extends SingleExpressionContext {
    public List<SingleExpressionContext> singleExpression() {
      return getRuleContexts(SingleExpressionContext.class);
    }

    public SingleExpressionContext singleExpression(int i) {
      return getRuleContext(SingleExpressionContext.class, i);
    }

    public TerminalNode Plus() {
      return getToken(JavaScriptParser.Plus, 0);
    }

    public TerminalNode Minus() {
      return getToken(JavaScriptParser.Minus, 0);
    }

    public AdditiveExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterAdditiveExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitAdditiveExpression(this);
    }
  }

  public static class RelationalExpressionContext extends SingleExpressionContext {
    public List<SingleExpressionContext> singleExpression() {
      return getRuleContexts(SingleExpressionContext.class);
    }

    public SingleExpressionContext singleExpression(int i) {
      return getRuleContext(SingleExpressionContext.class, i);
    }

    public TerminalNode LessThan() {
      return getToken(JavaScriptParser.LessThan, 0);
    }

    public TerminalNode MoreThan() {
      return getToken(JavaScriptParser.MoreThan, 0);
    }

    public TerminalNode LessThanEquals() {
      return getToken(JavaScriptParser.LessThanEquals, 0);
    }

    public TerminalNode GreaterThanEquals() {
      return getToken(JavaScriptParser.GreaterThanEquals, 0);
    }

    public RelationalExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterRelationalExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitRelationalExpression(this);
    }
  }

  public static class PostIncrementExpressionContext extends SingleExpressionContext {
    public SingleExpressionContext singleExpression() {
      return getRuleContext(SingleExpressionContext.class, 0);
    }

    public TerminalNode PlusPlus() {
      return getToken(JavaScriptParser.PlusPlus, 0);
    }

    public PostIncrementExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterPostIncrementExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitPostIncrementExpression(this);
    }
  }

  public static class YieldExpressionContext extends SingleExpressionContext {
    public YieldStatementContext yieldStatement() {
      return getRuleContext(YieldStatementContext.class, 0);
    }

    public YieldExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterYieldExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitYieldExpression(this);
    }
  }

  public static class BitNotExpressionContext extends SingleExpressionContext {
    public TerminalNode BitNot() {
      return getToken(JavaScriptParser.BitNot, 0);
    }

    public SingleExpressionContext singleExpression() {
      return getRuleContext(SingleExpressionContext.class, 0);
    }

    public BitNotExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterBitNotExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitBitNotExpression(this);
    }
  }

  public static class NewExpressionContext extends SingleExpressionContext {
    public TerminalNode New() {
      return getToken(JavaScriptParser.New, 0);
    }

    public SingleExpressionContext singleExpression() {
      return getRuleContext(SingleExpressionContext.class, 0);
    }

    public ArgumentsContext arguments() {
      return getRuleContext(ArgumentsContext.class, 0);
    }

    public NewExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterNewExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitNewExpression(this);
    }
  }

  public static class LiteralExpressionContext extends SingleExpressionContext {
    public LiteralContext literal() {
      return getRuleContext(LiteralContext.class, 0);
    }

    public LiteralExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterLiteralExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitLiteralExpression(this);
    }
  }

  public static class ArrayLiteralExpressionContext extends SingleExpressionContext {
    public ArrayLiteralContext arrayLiteral() {
      return getRuleContext(ArrayLiteralContext.class, 0);
    }

    public ArrayLiteralExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterArrayLiteralExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitArrayLiteralExpression(this);
    }
  }

  public static class MemberDotExpressionContext extends SingleExpressionContext {
    public SingleExpressionContext singleExpression() {
      return getRuleContext(SingleExpressionContext.class, 0);
    }

    public TerminalNode Dot() {
      return getToken(JavaScriptParser.Dot, 0);
    }

    public IdentifierNameContext identifierName() {
      return getRuleContext(IdentifierNameContext.class, 0);
    }

    public TerminalNode QuestionMark() {
      return getToken(JavaScriptParser.QuestionMark, 0);
    }

    public TerminalNode Hashtag() {
      return getToken(JavaScriptParser.Hashtag, 0);
    }

    public MemberDotExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterMemberDotExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitMemberDotExpression(this);
    }
  }

  public static class ClassExpressionContext extends SingleExpressionContext {
    public TerminalNode Class() {
      return getToken(JavaScriptParser.Class, 0);
    }

    public ClassTailContext classTail() {
      return getRuleContext(ClassTailContext.class, 0);
    }

    public TerminalNode Identifier() {
      return getToken(JavaScriptParser.Identifier, 0);
    }

    public ClassExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterClassExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitClassExpression(this);
    }
  }

  public static class MemberIndexExpressionContext extends SingleExpressionContext {
    public SingleExpressionContext singleExpression() {
      return getRuleContext(SingleExpressionContext.class, 0);
    }

    public TerminalNode OpenBracket() {
      return getToken(JavaScriptParser.OpenBracket, 0);
    }

    public ExpressionSequenceContext expressionSequence() {
      return getRuleContext(ExpressionSequenceContext.class, 0);
    }

    public TerminalNode CloseBracket() {
      return getToken(JavaScriptParser.CloseBracket, 0);
    }

    public MemberIndexExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterMemberIndexExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitMemberIndexExpression(this);
    }
  }

  public static class IdentifierExpressionContext extends SingleExpressionContext {
    public TerminalNode Identifier() {
      return getToken(JavaScriptParser.Identifier, 0);
    }

    public IdentifierExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterIdentifierExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitIdentifierExpression(this);
    }
  }

  public static class BitAndExpressionContext extends SingleExpressionContext {
    public List<SingleExpressionContext> singleExpression() {
      return getRuleContexts(SingleExpressionContext.class);
    }

    public SingleExpressionContext singleExpression(int i) {
      return getRuleContext(SingleExpressionContext.class, i);
    }

    public TerminalNode BitAnd() {
      return getToken(JavaScriptParser.BitAnd, 0);
    }

    public BitAndExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterBitAndExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitBitAndExpression(this);
    }
  }

  public static class BitOrExpressionContext extends SingleExpressionContext {
    public List<SingleExpressionContext> singleExpression() {
      return getRuleContexts(SingleExpressionContext.class);
    }

    public SingleExpressionContext singleExpression(int i) {
      return getRuleContext(SingleExpressionContext.class, i);
    }

    public TerminalNode BitOr() {
      return getToken(JavaScriptParser.BitOr, 0);
    }

    public BitOrExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterBitOrExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitBitOrExpression(this);
    }
  }

  public static class AssignmentOperatorExpressionContext extends SingleExpressionContext {
    public List<SingleExpressionContext> singleExpression() {
      return getRuleContexts(SingleExpressionContext.class);
    }

    public SingleExpressionContext singleExpression(int i) {
      return getRuleContext(SingleExpressionContext.class, i);
    }

    public AssignmentOperatorContext assignmentOperator() {
      return getRuleContext(AssignmentOperatorContext.class, 0);
    }

    public AssignmentOperatorExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterAssignmentOperatorExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitAssignmentOperatorExpression(this);
    }
  }

  public static class VoidExpressionContext extends SingleExpressionContext {
    public TerminalNode Void() {
      return getToken(JavaScriptParser.Void, 0);
    }

    public SingleExpressionContext singleExpression() {
      return getRuleContext(SingleExpressionContext.class, 0);
    }

    public VoidExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterVoidExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitVoidExpression(this);
    }
  }

  public static class CoalesceExpressionContext extends SingleExpressionContext {
    public List<SingleExpressionContext> singleExpression() {
      return getRuleContexts(SingleExpressionContext.class);
    }

    public SingleExpressionContext singleExpression(int i) {
      return getRuleContext(SingleExpressionContext.class, i);
    }

    public TerminalNode NullCoalesce() {
      return getToken(JavaScriptParser.NullCoalesce, 0);
    }

    public CoalesceExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterCoalesceExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitCoalesceExpression(this);
    }
  }

  public final SingleExpressionContext singleExpression() throws RecognitionException {
    return singleExpression(0);
  }

  private SingleExpressionContext singleExpression(int _p) throws RecognitionException {
    ParserRuleContext _parentctx = _ctx;
    int _parentState = getState();
    SingleExpressionContext _localctx = new SingleExpressionContext(_ctx, _parentState);
    SingleExpressionContext _prevctx = _localctx;
    int _startState = 116;
    enterRecursionRule(_localctx, 116, RULE_singleExpression, _p);
    int _la;
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
        setState(785);
        _errHandler.sync(this);
        switch (getInterpreter().adaptivePredict(_input, 89, _ctx)) {
          case 1: {
            _localctx = new FunctionExpressionContext(_localctx);
            _ctx = _localctx;
            _prevctx = _localctx;

            setState(735);
            anoymousFunction();
          }
          break;
          case 2: {
            _localctx = new ClassExpressionContext(_localctx);
            _ctx = _localctx;
            _prevctx = _localctx;
            setState(736);
            match(Class);
            setState(738);
            _errHandler.sync(this);
            _la = _input.LA(1);
            if (_la == Identifier) {
              {
                setState(737);
                match(Identifier);
              }
            }

            setState(740);
            classTail();
          }
          break;
          case 3: {
            _localctx = new NewExpressionContext(_localctx);
            _ctx = _localctx;
            _prevctx = _localctx;
            setState(741);
            match(New);
            setState(742);
            singleExpression(0);
            setState(744);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 88, _ctx)) {
              case 1: {
                setState(743);
                arguments();
              }
              break;
            }
          }
          break;
          case 4: {
            _localctx = new MetaExpressionContext(_localctx);
            _ctx = _localctx;
            _prevctx = _localctx;
            setState(746);
            match(New);
            setState(747);
            match(Dot);
            setState(748);
            match(Identifier);
          }
          break;
          case 5: {
            _localctx = new DeleteExpressionContext(_localctx);
            _ctx = _localctx;
            _prevctx = _localctx;
            setState(749);
            match(Delete);
            setState(750);
            singleExpression(37);
          }
          break;
          case 6: {
            _localctx = new VoidExpressionContext(_localctx);
            _ctx = _localctx;
            _prevctx = _localctx;
            setState(751);
            match(Void);
            setState(752);
            singleExpression(36);
          }
          break;
          case 7: {
            _localctx = new TypeofExpressionContext(_localctx);
            _ctx = _localctx;
            _prevctx = _localctx;
            setState(753);
            match(Typeof);
            setState(754);
            singleExpression(35);
          }
          break;
          case 8: {
            _localctx = new PreIncrementExpressionContext(_localctx);
            _ctx = _localctx;
            _prevctx = _localctx;
            setState(755);
            match(PlusPlus);
            setState(756);
            singleExpression(34);
          }
          break;
          case 9: {
            _localctx = new PreDecreaseExpressionContext(_localctx);
            _ctx = _localctx;
            _prevctx = _localctx;
            setState(757);
            match(MinusMinus);
            setState(758);
            singleExpression(33);
          }
          break;
          case 10: {
            _localctx = new UnaryPlusExpressionContext(_localctx);
            _ctx = _localctx;
            _prevctx = _localctx;
            setState(759);
            match(Plus);
            setState(760);
            singleExpression(32);
          }
          break;
          case 11: {
            _localctx = new UnaryMinusExpressionContext(_localctx);
            _ctx = _localctx;
            _prevctx = _localctx;
            setState(761);
            match(Minus);
            setState(762);
            singleExpression(31);
          }
          break;
          case 12: {
            _localctx = new BitNotExpressionContext(_localctx);
            _ctx = _localctx;
            _prevctx = _localctx;
            setState(763);
            match(BitNot);
            setState(764);
            singleExpression(30);
          }
          break;
          case 13: {
            _localctx = new NotExpressionContext(_localctx);
            _ctx = _localctx;
            _prevctx = _localctx;
            setState(765);
            match(Not);
            setState(766);
            singleExpression(29);
          }
          break;
          case 14: {
            _localctx = new AwaitExpressionContext(_localctx);
            _ctx = _localctx;
            _prevctx = _localctx;
            setState(767);
            match(Await);
            setState(768);
            singleExpression(28);
          }
          break;
          case 15: {
            _localctx = new ImportExpressionContext(_localctx);
            _ctx = _localctx;
            _prevctx = _localctx;
            setState(769);
            match(Import);
            setState(770);
            match(OpenParen);
            setState(771);
            singleExpression(0);
            setState(772);
            match(CloseParen);
          }
          break;
          case 16: {
            _localctx = new YieldExpressionContext(_localctx);
            _ctx = _localctx;
            _prevctx = _localctx;
            setState(774);
            yieldStatement();
          }
          break;
          case 17: {
            _localctx = new ThisExpressionContext(_localctx);
            _ctx = _localctx;
            _prevctx = _localctx;
            setState(775);
            match(This);
          }
          break;
          case 18: {
            _localctx = new IdentifierExpressionContext(_localctx);
            _ctx = _localctx;
            _prevctx = _localctx;
            setState(776);
            match(Identifier);
          }
          break;
          case 19: {
            _localctx = new SuperExpressionContext(_localctx);
            _ctx = _localctx;
            _prevctx = _localctx;
            setState(777);
            match(Super);
          }
          break;
          case 20: {
            _localctx = new LiteralExpressionContext(_localctx);
            _ctx = _localctx;
            _prevctx = _localctx;
            setState(778);
            literal();
          }
          break;
          case 21: {
            _localctx = new ArrayLiteralExpressionContext(_localctx);
            _ctx = _localctx;
            _prevctx = _localctx;
            setState(779);
            arrayLiteral();
          }
          break;
          case 22: {
            _localctx = new ObjectLiteralExpressionContext(_localctx);
            _ctx = _localctx;
            _prevctx = _localctx;
            setState(780);
            objectLiteral();
          }
          break;
          case 23: {
            _localctx = new ParenthesizedExpressionContext(_localctx);
            _ctx = _localctx;
            _prevctx = _localctx;
            setState(781);
            match(OpenParen);
            setState(782);
            expressionSequence();
            setState(783);
            match(CloseParen);
          }
          break;
        }
        _ctx.stop = _input.LT(-1);
        setState(868);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input, 93, _ctx);
        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
          if (_alt == 1) {
            if (_parseListeners != null) triggerExitRuleEvent();
            _prevctx = _localctx;
            {
              setState(866);
              _errHandler.sync(this);
              switch (getInterpreter().adaptivePredict(_input, 92, _ctx)) {
                case 1: {
                  _localctx = new PowerExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
                  pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                  setState(787);
                  if (!(precpred(_ctx, 27)))
                    throw new FailedPredicateException(this, "precpred(_ctx, 27)");
                  setState(788);
                  match(Power);
                  setState(789);
                  singleExpression(27);
                }
                break;
                case 2: {
                  _localctx = new MultiplicativeExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
                  pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                  setState(790);
                  if (!(precpred(_ctx, 26)))
                    throw new FailedPredicateException(this, "precpred(_ctx, 26)");
                  setState(791);
                  _la = _input.LA(1);
                  if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Multiply) | (1L << Divide) | (1L << Modulus))) != 0))) {
                    _errHandler.recoverInline(this);
                  } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                  }
                  setState(792);
                  singleExpression(27);
                }
                break;
                case 3: {
                  _localctx = new AdditiveExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
                  pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                  setState(793);
                  if (!(precpred(_ctx, 25)))
                    throw new FailedPredicateException(this, "precpred(_ctx, 25)");
                  setState(794);
                  _la = _input.LA(1);
                  if (!(_la == Plus || _la == Minus)) {
                    _errHandler.recoverInline(this);
                  } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                  }
                  setState(795);
                  singleExpression(26);
                }
                break;
                case 4: {
                  _localctx = new CoalesceExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
                  pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                  setState(796);
                  if (!(precpred(_ctx, 24)))
                    throw new FailedPredicateException(this, "precpred(_ctx, 24)");
                  setState(797);
                  match(NullCoalesce);
                  setState(798);
                  singleExpression(25);
                }
                break;
                case 5: {
                  _localctx = new BitShiftExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
                  pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                  setState(799);
                  if (!(precpred(_ctx, 23)))
                    throw new FailedPredicateException(this, "precpred(_ctx, 23)");
                  setState(800);
                  _la = _input.LA(1);
                  if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RightShiftArithmetic) | (1L << LeftShiftArithmetic) | (1L << RightShiftLogical))) != 0))) {
                    _errHandler.recoverInline(this);
                  } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                  }
                  setState(801);
                  singleExpression(24);
                }
                break;
                case 6: {
                  _localctx = new RelationalExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
                  pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                  setState(802);
                  if (!(precpred(_ctx, 22)))
                    throw new FailedPredicateException(this, "precpred(_ctx, 22)");
                  setState(803);
                  _la = _input.LA(1);
                  if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LessThan) | (1L << MoreThan) | (1L << LessThanEquals) | (1L << GreaterThanEquals))) != 0))) {
                    _errHandler.recoverInline(this);
                  } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                  }
                  setState(804);
                  singleExpression(23);
                }
                break;
                case 7: {
                  _localctx = new InstanceofExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
                  pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                  setState(805);
                  if (!(precpred(_ctx, 21)))
                    throw new FailedPredicateException(this, "precpred(_ctx, 21)");
                  setState(806);
                  match(Instanceof);
                  setState(807);
                  singleExpression(22);
                }
                break;
                case 8: {
                  _localctx = new InExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
                  pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                  setState(808);
                  if (!(precpred(_ctx, 20)))
                    throw new FailedPredicateException(this, "precpred(_ctx, 20)");
                  setState(809);
                  match(In);
                  setState(810);
                  singleExpression(21);
                }
                break;
                case 9: {
                  _localctx = new EqualityExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
                  pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                  setState(811);
                  if (!(precpred(_ctx, 19)))
                    throw new FailedPredicateException(this, "precpred(_ctx, 19)");
                  setState(812);
                  _la = _input.LA(1);
                  if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Equals_) | (1L << NotEquals) | (1L << IdentityEquals) | (1L << IdentityNotEquals))) != 0))) {
                    _errHandler.recoverInline(this);
                  } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                  }
                  setState(813);
                  singleExpression(20);
                }
                break;
                case 10: {
                  _localctx = new BitAndExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
                  pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                  setState(814);
                  if (!(precpred(_ctx, 18)))
                    throw new FailedPredicateException(this, "precpred(_ctx, 18)");
                  setState(815);
                  match(BitAnd);
                  setState(816);
                  singleExpression(19);
                }
                break;
                case 11: {
                  _localctx = new BitXOrExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
                  pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                  setState(817);
                  if (!(precpred(_ctx, 17)))
                    throw new FailedPredicateException(this, "precpred(_ctx, 17)");
                  setState(818);
                  match(BitXOr);
                  setState(819);
                  singleExpression(18);
                }
                break;
                case 12: {
                  _localctx = new BitOrExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
                  pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                  setState(820);
                  if (!(precpred(_ctx, 16)))
                    throw new FailedPredicateException(this, "precpred(_ctx, 16)");
                  setState(821);
                  match(BitOr);
                  setState(822);
                  singleExpression(17);
                }
                break;
                case 13: {
                  _localctx = new LogicalAndExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
                  pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                  setState(823);
                  if (!(precpred(_ctx, 15)))
                    throw new FailedPredicateException(this, "precpred(_ctx, 15)");
                  setState(824);
                  match(And);
                  setState(825);
                  singleExpression(16);
                }
                break;
                case 14: {
                  _localctx = new LogicalOrExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
                  pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                  setState(826);
                  if (!(precpred(_ctx, 14)))
                    throw new FailedPredicateException(this, "precpred(_ctx, 14)");
                  setState(827);
                  match(Or);
                  setState(828);
                  singleExpression(15);
                }
                break;
                case 15: {
                  _localctx = new TernaryExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
                  pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                  setState(829);
                  if (!(precpred(_ctx, 13)))
                    throw new FailedPredicateException(this, "precpred(_ctx, 13)");
                  setState(830);
                  match(QuestionMark);
                  setState(831);
                  singleExpression(0);
                  setState(832);
                  match(Colon);
                  setState(833);
                  singleExpression(14);
                }
                break;
                case 16: {
                  _localctx = new AssignmentExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
                  pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                  setState(835);
                  if (!(precpred(_ctx, 12)))
                    throw new FailedPredicateException(this, "precpred(_ctx, 12)");
                  setState(836);
                  match(Assign);
                  setState(837);
                  singleExpression(12);
                }
                break;
                case 17: {
                  _localctx = new AssignmentOperatorExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
                  pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                  setState(838);
                  if (!(precpred(_ctx, 11)))
                    throw new FailedPredicateException(this, "precpred(_ctx, 11)");
                  setState(839);
                  assignmentOperator();
                  setState(840);
                  singleExpression(11);
                }
                break;
                case 18: {
                  _localctx = new MemberIndexExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
                  pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                  setState(842);
                  if (!(precpred(_ctx, 44)))
                    throw new FailedPredicateException(this, "precpred(_ctx, 44)");
                  setState(843);
                  match(OpenBracket);
                  setState(844);
                  expressionSequence();
                  setState(845);
                  match(CloseBracket);
                }
                break;
                case 19: {
                  _localctx = new MemberDotExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
                  pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                  setState(847);
                  if (!(precpred(_ctx, 43)))
                    throw new FailedPredicateException(this, "precpred(_ctx, 43)");
                  setState(849);
                  _errHandler.sync(this);
                  _la = _input.LA(1);
                  if (_la == QuestionMark) {
                    {
                      setState(848);
                      match(QuestionMark);
                    }
                  }

                  setState(851);
                  match(Dot);
                  setState(853);
                  _errHandler.sync(this);
                  _la = _input.LA(1);
                  if (_la == Hashtag) {
                    {
                      setState(852);
                      match(Hashtag);
                    }
                  }

                  setState(855);
                  identifierName();
                }
                break;
                case 20: {
                  _localctx = new ArgumentsExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
                  pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                  setState(856);
                  if (!(precpred(_ctx, 42)))
                    throw new FailedPredicateException(this, "precpred(_ctx, 42)");
                  setState(857);
                  arguments();
                }
                break;
                case 21: {
                  _localctx = new PostIncrementExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
                  pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                  setState(858);
                  if (!(precpred(_ctx, 39)))
                    throw new FailedPredicateException(this, "precpred(_ctx, 39)");
                  setState(859);
                  if (!(this.notLineTerminator()))
                    throw new FailedPredicateException(this, "this.notLineTerminator()");
                  setState(860);
                  match(PlusPlus);
                }
                break;
                case 22: {
                  _localctx = new PostDecreaseExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
                  pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                  setState(861);
                  if (!(precpred(_ctx, 38)))
                    throw new FailedPredicateException(this, "precpred(_ctx, 38)");
                  setState(862);
                  if (!(this.notLineTerminator()))
                    throw new FailedPredicateException(this, "this.notLineTerminator()");
                  setState(863);
                  match(MinusMinus);
                }
                break;
                case 23: {
                  _localctx = new TemplateStringExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
                  pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                  setState(864);
                  if (!(precpred(_ctx, 9)))
                    throw new FailedPredicateException(this, "precpred(_ctx, 9)");
                  setState(865);
                  match(TemplateStringLiteral);
                }
                break;
              }
            }
          }
          setState(870);
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input, 93, _ctx);
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      unrollRecursionContexts(_parentctx);
    }
    return _localctx;
  }

  public static class AssignableContext extends ParserRuleContext {
    public TerminalNode Identifier() {
      return getToken(JavaScriptParser.Identifier, 0);
    }

    public ArrayLiteralContext arrayLiteral() {
      return getRuleContext(ArrayLiteralContext.class, 0);
    }

    public ObjectLiteralContext objectLiteral() {
      return getRuleContext(ObjectLiteralContext.class, 0);
    }

    public AssignableContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_assignable;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterAssignable(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitAssignable(this);
    }
  }

  public final AssignableContext assignable() throws RecognitionException {
    AssignableContext _localctx = new AssignableContext(_ctx, getState());
    enterRule(_localctx, 118, RULE_assignable);
    try {
      setState(874);
      _errHandler.sync(this);
      switch (_input.LA(1)) {
        case Identifier:
          enterOuterAlt(_localctx, 1);
        {
          setState(871);
          match(Identifier);
        }
        break;
        case OpenBracket:
          enterOuterAlt(_localctx, 2);
        {
          setState(872);
          arrayLiteral();
        }
        break;
        case OpenBrace:
          enterOuterAlt(_localctx, 3);
        {
          setState(873);
          objectLiteral();
        }
        break;
        default:
          throw new NoViableAltException(this);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class AnoymousFunctionContext extends ParserRuleContext {
    public AnoymousFunctionContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_anoymousFunction;
    }

    public AnoymousFunctionContext() {
    }

    public void copyFrom(AnoymousFunctionContext ctx) {
      super.copyFrom(ctx);
    }
  }

  public static class AnoymousFunctionDeclContext extends AnoymousFunctionContext {
    public TerminalNode Function() {
      return getToken(JavaScriptParser.Function, 0);
    }

    public TerminalNode OpenParen() {
      return getToken(JavaScriptParser.OpenParen, 0);
    }

    public TerminalNode CloseParen() {
      return getToken(JavaScriptParser.CloseParen, 0);
    }

    public TerminalNode OpenBrace() {
      return getToken(JavaScriptParser.OpenBrace, 0);
    }

    public FunctionBodyContext functionBody() {
      return getRuleContext(FunctionBodyContext.class, 0);
    }

    public TerminalNode CloseBrace() {
      return getToken(JavaScriptParser.CloseBrace, 0);
    }

    public TerminalNode Async() {
      return getToken(JavaScriptParser.Async, 0);
    }

    public TerminalNode Multiply() {
      return getToken(JavaScriptParser.Multiply, 0);
    }

    public FormalParameterListContext formalParameterList() {
      return getRuleContext(FormalParameterListContext.class, 0);
    }

    public AnoymousFunctionDeclContext(AnoymousFunctionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterAnoymousFunctionDecl(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitAnoymousFunctionDecl(this);
    }
  }

  public static class ArrowFunctionContext extends AnoymousFunctionContext {
    public ArrowFunctionParametersContext arrowFunctionParameters() {
      return getRuleContext(ArrowFunctionParametersContext.class, 0);
    }

    public TerminalNode ARROW() {
      return getToken(JavaScriptParser.ARROW, 0);
    }

    public ArrowFunctionBodyContext arrowFunctionBody() {
      return getRuleContext(ArrowFunctionBodyContext.class, 0);
    }

    public TerminalNode Async() {
      return getToken(JavaScriptParser.Async, 0);
    }

    public ArrowFunctionContext(AnoymousFunctionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterArrowFunction(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitArrowFunction(this);
    }
  }

  public static class FunctionDeclContext extends AnoymousFunctionContext {
    public FunctionDeclarationContext functionDeclaration() {
      return getRuleContext(FunctionDeclarationContext.class, 0);
    }

    public FunctionDeclContext(AnoymousFunctionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterFunctionDecl(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitFunctionDecl(this);
    }
  }

  public final AnoymousFunctionContext anoymousFunction() throws RecognitionException {
    AnoymousFunctionContext _localctx = new AnoymousFunctionContext(_ctx, getState());
    enterRule(_localctx, 120, RULE_anoymousFunction);
    int _la;
    try {
      setState(900);
      _errHandler.sync(this);
      switch (getInterpreter().adaptivePredict(_input, 99, _ctx)) {
        case 1:
          _localctx = new FunctionDeclContext(_localctx);
          enterOuterAlt(_localctx, 1);
        {
          setState(876);
          functionDeclaration();
        }
        break;
        case 2:
          _localctx = new AnoymousFunctionDeclContext(_localctx);
          enterOuterAlt(_localctx, 2);
        {
          setState(878);
          _errHandler.sync(this);
          _la = _input.LA(1);
          if (_la == Async) {
            {
              setState(877);
              match(Async);
            }
          }

          setState(880);
          match(Function);
          setState(882);
          _errHandler.sync(this);
          _la = _input.LA(1);
          if (_la == Multiply) {
            {
              setState(881);
              match(Multiply);
            }
          }

          setState(884);
          match(OpenParen);
          setState(886);
          _errHandler.sync(this);
          _la = _input.LA(1);
          if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenBracket) | (1L << OpenBrace) | (1L << Ellipsis))) != 0) || _la == Identifier) {
            {
              setState(885);
              formalParameterList();
            }
          }

          setState(888);
          match(CloseParen);
          setState(889);
          match(OpenBrace);
          setState(890);
          functionBody();
          setState(891);
          match(CloseBrace);
        }
        break;
        case 3:
          _localctx = new ArrowFunctionContext(_localctx);
          enterOuterAlt(_localctx, 3);
        {
          setState(894);
          _errHandler.sync(this);
          _la = _input.LA(1);
          if (_la == Async) {
            {
              setState(893);
              match(Async);
            }
          }

          setState(896);
          arrowFunctionParameters();
          setState(897);
          match(ARROW);
          setState(898);
          arrowFunctionBody();
        }
        break;
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class ArrowFunctionParametersContext extends ParserRuleContext {
    public TerminalNode Identifier() {
      return getToken(JavaScriptParser.Identifier, 0);
    }

    public TerminalNode OpenParen() {
      return getToken(JavaScriptParser.OpenParen, 0);
    }

    public TerminalNode CloseParen() {
      return getToken(JavaScriptParser.CloseParen, 0);
    }

    public FormalParameterListContext formalParameterList() {
      return getRuleContext(FormalParameterListContext.class, 0);
    }

    public ArrowFunctionParametersContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_arrowFunctionParameters;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterArrowFunctionParameters(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitArrowFunctionParameters(this);
    }
  }

  public final ArrowFunctionParametersContext arrowFunctionParameters() throws RecognitionException {
    ArrowFunctionParametersContext _localctx = new ArrowFunctionParametersContext(_ctx, getState());
    enterRule(_localctx, 122, RULE_arrowFunctionParameters);
    int _la;
    try {
      setState(908);
      _errHandler.sync(this);
      switch (_input.LA(1)) {
        case Identifier:
          enterOuterAlt(_localctx, 1);
        {
          setState(902);
          match(Identifier);
        }
        break;
        case OpenParen:
          enterOuterAlt(_localctx, 2);
        {
          setState(903);
          match(OpenParen);
          setState(905);
          _errHandler.sync(this);
          _la = _input.LA(1);
          if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenBracket) | (1L << OpenBrace) | (1L << Ellipsis))) != 0) || _la == Identifier) {
            {
              setState(904);
              formalParameterList();
            }
          }

          setState(907);
          match(CloseParen);
        }
        break;
        default:
          throw new NoViableAltException(this);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class ArrowFunctionBodyContext extends ParserRuleContext {
    public SingleExpressionContext singleExpression() {
      return getRuleContext(SingleExpressionContext.class, 0);
    }

    public TerminalNode OpenBrace() {
      return getToken(JavaScriptParser.OpenBrace, 0);
    }

    public FunctionBodyContext functionBody() {
      return getRuleContext(FunctionBodyContext.class, 0);
    }

    public TerminalNode CloseBrace() {
      return getToken(JavaScriptParser.CloseBrace, 0);
    }

    public ArrowFunctionBodyContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_arrowFunctionBody;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterArrowFunctionBody(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitArrowFunctionBody(this);
    }
  }

  public final ArrowFunctionBodyContext arrowFunctionBody() throws RecognitionException {
    ArrowFunctionBodyContext _localctx = new ArrowFunctionBodyContext(_ctx, getState());
    enterRule(_localctx, 124, RULE_arrowFunctionBody);
    try {
      setState(915);
      _errHandler.sync(this);
      switch (getInterpreter().adaptivePredict(_input, 102, _ctx)) {
        case 1:
          enterOuterAlt(_localctx, 1);
        {
          setState(910);
          singleExpression(0);
        }
        break;
        case 2:
          enterOuterAlt(_localctx, 2);
        {
          setState(911);
          match(OpenBrace);
          setState(912);
          functionBody();
          setState(913);
          match(CloseBrace);
        }
        break;
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class AssignmentOperatorContext extends ParserRuleContext {
    public TerminalNode MultiplyAssign() {
      return getToken(JavaScriptParser.MultiplyAssign, 0);
    }

    public TerminalNode DivideAssign() {
      return getToken(JavaScriptParser.DivideAssign, 0);
    }

    public TerminalNode ModulusAssign() {
      return getToken(JavaScriptParser.ModulusAssign, 0);
    }

    public TerminalNode PlusAssign() {
      return getToken(JavaScriptParser.PlusAssign, 0);
    }

    public TerminalNode MinusAssign() {
      return getToken(JavaScriptParser.MinusAssign, 0);
    }

    public TerminalNode LeftShiftArithmeticAssign() {
      return getToken(JavaScriptParser.LeftShiftArithmeticAssign, 0);
    }

    public TerminalNode RightShiftArithmeticAssign() {
      return getToken(JavaScriptParser.RightShiftArithmeticAssign, 0);
    }

    public TerminalNode RightShiftLogicalAssign() {
      return getToken(JavaScriptParser.RightShiftLogicalAssign, 0);
    }

    public TerminalNode BitAndAssign() {
      return getToken(JavaScriptParser.BitAndAssign, 0);
    }

    public TerminalNode BitXorAssign() {
      return getToken(JavaScriptParser.BitXorAssign, 0);
    }

    public TerminalNode BitOrAssign() {
      return getToken(JavaScriptParser.BitOrAssign, 0);
    }

    public TerminalNode PowerAssign() {
      return getToken(JavaScriptParser.PowerAssign, 0);
    }

    public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_assignmentOperator;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterAssignmentOperator(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitAssignmentOperator(this);
    }
  }

  public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
    AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
    enterRule(_localctx, 126, RULE_assignmentOperator);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(917);
        _la = _input.LA(1);
        if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MultiplyAssign) | (1L << DivideAssign) | (1L << ModulusAssign) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << LeftShiftArithmeticAssign) | (1L << RightShiftArithmeticAssign) | (1L << RightShiftLogicalAssign) | (1L << BitAndAssign) | (1L << BitXorAssign) | (1L << BitOrAssign) | (1L << PowerAssign))) != 0))) {
          _errHandler.recoverInline(this);
        } else {
          if (_input.LA(1) == Token.EOF) matchedEOF = true;
          _errHandler.reportMatch(this);
          consume();
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class LiteralContext extends ParserRuleContext {
    public TerminalNode NullLiteral() {
      return getToken(JavaScriptParser.NullLiteral, 0);
    }

    public TerminalNode BooleanLiteral() {
      return getToken(JavaScriptParser.BooleanLiteral, 0);
    }

    public TerminalNode StringLiteral() {
      return getToken(JavaScriptParser.StringLiteral, 0);
    }

    public TerminalNode TemplateStringLiteral() {
      return getToken(JavaScriptParser.TemplateStringLiteral, 0);
    }

    public TerminalNode RegularExpressionLiteral() {
      return getToken(JavaScriptParser.RegularExpressionLiteral, 0);
    }

    public NumericLiteralContext numericLiteral() {
      return getRuleContext(NumericLiteralContext.class, 0);
    }

    public BigintLiteralContext bigintLiteral() {
      return getRuleContext(BigintLiteralContext.class, 0);
    }

    public LiteralContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_literal;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterLiteral(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitLiteral(this);
    }
  }

  public final LiteralContext literal() throws RecognitionException {
    LiteralContext _localctx = new LiteralContext(_ctx, getState());
    enterRule(_localctx, 128, RULE_literal);
    try {
      setState(926);
      _errHandler.sync(this);
      switch (_input.LA(1)) {
        case NullLiteral:
          enterOuterAlt(_localctx, 1);
        {
          setState(919);
          match(NullLiteral);
        }
        break;
        case BooleanLiteral:
          enterOuterAlt(_localctx, 2);
        {
          setState(920);
          match(BooleanLiteral);
        }
        break;
        case StringLiteral:
          enterOuterAlt(_localctx, 3);
        {
          setState(921);
          match(StringLiteral);
        }
        break;
        case TemplateStringLiteral:
          enterOuterAlt(_localctx, 4);
        {
          setState(922);
          match(TemplateStringLiteral);
        }
        break;
        case RegularExpressionLiteral:
          enterOuterAlt(_localctx, 5);
        {
          setState(923);
          match(RegularExpressionLiteral);
        }
        break;
        case DecimalLiteral:
        case HexIntegerLiteral:
        case OctalIntegerLiteral:
        case OctalIntegerLiteral2:
        case BinaryIntegerLiteral:
          enterOuterAlt(_localctx, 6);
        {
          setState(924);
          numericLiteral();
        }
        break;
        case BigHexIntegerLiteral:
        case BigOctalIntegerLiteral:
        case BigBinaryIntegerLiteral:
        case BigDecimalIntegerLiteral:
          enterOuterAlt(_localctx, 7);
        {
          setState(925);
          bigintLiteral();
        }
        break;
        default:
          throw new NoViableAltException(this);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class NumericLiteralContext extends ParserRuleContext {
    public TerminalNode DecimalLiteral() {
      return getToken(JavaScriptParser.DecimalLiteral, 0);
    }

    public TerminalNode HexIntegerLiteral() {
      return getToken(JavaScriptParser.HexIntegerLiteral, 0);
    }

    public TerminalNode OctalIntegerLiteral() {
      return getToken(JavaScriptParser.OctalIntegerLiteral, 0);
    }

    public TerminalNode OctalIntegerLiteral2() {
      return getToken(JavaScriptParser.OctalIntegerLiteral2, 0);
    }

    public TerminalNode BinaryIntegerLiteral() {
      return getToken(JavaScriptParser.BinaryIntegerLiteral, 0);
    }

    public NumericLiteralContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_numericLiteral;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterNumericLiteral(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitNumericLiteral(this);
    }
  }

  public final NumericLiteralContext numericLiteral() throws RecognitionException {
    NumericLiteralContext _localctx = new NumericLiteralContext(_ctx, getState());
    enterRule(_localctx, 130, RULE_numericLiteral);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(928);
        _la = _input.LA(1);
        if (!(((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (DecimalLiteral - 61)) | (1L << (HexIntegerLiteral - 61)) | (1L << (OctalIntegerLiteral - 61)) | (1L << (OctalIntegerLiteral2 - 61)) | (1L << (BinaryIntegerLiteral - 61)))) != 0))) {
          _errHandler.recoverInline(this);
        } else {
          if (_input.LA(1) == Token.EOF) matchedEOF = true;
          _errHandler.reportMatch(this);
          consume();
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class BigintLiteralContext extends ParserRuleContext {
    public TerminalNode BigDecimalIntegerLiteral() {
      return getToken(JavaScriptParser.BigDecimalIntegerLiteral, 0);
    }

    public TerminalNode BigHexIntegerLiteral() {
      return getToken(JavaScriptParser.BigHexIntegerLiteral, 0);
    }

    public TerminalNode BigOctalIntegerLiteral() {
      return getToken(JavaScriptParser.BigOctalIntegerLiteral, 0);
    }

    public TerminalNode BigBinaryIntegerLiteral() {
      return getToken(JavaScriptParser.BigBinaryIntegerLiteral, 0);
    }

    public BigintLiteralContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_bigintLiteral;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterBigintLiteral(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitBigintLiteral(this);
    }
  }

  public final BigintLiteralContext bigintLiteral() throws RecognitionException {
    BigintLiteralContext _localctx = new BigintLiteralContext(_ctx, getState());
    enterRule(_localctx, 132, RULE_bigintLiteral);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(930);
        _la = _input.LA(1);
        if (!(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (BigHexIntegerLiteral - 66)) | (1L << (BigOctalIntegerLiteral - 66)) | (1L << (BigBinaryIntegerLiteral - 66)) | (1L << (BigDecimalIntegerLiteral - 66)))) != 0))) {
          _errHandler.recoverInline(this);
        } else {
          if (_input.LA(1) == Token.EOF) matchedEOF = true;
          _errHandler.reportMatch(this);
          consume();
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class IdentifierNameContext extends ParserRuleContext {
    public TerminalNode Identifier() {
      return getToken(JavaScriptParser.Identifier, 0);
    }

    public ReservedWordContext reservedWord() {
      return getRuleContext(ReservedWordContext.class, 0);
    }

    public IdentifierNameContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_identifierName;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterIdentifierName(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitIdentifierName(this);
    }
  }

  public final IdentifierNameContext identifierName() throws RecognitionException {
    IdentifierNameContext _localctx = new IdentifierNameContext(_ctx, getState());
    enterRule(_localctx, 134, RULE_identifierName);
    try {
      setState(934);
      _errHandler.sync(this);
      switch (_input.LA(1)) {
        case Identifier:
          enterOuterAlt(_localctx, 1);
        {
          setState(932);
          match(Identifier);
        }
        break;
        case NullLiteral:
        case BooleanLiteral:
        case Break:
        case Do:
        case Instanceof:
        case Typeof:
        case Case:
        case Else:
        case New:
        case Var:
        case Catch:
        case Finally:
        case Return:
        case Void:
        case Continue:
        case For:
        case Switch:
        case While:
        case Debugger:
        case Function:
        case This:
        case With:
        case Default:
        case If:
        case Throw:
        case Delete:
        case In:
        case Try:
        case As:
        case From:
        case Class:
        case Enum:
        case Extends:
        case Super:
        case Const:
        case Export:
        case Import:
        case Async:
        case Await:
        case Implements:
        case Let:
        case Private:
        case Public:
        case Interface:
        case Package:
        case Protected:
        case Static:
        case Yield:
          enterOuterAlt(_localctx, 2);
        {
          setState(933);
          reservedWord();
        }
        break;
        default:
          throw new NoViableAltException(this);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class ReservedWordContext extends ParserRuleContext {
    public KeywordContext keyword() {
      return getRuleContext(KeywordContext.class, 0);
    }

    public TerminalNode NullLiteral() {
      return getToken(JavaScriptParser.NullLiteral, 0);
    }

    public TerminalNode BooleanLiteral() {
      return getToken(JavaScriptParser.BooleanLiteral, 0);
    }

    public ReservedWordContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_reservedWord;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterReservedWord(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitReservedWord(this);
    }
  }

  public final ReservedWordContext reservedWord() throws RecognitionException {
    ReservedWordContext _localctx = new ReservedWordContext(_ctx, getState());
    enterRule(_localctx, 136, RULE_reservedWord);
    try {
      setState(939);
      _errHandler.sync(this);
      switch (_input.LA(1)) {
        case Break:
        case Do:
        case Instanceof:
        case Typeof:
        case Case:
        case Else:
        case New:
        case Var:
        case Catch:
        case Finally:
        case Return:
        case Void:
        case Continue:
        case For:
        case Switch:
        case While:
        case Debugger:
        case Function:
        case This:
        case With:
        case Default:
        case If:
        case Throw:
        case Delete:
        case In:
        case Try:
        case As:
        case From:
        case Class:
        case Enum:
        case Extends:
        case Super:
        case Const:
        case Export:
        case Import:
        case Async:
        case Await:
        case Implements:
        case Let:
        case Private:
        case Public:
        case Interface:
        case Package:
        case Protected:
        case Static:
        case Yield:
          enterOuterAlt(_localctx, 1);
        {
          setState(936);
          keyword();
        }
        break;
        case NullLiteral:
          enterOuterAlt(_localctx, 2);
        {
          setState(937);
          match(NullLiteral);
        }
        break;
        case BooleanLiteral:
          enterOuterAlt(_localctx, 3);
        {
          setState(938);
          match(BooleanLiteral);
        }
        break;
        default:
          throw new NoViableAltException(this);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class KeywordContext extends ParserRuleContext {
    public TerminalNode Break() {
      return getToken(JavaScriptParser.Break, 0);
    }

    public TerminalNode Do() {
      return getToken(JavaScriptParser.Do, 0);
    }

    public TerminalNode Instanceof() {
      return getToken(JavaScriptParser.Instanceof, 0);
    }

    public TerminalNode Typeof() {
      return getToken(JavaScriptParser.Typeof, 0);
    }

    public TerminalNode Case() {
      return getToken(JavaScriptParser.Case, 0);
    }

    public TerminalNode Else() {
      return getToken(JavaScriptParser.Else, 0);
    }

    public TerminalNode New() {
      return getToken(JavaScriptParser.New, 0);
    }

    public TerminalNode Var() {
      return getToken(JavaScriptParser.Var, 0);
    }

    public TerminalNode Catch() {
      return getToken(JavaScriptParser.Catch, 0);
    }

    public TerminalNode Finally() {
      return getToken(JavaScriptParser.Finally, 0);
    }

    public TerminalNode Return() {
      return getToken(JavaScriptParser.Return, 0);
    }

    public TerminalNode Void() {
      return getToken(JavaScriptParser.Void, 0);
    }

    public TerminalNode Continue() {
      return getToken(JavaScriptParser.Continue, 0);
    }

    public TerminalNode For() {
      return getToken(JavaScriptParser.For, 0);
    }

    public TerminalNode Switch() {
      return getToken(JavaScriptParser.Switch, 0);
    }

    public TerminalNode While() {
      return getToken(JavaScriptParser.While, 0);
    }

    public TerminalNode Debugger() {
      return getToken(JavaScriptParser.Debugger, 0);
    }

    public TerminalNode Function() {
      return getToken(JavaScriptParser.Function, 0);
    }

    public TerminalNode This() {
      return getToken(JavaScriptParser.This, 0);
    }

    public TerminalNode With() {
      return getToken(JavaScriptParser.With, 0);
    }

    public TerminalNode Default() {
      return getToken(JavaScriptParser.Default, 0);
    }

    public TerminalNode If() {
      return getToken(JavaScriptParser.If, 0);
    }

    public TerminalNode Throw() {
      return getToken(JavaScriptParser.Throw, 0);
    }

    public TerminalNode Delete() {
      return getToken(JavaScriptParser.Delete, 0);
    }

    public TerminalNode In() {
      return getToken(JavaScriptParser.In, 0);
    }

    public TerminalNode Try() {
      return getToken(JavaScriptParser.Try, 0);
    }

    public TerminalNode Class() {
      return getToken(JavaScriptParser.Class, 0);
    }

    public TerminalNode Enum() {
      return getToken(JavaScriptParser.Enum, 0);
    }

    public TerminalNode Extends() {
      return getToken(JavaScriptParser.Extends, 0);
    }

    public TerminalNode Super() {
      return getToken(JavaScriptParser.Super, 0);
    }

    public TerminalNode Const() {
      return getToken(JavaScriptParser.Const, 0);
    }

    public TerminalNode Export() {
      return getToken(JavaScriptParser.Export, 0);
    }

    public TerminalNode Import() {
      return getToken(JavaScriptParser.Import, 0);
    }

    public TerminalNode Implements() {
      return getToken(JavaScriptParser.Implements, 0);
    }

    public TerminalNode Let() {
      return getToken(JavaScriptParser.Let, 0);
    }

    public TerminalNode Private() {
      return getToken(JavaScriptParser.Private, 0);
    }

    public TerminalNode Public() {
      return getToken(JavaScriptParser.Public, 0);
    }

    public TerminalNode Interface() {
      return getToken(JavaScriptParser.Interface, 0);
    }

    public TerminalNode Package() {
      return getToken(JavaScriptParser.Package, 0);
    }

    public TerminalNode Protected() {
      return getToken(JavaScriptParser.Protected, 0);
    }

    public TerminalNode Static() {
      return getToken(JavaScriptParser.Static, 0);
    }

    public TerminalNode Yield() {
      return getToken(JavaScriptParser.Yield, 0);
    }

    public TerminalNode Async() {
      return getToken(JavaScriptParser.Async, 0);
    }

    public TerminalNode Await() {
      return getToken(JavaScriptParser.Await, 0);
    }

    public TerminalNode From() {
      return getToken(JavaScriptParser.From, 0);
    }

    public TerminalNode As() {
      return getToken(JavaScriptParser.As, 0);
    }

    public KeywordContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_keyword;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterKeyword(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitKeyword(this);
    }
  }

  public final KeywordContext keyword() throws RecognitionException {
    KeywordContext _localctx = new KeywordContext(_ctx, getState());
    enterRule(_localctx, 138, RULE_keyword);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(941);
        _la = _input.LA(1);
        if (!(((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (Break - 70)) | (1L << (Do - 70)) | (1L << (Instanceof - 70)) | (1L << (Typeof - 70)) | (1L << (Case - 70)) | (1L << (Else - 70)) | (1L << (New - 70)) | (1L << (Var - 70)) | (1L << (Catch - 70)) | (1L << (Finally - 70)) | (1L << (Return - 70)) | (1L << (Void - 70)) | (1L << (Continue - 70)) | (1L << (For - 70)) | (1L << (Switch - 70)) | (1L << (While - 70)) | (1L << (Debugger - 70)) | (1L << (Function - 70)) | (1L << (This - 70)) | (1L << (With - 70)) | (1L << (Default - 70)) | (1L << (If - 70)) | (1L << (Throw - 70)) | (1L << (Delete - 70)) | (1L << (In - 70)) | (1L << (Try - 70)) | (1L << (As - 70)) | (1L << (From - 70)) | (1L << (Class - 70)) | (1L << (Enum - 70)) | (1L << (Extends - 70)) | (1L << (Super - 70)) | (1L << (Const - 70)) | (1L << (Export - 70)) | (1L << (Import - 70)) | (1L << (Async - 70)) | (1L << (Await - 70)) | (1L << (Implements - 70)) | (1L << (Let - 70)) | (1L << (Private - 70)) | (1L << (Public - 70)) | (1L << (Interface - 70)) | (1L << (Package - 70)) | (1L << (Protected - 70)) | (1L << (Static - 70)) | (1L << (Yield - 70)))) != 0))) {
          _errHandler.recoverInline(this);
        } else {
          if (_input.LA(1) == Token.EOF) matchedEOF = true;
          _errHandler.reportMatch(this);
          consume();
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class GetterContext extends ParserRuleContext {
    public TerminalNode Identifier() {
      return getToken(JavaScriptParser.Identifier, 0);
    }

    public PropertyNameContext propertyName() {
      return getRuleContext(PropertyNameContext.class, 0);
    }

    public GetterContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_getter;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterGetter(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitGetter(this);
    }
  }

  public final GetterContext getter() throws RecognitionException {
    GetterContext _localctx = new GetterContext(_ctx, getState());
    enterRule(_localctx, 140, RULE_getter);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(943);
        match(Identifier);
        setState(944);
        if (!(this.p("get"))) throw new FailedPredicateException(this, "this.p(\"get\")");
        setState(945);
        propertyName();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class SetterContext extends ParserRuleContext {
    public TerminalNode Identifier() {
      return getToken(JavaScriptParser.Identifier, 0);
    }

    public PropertyNameContext propertyName() {
      return getRuleContext(PropertyNameContext.class, 0);
    }

    public SetterContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_setter;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterSetter(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitSetter(this);
    }
  }

  public final SetterContext setter() throws RecognitionException {
    SetterContext _localctx = new SetterContext(_ctx, getState());
    enterRule(_localctx, 142, RULE_setter);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(947);
        match(Identifier);
        setState(948);
        if (!(this.p("set"))) throw new FailedPredicateException(this, "this.p(\"set\")");
        setState(949);
        propertyName();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class EosContext extends ParserRuleContext {
    public TerminalNode SemiColon() {
      return getToken(JavaScriptParser.SemiColon, 0);
    }

    public TerminalNode EOF() {
      return getToken(JavaScriptParser.EOF, 0);
    }

    public EosContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_eos;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterEos(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitEos(this);
    }
  }

  public final EosContext eos() throws RecognitionException {
    EosContext _localctx = new EosContext(_ctx, getState());
    enterRule(_localctx, 144, RULE_eos);
    try {
      setState(955);
      _errHandler.sync(this);
      switch (getInterpreter().adaptivePredict(_input, 106, _ctx)) {
        case 1:
          enterOuterAlt(_localctx, 1);
        {
          setState(951);
          match(SemiColon);
        }
        break;
        case 2:
          enterOuterAlt(_localctx, 2);
        {
          setState(952);
          match(EOF);
        }
        break;
        case 3:
          enterOuterAlt(_localctx, 3);
        {
          setState(953);
          if (!(this.lineTerminatorAhead()))
            throw new FailedPredicateException(this, "this.lineTerminatorAhead()");
        }
        break;
        case 4:
          enterOuterAlt(_localctx, 4);
        {
          setState(954);
          if (!(this.closeBrace())) throw new FailedPredicateException(this, "this.closeBrace()");
        }
        break;
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
    switch (ruleIndex) {
      case 19:
        return expressionStatement_sempred((ExpressionStatementContext) _localctx, predIndex);
      case 21:
        return iterationStatement_sempred((IterationStatementContext) _localctx, predIndex);
      case 23:
        return continueStatement_sempred((ContinueStatementContext) _localctx, predIndex);
      case 24:
        return breakStatement_sempred((BreakStatementContext) _localctx, predIndex);
      case 25:
        return returnStatement_sempred((ReturnStatementContext) _localctx, predIndex);
      case 26:
        return yieldStatement_sempred((YieldStatementContext) _localctx, predIndex);
      case 34:
        return throwStatement_sempred((ThrowStatementContext) _localctx, predIndex);
      case 42:
        return classElement_sempred((ClassElementContext) _localctx, predIndex);
      case 58:
        return singleExpression_sempred((SingleExpressionContext) _localctx, predIndex);
      case 70:
        return getter_sempred((GetterContext) _localctx, predIndex);
      case 71:
        return setter_sempred((SetterContext) _localctx, predIndex);
      case 72:
        return eos_sempred((EosContext) _localctx, predIndex);
    }
    return true;
  }

  private boolean expressionStatement_sempred(ExpressionStatementContext _localctx, int predIndex) {
    switch (predIndex) {
      case 0:
        return this.notOpenBraceAndNotFunction();
    }
    return true;
  }

  private boolean iterationStatement_sempred(IterationStatementContext _localctx, int predIndex) {
    switch (predIndex) {
      case 1:
        return this.p("of");
    }
    return true;
  }

  private boolean continueStatement_sempred(ContinueStatementContext _localctx, int predIndex) {
    switch (predIndex) {
      case 2:
        return this.notLineTerminator();
    }
    return true;
  }

  private boolean breakStatement_sempred(BreakStatementContext _localctx, int predIndex) {
    switch (predIndex) {
      case 3:
        return this.notLineTerminator();
    }
    return true;
  }

  private boolean returnStatement_sempred(ReturnStatementContext _localctx, int predIndex) {
    switch (predIndex) {
      case 4:
        return this.notLineTerminator();
    }
    return true;
  }

  private boolean yieldStatement_sempred(YieldStatementContext _localctx, int predIndex) {
    switch (predIndex) {
      case 5:
        return this.notLineTerminator();
    }
    return true;
  }

  private boolean throwStatement_sempred(ThrowStatementContext _localctx, int predIndex) {
    switch (predIndex) {
      case 6:
        return this.notLineTerminator();
    }
    return true;
  }

  private boolean classElement_sempred(ClassElementContext _localctx, int predIndex) {
    switch (predIndex) {
      case 7:
        return this.n("static");
    }
    return true;
  }

  private boolean singleExpression_sempred(SingleExpressionContext _localctx, int predIndex) {
    switch (predIndex) {
      case 8:
        return precpred(_ctx, 27);
      case 9:
        return precpred(_ctx, 26);
      case 10:
        return precpred(_ctx, 25);
      case 11:
        return precpred(_ctx, 24);
      case 12:
        return precpred(_ctx, 23);
      case 13:
        return precpred(_ctx, 22);
      case 14:
        return precpred(_ctx, 21);
      case 15:
        return precpred(_ctx, 20);
      case 16:
        return precpred(_ctx, 19);
      case 17:
        return precpred(_ctx, 18);
      case 18:
        return precpred(_ctx, 17);
      case 19:
        return precpred(_ctx, 16);
      case 20:
        return precpred(_ctx, 15);
      case 21:
        return precpred(_ctx, 14);
      case 22:
        return precpred(_ctx, 13);
      case 23:
        return precpred(_ctx, 12);
      case 24:
        return precpred(_ctx, 11);
      case 25:
        return precpred(_ctx, 44);
      case 26:
        return precpred(_ctx, 43);
      case 27:
        return precpred(_ctx, 42);
      case 28:
        return precpred(_ctx, 39);
      case 29:
        return this.notLineTerminator();
      case 30:
        return precpred(_ctx, 38);
      case 31:
        return this.notLineTerminator();
      case 32:
        return precpred(_ctx, 9);
    }
    return true;
  }

  private boolean getter_sempred(GetterContext _localctx, int predIndex) {
    switch (predIndex) {
      case 33:
        return this.p("get");
    }
    return true;
  }

  private boolean setter_sempred(SetterContext _localctx, int predIndex) {
    switch (predIndex) {
      case 34:
        return this.p("set");
    }
    return true;
  }

  private boolean eos_sempred(EosContext _localctx, int predIndex) {
    switch (predIndex) {
      case 35:
        return this.lineTerminatorAhead();
      case 36:
        return this.closeBrace();
    }
    return true;
  }

  public static final String _serializedATN =
          "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3}\u03c0\4\2\t\2\4" +
                  "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
                  "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                  "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                  "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
                  "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4" +
                  ",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t" +
                  "\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t=" +
                  "\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I" +
                  "\tI\4J\tJ\3\2\5\2\u0096\n\2\3\2\5\2\u0099\n\2\3\2\3\2\3\3\3\3\3\4\3\4" +
                  "\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3" +
                  "\4\5\4\u00b3\n\4\3\5\3\5\5\5\u00b7\n\5\3\5\3\5\3\6\6\6\u00bc\n\6\r\6\16" +
                  "\6\u00bd\3\7\3\7\3\7\3\b\5\b\u00c4\n\b\3\b\3\b\5\b\u00c8\n\b\3\b\3\b\3" +
                  "\b\3\b\3\b\5\b\u00cf\n\b\3\t\3\t\3\t\3\t\7\t\u00d5\n\t\f\t\16\t\u00d8" +
                  "\13\t\3\t\3\t\5\t\u00dc\n\t\5\t\u00de\n\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13" +
                  "\3\13\5\13\u00e8\n\13\3\f\3\f\3\f\3\r\3\r\3\r\5\r\u00f0\n\r\3\16\3\16" +
                  "\3\16\5\16\u00f5\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00fe\n" +
                  "\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0106\n\17\3\17\3\17\5\17\u010a" +
                  "\n\17\3\20\3\20\3\20\5\20\u010f\n\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22" +
                  "\7\22\u0118\n\22\f\22\16\22\u011b\13\22\3\23\3\23\3\23\5\23\u0120\n\23" +
                  "\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26" +
                  "\u012f\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27" +
                  "\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0143\n\27\3\27\3\27\5\27\u0147\n" +
                  "\27\3\27\3\27\5\27\u014b\n\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0153" +
                  "\n\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u015c\n\27\3\27\3\27\3\27" +
                  "\5\27\u0161\n\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0169\n\27\3\30\3" +
                  "\30\3\31\3\31\3\31\5\31\u0170\n\31\3\31\3\31\3\32\3\32\3\32\5\32\u0177" +
                  "\n\32\3\32\3\32\3\33\3\33\3\33\5\33\u017e\n\33\3\33\3\33\3\34\3\34\3\34" +
                  "\5\34\u0185\n\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36" +
                  "\3\36\3\36\3\36\3\37\3\37\5\37\u0197\n\37\3\37\3\37\5\37\u019b\n\37\5" +
                  "\37\u019d\n\37\3\37\3\37\3 \6 \u01a2\n \r \16 \u01a3\3!\3!\3!\3!\5!\u01aa" +
                  "\n!\3\"\3\"\3\"\5\"\u01af\n\"\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\5" +
                  "%\u01be\n%\3%\5%\u01c1\n%\3&\3&\3&\5&\u01c6\n&\3&\5&\u01c9\n&\3&\3&\3" +
                  "\'\3\'\3\'\3(\3(\3(\3)\5)\u01d4\n)\3)\3)\5)\u01d8\n)\3)\3)\3)\5)\u01dd" +
                  "\n)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3+\3+\5+\u01ea\n+\3+\3+\7+\u01ee\n+\f+" +
                  "\16+\u01f1\13+\3+\3+\3,\3,\3,\3,\7,\u01f9\n,\f,\16,\u01fc\13,\3,\3,\3" +
                  ",\5,\u0201\n,\3,\3,\3,\3,\5,\u0207\n,\3-\5-\u020a\n-\3-\5-\u020d\n-\3" +
                  "-\3-\3-\5-\u0212\n-\3-\3-\3-\3-\3-\3-\5-\u021a\n-\3-\5-\u021d\n-\3-\3" +
                  "-\3-\3-\3-\3-\3-\3-\5-\u0227\n-\3-\5-\u022a\n-\3-\3-\3-\5-\u022f\n-\3" +
                  "-\3-\3-\3-\3-\5-\u0236\n-\3.\3.\3.\7.\u023b\n.\f.\16.\u023e\13.\3.\3." +
                  "\5.\u0242\n.\3.\5.\u0245\n.\3/\3/\3/\5/\u024a\n/\3\60\3\60\3\60\3\61\5" +
                  "\61\u0250\n\61\3\62\6\62\u0253\n\62\r\62\16\62\u0254\3\63\3\63\3\63\3" +
                  "\63\3\64\7\64\u025c\n\64\f\64\16\64\u025f\13\64\3\64\5\64\u0262\n\64\3" +
                  "\64\6\64\u0265\n\64\r\64\16\64\u0266\3\64\7\64\u026a\n\64\f\64\16\64\u026d" +
                  "\13\64\3\64\7\64\u0270\n\64\f\64\16\64\u0273\13\64\3\65\5\65\u0276\n\65" +
                  "\3\65\3\65\3\66\3\66\3\66\3\66\7\66\u027e\n\66\f\66\16\66\u0281\13\66" +
                  "\5\66\u0283\n\66\3\66\5\66\u0286\n\66\3\66\3\66\3\67\3\67\3\67\3\67\3" +
                  "\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u0295\n\67\3\67\5\67\u0298\n\67" +
                  "\3\67\3\67\3\67\5\67\u029d\n\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67" +
                  "\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67" +
                  "\u02b4\n\67\3\67\5\67\u02b7\n\67\38\38\38\38\38\38\38\58\u02c0\n8\39\3" +
                  "9\39\39\79\u02c6\n9\f9\169\u02c9\139\39\59\u02cc\n9\59\u02ce\n9\39\39" +
                  "\3:\5:\u02d3\n:\3:\3:\5:\u02d7\n:\3;\3;\3;\7;\u02dc\n;\f;\16;\u02df\13" +
                  ";\3<\3<\3<\3<\5<\u02e5\n<\3<\3<\3<\3<\5<\u02eb\n<\3<\3<\3<\3<\3<\3<\3" +
                  "<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3" +
                  "<\3<\3<\3<\3<\3<\3<\3<\3<\3<\5<\u0314\n<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3" +
                  "<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3" +
                  "<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3" +
                  "<\3<\3<\3<\3<\3<\3<\5<\u0354\n<\3<\3<\5<\u0358\n<\3<\3<\3<\3<\3<\3<\3" +
                  "<\3<\3<\3<\3<\7<\u0365\n<\f<\16<\u0368\13<\3=\3=\3=\5=\u036d\n=\3>\3>" +
                  "\5>\u0371\n>\3>\3>\5>\u0375\n>\3>\3>\5>\u0379\n>\3>\3>\3>\3>\3>\3>\5>" +
                  "\u0381\n>\3>\3>\3>\3>\5>\u0387\n>\3?\3?\3?\5?\u038c\n?\3?\5?\u038f\n?" +
                  "\3@\3@\3@\3@\3@\5@\u0396\n@\3A\3A\3B\3B\3B\3B\3B\3B\3B\5B\u03a1\nB\3C" +
                  "\3C\3D\3D\3E\3E\5E\u03a9\nE\3F\3F\3F\5F\u03ae\nF\3G\3G\3H\3H\3H\3H\3I" +
                  "\3I\3I\3I\3J\3J\3J\3J\5J\u03be\nJ\3J\2\3vK\2\4\6\b\n\f\16\20\22\24\26" +
                  "\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|" +
                  "~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\2\f\5\2" +
                  "OOhhnn\3\2\32\34\3\2\26\27\3\2 \"\3\2#&\3\2\'*\3\2\60;\3\2?C\3\2DG\3\2" +
                  "Hu\2\u0435\2\u0095\3\2\2\2\4\u009c\3\2\2\2\6\u00b2\3\2\2\2\b\u00b4\3\2" +
                  "\2\2\n\u00bb\3\2\2\2\f\u00bf\3\2\2\2\16\u00ce\3\2\2\2\20\u00d0\3\2\2\2" +
                  "\22\u00e1\3\2\2\2\24\u00e4\3\2\2\2\26\u00e9\3\2\2\2\30\u00ec\3\2\2\2\32" +
                  "\u00fd\3\2\2\2\34\u0109\3\2\2\2\36\u010e\3\2\2\2 \u0110\3\2\2\2\"\u0114" +
                  "\3\2\2\2$\u011c\3\2\2\2&\u0121\3\2\2\2(\u0123\3\2\2\2*\u0127\3\2\2\2," +
                  "\u0168\3\2\2\2.\u016a\3\2\2\2\60\u016c\3\2\2\2\62\u0173\3\2\2\2\64\u017a" +
                  "\3\2\2\2\66\u0181\3\2\2\28\u0188\3\2\2\2:\u018e\3\2\2\2<\u0194\3\2\2\2" +
                  ">\u01a1\3\2\2\2@\u01a5\3\2\2\2B\u01ab\3\2\2\2D\u01b0\3\2\2\2F\u01b4\3" +
                  "\2\2\2H\u01b9\3\2\2\2J\u01c2\3\2\2\2L\u01cc\3\2\2\2N\u01cf\3\2\2\2P\u01d3" +
                  "\3\2\2\2R\u01e3\3\2\2\2T\u01e9\3\2\2\2V\u0206\3\2\2\2X\u0235\3\2\2\2Z" +
                  "\u0244\3\2\2\2\\\u0246\3\2\2\2^\u024b\3\2\2\2`\u024f\3\2\2\2b\u0252\3" +
                  "\2\2\2d\u0256\3\2\2\2f\u025d\3\2\2\2h\u0275\3\2\2\2j\u0279\3\2\2\2l\u02b6" +
                  "\3\2\2\2n\u02bf\3\2\2\2p\u02c1\3\2\2\2r\u02d2\3\2\2\2t\u02d8\3\2\2\2v" +
                  "\u0313\3\2\2\2x\u036c\3\2\2\2z\u0386\3\2\2\2|\u038e\3\2\2\2~\u0395\3\2" +
                  "\2\2\u0080\u0397\3\2\2\2\u0082\u03a0\3\2\2\2\u0084\u03a2\3\2\2\2\u0086" +
                  "\u03a4\3\2\2\2\u0088\u03a8\3\2\2\2\u008a\u03ad\3\2\2\2\u008c\u03af\3\2" +
                  "\2\2\u008e\u03b1\3\2\2\2\u0090\u03b5\3\2\2\2\u0092\u03bd\3\2\2\2\u0094" +
                  "\u0096\7\3\2\2\u0095\u0094\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098\3\2" +
                  "\2\2\u0097\u0099\5b\62\2\u0098\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099" +
                  "\u009a\3\2\2\2\u009a\u009b\7\2\2\3\u009b\3\3\2\2\2\u009c\u009d\5\6\4\2" +
                  "\u009d\5\3\2\2\2\u009e\u00b3\5\b\5\2\u009f\u00b3\5 \21\2\u00a0\u00b3\5" +
                  "\f\7\2\u00a1\u00b3\5\32\16\2\u00a2\u00b3\5&\24\2\u00a3\u00b3\5R*\2\u00a4" +
                  "\u00b3\5(\25\2\u00a5\u00b3\5*\26\2\u00a6\u00b3\5,\27\2\u00a7\u00b3\5\60" +
                  "\31\2\u00a8\u00b3\5\62\32\2\u00a9\u00b3\5\64\33\2\u00aa\u00b3\5\66\34" +
                  "\2\u00ab\u00b3\58\35\2\u00ac\u00b3\5D#\2\u00ad\u00b3\5:\36\2\u00ae\u00b3" +
                  "\5F$\2\u00af\u00b3\5H%\2\u00b0\u00b3\5N(\2\u00b1\u00b3\5P)\2\u00b2\u009e" +
                  "\3\2\2\2\u00b2\u009f\3\2\2\2\u00b2\u00a0\3\2\2\2\u00b2\u00a1\3\2\2\2\u00b2" +
                  "\u00a2\3\2\2\2\u00b2\u00a3\3\2\2\2\u00b2\u00a4\3\2\2\2\u00b2\u00a5\3\2" +
                  "\2\2\u00b2\u00a6\3\2\2\2\u00b2\u00a7\3\2\2\2\u00b2\u00a8\3\2\2\2\u00b2" +
                  "\u00a9\3\2\2\2\u00b2\u00aa\3\2\2\2\u00b2\u00ab\3\2\2\2\u00b2\u00ac\3\2" +
                  "\2\2\u00b2\u00ad\3\2\2\2\u00b2\u00ae\3\2\2\2\u00b2\u00af\3\2\2\2\u00b2" +
                  "\u00b0\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3\7\3\2\2\2\u00b4\u00b6\7\13\2" +
                  "\2\u00b5\u00b7\5\n\6\2\u00b6\u00b5\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8" +
                  "\3\2\2\2\u00b8\u00b9\7\f\2\2\u00b9\t\3\2\2\2\u00ba\u00bc\5\6\4\2\u00bb" +
                  "\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2" +
                  "\2\2\u00be\13\3\2\2\2\u00bf\u00c0\7j\2\2\u00c0\u00c1\5\16\b\2\u00c1\r" +
                  "\3\2\2\2\u00c2\u00c4\5\22\n\2\u00c3\u00c2\3\2\2\2\u00c3\u00c4\3\2\2\2" +
                  "\u00c4\u00c7\3\2\2\2\u00c5\u00c8\5\24\13\2\u00c6\u00c8\5\20\t\2\u00c7" +
                  "\u00c5\3\2\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\5\26" +
                  "\f\2\u00ca\u00cb\5\u0092J\2\u00cb\u00cf\3\2\2\2\u00cc\u00cd\7w\2\2\u00cd" +
                  "\u00cf\5\u0092J\2\u00ce\u00c3\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\17\3\2" +
                  "\2\2\u00d0\u00d6\7\13\2\2\u00d1\u00d2\5\30\r\2\u00d2\u00d3\7\16\2\2\u00d3" +
                  "\u00d5\3\2\2\2\u00d4\u00d1\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2" +
                  "\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00dd\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9" +
                  "\u00db\5\30\r\2\u00da\u00dc\7\16\2\2\u00db\u00da\3\2\2\2\u00db\u00dc\3" +
                  "\2\2\2\u00dc\u00de\3\2\2\2\u00dd\u00d9\3\2\2\2\u00dd\u00de\3\2\2\2\u00de" +
                  "\u00df\3\2\2\2\u00df\u00e0\7\f\2\2\u00e0\21\3\2\2\2\u00e1\u00e2\5\30\r" +
                  "\2\u00e2\u00e3\7\16\2\2\u00e3\23\3\2\2\2\u00e4\u00e7\7\32\2\2\u00e5\u00e6" +
                  "\7b\2\2\u00e6\u00e8\5\u0088E\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2" +
                  "\u00e8\25\3\2\2\2\u00e9\u00ea\7c\2\2\u00ea\u00eb\7w\2\2\u00eb\27\3\2\2" +
                  "\2\u00ec\u00ef\5\u0088E\2\u00ed\u00ee\7b\2\2\u00ee\u00f0\5\u0088E\2\u00ef" +
                  "\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\31\3\2\2\2\u00f1\u00f4\7i\2\2" +
                  "\u00f2\u00f5\5\34\17\2\u00f3\u00f5\5\36\20\2\u00f4\u00f2\3\2\2\2\u00f4" +
                  "\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\5\u0092J\2\u00f7\u00fe" +
                  "\3\2\2\2\u00f8\u00f9\7i\2\2\u00f9\u00fa\7\\\2\2\u00fa\u00fb\5v<\2\u00fb" +
                  "\u00fc\5\u0092J\2\u00fc\u00fe\3\2\2\2\u00fd\u00f1\3\2\2\2\u00fd\u00f8" +
                  "\3\2\2\2\u00fe\33\3\2\2\2\u00ff\u0100\5\24\13\2\u0100\u0101\5\26\f\2\u0101" +
                  "\u0102\5\u0092J\2\u0102\u010a\3\2\2\2\u0103\u0105\5\20\t\2\u0104\u0106" +
                  "\5\26\f\2\u0105\u0104\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\3\2\2\2" +
                  "\u0107\u0108\5\u0092J\2\u0108\u010a\3\2\2\2\u0109\u00ff\3\2\2\2\u0109" +
                  "\u0103\3\2\2\2\u010a\35\3\2\2\2\u010b\u010f\5 \21\2\u010c\u010f\5R*\2" +
                  "\u010d\u010f\5P)\2\u010e\u010b\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010d" +
                  "\3\2\2\2\u010f\37\3\2\2\2\u0110\u0111\5.\30\2\u0111\u0112\5\"\22\2\u0112" +
                  "\u0113\5\u0092J\2\u0113!\3\2\2\2\u0114\u0119\5$\23\2\u0115\u0116\7\16" +
                  "\2\2\u0116\u0118\5$\23\2\u0117\u0115\3\2\2\2\u0118\u011b\3\2\2\2\u0119" +
                  "\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a#\3\2\2\2\u011b\u0119\3\2\2\2" +
                  "\u011c\u011f\5x=\2\u011d\u011e\7\17\2\2\u011e\u0120\5v<\2\u011f\u011d" +
                  "\3\2\2\2\u011f\u0120\3\2\2\2\u0120%\3\2\2\2\u0121\u0122\7\r\2\2\u0122" +
                  "\'\3\2\2\2\u0123\u0124\6\25\2\2\u0124\u0125\5t;\2\u0125\u0126\5\u0092" +
                  "J\2\u0126)\3\2\2\2\u0127\u0128\7]\2\2\u0128\u0129\7\t\2\2\u0129\u012a" +
                  "\5t;\2\u012a\u012b\7\n\2\2\u012b\u012e\5\6\4\2\u012c\u012d\7M\2\2\u012d" +
                  "\u012f\5\6\4\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f+\3\2\2\2" +
                  "\u0130\u0131\7I\2\2\u0131\u0132\5\6\4\2\u0132\u0133\7W\2\2\u0133\u0134" +
                  "\7\t\2\2\u0134\u0135\5t;\2\u0135\u0136\7\n\2\2\u0136\u0137\5\u0092J\2" +
                  "\u0137\u0169\3\2\2\2\u0138\u0139\7W\2\2\u0139\u013a\7\t\2\2\u013a\u013b" +
                  "\5t;\2\u013b\u013c\7\n\2\2\u013c\u013d\5\6\4\2\u013d\u0169\3\2\2\2\u013e" +
                  "\u013f\7U\2\2\u013f\u0142\7\t\2\2\u0140\u0143\5t;\2\u0141\u0143\5 \21" +
                  "\2\u0142\u0140\3\2\2\2\u0142\u0141\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144" +
                  "\3\2\2\2\u0144\u0146\7\r\2\2\u0145\u0147\5t;\2\u0146\u0145\3\2\2\2\u0146" +
                  "\u0147\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014a\7\r\2\2\u0149\u014b\5t" +
                  ";\2\u014a\u0149\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014c\3\2\2\2\u014c" +
                  "\u014d\7\n\2\2\u014d\u0169\5\6\4\2\u014e\u014f\7U\2\2\u014f\u0152\7\t" +
                  "\2\2\u0150\u0153\5v<\2\u0151\u0153\5 \21\2\u0152\u0150\3\2\2\2\u0152\u0151" +
                  "\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0155\7`\2\2\u0155\u0156\5t;\2\u0156" +
                  "\u0157\7\n\2\2\u0157\u0158\5\6\4\2\u0158\u0169\3\2\2\2\u0159\u015b\7U" +
                  "\2\2\u015a\u015c\7l\2\2\u015b\u015a\3\2\2\2\u015b\u015c\3\2\2\2\u015c" +
                  "\u015d\3\2\2\2\u015d\u0160\7\t\2\2\u015e\u0161\5v<\2\u015f\u0161\5 \21" +
                  "\2\u0160\u015e\3\2\2\2\u0160\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0163" +
                  "\7v\2\2\u0163\u0164\6\27\3\2\u0164\u0165\5t;\2\u0165\u0166\7\n\2\2\u0166" +
                  "\u0167\5\6\4\2\u0167\u0169\3\2\2\2\u0168\u0130\3\2\2\2\u0168\u0138\3\2" +
                  "\2\2\u0168\u013e\3\2\2\2\u0168\u014e\3\2\2\2\u0168\u0159\3\2\2\2\u0169" +
                  "-\3\2\2\2\u016a\u016b\t\2\2\2\u016b/\3\2\2\2\u016c\u016f\7T\2\2\u016d" +
                  "\u016e\6\31\4\2\u016e\u0170\7v\2\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2" +
                  "\2\2\u0170\u0171\3\2\2\2\u0171\u0172\5\u0092J\2\u0172\61\3\2\2\2\u0173" +
                  "\u0176\7H\2\2\u0174\u0175\6\32\5\2\u0175\u0177\7v\2\2\u0176\u0174\3\2" +
                  "\2\2\u0176\u0177\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0179\5\u0092J\2\u0179" +
                  "\63\3\2\2\2\u017a\u017d\7R\2\2\u017b\u017c\6\33\6\2\u017c\u017e\5t;\2" +
                  "\u017d\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0180" +
                  "\5\u0092J\2\u0180\65\3\2\2\2\u0181\u0184\7u\2\2\u0182\u0183\6\34\7\2\u0183" +
                  "\u0185\5t;\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0186\3\2\2" +
                  "\2\u0186\u0187\5\u0092J\2\u0187\67\3\2\2\2\u0188\u0189\7[\2\2\u0189\u018a" +
                  "\7\t\2\2\u018a\u018b\5t;\2\u018b\u018c\7\n\2\2\u018c\u018d\5\6\4\2\u018d" +
                  "9\3\2\2\2\u018e\u018f\7V\2\2\u018f\u0190\7\t\2\2\u0190\u0191\5t;\2\u0191" +
                  "\u0192\7\n\2\2\u0192\u0193\5<\37\2\u0193;\3\2\2\2\u0194\u0196\7\13\2\2" +
                  "\u0195\u0197\5> \2\u0196\u0195\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u019c" +
                  "\3\2\2\2\u0198\u019a\5B\"\2\u0199\u019b\5> \2\u019a\u0199\3\2\2\2\u019a" +
                  "\u019b\3\2\2\2\u019b\u019d\3\2\2\2\u019c\u0198\3\2\2\2\u019c\u019d\3\2" +
                  "\2\2\u019d\u019e\3\2\2\2\u019e\u019f\7\f\2\2\u019f=\3\2\2\2\u01a0\u01a2" +
                  "\5@!\2\u01a1\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a3" +
                  "\u01a4\3\2\2\2\u01a4?\3\2\2\2\u01a5\u01a6\7L\2\2\u01a6\u01a7\5t;\2\u01a7" +
                  "\u01a9\7\21\2\2\u01a8\u01aa\5\n\6\2\u01a9\u01a8\3\2\2\2\u01a9\u01aa\3" +
                  "\2\2\2\u01aaA\3\2\2\2\u01ab\u01ac\7\\\2\2\u01ac\u01ae\7\21\2\2\u01ad\u01af" +
                  "\5\n\6\2\u01ae\u01ad\3\2\2\2\u01ae\u01af\3\2\2\2\u01afC\3\2\2\2\u01b0" +
                  "\u01b1\7v\2\2\u01b1\u01b2\7\21\2\2\u01b2\u01b3\5\6\4\2\u01b3E\3\2\2\2" +
                  "\u01b4\u01b5\7^\2\2\u01b5\u01b6\6$\b\2\u01b6\u01b7\5t;\2\u01b7\u01b8\5" +
                  "\u0092J\2\u01b8G\3\2\2\2\u01b9\u01ba\7a\2\2\u01ba\u01c0\5\b\5\2\u01bb" +
                  "\u01bd\5J&\2\u01bc\u01be\5L\'\2\u01bd\u01bc\3\2\2\2\u01bd\u01be\3\2\2" +
                  "\2\u01be\u01c1\3\2\2\2\u01bf\u01c1\5L\'\2\u01c0\u01bb\3\2\2\2\u01c0\u01bf" +
                  "\3\2\2\2\u01c1I\3\2\2\2\u01c2\u01c8\7P\2\2\u01c3\u01c5\7\t\2\2\u01c4\u01c6" +
                  "\5x=\2\u01c5\u01c4\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7" +
                  "\u01c9\7\n\2\2\u01c8\u01c3\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01ca\3\2" +
                  "\2\2\u01ca\u01cb\5\b\5\2\u01cbK\3\2\2\2\u01cc\u01cd\7Q\2\2\u01cd\u01ce" +
                  "\5\b\5\2\u01ceM\3\2\2\2\u01cf\u01d0\7X\2\2\u01d0\u01d1\5\u0092J\2\u01d1" +
                  "O\3\2\2\2\u01d2\u01d4\7k\2\2\u01d3\u01d2\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4" +
                  "\u01d5\3\2\2\2\u01d5\u01d7\7Y\2\2\u01d6\u01d8\7\32\2\2\u01d7\u01d6\3\2" +
                  "\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01da\7v\2\2\u01da" +
                  "\u01dc\7\t\2\2\u01db\u01dd\5Z.\2\u01dc\u01db\3\2\2\2\u01dc\u01dd\3\2\2" +
                  "\2\u01dd\u01de\3\2\2\2\u01de\u01df\7\n\2\2\u01df\u01e0\7\13\2\2\u01e0" +
                  "\u01e1\5`\61\2\u01e1\u01e2\7\f\2\2\u01e2Q\3\2\2\2\u01e3\u01e4\7d\2\2\u01e4" +
                  "\u01e5\7v\2\2\u01e5\u01e6\5T+\2\u01e6S\3\2\2\2\u01e7\u01e8\7f\2\2\u01e8" +
                  "\u01ea\5v<\2\u01e9\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01eb\3\2\2" +
                  "\2\u01eb\u01ef\7\13\2\2\u01ec\u01ee\5V,\2\u01ed\u01ec\3\2\2\2\u01ee\u01f1" +
                  "\3\2\2\2\u01ef\u01ed\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01f2\3\2\2\2\u01f1" +
                  "\u01ef\3\2\2\2\u01f2\u01f3\7\f\2\2\u01f3U\3\2\2\2\u01f4\u01f9\7t\2\2\u01f5" +
                  "\u01f6\6,\t\2\u01f6\u01f9\7v\2\2\u01f7\u01f9\7k\2\2\u01f8\u01f4\3\2\2" +
                  "\2\u01f8\u01f5\3\2\2\2\u01f8\u01f7\3\2\2\2\u01f9\u01fc\3\2\2\2\u01fa\u01f8" +
                  "\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fd\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fd" +
                  "\u0207\5X-\2\u01fe\u0207\5&\24\2\u01ff\u0201\7\37\2\2\u0200\u01ff\3\2" +
                  "\2\2\u0200\u0201\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0203\5n8\2\u0203\u0204" +
                  "\7\17\2\2\u0204\u0205\5v<\2\u0205\u0207\3\2\2\2\u0206\u01fa\3\2\2\2\u0206" +
                  "\u01fe\3\2\2\2\u0206\u0200\3\2\2\2\u0207W\3\2\2\2\u0208\u020a\7\32\2\2" +
                  "\u0209\u0208\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020c\3\2\2\2\u020b\u020d" +
                  "\7\37\2\2\u020c\u020b\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020e\3\2\2\2" +
                  "\u020e\u020f\5n8\2\u020f\u0211\7\t\2\2\u0210\u0212\5Z.\2\u0211\u0210\3" +
                  "\2\2\2\u0211\u0212\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0214\7\n\2\2\u0214" +
                  "\u0215\7\13\2\2\u0215\u0216\5`\61\2\u0216\u0217\7\f\2\2\u0217\u0236\3" +
                  "\2\2\2\u0218\u021a\7\32\2\2\u0219\u0218\3\2\2\2\u0219\u021a\3\2\2\2\u021a" +
                  "\u021c\3\2\2\2\u021b\u021d\7\37\2\2\u021c\u021b\3\2\2\2\u021c\u021d\3" +
                  "\2\2\2\u021d\u021e\3\2\2\2\u021e\u021f\5\u008eH\2\u021f\u0220\7\t\2\2" +
                  "\u0220\u0221\7\n\2\2\u0221\u0222\7\13\2\2\u0222\u0223\5`\61\2\u0223\u0224" +
                  "\7\f\2\2\u0224\u0236\3\2\2\2\u0225\u0227\7\32\2\2\u0226\u0225\3\2\2\2" +
                  "\u0226\u0227\3\2\2\2\u0227\u0229\3\2\2\2\u0228\u022a\7\37\2\2\u0229\u0228" +
                  "\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u022c\5\u0090I" +
                  "\2\u022c\u022e\7\t\2\2\u022d\u022f\5Z.\2\u022e\u022d\3\2\2\2\u022e\u022f" +
                  "\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u0231\7\n\2\2\u0231\u0232\7\13\2\2" +
                  "\u0232\u0233\5`\61\2\u0233\u0234\7\f\2\2\u0234\u0236\3\2\2\2\u0235\u0209" +
                  "\3\2\2\2\u0235\u0219\3\2\2\2\u0235\u0226\3\2\2\2\u0236Y\3\2\2\2\u0237" +
                  "\u023c\5\\/\2\u0238\u0239\7\16\2\2\u0239\u023b\5\\/\2\u023a\u0238\3\2" +
                  "\2\2\u023b\u023e\3\2\2\2\u023c\u023a\3\2\2\2\u023c\u023d\3\2\2\2\u023d" +
                  "\u0241\3\2\2\2\u023e\u023c\3\2\2\2\u023f\u0240\7\16\2\2\u0240\u0242\5" +
                  "^\60\2\u0241\u023f\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0245\3\2\2\2\u0243" +
                  "\u0245\5^\60\2\u0244\u0237\3\2\2\2\u0244\u0243\3\2\2\2\u0245[\3\2\2\2" +
                  "\u0246\u0249\5x=\2\u0247\u0248\7\17\2\2\u0248\u024a\5v<\2\u0249\u0247" +
                  "\3\2\2\2\u0249\u024a\3\2\2\2\u024a]\3\2\2\2\u024b\u024c\7\22\2\2\u024c" +
                  "\u024d\5v<\2\u024d_\3\2\2\2\u024e\u0250\5b\62\2\u024f\u024e\3\2\2\2\u024f" +
                  "\u0250\3\2\2\2\u0250a\3\2\2\2\u0251\u0253\5\4\3\2\u0252\u0251\3\2\2\2" +
                  "\u0253\u0254\3\2\2\2\u0254\u0252\3\2\2\2\u0254\u0255\3\2\2\2\u0255c\3" +
                  "\2\2\2\u0256\u0257\7\7\2\2\u0257\u0258\5f\64\2\u0258\u0259\7\b\2\2\u0259" +
                  "e\3\2\2\2\u025a\u025c\7\16\2\2\u025b\u025a\3\2\2\2\u025c\u025f\3\2\2\2" +
                  "\u025d\u025b\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u0261\3\2\2\2\u025f\u025d" +
                  "\3\2\2\2\u0260\u0262\5h\65\2\u0261\u0260\3\2\2\2\u0261\u0262\3\2\2\2\u0262" +
                  "\u026b\3\2\2\2\u0263\u0265\7\16\2\2\u0264\u0263\3\2\2\2\u0265\u0266\3" +
                  "\2\2\2\u0266\u0264\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u0268\3\2\2\2\u0268" +
                  "\u026a\5h\65\2\u0269\u0264\3\2\2\2\u026a\u026d\3\2\2\2\u026b\u0269\3\2" +
                  "\2\2\u026b\u026c\3\2\2\2\u026c\u0271\3\2\2\2\u026d\u026b\3\2\2\2\u026e" +
                  "\u0270\7\16\2\2\u026f\u026e\3\2\2\2\u0270\u0273\3\2\2\2\u0271\u026f\3" +
                  "\2\2\2\u0271\u0272\3\2\2\2\u0272g\3\2\2\2\u0273\u0271\3\2\2\2\u0274\u0276" +
                  "\7\22\2\2\u0275\u0274\3\2\2\2\u0275\u0276\3\2\2\2\u0276\u0277\3\2\2\2" +
                  "\u0277\u0278\5v<\2\u0278i\3\2\2\2\u0279\u0282\7\13\2\2\u027a\u027f\5l" +
                  "\67\2\u027b\u027c\7\16\2\2\u027c\u027e\5l\67\2\u027d\u027b\3\2\2\2\u027e" +
                  "\u0281\3\2\2\2\u027f\u027d\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u0283\3\2" +
                  "\2\2\u0281\u027f\3\2\2\2\u0282\u027a\3\2\2\2\u0282\u0283\3\2\2\2\u0283" +
                  "\u0285\3\2\2\2\u0284\u0286\7\16\2\2\u0285\u0284\3\2\2\2\u0285\u0286\3" +
                  "\2\2\2\u0286\u0287\3\2\2\2\u0287\u0288\7\f\2\2\u0288k\3\2\2\2\u0289\u028a" +
                  "\5n8\2\u028a\u028b\7\21\2\2\u028b\u028c\5v<\2\u028c\u02b7\3\2\2\2\u028d" +
                  "\u028e\7\7\2\2\u028e\u028f\5v<\2\u028f\u0290\7\b\2\2\u0290\u0291\7\21" +
                  "\2\2\u0291\u0292\5v<\2\u0292\u02b7\3\2\2\2\u0293\u0295\7k\2\2\u0294\u0293" +
                  "\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u0297\3\2\2\2\u0296\u0298\7\32\2\2" +
                  "\u0297\u0296\3\2\2\2\u0297\u0298\3\2\2\2\u0298\u0299\3\2\2\2\u0299\u029a" +
                  "\5n8\2\u029a\u029c\7\t\2\2\u029b\u029d\5Z.\2\u029c\u029b\3\2\2\2\u029c" +
                  "\u029d\3\2\2\2\u029d\u029e\3\2\2\2\u029e\u029f\7\n\2\2\u029f\u02a0\7\13" +
                  "\2\2\u02a0\u02a1\5`\61\2\u02a1\u02a2\7\f\2\2\u02a2\u02b7\3\2\2\2\u02a3" +
                  "\u02a4\5\u008eH\2\u02a4\u02a5\7\t\2\2\u02a5\u02a6\7\n\2\2\u02a6\u02a7" +
                  "\7\13\2\2\u02a7\u02a8\5`\61\2\u02a8\u02a9\7\f\2\2\u02a9\u02b7\3\2\2\2" +
                  "\u02aa\u02ab\5\u0090I\2\u02ab\u02ac\7\t\2\2\u02ac\u02ad\5\\/\2\u02ad\u02ae" +
                  "\7\n\2\2\u02ae\u02af\7\13\2\2\u02af\u02b0\5`\61\2\u02b0\u02b1\7\f\2\2" +
                  "\u02b1\u02b7\3\2\2\2\u02b2\u02b4\7\22\2\2\u02b3\u02b2\3\2\2\2\u02b3\u02b4" +
                  "\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5\u02b7\5v<\2\u02b6\u0289\3\2\2\2\u02b6" +
                  "\u028d\3\2\2\2\u02b6\u0294\3\2\2\2\u02b6\u02a3\3\2\2\2\u02b6\u02aa\3\2" +
                  "\2\2\u02b6\u02b3\3\2\2\2\u02b7m\3\2\2\2\u02b8\u02c0\5\u0088E\2\u02b9\u02c0" +
                  "\7w\2\2\u02ba\u02c0\5\u0084C\2\u02bb\u02bc\7\7\2\2\u02bc\u02bd\5v<\2\u02bd" +
                  "\u02be\7\b\2\2\u02be\u02c0\3\2\2\2\u02bf\u02b8\3\2\2\2\u02bf\u02b9\3\2" +
                  "\2\2\u02bf\u02ba\3\2\2\2\u02bf\u02bb\3\2\2\2\u02c0o\3\2\2\2\u02c1\u02cd" +
                  "\7\t\2\2\u02c2\u02c7\5r:\2\u02c3\u02c4\7\16\2\2\u02c4\u02c6\5r:\2\u02c5" +
                  "\u02c3\3\2\2\2\u02c6\u02c9\3\2\2\2\u02c7\u02c5\3\2\2\2\u02c7\u02c8\3\2" +
                  "\2\2\u02c8\u02cb\3\2\2\2\u02c9\u02c7\3\2\2\2\u02ca\u02cc\7\16\2\2\u02cb" +
                  "\u02ca\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc\u02ce\3\2\2\2\u02cd\u02c2\3\2" +
                  "\2\2\u02cd\u02ce\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf\u02d0\7\n\2\2\u02d0" +
                  "q\3\2\2\2\u02d1\u02d3\7\22\2\2\u02d2\u02d1\3\2\2\2\u02d2\u02d3\3\2\2\2" +
                  "\u02d3\u02d6\3\2\2\2\u02d4\u02d7\5v<\2\u02d5\u02d7\7v\2\2\u02d6\u02d4" +
                  "\3\2\2\2\u02d6\u02d5\3\2\2\2\u02d7s\3\2\2\2\u02d8\u02dd\5v<\2\u02d9\u02da" +
                  "\7\16\2\2\u02da\u02dc\5v<\2\u02db\u02d9\3\2\2\2\u02dc\u02df\3\2\2\2\u02dd" +
                  "\u02db\3\2\2\2\u02dd\u02de\3\2\2\2\u02deu\3\2\2\2\u02df\u02dd\3\2\2\2" +
                  "\u02e0\u02e1\b<\1\2\u02e1\u0314\5z>\2\u02e2\u02e4\7d\2\2\u02e3\u02e5\7" +
                  "v\2\2\u02e4\u02e3\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6" +
                  "\u0314\5T+\2\u02e7\u02e8\7N\2\2\u02e8\u02ea\5v<\2\u02e9\u02eb\5p9\2\u02ea" +
                  "\u02e9\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb\u0314\3\2\2\2\u02ec\u02ed\7N" +
                  "\2\2\u02ed\u02ee\7\23\2\2\u02ee\u0314\7v\2\2\u02ef\u02f0\7_\2\2\u02f0" +
                  "\u0314\5v<\'\u02f1\u02f2\7S\2\2\u02f2\u0314\5v<&\u02f3\u02f4\7K\2\2\u02f4" +
                  "\u0314\5v<%\u02f5\u02f6\7\24\2\2\u02f6\u0314\5v<$\u02f7\u02f8\7\25\2\2" +
                  "\u02f8\u0314\5v<#\u02f9\u02fa\7\26\2\2\u02fa\u0314\5v<\"\u02fb\u02fc\7" +
                  "\27\2\2\u02fc\u0314\5v<!\u02fd\u02fe\7\30\2\2\u02fe\u0314\5v< \u02ff\u0300" +
                  "\7\31\2\2\u0300\u0314\5v<\37\u0301\u0302\7l\2\2\u0302\u0314\5v<\36\u0303" +
                  "\u0304\7j\2\2\u0304\u0305\7\t\2\2\u0305\u0306\5v<\2\u0306\u0307\7\n\2" +
                  "\2\u0307\u0314\3\2\2\2\u0308\u0314\5\66\34\2\u0309\u0314\7Z\2\2\u030a" +
                  "\u0314\7v\2\2\u030b\u0314\7g\2\2\u030c\u0314\5\u0082B\2\u030d\u0314\5" +
                  "d\63\2\u030e\u0314\5j\66\2\u030f\u0310\7\t\2\2\u0310\u0311\5t;\2\u0311" +
                  "\u0312\7\n\2\2\u0312\u0314\3\2\2\2\u0313\u02e0\3\2\2\2\u0313\u02e2\3\2" +
                  "\2\2\u0313\u02e7\3\2\2\2\u0313\u02ec\3\2\2\2\u0313\u02ef\3\2\2\2\u0313" +
                  "\u02f1\3\2\2\2\u0313\u02f3\3\2\2\2\u0313\u02f5\3\2\2\2\u0313\u02f7\3\2" +
                  "\2\2\u0313\u02f9\3\2\2\2\u0313\u02fb\3\2\2\2\u0313\u02fd\3\2\2\2\u0313" +
                  "\u02ff\3\2\2\2\u0313\u0301\3\2\2\2\u0313\u0303\3\2\2\2\u0313\u0308\3\2" +
                  "\2\2\u0313\u0309\3\2\2\2\u0313\u030a\3\2\2\2\u0313\u030b\3\2\2\2\u0313" +
                  "\u030c\3\2\2\2\u0313\u030d\3\2\2\2\u0313\u030e\3\2\2\2\u0313\u030f\3\2" +
                  "\2\2\u0314\u0366\3\2\2\2\u0315\u0316\f\35\2\2\u0316\u0317\7\35\2\2\u0317" +
                  "\u0365\5v<\35\u0318\u0319\f\34\2\2\u0319\u031a\t\3\2\2\u031a\u0365\5v" +
                  "<\35\u031b\u031c\f\33\2\2\u031c\u031d\t\4\2\2\u031d\u0365\5v<\34\u031e" +
                  "\u031f\f\32\2\2\u031f\u0320\7\36\2\2\u0320\u0365\5v<\33\u0321\u0322\f" +
                  "\31\2\2\u0322\u0323\t\5\2\2\u0323\u0365\5v<\32\u0324\u0325\f\30\2\2\u0325" +
                  "\u0326\t\6\2\2\u0326\u0365\5v<\31\u0327\u0328\f\27\2\2\u0328\u0329\7J" +
                  "\2\2\u0329\u0365\5v<\30\u032a\u032b\f\26\2\2\u032b\u032c\7`\2\2\u032c" +
                  "\u0365\5v<\27\u032d\u032e\f\25\2\2\u032e\u032f\t\7\2\2\u032f\u0365\5v" +
                  "<\26\u0330\u0331\f\24\2\2\u0331\u0332\7+\2\2\u0332\u0365\5v<\25\u0333" +
                  "\u0334\f\23\2\2\u0334\u0335\7,\2\2\u0335\u0365\5v<\24\u0336\u0337\f\22" +
                  "\2\2\u0337\u0338\7-\2\2\u0338\u0365\5v<\23\u0339\u033a\f\21\2\2\u033a" +
                  "\u033b\7.\2\2\u033b\u0365\5v<\22\u033c\u033d\f\20\2\2\u033d\u033e\7/\2" +
                  "\2\u033e\u0365\5v<\21\u033f\u0340\f\17\2\2\u0340\u0341\7\20\2\2\u0341" +
                  "\u0342\5v<\2\u0342\u0343\7\21\2\2\u0343\u0344\5v<\20\u0344\u0365\3\2\2" +
                  "\2\u0345\u0346\f\16\2\2\u0346\u0347\7\17\2\2\u0347\u0365\5v<\16\u0348" +
                  "\u0349\f\r\2\2\u0349\u034a\5\u0080A\2\u034a\u034b\5v<\r\u034b\u0365\3" +
                  "\2\2\2\u034c\u034d\f.\2\2\u034d\u034e\7\7\2\2\u034e\u034f\5t;\2\u034f" +
                  "\u0350\7\b\2\2\u0350\u0365\3\2\2\2\u0351\u0353\f-\2\2\u0352\u0354\7\20" +
                  "\2\2\u0353\u0352\3\2\2\2\u0353\u0354\3\2\2\2\u0354\u0355\3\2\2\2\u0355" +
                  "\u0357\7\23\2\2\u0356\u0358\7\37\2\2\u0357\u0356\3\2\2\2\u0357\u0358\3" +
                  "\2\2\2\u0358\u0359\3\2\2\2\u0359\u0365\5\u0088E\2\u035a\u035b\f,\2\2\u035b" +
                  "\u0365\5p9\2\u035c\u035d\f)\2\2\u035d\u035e\6<\37\2\u035e\u0365\7\24\2" +
                  "\2\u035f\u0360\f(\2\2\u0360\u0361\6<!\2\u0361\u0365\7\25\2\2\u0362\u0363" +
                  "\f\13\2\2\u0363\u0365\7x\2\2\u0364\u0315\3\2\2\2\u0364\u0318\3\2\2\2\u0364" +
                  "\u031b\3\2\2\2\u0364\u031e\3\2\2\2\u0364\u0321\3\2\2\2\u0364\u0324\3\2" +
                  "\2\2\u0364\u0327\3\2\2\2\u0364\u032a\3\2\2\2\u0364\u032d\3\2\2\2\u0364" +
                  "\u0330\3\2\2\2\u0364\u0333\3\2\2\2\u0364\u0336\3\2\2\2\u0364\u0339\3\2" +
                  "\2\2\u0364\u033c\3\2\2\2\u0364\u033f\3\2\2\2\u0364\u0345\3\2\2\2\u0364" +
                  "\u0348\3\2\2\2\u0364\u034c\3\2\2\2\u0364\u0351\3\2\2\2\u0364\u035a\3\2" +
                  "\2\2\u0364\u035c\3\2\2\2\u0364\u035f\3\2\2\2\u0364\u0362\3\2\2\2\u0365" +
                  "\u0368\3\2\2\2\u0366\u0364\3\2\2\2\u0366\u0367\3\2\2\2\u0367w\3\2\2\2" +
                  "\u0368\u0366\3\2\2\2\u0369\u036d\7v\2\2\u036a\u036d\5d\63\2\u036b\u036d" +
                  "\5j\66\2\u036c\u0369\3\2\2\2\u036c\u036a\3\2\2\2\u036c\u036b\3\2\2\2\u036d" +
                  "y\3\2\2\2\u036e\u0387\5P)\2\u036f\u0371\7k\2\2\u0370\u036f\3\2\2\2\u0370" +
                  "\u0371\3\2\2\2\u0371\u0372\3\2\2\2\u0372\u0374\7Y\2\2\u0373\u0375\7\32" +
                  "\2\2\u0374\u0373\3\2\2\2\u0374\u0375\3\2\2\2\u0375\u0376\3\2\2\2\u0376" +
                  "\u0378\7\t\2\2\u0377\u0379\5Z.\2\u0378\u0377\3\2\2\2\u0378\u0379\3\2\2" +
                  "\2\u0379\u037a\3\2\2\2\u037a\u037b\7\n\2\2\u037b\u037c\7\13\2\2\u037c" +
                  "\u037d\5`\61\2\u037d\u037e\7\f\2\2\u037e\u0387\3\2\2\2\u037f\u0381\7k" +
                  "\2\2\u0380\u037f\3\2\2\2\u0380\u0381\3\2\2\2\u0381\u0382\3\2\2\2\u0382" +
                  "\u0383\5|?\2\u0383\u0384\7<\2\2\u0384\u0385\5~@\2\u0385\u0387\3\2\2\2" +
                  "\u0386\u036e\3\2\2\2\u0386\u0370\3\2\2\2\u0386\u0380\3\2\2\2\u0387{\3" +
                  "\2\2\2\u0388\u038f\7v\2\2\u0389\u038b\7\t\2\2\u038a\u038c\5Z.\2\u038b" +
                  "\u038a\3\2\2\2\u038b\u038c\3\2\2\2\u038c\u038d\3\2\2\2\u038d\u038f\7\n" +
                  "\2\2\u038e\u0388\3\2\2\2\u038e\u0389\3\2\2\2\u038f}\3\2\2\2\u0390\u0396" +
                  "\5v<\2\u0391\u0392\7\13\2\2\u0392\u0393\5`\61\2\u0393\u0394\7\f\2\2\u0394" +
                  "\u0396\3\2\2\2\u0395\u0390\3\2\2\2\u0395\u0391\3\2\2\2\u0396\177\3\2\2" +
                  "\2\u0397\u0398\t\b\2\2\u0398\u0081\3\2\2\2\u0399\u03a1\7=\2\2\u039a\u03a1" +
                  "\7>\2\2\u039b\u03a1\7w\2\2\u039c\u03a1\7x\2\2\u039d\u03a1\7\6\2\2\u039e" +
                  "\u03a1\5\u0084C\2\u039f\u03a1\5\u0086D\2\u03a0\u0399\3\2\2\2\u03a0\u039a" +
                  "\3\2\2\2\u03a0\u039b\3\2\2\2\u03a0\u039c\3\2\2\2\u03a0\u039d\3\2\2\2\u03a0" +
                  "\u039e\3\2\2\2\u03a0\u039f\3\2\2\2\u03a1\u0083\3\2\2\2\u03a2\u03a3\t\t" +
                  "\2\2\u03a3\u0085\3\2\2\2\u03a4\u03a5\t\n\2\2\u03a5\u0087\3\2\2\2\u03a6" +
                  "\u03a9\7v\2\2\u03a7\u03a9\5\u008aF\2\u03a8\u03a6\3\2\2\2\u03a8\u03a7\3" +
                  "\2\2\2\u03a9\u0089\3\2\2\2\u03aa\u03ae\5\u008cG\2\u03ab\u03ae\7=\2\2\u03ac" +
                  "\u03ae\7>\2\2\u03ad\u03aa\3\2\2\2\u03ad\u03ab\3\2\2\2\u03ad\u03ac\3\2" +
                  "\2\2\u03ae\u008b\3\2\2\2\u03af\u03b0\t\13\2\2\u03b0\u008d\3\2\2\2\u03b1" +
                  "\u03b2\7v\2\2\u03b2\u03b3\6H#\2\u03b3\u03b4\5n8\2\u03b4\u008f\3\2\2\2" +
                  "\u03b5\u03b6\7v\2\2\u03b6\u03b7\6I$\2\u03b7\u03b8\5n8\2\u03b8\u0091\3" +
                  "\2\2\2\u03b9\u03be\7\r\2\2\u03ba\u03be\7\2\2\3\u03bb\u03be\6J%\2\u03bc" +
                  "\u03be\6J&\2\u03bd\u03b9\3\2\2\2\u03bd\u03ba\3\2\2\2\u03bd\u03bb\3\2\2" +
                  "\2\u03bd\u03bc\3\2\2\2\u03be\u0093\3\2\2\2m\u0095\u0098\u00b2\u00b6\u00bd" +
                  "\u00c3\u00c7\u00ce\u00d6\u00db\u00dd\u00e7\u00ef\u00f4\u00fd\u0105\u0109" +
                  "\u010e\u0119\u011f\u012e\u0142\u0146\u014a\u0152\u015b\u0160\u0168\u016f" +
                  "\u0176\u017d\u0184\u0196\u019a\u019c\u01a3\u01a9\u01ae\u01bd\u01c0\u01c5" +
                  "\u01c8\u01d3\u01d7\u01dc\u01e9\u01ef\u01f8\u01fa\u0200\u0206\u0209\u020c" +
                  "\u0211\u0219\u021c\u0226\u0229\u022e\u0235\u023c\u0241\u0244\u0249\u024f" +
                  "\u0254\u025d\u0261\u0266\u026b\u0271\u0275\u027f\u0282\u0285\u0294\u0297" +
                  "\u029c\u02b3\u02b6\u02bf\u02c7\u02cb\u02cd\u02d2\u02d6\u02dd\u02e4\u02ea" +
                  "\u0313\u0353\u0357\u0364\u0366\u036c\u0370\u0374\u0378\u0380\u0386\u038b" +
                  "\u038e\u0395\u03a0\u03a8\u03ad\u03bd";
  public static final ATN _ATN =
          new ATNDeserializer().deserialize(_serializedATN.toCharArray());

  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}