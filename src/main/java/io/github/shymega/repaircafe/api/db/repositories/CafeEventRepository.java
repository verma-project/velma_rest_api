package io.github.shymega.repaircafe.api.db.repositories;

import io.github.shymega.repaircafe.api.models.CafeEvent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CafeEventRepository extends JpaRepository<CafeEvent, UUID> {
}
