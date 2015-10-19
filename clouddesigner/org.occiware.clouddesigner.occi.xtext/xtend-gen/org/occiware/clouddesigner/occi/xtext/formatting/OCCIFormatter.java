/**
 * generated by Xtext
 */
package org.occiware.clouddesigner.occi.xtext.formatting;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.util.Pair;
import org.eclipse.xtext.xbase.lib.Extension;
import org.occiware.clouddesigner.occi.xtext.services.OCCIGrammarAccess;

/**
 * This class contains custom formatting declarations.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#formatting
 * on how and when to use it.
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an example
 */
@SuppressWarnings("all")
public class OCCIFormatter extends AbstractDeclarativeFormatter {
  @Inject
  @Extension
  private OCCIGrammarAccess _oCCIGrammarAccess;
  
  @Override
  protected void configureFormatting(final FormattingConfig c) {
    FormattingConfig.LinewrapLocator _setLinewrap = c.setLinewrap(1);
    ParserRule _kindDeclRule = this._oCCIGrammarAccess.getKindDeclRule();
    _setLinewrap.before(_kindDeclRule);
    List<Keyword> _findKeywords = this._oCCIGrammarAccess.findKeywords("import");
    for (final Keyword import_ : _findKeywords) {
      {
        FormattingConfig.NoLinewrapLocator _setNoLinewrap = c.setNoLinewrap();
        _setNoLinewrap.after(import_);
        FormattingConfig.LinewrapLocator _setLinewrap_1 = c.setLinewrap();
        _setLinewrap_1.before(import_);
      }
    }
    FormattingConfig.LinewrapLocator _setLinewrap_1 = c.setLinewrap(1);
    ParserRule _attributeDeclRule = this._oCCIGrammarAccess.getAttributeDeclRule();
    _setLinewrap_1.before(_attributeDeclRule);
    FormattingConfig.LinewrapLocator _setLinewrap_2 = c.setLinewrap(1);
    ParserRule _actionDeclRule = this._oCCIGrammarAccess.getActionDeclRule();
    _setLinewrap_2.before(_actionDeclRule);
    FormattingConfig.LinewrapLocator _setLinewrap_3 = c.setLinewrap(1);
    ParserRule _dataTypeDeclRule = this._oCCIGrammarAccess.getDataTypeDeclRule();
    _setLinewrap_3.before(_dataTypeDeclRule);
    FormattingConfig.LinewrapLocator _setLinewrap_4 = c.setLinewrap(1);
    ParserRule _enumTypeDeclRule = this._oCCIGrammarAccess.getEnumTypeDeclRule();
    _setLinewrap_4.before(_enumTypeDeclRule);
    List<Keyword> _findKeywords_1 = this._oCCIGrammarAccess.findKeywords("(");
    for (final Keyword parenthesis : _findKeywords_1) {
      {
        FormattingConfig.NoLinewrapLocator _setNoLinewrap = c.setNoLinewrap();
        _setNoLinewrap.before(parenthesis);
        FormattingConfig.NoSpaceLocator _setNoSpace = c.setNoSpace();
        _setNoSpace.after(parenthesis);
      }
    }
    List<Pair<Keyword, Keyword>> _findKeywordPairs = this._oCCIGrammarAccess.findKeywordPairs("{", "}");
    for (final Pair<Keyword, Keyword> pair : _findKeywordPairs) {
      {
        Keyword _first = pair.getFirst();
        Keyword _second = pair.getSecond();
        c.setIndentation(_first, _second);
        FormattingConfig.LinewrapLocator _setLinewrap_5 = c.setLinewrap(1);
        Keyword _first_1 = pair.getFirst();
        _setLinewrap_5.after(_first_1);
        FormattingConfig.LinewrapLocator _setLinewrap_6 = c.setLinewrap(1);
        Keyword _second_1 = pair.getSecond();
        _setLinewrap_6.before(_second_1);
        FormattingConfig.LinewrapLocator _setLinewrap_7 = c.setLinewrap(1);
        Keyword _second_2 = pair.getSecond();
        _setLinewrap_7.after(_second_2);
      }
    }
    List<Keyword> _findKeywords_2 = this._oCCIGrammarAccess.findKeywords(",");
    for (final Keyword comma : _findKeywords_2) {
      {
        FormattingConfig.NoLinewrapLocator _setNoLinewrap = c.setNoLinewrap();
        _setNoLinewrap.before(comma);
        FormattingConfig.NoSpaceLocator _setNoSpace = c.setNoSpace();
        _setNoSpace.before(comma);
        FormattingConfig.LinewrapLocator _setLinewrap_5 = c.setLinewrap();
        _setLinewrap_5.after(comma);
      }
    }
    FormattingConfig.LinewrapLocator _setLinewrap_5 = c.setLinewrap(0, 1, 2);
    TerminalRule _sL_COMMENTRule = this._oCCIGrammarAccess.getSL_COMMENTRule();
    _setLinewrap_5.before(_sL_COMMENTRule);
    FormattingConfig.LinewrapLocator _setLinewrap_6 = c.setLinewrap(0, 1, 2);
    TerminalRule _mL_COMMENTRule = this._oCCIGrammarAccess.getML_COMMENTRule();
    _setLinewrap_6.before(_mL_COMMENTRule);
    FormattingConfig.LinewrapLocator _setLinewrap_7 = c.setLinewrap(0, 1, 1);
    TerminalRule _mL_COMMENTRule_1 = this._oCCIGrammarAccess.getML_COMMENTRule();
    _setLinewrap_7.after(_mL_COMMENTRule_1);
  }
}
