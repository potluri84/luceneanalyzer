package sdanalyzer;

import java.io.Reader;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.Tokenizer;
import org.apache.lucene.analysis.core.WhitespaceTokenizer;

public class customanalyzer extends Analyzer {

	@Override
	protected TokenStreamComponents createComponents(String arg0) {	
		System.out.println(arg0);
		 Tokenizer tokenizer = new WhitespaceTokenizer();
         TokenStream filter = new EmptyStringTokenFilter(tokenizer);
         return new TokenStreamComponents(tokenizer, filter);

	}

}
