import junit.framework.*;
import java.util.List;
import java.util.ArrayList;
import hello.Article;


public class ArticleTest extends TestCase {

   // test method to ensure all chars in String are converted to lower case
   public void testGetTitleInLowerCase() {

     String cockleshell = "Cockleshell Heros";
     String vietnam = "Vietnam";

      List<Article> articles = new ArrayList();
      Article article1 = new Article((short)1, cockleshell);
      Article article2 = new Article((short)2, vietnam);
      articles.add(article1);
      articles.add(article2);

      for (Article article : articles) {
        assertTrue(article.getTitleInLowerCase().equals(article.getTitle().toLowerCase()));
      }

   }
}
