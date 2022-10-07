package org.example;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PersonDtoConverter {

    public PersonDto convert(Person person) {

        PersonDto personDto = new PersonDto();
        personDto.setId(person.getId());
        personDto.setAge(person.getAge());
        personDto.setName(person.getName());

        log.info("DTO fields: id: "+personDto.getId() + " age: "+personDto.getAge()+" name: "+personDto.getName());
        return personDto;
    }
}
