package ru.hackathon.vk.service;

import ru.hackathon.vk.form.ElementForm;

/**
 * Created by etovladislav on 26.11.16.
 */
public interface ZoneService {

    Long createZone(String name, String groupId);

    Long createElement(ElementForm elementForm);
}
