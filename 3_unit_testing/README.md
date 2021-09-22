## Quality Assurance

Aplikacje tworzone przez zespoły programistyczne mają często skomplikowaną struktórę składającą się z wielu elementów.
Stworzenie poprawnie działającej aplikacji utrudnia dodatkowo fakt, ze są one tworzone przez wielu programistów o róznym stopniu zaawansowania na przestrzeni wielu miesięcy a nawet lat. Niektóre systemy informatyczne są rozwijane i modyfikowane latami przez kolejne pokolenia programistów. W tej sytuacji pojawia się pytanie w jaki sposób zapewnić ze aplikacja wykonuje dokładnie to do czego została zaprojektowana jej nowe funkcjonalności są kompatybilne ze starymi funkcjonalnościami a wrpowadzane zmiany nie powodują popsucia części ich składowych elementów.

Istnieje wiele strategii mających zagwarantować wysoką jakość tworzenia oprogramowania i jego poprawne działanie. Pierwszym ze sposobów jest wprowadzenie do zespołu roli architekta który odpowiada za to by system informatyczny był poprawnie zaprojektowany oraz za to zeby byl realizowany zgodnie z tymi wytycznymi. Innym podejściem jest code review polegająca na tym ze zadna linijka kodu nie moze zostać dodana do repozytorium bez wcześniejszego zweryfikowania przez programistę bardziej doświadczonego niz osoba daną funkcjonalność tworząca. Gdy każda nowa funkcjonalność jest tworzona przez dwie osoby trudniej jest o powstanie błędów. 
Ważnym elementem oprogramowania jest dokumentacja, jednak gdy jest duża presja by oprogramowanie powstało w jak najkrótszym czasie często dokumentacja nie jest uzupełniana. W wielu firmach istnieje duży nacisk na tworzenie tak zwanego samo dokumentującego się kodu. Znaczy to, funkcje i zmienne są tworzone w taki sposób by było czytelne co dany kawałek kodu wykonuje. W tym celu tworzone są odpowiednie opisowe nazwy zmiennych i metod, dodawane są komentarze w kodzie oraz komentarze metod. Wszystkie te zabiegi powodują nie tylko większą przejrzystość kodu dla współpracowników lecz także ułatwią zrozumienie jego działania samym twórcom.

## Rodzaje testów

Ważnym elementem tworzenia aplikacji są też także testy. 
Pierwszym i najbardziej podstawowym rodzajem testu są testy wykonywane przez ludzi. W celu zweryfikowania poprawnego działania oprogramowanie tworzone są scenariusze testowe które muszą zostać wykonane przez ludzi którzy symulują czynności użytkownikó ostatecznych systemu. Testy takie są bardzo pracochłonne i muszą być powtarzane przy każdej nowej wersji oprogramowania. Niekiedy testy takie są nie możliwe lub bardzo utrudnione jeżeli mamy do czynienia z kawałkiem systemu który nie komunikuje się bezpośrednio z człowiekiem lecz z innym elementem systemu informatycznego.

W takich przypadkach często tworzone są testy automatyczne. Testy automatyczne są tworzone w różnego rodzaju narzędziach symulujących zachowania użytkowników lub innych systemów z wykorzystaniem skryptów, czyli kawałków kodu opisujących sekwencję działań wykonywanych na systemie. 

Testy automatyczne są rodzajem black box testing to znaczy, że testują najbardziej zewnętrzną warstwę oprogramowania bez znajomości struktury oprogramowania.

Testy automatyczne można także podzielić na testy End to End e2e oraz testy wydajnościowe. Testy e2e są to testy autoamtyczne które testują specyficzne funkcjolaności aplikacji wymagane przez zleceniodawców i użytkowników systemu.
Testy wydajnościowe sprawdzają czy poprawnie działający system będzie nadal poprawnie działał w skrajnych przypadkach wysokiego obciążenia systemu na przykład liczbą jednocześnie kożystających z nich użytkowników.
W zależności od sposobu podziału aplikacji moduły można testować także poszczególne moduły aplikacji.

Najbardziej szczegółowymi testami możliwymi w aplikacji są testy jednostkowe. Tak jak nazwa wskazuje powinny być one wykonywane na niepodzielnej części kodu i testować tylko jedno zachowanie. W programowaniu takim najmniejszym nie podzielnym elementem kodu jest funkcja. Testy jednostkowe pisane są przez samych twórców oprogamowania i są pisane z uwzględnieniem wewnętrznego działania i struktury kodu ze względu na tą specificzną własność nazywane są także white box testing.

Za różne rodzaje testów odpowiedzialne są różne zespoły natomiast testy jednostkowe zawsze są przez samych programistów i autorów testowanej funkcjonalności. Umiejętność pisania testów jednostkowych jest wymagana w większości firm.

Ponieważ pisanie testów jednostkowych jest tak częstą i ważną czynnością powstało wiele bibliotek których jedynym celem jest tworzenie oraz uruchamianie testów jednostkowych. JUnit jest bibliotekę stworzoną dla języka Java i jej celem jest ułatwienie tworzenie testów jednostkowych. Stała się ona standardem w społeczności programistów.

## Dlaczego warto pisać testy TDD.

Test Driven Development to rodzaj strategii wytwarzania oprogramowania w którym na podstawie wymagania w postaci historyjki użytkownika programista w pierwszej kolejności pisze zestaw testów które opisują co tworzony fragment kodu ma wykonywać a dopiero w drugiej koleności tworzony jest kod imlementujący daną funkcjonalność. W TDD wyróżniamy różne fazy. 
faza czerwona faza zielona i refactor. 

