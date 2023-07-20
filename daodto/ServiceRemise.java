package daodto;

import java.util.List;

public class ServiceRemise {
	
	private ArticleDAOImpl impl;
	
	public ServiceRemise(ArticleDAOImpl impl) {
		
		this.impl = impl;
	}
	
	public void remiseArticle(List<Article> lesArticles, double remise) {
		
		for(Article unArticle : lesArticles) {
			unArticle.setprix(unArticle.getprix() * remise);
			impl.updateArticle(unArticle);
		}
		
	}

}
