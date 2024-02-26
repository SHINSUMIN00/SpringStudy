package hello.spirngpractice.repositroy;

import hello.spirngpractice.entity.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository<Article, Long> {
}
