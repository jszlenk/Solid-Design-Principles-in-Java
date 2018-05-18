# Zasady SOLID

![Solid Design ](https://img.shields.io/badge/Solid_Design-Principles--in--Java-green.svg?longCache=true&style=for-the-badge)

##### SOLID to zbiór ważnych praktyk programistycznych, które zostały opracowane przez Roberta C. Martina.

**[Solid na Wiki](https://pl.wikipedia.org/wiki/SOLID_(programowanie_obiektowe))**

SOLID składa się z 5 praktyk kodowania programów:

1. **SRP - [Zasada jedej odpowiedzialności](#zasada-jednej-odpowiedzialności)**
2. OCP - [Zasada otwarte-zamknięte](#zasada-otwarte-zamknięte)
3. **LSP - Zasada podstawienia Liskov**
4. **ISP - Zasada segregacji interfejsów**
5. **DIP - Zasada odwrócenia zależności**

### SRP - Single responsibility principle
**[Zasada jednej odpowiedzialności](https://github.com/jszlenk/Solid-Design-Principles-in-Java/tree/master/src/SPR)**

SRP - mówi on o tym, że każda metoda/klasa powinna odpowiadać za jedną konkretną czynność. Wkładanie wszystkiego do jednej metody nie spełnia podstawowych założeń obiektowości, ale również utrudnia czytanie, naprawianie czy rozszerzanie programów.

Zasada ta jest mocno zauważalna, kiedy piszemy aplikację, która z czasem zaczyna się powiększać. Jest wzbogacana o nowe funkcjonalności. Wtedy chcemy skorzystać już z istniejących klas i ich możliwości. Okazuje się, jednak że klasa, która powinna robić czynność A, robi również czynność B, C i D, które nie są pożądane przez aktualnie tworzoną implementację. Wtedy powstaje problem, ponieważ nie możemy już wykorzystać danej klasy. W takiej sytuacji można uniknąć trzymając się SRP.

### OCP - Open/close principle
[Zasada otwarte-zamknięte](https://github.com/jszlenk/Solid-Design-Principles-in-Java/tree/master/src/OCP)

Zasada OCP mówi o tym, aby klasy, które tworzymy, były otwarte na rozszerzenia, a zamknięte na modyfikacje.

Aplikacja, którą tworzymy, musi być gotowa na rozszerzenia, ponieważ systemy w dzisiejszych czasach bardzo szybko się zmieniają. Dzięki zasadzie OCP jesteśmy w stanie wielokrotnie wykorzystywać nasze klasy do różnych zadań, co sprzyja reużywalności kodu, ale również czyni go prostym do zrozumienia.

### YAGNI - You ain’t gonna need it
#### Nie będziesz tego potrzebować

Zasada mówi o tym, aby nie tworzyć funkcjonalności dopóki nie będzie ona faktycznie potrzebna. Jest to dobra praktyka, ponieważ nie tworzymy nadmiarowości kodu w aplikacji oraz nie pozostawiamy kodu, który nie jest w żaden sposób wykorzystywany.

**[YAGNI na Wiki](https://en.wikipedia.org/wiki/You_aren%27t_gonna_need_it)**

### DRY - Don’t repeat yourself
#### Nie powtarzaj się! 

Analiza napisanego kodu i chęć polepszania go są zawsze kluczowe w pisaniu oprogramowania.

Pisząc kilka klas o podobnych właściwościach, możemy napotkać na podobne problemy. Jest to znak, że kod wewnątrz tych klas jest wspólny i może to świadczyć o tym, że powinien zostać wydzielony do innej klasy, która zajmie się powtarzalnymi zadaniami w jednym miejscu. Dzięki takiej operacji, obie klasy będą korzystać z tego samego kodu, a co za tym idzie, prawdopodobieństwo wystąpienia błędu spadnie.

**[DRY na Wiki](https://pl.wikipedia.org/wiki/DRY)**

### KISS - Keep It Simple, Stupid!
#### Nie kombinuj głuptasie!

Reguła ta jest często wspominana przy dyskusji architektury lub szczegółów budowy projektów. Jej istotą jest dążenie do utrzymania eleganckiej i przejrzystej struktury, bez dodawania niepotrzebnych elementów.

**[KISS na Wiki](https://pl.wikipedia.org/wiki/KISS_(regu%C5%82a))**


## Słownik

#### DTO - Data Transfer Object

Jest to obiekt, który wykorzystuje się do przenoszenia danych na oraz z aplikacji. Pisząc kod, możesz spotkać się z sytuacją, w której chciałbyś zwrócić w metodzie więcej niż jedną rzecz jednocześnie. Np. obiekt User i informację o tym, czy udało mu się wypożyczyć np. jakiś pojazd. W związku z tym, że nie możemy zwrócić kilku obiektów jednocześnie, wykorzystujemy wtedy DTO - obiekt zawierający dane, które chcemy przekazać. Dzięki temu, zwracamy jedynie DTO, z którego później możemy wyciągnąć dane, które nas interesują.

