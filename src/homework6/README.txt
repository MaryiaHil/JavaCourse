2.1 Найти в тексте все использованные слова и поместить их в коллекцию Set:
 - homework6.runners.ReadFileMain1.java 
 - homework6.dto.api.ITextSpliterator.java
 - homework6.dto.TextSpliterator.java

2.2 Найти в тексте топ N (настраиваемое значение) слов и вывести количество этих слов используя Map и List. 
Отсортировать по количеству. Распечатать в консоль: 
 - homework6.runners.ReadFileMain2.java 
 - homework6.dto.api.ITextSpliterator.java
 - homework6.dto.TextSpliterator.java

3. Написать интерфейс ISearchEngine:
 - homework6.dto.api.ISearchEngine.java

4.1 Написать класс EasySearch:
 - homework6.dto.EasySearch.java
 - homework6.runners.ReadFileMain3.java

4.2* Написать класс RegExSearch реализующий интерфейс ISearchEngine. Реализовать поиск при помощи класса Matcher:
 - homework6.dto.RegExSearch.java
 - homework6.runners.ReadFileMain4.java

4.3* Написать декоратор SearchEnginePunctuationNormalizer для ISearchEngine который будет удалять нежелательные символы:
 - homework6.dto.SearchEnginePunctuationNormalizer.java
 - homework6.runners.ReadFileMain5.java

4.4* Написать декоратор для ISearchEngine который будет позволять искать данные без учёта регистра:
 - homework6.dto.SearchEngineIgnoreCaseDecorator.java
 - homework6.runners.ReadFileMain6.java

5. Используя реализации интерфейса ISearchEngine вывести информацию как часто встречаются слова "война", "и" (как союз), "мир" вне зависимости от регистра:
- homework6.runners.ReadFileMain6.java