### Faza Red
Pierwszym krokiem jest napisanie testu. Test ten nie może się powieść, ponieważ sama funkcjonalność jeszcze nie jest zaimplementowana. Możliwe, że nawet po napisaniu takiego testu kod nie będzie się kompilował. Może się tak stać w przypadku, gdy napisałeś test dla metody, która jeszcze nie istnieje.

Sytuacja, w której testy jednostkowe nie przechodzą bardzo często w IDE oznaczana jest kolorem czerwonym.

### Faza Green
Kolejnym krokiem jest napisanie kodu, który implementuje brakującą funkcjonalność. W tym momencie istotne jest to aby ten kod nie był „idealny”. Chodzi o możliwe jak najszybszą implementację, która spełnia założenia testu, który był napisany w poprzedniej fazie.

Następnie potwierdzamy to, że nasza implementacja działa jak powinna uruchamiając testy jednostkowe. Jeśli wszystko jest w porządku całość powinna zakończyć się testami jednostkowymi, które przechodzą. IDE sygnalizuje taką sytuację zielonym kolorem. Ważne jest aby w tej fazie uruchamiać wszystkie dotychczas napisane testy jednostkowe.

### Faza Refactor
Refaktoryzacja (ang. refactor) to proces, w którym zmieniamy kod w taki sposób, że nie zostaje zmieniona jego funkcjonalność. Mówi się o „oczyszczaniu” kodu, doprowadzaniu go do lepszego stanu. Przykładem refaktoryzacji może być wydzielenie oddzielnej metody, która usuwa powielony kod czy stworzenie zupełnie nowej klasy odpowiedzialnej za pewną część zadań danej klasy.

(źródło)[https://www.samouczekprogramisty.pl/test-driven-development-na-przykladzie/]

Jest kilka powodów dlaczego TDD zdobyło taką popularność.
* gwarantuje wysokie pokrycie testami (to znaczy że wszystkie funckonalności będą przetestowane i zgodne z wymaganiami)
* podczas modyfikacji kodu oprogramowania sprawdzają czy nie nastąpiła regresja oprogamowania czyli popsucie pewnych starych funcjonalności.
* ułatwia programiście skupieniu się ne ralizacji najważniejszego zadania.
* ułatwia zrozumienie działania kodu przez zaprezentowanie przypadków jego użycia, jest elementem samo dokumentującego się kodu. 
* ułatwia programoiście wydajną pracę gdyż przejście do fazy zielonej sygnalizuje, że funcjonalność została zakończona i można przjść do fazy poprawy jakości kodu.
* ułatwia programoiście wydajną pracę gdyż dzieli proces tworzenia oprogramowania na fazy w których najpierw kluczowe jest spełnienie wymagań biznesowych a w drugiej koleności poprawia jakości oprogramowania.
* ułatwia wykonywanie code review.


## Czy są jakieś przeciwskazania tworzenia testów?

Tak. W przypadku gdy mamy do czynienia z dynamicznie zmieniającym się oprogramowaniem i dodatkowo czas spędzony na pisanie testu jest znacząco dłuższy od stworzenia danej funkcjonalności. Przykładem takiej sytuacji jest interfejs użytkownika.
Często porównanie stworzonego interfejsu użytkownika z jego projektem wykonane przez sprawnego testera jest dużo szybsze niż pisanie testów interfejsów użytkownika. Interfejs użytkownika może być często modyfikowany w przypadku pracy metodologią Extreme Programming.

Tworzenie POC proof of concept czyli szybkiej implementacji mającej wykazać, że dane zagadnieniem może być zrealizowane przez zespół w wybranej technologii.

## Testy Jednostkowe JUnit

```java
@Test
public void shouldSayThat15rIsInRange() {
    Range range = new Range(10, 20);
    Assert.assertTrue(range.isInRange(15));
}
```

## Assercje

Asercje to metody statyczne dostarczone przez bibliotekę JUnit, które pomagają przy testowaniu weryfikując różnego rodzaju warunki i tworzą znaczące komunikaty w przypadku nie spełnienia warunku.

```java
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.*;
```

* assertTrue sprawdza czy przekazany argument to true,
* assertFalse sprawdza czy przekazany argument to false,
* assertNull sprawdza czy przekazany argument to null,
* assertNotNull sprawdza czy przekazany argument nie jest nullem,
* assertEquals przyjmuje dwa parametry wartość oczekiwaną i wartość rzeczywistą, jeśli są różne rzuca wyjątek,
* assertNotEquals przyjmuje dwa parametry wartość oczekiwaną i wartość rzeczywistą, rzuci wyjątek jeśli są równe.

```java
assertFalse(false);
assertTrue(true);
```

## Testowanie metod rzucających wyjątki.

```java
@Test(expected = IllegalArgumentException.class)
public void shouldThrownIllegalArgumentExceptionOnWrongParameters() {
    new Range(20, 10);
}
```

## Struktura testu Given, When, Then.

Test można podzielić na trzy elementy.
* Given - to etap w którym tworzymy różnego rodzaju elementy które podlegają testowaniu.
* When - to etap w którym wykonywana jest jakaś akcja na stwozonym elemencie.
* Then - opisuje oczekiwaną reakcję Wykorzystuje do tego Asercje i definiuje komunikaty błędów.

## Tworzenie testu 
* @Test

## Cykl życia klasy z testami jednostkowymi

* @BeforeAll

* @BeforeEach

* @AfterEach

* @AfterAll

## @ParameterizedTest

## @RepeatedTest

## @DisplayName

## @Nested

## Testy E2E

## Black Box Testing

## Testy wydajnościowe

## JMeter




Materiały dodatkowe
[https://www.samouczekprogramisty.pl/test-driven-development-na-przykladzie/]
[https://www.youtube.com/watch?v=fr1E9aVnBxw]