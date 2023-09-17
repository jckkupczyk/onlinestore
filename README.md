# Jacek Kupczyk
## Nazwa projektu: onlinestore

### założenia ogólne:
* sklep internetowy z asortymenem od kilku wybranych producentów (wstępnie będą to rowery lub sprzęt elektroniczny typu laptopy, słuchawki, albo książki)
* na stronie głównej planuję wyświetlić ogólne informacje o sklepie wraz z możliwością przejścia do kilku zakładek
* w zakładce oferta loga 2-3 producentów/nazwiska autorów, po dokonaniu wyboru użytkownik zostanie przekierowany do wybranej listy produktów
* lista produktów będzie zawierać: miniatury zdjęć, opis, informację o dostępności produktu, cenę jednostkową oraz przycisk umożliwiający złożenie zamówienia
* kolejną zakładką będzie koszyk kupującego, w którym nastąpi podsumowanie zakupu
* aplikacja z możliwością dodania nowego produktu przez sprzedawcę
* ewentualnie dodatkowe funkcjonalności w miarę rozwijania projektu

W uzupełnieniu do wstępnych założeń projektu dotyczącego  stworzenia strony internetowej symulującej działanie prostego sklepu internetowego poniżej przedstawiam instrukcję obsługi:
Aby uruchomić onlinestore należy pobrać repozytorium ze strony: https://github.com/jckkupczyk/onlinestore. Po zbudowaniu oraz uruchomieniu aplikacji w Inteliji lub innym IDE należy wpisać w przeglądarce domyślny adres url: http://localhost:8080. W celu wczytania przykładowych danych można skorzystać z pliku data.sql, w którym znajdują się zakomentowane polecenia uzupełniające tabele: „bicycles” oraz „opinions”. 

Główna strona sklepu internetowego to widok paska nawigacji, grafiki obrazującej tematykę sprzedawanych produktów – są to rowery oraz podstawowych informacji o sklepie. 

W pasku nawigacji można przejść do kilku zakładek: oferty sklepu, opinii oraz panelu administratora. Logo sklepu umieszczone w górnym lewym roku zawsze przenosi użytkownika do strony głównej. Pod informacjami o sklepie znajduje się przycisk, który podobnie jak oferta na pasku nawigacji wyświetla sprzedawane przez sklep rowery.

W ofercie sklepu znajdują się grafiki przedstawiające loga producentów: romet i kross. Po kliknięciu na wybrane logo zostaną wyświetlone tylko rowery konkretnego producenta. W przypadku braku podjęcia wyboru na stronie wyświetlane są wszystkie rowery. 

W tabelach reprezentujących konkretny przedmiot znajdują się nazwa roweru oraz model, informacja o dostępności produktu (na zielono dostępny, na czerwono niedostępny, w przypadku wyświetlenia napisu niedostępny nie ma możliwości złożenia zamówienia). 

Pozostałe informacje o sprzedawanym rowerze wyświetlone po przejściu do oferty to: cena jednostkowa, zdjęcie, kolor, rozmiar ramy, rozmiar kół, waga, ilość biegów oraz odnośnik który przenosi do strony producenta roweru. Pod rowerem na całej szerokości strony wyświetla się przycisk zamów, który umożliwia zakup roweru. Po jego naciśnięciu użytkownik zostaje przeniesiony do kolejnej strony, w której uzupełnia swoje dane adresowe. 

Po prawidłowym wypełnieniu formularza i naciśnięciu zamów, wyświetla się strona potwierdzająca złożenie zamówienia - w tym miejscu użytkownik może sprawdzić podane przez siebie dane adresowe, jak również po przejściu w „pokaż szczegóły zakupu” jeszcze raz zobaczyć informacje o zamawianym rowerze. 

W przypadku pomyłki w adresie lub podjęcia decyzji o rezygnacji z zakupu użytkownik może anulować zamówienie odpowiednim przyciskiem. Jeżeli tego nie zrobi dane adresowe, informacje o zamówieniu oraz czasie złożenia zamówienia zostaną zapisane w bazie danych sql w dwóch tabelach: orders, order.adresses. Wraz z dokonaniem zakupu liczba dostępnych sztuk w bazie danych zostaje zmniejszona o 1. Anulowanie zamówienia przywraca tą liczbę do poprzedniego stanu.

W zakładce opinie są wyświetlane opinie już dodane przez użytkowników, które zostają zapisane w tabeli opinions w bazie danych. W tym miejscu użytkownik ma możliwość dodania nowych opinii (do 250 znaków, powyżej tej liczby treść automatycznie zostaje skrócona do maksymalnej wartości), oprócz treści obowiązkowym do wypełnienia polem jest nazwa autora opinii natomiast automatycznie pobierany jest czas dodania opinii i wyświetlany wraz z nazwą autora i treścią dodanej opinii na tej podstronie.

Panel administratora służy do zarządzania bazą produktów przez sprzedawcę. W tej zakładce oprócz widoku wszystkich produktów dostępnych w ofercie sprzedażowej sklepu dodano funkcjonalności dodawania edytowania już istniejących, jak też usuwania produktów z oferty sklepu. Do tego celu służą przyciski znajdujące się poniżej każdego produktu, a do dodawania nowych rowerów na górze i dole strony.

### W projekcie wykorzystano następujące technologie:
* Java
* Spring Boot (Web, JPA)
* SQL Server, h2 Database, PostgreSQL
* Thymeleaf
* Railway.app

### Baza danych:
* W czasie przygotowywania projektu korzystałem z uczelnianej bazy danych Microsoft SQL Server, z którą łączyłem się zgodnie z wytycznymi przedstawionymi na naszych zajęciach, czyli logując się do prywatnej sieci wirtualnej (VPN). Do wszystkich operacji bazodanowych miałem dostęp przez Microsoft SQL Server Management Studio.
* W trakcie realizacji projektu testowo kilkukrotnie przełączałem się również na bazę H2 dostępną po wpisaniu do przeglądarki adresu: http://localhost:8080/h2-console (w tym momencie aby połączyć się z tą bazą danych należy w projekcie odkomentować wiersze oraz zakomentować podkreślone na czerwono w pliku application.properties oraz zależności w pom.xml). Następnie po przekierowania do strony uwierzytelnienia wpisujemy tylko hasło zadeklarowane w application.properties. Pola JDBC URL oraz User Name zostaje uzupełnione automatycznie ag. z tym co w application.properties.
* Po ukończeniu projektu w celu jego hostingowania na railway.app kolejny raz zmieniłem bazę danych tym razem na postgresql. Na podstawie ostatnich zajęć z przedmiotu projekt końcowy aplikacja została udotępniona pod adresem: https://onlinestoreapp.up.railway.app. 

