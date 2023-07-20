package daodto;

import java.util.List;

public interface IArticleDAO {
	
	public void addArticle(Article unArticle);
	public void deleteArticle(int Id);
	public void updateArticle(Article unArticle);
	public Article getArticle(int Id);
	public List<Article> getAllArticle();
	

}
