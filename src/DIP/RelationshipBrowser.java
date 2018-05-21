package DIP;

import java.util.List;

public interface RelationshipBrowser {
    List<Person> findAllChildrenOf(Person person);
}
