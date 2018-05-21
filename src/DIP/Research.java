package DIP;

import java.util.List;

public class Research {

    Research(Person parent, RelationshipBrowser browser) {
        List<Person> children = browser.findAllChildrenOf(parent);
        for (Person child : children)
            System.out.println(parent.name + " has a child called " + child.name);
    }

    @Override
    public String toString() {
        return "Research end";
    }
}
