package DIP;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Relationships implements RelationshipBrowser {
    public List<Person> findAllChildrenOf(Person person) {

        return relations.stream()
                .filter(p -> p.role.equals(Role.CHILD))
                .collect(Collectors.toList());
    }

    private List<Person> relations = new ArrayList<>();

    void addParentAndChild(Person person) {
        relations.add(person);
    }
}