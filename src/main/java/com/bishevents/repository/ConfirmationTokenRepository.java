package com.bishevents.repository;

import com.bishevents.entity.ConfirmationToken;
import com.bishevents.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ConfirmationTokenRepository extends JpaRepository<ConfirmationToken, Long> {
    Optional<ConfirmationToken> findByUser(User user);

    Optional<ConfirmationToken> findByToken(String token);
}
