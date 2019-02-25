package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Article {

    public Article () {
      super();
    }

    public Article (short id, String title) {
      this.id = id;
      this.title = title;
    }

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private short id;
    private String title;

    public short getId () {
      return id;
    }

    public String getTitle () {
      return title;
    }

    public void setId (short id) {
      this.id = id;
    }

    public void setTitle ( String title) {
      this.title = title;
    }

    public String getTitleInLowerCase () {
      return title.toLowerCase();
    }

}
