package br.com.ramonsilva186.springsecurity.repository;

import br.com.ramonsilva186.springsecurity.entities.Tweet;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TweetRepository extends JpaRepository<Tweet, Long>{

}
