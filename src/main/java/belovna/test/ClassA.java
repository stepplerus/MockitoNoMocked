package belovna.test;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClassA {
    int a;
    int b;

    public ClassA(int a, int b) {
        this.a = a;
        this.b = b;
    }
}
