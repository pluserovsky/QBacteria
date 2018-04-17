# QBacteria
http://lukasz.culer.staff.iiar.pwr.wroc.pl
Temat: 
Wykorzystanie bazy danych w aplikacji przeznaczonej do przetwarzania dużych zbiorów danych. 

Wymagania: 
Do realizacji zadania potrzebna będzie wiedza o sposobach komunikacji z bazami danych za pomocą JDBC (choć istnieją frameworki ORM pozwalające na tworzenie aplikacji z warstwą danych, jednak nie będą one wykorzystane - chodzi tu o stworzenie aplikacji korzystającej bezpośrednio z JDBC). Ponadto wymagana będzie znajomość sposobów przetwarzania plików XML w języku Java za pomocą JAXB. 

Zadanie: 
Ogólny opis aplikacji: 
Zaimplementowana aplikacja powinna służyć do klasyfikowania bakterii o zadanym genotypie. 

Genotyp bakterii stanowić będzie ciąg 6 cyfr, przykładowo: 

351244 

Genotyp ten koduje trzy geny:
34 - alpha
54 - beta
12 - gamma


Geny alfa i beta odpowiadają za kodowanie liczby wici (1, 2, 3...) , natomiast beta i gamma - klasę twardości błony komórkowej (a, b, c...).
Aplikacja ma za zadanie służyć do klasyfikacji nieznanych wcześniej osobników na podstawie ich genotypów i zapisywać pomiar do bazy do odpowiedniej tabeli - w przypadku istnienia pomiaru dla danego genotypu ma być aktualizowany. 
Do klasyfikacji posłużyć ma algorytm 1-NN wraz z bazą przebadanych wcześniej (można wygenerować dane losowo, ale postaram się zamieścić też jakieś przykładowe dane). 

Aplikacja powinna:
Umożliwić podłączenie do bazy danych pod dowolnym adresem / nazwą pliku
Wyświetlać listę historii przebadanych osobników wraz z klasyfikacją (wykorzystać procedury zapisane)
Zapisywać listę przebadanych osobników do pliku XML
Pozwalać na klasyfikację pojedynczego osobnika (wraz z natychmiastową informacją o klasyfikacji i zapisaniu do historii)
Pozwalać na klasyfikację wielu osobników (wykorzystanie transakcji przy zapisywaniu do historii)
Minimalizować liczbę zapytań do bazy danych.
Wykorzystywać zapytania parametryzowane
