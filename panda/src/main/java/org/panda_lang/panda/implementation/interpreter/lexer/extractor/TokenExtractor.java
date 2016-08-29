package org.panda_lang.panda.implementation.interpreter.lexer.extractor;

import org.panda_lang.core.interpreter.lexer.Token;
import org.panda_lang.core.interpreter.lexer.TokenReader;
import org.panda_lang.core.interpreter.lexer.TokenType;
import org.panda_lang.core.interpreter.lexer.suggestion.Separator;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TokenExtractor {

    public static final TokenPatternUnit HOLLOW = new TokenPatternUnit(new TokenType("HOLLOW"), "*");

    private final TokenPattern pattern;
    private final List<TokenHollow> hollows;
    private final Stack<Separator> separators;
    private TokenHollow hollow;

    public TokenExtractor(TokenPattern pattern) {
        this.pattern = pattern;
        this.hollows = new ArrayList<>();
        this.separators = new Stack<>();
        this.hollow = new TokenHollow();
    }

    // TODO
    public boolean extract(TokenReader tokenReader) {
        TokenPatternUnit[] tokenPatternUnits = pattern.getUnits();
        int readerIndex = 0;

        for (int unitIndex = 0; unitIndex < tokenPatternUnits.length; unitIndex++) {
            TokenPatternUnit unit = tokenPatternUnits[unitIndex];

            for (Token nextToken : tokenReader) {
                if (unit.isHollow()) {

                }
            }


        }

        return true;
    }

    public List<TokenHollow> getHollows() {
        return hollows;
    }

}
