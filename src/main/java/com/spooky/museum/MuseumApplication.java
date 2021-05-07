package com.spooky.museum;

import com.spooky.museum.model.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MuseumApplication {
    public static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("MM.dd.yyyy  HH:mm");
    public static void main(String[] args) throws ParseException {
        Client client = Client
                .builder()
                .id(1)
                .name("tim")
                .lastName("Vatlor")
                .password("526")
                .userContact(UserContacts.builder().phoneNumber("267812963").email("tim211@gmail.com").userName("tim111").build())
                .build();
        Admin admin1 = Admin
                .builder()
                .id(2)
                .name("Shon")
                .lastName("watson")
                .password("awwr62")
                .userContact(UserContacts.builder().phoneNumber("267022933").email("ShonDalto@Museum.com").userName("admin81442").build())
                .build();
        Guide guide1 = Guide
                .builder()
                .id(3)
                .name("Sasha")
                .lastName("Relto")
                .password("0987uio")
                .userContact(UserContacts.builder().phoneNumber("212242933").email("ShonDalto@Museum.com").userName("admin81442").build())
                .build();
        Guide guide2 = Guide
                .builder()
                .id(4)
                .name("martlo")
                .lastName("Fisherman")
                .password("a654poi")
                .userContact(UserContacts.builder().phoneNumber("267022933").email("ShonDalto@Museum.com").userName("admin81442").build())
                .build();
        Guide guide3 = Guide
                .builder()
                .id(5)
                .name("york")
                .lastName("larman")
                .password("amkouyi")
                .userContact(UserContacts.builder().phoneNumber("267022933").email("ShonDalto@Museum.com").userName("admin81442").build())
                .build();
        Department department1 = Department
                .builder()
                .name("History of rock instruments")
                .description("The history of rock instruments")
                .id(1)
                .contact(Contact.builder().phoneNumber("43224733").email("DepartmentOfRock@Museum.com").build())
                .guides(Collections.singletonList(guide1))
                .build();
        Department department2 = Department
                .builder()
                .name("first instruments")
                .description("The first instruments that are known")
                .id(2)
                .contact(Contact.builder().phoneNumber("43107537").email("DepartmentOfFirstInstruments@Museum.com").build())
                .guides(Collections.singletonList(guide2))
                .build();

        Department department3 = Department
                .builder()
                .name("Newer instruments")
                .description("instruments of the new era")
                .id(3)
                .contact(Contact.builder().phoneNumber("43224733").email("DepartmentOfRock@Museum.com").build())
                .guides(Collections.singletonList(guide3))
                .build();

        Excursion excursion = Excursion
                .builder()
                .mainGuide(guide1)
                .id(1)
                .name("From ancient songs to rock and roll")
                .group(Collections.singletonList(client))
                .lectures(List.of(
                        Lecture.builder()
                                .startTime(DATE_FORMAT.parse("07.05.2021 10:30"))
                                .endTime(DATE_FORMAT.parse("07.05.2021 10:45"))
                                .lecturer(guide1)
                                .subject(department1.getDescription())
                                .build(),
                        Lecture.builder()
                                .startTime(DATE_FORMAT.parse("07.05.2021 13:45"))
                                .endTime(DATE_FORMAT.parse("07.05.2021 14:00"))
                                .lecturer(guide2)
                                .subject(department2.getDescription())
                                .build(),
                        Lecture.builder()
                                .startTime(DATE_FORMAT.parse("07.05.2021 16:30"))
                                .endTime(DATE_FORMAT.parse("07.05.2021 17:45"))
                                .lecturer(guide3)
                                .subject(department3.getDescription())
                                .build()
                )).build();
        Museum Museum1 = Museum
                .builder()
                .id(1)
                .name("History of music museum")
                .location("mienchen218")
                .departmentList(Arrays.asList(department1,department2,department3))
                .excursionList(Collections.singletonList(excursion))
                .build();
        System.out.println();
    }
}
