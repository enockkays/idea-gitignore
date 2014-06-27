package mobi.hsz.idea.gitignore.lexer;

import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

public class GitignoreLexerAdapter extends FlexAdapter {
    public GitignoreLexerAdapter() {
        super(new GitignoreLexer((Reader) null));
    }
}