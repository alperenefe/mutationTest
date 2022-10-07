package org.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class PersonDtoConverterTest {

    @Test
    public void test() {

        //Given
        Person person = new Person();
        person.setId(1);
        person.setAge(43);
        person.setName("alperen");



        //When
        PersonDto personDto = new PersonDtoConverter().convert(person);

        //Then
        assertThat(personDto.getId()).isEqualTo(person.getId());
    }

}