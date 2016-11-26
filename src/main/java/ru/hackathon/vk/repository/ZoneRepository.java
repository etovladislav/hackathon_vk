package ru.hackathon.vk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.hackathon.vk.model.Zone;

/**
 * Created by etovladislav on 26.11.16.
 */
public interface ZoneRepository extends JpaRepository<Zone, Long> {
}
