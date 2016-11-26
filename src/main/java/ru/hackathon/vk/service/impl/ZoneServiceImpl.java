package ru.hackathon.vk.service.impl;

import org.hibernate.mapping.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.hackathon.vk.form.ElementForm;
import ru.hackathon.vk.model.Element;
import ru.hackathon.vk.model.Zone;
import ru.hackathon.vk.repository.ZoneRepository;
import ru.hackathon.vk.service.ZoneService;

import java.util.Collections;

/**
 * Created by etovladislav on 26.11.16.
 */
@Service
public class ZoneServiceImpl implements ZoneService {

    @Autowired
    ZoneRepository zoneRepository;

    @Override
    public Long createZone(String name, String groupId) {
        Zone zone = new Zone();
        zone.setFloor(1);
        zone.setGroupId(groupId);
        zone.setName(name);
        return zoneRepository.save(zone).getId();
    }

    @Override
    public Long createElement(ElementForm elementForm) {
        Element element = new Element(elementForm);
        element.setZone();

        return null;
    }
}
