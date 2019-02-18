package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Article {

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

}
